package example

//import io.scalajs.nodejs.os
import util._
import example.facade._

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world scalajs on nodejs")
    println("args:")
    args.foreach(println)

    println(JSON.stringify(nodejs.OS, null, 2))

    nodejs.OS
      .arch()
      .|>(arch => println(s"""os arch is: $arch"""))
  }
}
