import java.text.SimpleDateFormat
import java.util.Calendar
import scala.util.Random

object Main {
  def main(args: Array[String]): Unit = {

    val format = new SimpleDateFormat("d-M-y hh:mm a")
    var currentDate : String = format.format(Calendar.getInstance().getTime())
    val r = scala.util.Random

    println("Hello, world!")

    //case class droneReport (id:String, lattitude:Int, longitude:Int, name_citizen:String, max_battery:Int, current_battery:Int, report:String)

    1.to(10).foreach(((i : Int) => println(DroneReport(i.toString, currentDate, r.nextLong(300), r.nextLong(300), List("Arnaud", "Aude", "Gabriel"), 30, r.nextInt(30) + 1, ""))))

  }
}