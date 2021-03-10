package runtime

import drone.droneReport
import java.text.SimpleDateFormat
import java.util.Calendar

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    // prevents a bug
    val format = new SimpleDateFormat("d-M-y hh:mm a")
    var currentDate : String = format.format(Calendar.getInstance().getTime())

    // many reports
    val Report1 = new droneReport("01", currentDate, 10, 20, List("Arnaud", "Aude", "Gabriel"), 30, 15, "")
    println(Report1.toString())

    val Report2 = new droneReport("02", currentDate, 30, 85, List("Louis", "Louis"), 30, 5, "")
    println(Report2.toString())

    val Report3 = new droneReport("03", currentDate, 5, 95, List("Cassandra"), 30, 28, "")
    println(Report3.toString())
  }
}