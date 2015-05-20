package pl.dev.model.graph;
/**
 * Represents single path in graph.
 */
public class Route {

	/**
	 * Node that given path lead to.
	 */
	private Node endPoint;
	/**
	 * Numeric value that defines cost of this path.
	 */
	private Integer weight;
	
	public Route(){
		
	}
	public Route(Node endPoint, Integer weight) {
		super();
		this.endPoint = endPoint;
		this.weight = weight;
	}
	public Node getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(Node endPoint) {
		this.endPoint = endPoint;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
}
