package com.abhilash.error;

// throws on Constructors
public class ConfigDemo {
	public static void main(String args[]) throws ConfigLoadException {
		StoreConfig storeConfig = new StoreConfig("/etc/store.conf");
		System.out.println("Currency: " + storeConfig.getCurrency());
	}

}

class ConfigLoadException extends Exception {
	public ConfigLoadException(String message) {
		super(message);
	}
}
class StoreConfig {
	private String currency;
	
	public StoreConfig(String configPath) throws ConfigLoadException {
		if(configPath == null || configPath.isBlank()) {
			throw new ConfigLoadException("Config path missing");
		}
		
		this.currency = "USD";
	}
	
	public String getCurrency() {
		return this.currency;
	}
}
