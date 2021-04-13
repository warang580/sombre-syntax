<?php

use Recipes\Vegetable as Veggie;

class Spinach extends Veggie
{
  public $cooked = false;

  function Spinach()
  {
    $this->Vegetable(true, "green");
  }

  function cook()
  {
    $this->cooked = true;
  }

  function is_cooked()
  {
    return !! $this->cooked;
  }
}
