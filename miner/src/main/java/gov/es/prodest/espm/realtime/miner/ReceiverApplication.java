package gov.es.prodest.espm.realtime.miner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import gov.es.prodest.espm.realtime.miner.service.SenderService;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ReceiverApplication implements ApplicationRunner{
	
	private final String TOPIC = "DadosRastreioPRODEST";
	
	@Autowired
    private SenderService senderService;
	
	/* Recebedo informação do Topico*/
    @JmsListener(destination = TOPIC, containerFactory = "jmsFactoryTopic")
    public void onReceiverTopic(String str) {
    	
    	log.info("Recebendo: " + str);
    	senderService.send(str);
    	
    }
    
	@Override
	public void run(ApplicationArguments args) throws Exception {
		log.info("Receiver started");
				
	}

}
