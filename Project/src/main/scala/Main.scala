object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    //case class droneReport (id:String, lattitude:Int, longitude:Int, name_citizen:String, max_battery:Int, current_battery:Int, report:String)
    var Report1 = droneReport("01", 10, 20, "Arnaud", 30, 15, "")
    println("\n\nREPORT FROM DRONE " + Report1.id + "\nPosition : (" + Report1.lattitude + ", " + Report1.longitude + ")\nCitizen : " + Report1.name_citizen +
      "\nBattery : " + Report1.current_battery + "/" + Report1.max_battery + "\nReport : " + Report1.report)

    var Report2 = droneReport("02", 30, 85, "Louis", 30, 5, "")
    println("\n\nREPORT FROM DRONE " + Report2.id + "\nPosition : (" + Report2.lattitude + ", " + Report2.longitude + ")\nCitizen : " + Report2.name_citizen +
      "\nBattery : " + Report2.current_battery + "/" + Report2.max_battery + "\nReport : " + Report1.report)

    var Report3 = droneReport("03", 5, 95, "Cassandra", 30, 28, "")
    println("\n\nREPORT FROM DRONE " + Report3.id + "\nPosition : (" + Report3.lattitude + ", " + Report3.longitude + ")\nCitizen : " + Report3.name_citizen +
      "\nBattery : " + Report3.current_battery + "/" + Report3.max_battery + "\nReport : " + Report1.report)
  }
}