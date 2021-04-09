import java.util.Properties;
import org.apache.kafka.streams.StreamsConfig;


val streams = new Properties();
// Set a few key parameters
streams.put(StreamsConfig.APPLICATION_ID_CONFIG, "Drone-application");
streams.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "kafka-broker1:9092,kafka-broker2:9092");
streams.put(... , ...);