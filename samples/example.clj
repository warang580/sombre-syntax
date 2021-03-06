(ns examples.exploring
  (:require [clojure.string :as str])
  (:import (java.io File)))

(defn date [person-1 person-2 & chaperones]
  (println person-1 "and" person-2 "went out with" (count chaperones) "chaperones."))

(defn is-small? [number]
  (if (< number 100) "yes" "no"))

(defn countdown [result x]
  (if (zero? x)
    result
    (recur (conj result x) (dec x))))

(defn indexed [coll] (map-indexed vector coll))

(defn index-filter [pred coll]
  (when pred
    (for [[idx elt] (indexed coll) :when (pred elt)] idx)))

(defn index-of-any [pred coll]
  (first (index-filter pred coll)))

(defn greeting
  "Returns a greeting of the form 'Hello, username.'"
  [username]
  (str "Hello, " username))

(defn greeting
  "Returns a greeting of the form 'Hello, username.'
   Default username is 'world'."
  ([] (greeting "world"))
  ([username] (str "Hello, " username)))

(defn indexable-word? [word]
  (> (count word) 2))

(defn indexable-words [text]
  (let [indexable-word? (fn [w] (> (count w) 2))]
    (filter indexable-word? (str/split text #"\W+"))))

(defn make-greeter [greeting-prefix]
  (fn [username] (str greeting-prefix ", " username)))

(defn square-corners [bottom left size]
  (let [top (+ bottom size)
	right (+ left size)]
    [[bottom left] [top left] [top right] [bottom right]]))

(defn ^{:test (fn [] (assert (nil? (busted))))} busted [] "busted")

(def vinge {:first-name "Vernor" :last-name "Vinge"})

(defn greet-author-1 [author]
  (println "Hello," (:first-name author)))

(defn greet-author-2 [{fname :first-name}]
  (println "Hello," fname))

(require '[clojure.string :as str])
(defn ellipsize [words]
  (let [[w1 w2 w3] (str/split words #"\sHelloWorld+")]
    (str/join " " [w1 w2 w3 "..."])))
