package com.allaboutscala.chapter.two.tutorial_04


object EscapeCharactersAndMultilineString extends App {

  println("Step 1: How to escape a Json String")
  val donutJson: String = "{\"donut_name\":\"Glazed Donut\",\"taste_level\",\"Very Tasty\",\"price\":2.50}"
  println(s"donutJson = $donutJson")

  println("\nStep 2: Using triple quotes \"\"\" to escape characters")
  val donutJson2: String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
  println(s"donutJson2 = $donutJson2")
}
