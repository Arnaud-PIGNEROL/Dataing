import scala.io.Source
import org.apache.kafka.clients.producer._
import java.util.Properties
import java.util.Timer
import java.util
import org.apache.kafka.clients.consumer.KafkaConsumer
import org.apache.kafka.clients.consumer.ConsumerConfig
import scala.collection.JavaConverters._
import javax.mail.internet.{InternetAddress, MimeMessage}
import javax.mail.{Message, Session}

import java.io._

object Consumer extends App {

  val  stream = new Properties()
  stream.put("bootstrap.servers", "localhost:9092")
  stream.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "false")
  stream.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
  stream.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
  stream.put("group.id", "consumergroup")

  val consumer = new KafkaConsumer[String, String](stream)

  val topic ="peacewatcher_message"
  consumer.subscribe(util.Collections.singletonList(topic))



  def receiveStream(period: Int): Unit =  {

    val receiv = new java.util.TimerTask {
      def run() = {
        println("receiving data now...")
        val records = consumer.poll(3)

        records.asScala.foreach{record => println(record.value())

          if ((record.value().split(",")(3))=="1"){
            println("An alert was detected, please do something !")
          }

        }


      }
    }

    val interval = new java.util.Timer()
    interval.schedule(receiv, period, period)
  }

  receiveStream(5000)

}




