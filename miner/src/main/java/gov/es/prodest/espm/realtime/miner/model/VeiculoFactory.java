package gov.es.prodest.espm.realtime.miner.model;

import java.util.Map;

public class VeiculoFactory {
	
	public static Veiculo getInstance(Map<String,Object> message) {
		
		Veiculo veiculo = new Veiculo();
		
		if (message.containsKey("IDENTIFIER")) 
			veiculo.setIdentifier((String)message.get("IDENTIFIER").toString());
		
		if (message.containsKey("ignicao")) 
			veiculo.setIgnicao((boolean)message.get("ignicao"));	
		
		if (message.containsKey("IGNICAO")) 
			veiculo.setIgnicao((boolean)message.get("IGNICAO"));	
		
		if (message.containsKey("messageSubType") && message.get("messageSubType")!= null) 
			veiculo.setMessageSubType(message.get("messageSubType").toString());	
		
		if (message.containsKey("MESSAGE_SUB_TYPE") && message.get("MESSAGE_SUB_TYPE")!= null) 			
			veiculo.setMessageSubType(message.get("MESSAGE_SUB_TYPE").toString());	
		
		if (message.containsKey("SD1_ACIONADA"))
			veiculo.setSD2Acionada((boolean)message.get("SD1_ACIONADA"));
		
		if (message.containsKey("SD2_ACIONADA"))
			veiculo.setSD2Acionada((boolean)message.get("SD2_ACIONADA"));
		
		if (message.containsKey("SD3_ACIONADA"))
			veiculo.setSD3Acionada((boolean)message.get("SD3_ACIONADA"));
		
		if (message.containsKey("SD4_ACIONADA"))
			veiculo.setSD4Acionada((boolean)message.get("SD4_ACIONADA"));
		
		
		if (message.containsKey("ED1_ACIONADA"))
			veiculo.setSD2Acionada((boolean)message.get("SD1_ACIONADA"));
		
		if (message.containsKey("ED2_ACIONADA"))
			veiculo.setSD2Acionada((boolean)message.get("SD2_ACIONADA"));
		
		if (message.containsKey("ED3_ACIONADA"))
			veiculo.setSD3Acionada((boolean)message.get("SD3_ACIONADA"));
		
		if (message.containsKey("ED4_ACIONADA"))
			veiculo.setSD4Acionada((boolean)message.get("SD4_ACIONADA"));
		
		if (message.containsKey("CURSOR"))
			veiculo.setCurso((int)message.get("CURSO"));
		
		if (message.containsKey("LONGITUDE"))
			veiculo.setLongitude((double)message.get("LONGITUDE"));
		
		if (message.containsKey("LATITUDE"))
			veiculo.setLatitude((double)message.get("LATITUDE"));
		
		if (message.containsKey("LATITUDE"))
			veiculo.setLatitude((double)message.get("LATITUDE"));
		
		if (message.containsKey("STATUS_GPS"))
			veiculo.setStatus_gps(message.get("STATUS_GPS").toString());
		
		if (message.containsKey("VELOCIDADE"))
			veiculo.setVelocidade((double)message.get("VELOCIDADE"));
		
		if (message.containsKey("DATAHORA"))
			veiculo.setDataHora((long)message.get("DATAHORA"));
		
		if (message.containsKey("SERVER_TIME"))
			veiculo.setServerTime((long)message.get("SERVER_TIME"));
		
		if (message.containsKey("MESSAGE_TYPE"))
			veiculo.setMessage_type(message.get("MESSAGE_TYPE").toString());
		
		if (message.containsKey("ID_MODULO"))
			veiculo.setIdModulo(message.get("ID_MODULO").toString());
		
		return veiculo;
		
	}

}
