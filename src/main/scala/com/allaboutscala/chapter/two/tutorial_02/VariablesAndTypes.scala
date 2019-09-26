package com.allaboutscala.chapter.two.tutorial_02


object VariablesAndTypes extends App {

  // Immutable variables
  val donutsToBuy: Int = 5
  // donutsToBuy = 10 Reassignment to val ot allowed

  //Mutable variables
  var favoriteDonut: String = "Glazed Donut"
  favoriteDonut = "Vanilla Donut"

  lazy val donutService = "initialize some donut service"


  val donutsBought: Int = 5
  val bigNumberOfDonuts: Long = 100000000L
  val smallNumberOfDonuts: Short = 1
  val priceOfDonut: Double = 2.50
  val donutPrice: Float = 2.50f
  val donutStoreName: String = "allaboutscala Donut Store"
  val donutByte: Byte = 0xa
  val donutFirstLetter: Char = 'D'
  val nothing: Unit = ()

  var leastFavoriteDonut: String = _
  leastFavoriteDonut = "Plain Donut"

}
