package drone

class droneReport(id:String, lattitude:Int, longitude:Int, citizens:List[String], max_battery:Int, current_battery:Int, report:String)
{
  // because we have put all the variable of droneReport in the (), we don't have to write it here

  override def toString() : String =
    s"\n\nREPORT FROM DRONE $id\nPosition : ($lattitude, $longitude)\nCitizen : $citizens\nBattery : $current_battery/$max_battery\nReport : $report"
}