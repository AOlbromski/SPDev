package pl.dev.model.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	
	private List<Node> nodes = new ArrayList<Node>();
	private Node first;

	public List<Node> getNodes() {
		return nodes;
	}

	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}
	
	public void addNode(Node node){
		this.nodes.add(node);
	}

	public Node getFirst() {
		return first;
	}
	
	public void setFirst(Node first){
		this.first = first; 
	}
}
