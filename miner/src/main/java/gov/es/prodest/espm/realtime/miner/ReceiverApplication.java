package gov.es.prodest.espm.realtime.miner;

import org.apache.activemq.command.ActiveMQMapMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import gov.es.prodest.espm.realtime.miner.model.Veiculo;
import gov.es.prodest.espm.realtime.miner.model.VeiculoFactory;
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
    public void onReceiverTopic(ActiveMQMapMessage message) {
    	
    	try {
    		
    		//Veiculo veiculo = VeiculoFactory.getInstance();
    		
    		ObjectMapper mapper = new ObjectMapper();
    		
    		Veiculo veiculo = VeiculoFactory.getInstance(message.getContentMap());
    		
    		String json = mapper.writeValueAsString(veiculo);

			senderService.send(json);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	
    	
    }
    
	@Override
	public void run(ApplicationArguments args) throws Exception {
		log.info("Receiver started");
				
	}

}
