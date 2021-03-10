package runtime

import drone.droneReport
import java.text.SimpleDateFormat
import java.util.Calendar

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    // prevents a bug
    val format = new SimpleDateFormat("d-M-y hh:mm a")
    println(format.format(Calendar.getInstance().getTime()))

    // many reports
    val Report1 = new droneReport("01", 10, 20, "Arnaud", 30, 15, "")
    println(Report1.toString())

    val Report2 = new droneReport("02", 30, 85, "Louis", 30, 5, "")
    println(Report2.toString())

    val Report3 = new droneReport("03", 5, 95, "Cassandra", 30, 28, "")
    println(Report3.toString())
  }
}