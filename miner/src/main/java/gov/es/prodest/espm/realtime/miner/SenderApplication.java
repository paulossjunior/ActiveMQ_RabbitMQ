package gov.es.prodest.espm.realtime.miner;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SenderApplication implements ApplicationRunner{

	@Value("${spring.rabbitmq.queue.transcol.name}")
    private String transcolQueue;
	
	@Bean
    public Queue queue() {
        return new Queue(transcolQueue, true);
    }
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		log.info("Sender started");
		
	}

}
