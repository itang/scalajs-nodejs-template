package example

object utils:

  import java.text.SimpleDateFormat
  import java.util.Date

  extension (d: Date)
    def format(pattern: String = "yyyyMMdd"): String = new SimpleDateFormat(pattern).format(d)

  def time[T](block: => T): T =
    val start = System.currentTimeMillis()
    val ret = block
    val end = System.currentTimeMillis()
    println(s">>Cost time: ${end - start}ms")
    ret

