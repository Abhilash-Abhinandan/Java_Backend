package com.abhilash.electricity.model;

public class Consumer {
	private static int nextId = 1001;
	
	private final String consumerId;
	private final String consumerName;
	private final int unitsConsumed;
	private final String connectionType;
	
	public Consumer(String consumerName, int unitsConsumed, String connectionType) {
		if(consumerName.isBlank() || consumerName == null) {
			throw new IllegalArgumentException("Consumer name can not be blank or null!");
		}
		
		if(unitsConsumed < 0) {
			throw new IllegalArgumentException("Units can not be less than 0 unit!");
		}
		
		if(connectionType.isBlank()|| connectionType == null) {
			throw new IllegalArgumentException("Connection type can not be empty or null!");
		}

		// Auto generated consumer id.
		this.consumerId = "CON" + nextId;
		nextId++;
		
		this.consumerName = consumerName;
		this.unitsConsumed = unitsConsumed;
		this.connectionType = connectionType;
	}

	// Getters
	public String getConsumerId() {
		return consumerId;
	}
	
	public String getConsumerName()	{
		return consumerName;
	}
	
	public int getConsumedUnits() {
		return unitsConsumed;
	}
	
	public String getConnectionType() {
		return connectionType;
	}
}
