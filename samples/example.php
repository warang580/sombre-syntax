<?php

use Recipes\Vegetable;

class Spinach extends Vegetable
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
