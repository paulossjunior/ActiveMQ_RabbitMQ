package gov.es.prodest.espm.realtime.miner.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SenderService {
	
	@Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;
    
    public void send(String msg) {
    	
    	rabbitTemplate.convertAndSend(this.queue.getName(), msg);
    	
    	log.info("Enviado para o Rabbit: " + msg);
    }

}
