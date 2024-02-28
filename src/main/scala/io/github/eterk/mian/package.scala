package io.github.eterk

import org.apache.logging.log4j.{LogManager, Logger}

package object mian {
  lazy val logger: Logger = LogManager.getLogger(getClass)

}
