package pl.dev.model.xml;

import java.io.Serializable;

/**
 * Represents City data from XML file.
 * Will be converted to single Node in graph.
 */
public class City implements Serializable{
	
	/**
	 * Name of given City.
	 * Identificates a City object.
	 */
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
