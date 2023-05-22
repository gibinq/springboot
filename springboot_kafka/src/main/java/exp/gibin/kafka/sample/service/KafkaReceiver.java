package exp.gibin.kafka.sample.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaReceiver {
	
	 @KafkaListener(
	            id = "foo", 
	            topics = "java_in_use_topic",
	            properties = {"bootstrap.server=localhost:9092"}
	    )
	public void listen(String data) {
		System.out.println(data);
	}

}
