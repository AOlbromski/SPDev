package pl.dev.model.graph;

public class Route {

	private Node endPoint;
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
