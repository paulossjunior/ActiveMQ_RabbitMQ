package gov.es.prodest.espm.realtime.miner.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Veiculo implements Serializable{
	
	/**
	 * 
	 */
	private boolean ignicao;
	private String messageSubType;
	
	private boolean SD1Acionada;
	private boolean SD2Acionada;
	private boolean SD3Acionada;
	private boolean SD4Acionada;
	
	private boolean ED1Acionada;
	private boolean ED2Acionada;
	private boolean ED3Acionada;
	private boolean ED4Acionada;
	
	private int curso;
	
	private double longitude;
	private double latitude;
	
	private String identifier;
	private double velocidade;
	
	private String status_gps;
	private String message_type;
	
	private long dataHora;
	private long serverTime;
	
	private String idModulo;
	
}
