package pl.dev.model.xml;

import java.io.Serializable;


public class City implements Serializable{
	
	private String name;
	
	public City(){
		super();
	}
	
	public City(String name) {
		super();
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
