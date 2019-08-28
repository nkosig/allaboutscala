package com.allaboutscala.chapter.one.tutorial_10

import com.typesafe.scalalogging.LazyLogging

object HelloWorldWithScalaLogging extends App with LazyLogging {

  logger.info("Info Hello World from Scala Logging")
  logger.debug("Debug Hello World from Scala Logging")
  logger.error("Error Hello World from Scala Logging")
}

