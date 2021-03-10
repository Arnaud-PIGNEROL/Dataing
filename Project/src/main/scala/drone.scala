package drone

class droneReport(id:String, lattitude:Int, longitude:Int, name_citizen:String, max_battery:Int, current_battery:Int, report:String)
{
  // because we have put all the variable of droneReport in the (), we don't have to write it here

  override def toString() : String =
    s"\n\nREPORT FROM DRONE $id\nPosition : ($lattitude, $longitude)\nCitizen : $name_citizen\nBattery : $current_battery/$max_battery\nReport : $report"
}