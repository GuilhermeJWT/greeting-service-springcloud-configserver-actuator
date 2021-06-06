package br.com.systemsgs.model;

public class ModelGreeting {
	
	private final long id;
	private final String contet;
	
	public ModelGreeting(long id, String contet) {
		super();
		this.id = id;
		this.contet = contet;
	}

	public long getId() {
		return id;
	}
	
	public String getContet() {
		return contet;
	}

}
