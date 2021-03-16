import java.text.SimpleDateFormat
import java.util.Calendar

object Main {
  def main(args: Array[String]): Unit = {

    val format = new SimpleDateFormat("d-M-y hh:mm a")
    var currentDate : String = format.format(Calendar.getInstance().getTime())

    println("Hello, world!")

    //case class droneReport (id:String, lattitude:Int, longitude:Int, name_citizen:String, max_battery:Int, current_battery:Int, report:String)
    var Report1 = DroneReport("01", currentDate, 10, 20, List("Arnaud", "Aude", "Gabriel"), 30, 15, "")
    println(Report1.toString)

  }
}