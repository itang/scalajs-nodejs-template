package example.facade

import scala.scalajs.js
import scala.scalajs.js.annotation._

object nodejs:
  @js.native
  trait OS extends js.Object {
    def arch(): String = js.native
  }

  @js.native
  @JSImport("os", JSImport.Namespace)
  object OS extends OS
