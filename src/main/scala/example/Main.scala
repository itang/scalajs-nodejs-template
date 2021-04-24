package example

import utils._
import example.facade._
import scala.util.chaining._

object Main:
  def main(args: Array[String]): Unit = time {
    println("Hello world scalajs on nodejs")
    println("args:")
    args.foreach(println)

    println(JSON.stringify(nodejs.OS, null, 2))

    nodejs.OS
      .arch()
      .pipe(arch => println(s"""os arch is: $arch"""))
  }
