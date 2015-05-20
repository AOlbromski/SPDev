package pl.dev.model.xml;

import java.io.Serializable;

/**
 * Represents Path data from XML file.
 * Will be converted to single Route in graph.
 */
public class Path implements Serializable{
	
	/**
	 * Represents start point of Route.
	 */
	private City startPoint;
	
	/**
	 * Represents end point of Route.
	 */
	private City endPoint;
	
	/**
	 * Represents cost of given Route.
	 */
	private int length;
	
	public Path(){
		super();
	}

	public Path(City startPoint, City endPoint, int length) {
		super();
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.length = length;
	}

	public City getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(City startPoint) {
		this.startPoint = startPoint;
	}

	public City getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(City endPoint) {
		this.endPoint = endPoint;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
}
