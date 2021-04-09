import com.sun.xml.internal.bind.v2.TODO
import org.apache.kafka.clients.producer._

import java.text.SimpleDateFormat
import java.util.{Calendar, Properties, Timer}


object Producer extends App {

  // Creation of the Stream
  val stream = new Properties()
  stream.put("bootstrap.servers", "localhost:9092")
  stream.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
  stream.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")
  val producer = new KafkaProducer[String, String](stream)

  val topic = "peacewatcher_message"



  def DroneSendStream(period: Int): Unit =  {

    val send = new java.util.TimerTask {
      def run() = {
        println("info sent by drones!")

        /**
         * TODO : Get our DroneReports here (val report) and find a way to use the foreach here
         */
        val format = new SimpleDateFormat("d-M-y hh:mm a")
        val currentDate: String = format.format(Calendar.getInstance().getTime())
        val r = scala.util.Random
        val report = DroneReport(r.nextInt(100).toString, currentDate, r.nextLong(300), r.nextLong(300), List("Arnaud", "Cassandra", "Louis"),
          30, r.nextInt(30) + 1)


        /**
         * TODO : Determine if there is an alert or not (val info)
         */

        val list_info = Seq("", "", "", "", "", "alert") // 1 chance out of 6 to be an alert
        val info = list_info(r.nextInt(list_info.length))

        if (info == "alert") {
          println("This is an alert !")
        }

        val record = new ProducerRecord(topic, report, info)
        producer.send(record)
      }

        println("End of the record")
    }

    // time interval between each report
    val interval = new java.util.Timer()
    interval.schedule(send, period, period) // (task, delay, period)
  }

  DroneSendStream(5000)
}

