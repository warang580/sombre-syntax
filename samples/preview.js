// https://codesandbox.io/s/xstate-vue-reddit-example-with-actors-uvu14
import { Machine, assign, spawn } from "xstate";
import { createSubredditMachine } from "./subredditMachine.js";

export const redditMachine = Machine({
  id: "reddit",
  initial: "idle",
  context: {
    subreddits: {},
    subreddit: null
  },
  states: { idle: {}, selected: {} },
  on: {
    SELECT: {
      target: ".selected",
      actions: assign((context, event) => {
        // Use the existing subreddit actor
        let subreddit = context.subreddits[event.name];
        if (subreddit) return {...context, subreddit};

        // Otherwise, spawn a new subreddit actor and
        // save it in the subreddits object
        subreddit = spawn(createSubredditMachine(event.name));

        return {
          subreddits: {
            ...context.subreddits,
            [event.name]: subreddit
          },
          subreddit
        };
      })
    }
  }
});
