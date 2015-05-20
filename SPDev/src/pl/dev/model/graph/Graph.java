package pl.dev.model.graph;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import pl.dev.model.xml.City;

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
		if(nodes.isEmpty()){
			first=node;
		}
		this.nodes.add(node);
	}

	public Node getFirst() {
		return first;
	}
}
