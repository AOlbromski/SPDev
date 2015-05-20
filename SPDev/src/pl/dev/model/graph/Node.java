package pl.dev.model.graph;

import java.util.ArrayList;
import java.util.List;

public class Node {

	private String name;
	private List<Route> routes = new ArrayList<Route>();
	
	public Node(){
		
	}
	
	public Node(String name, List<Route> routes) {
		super();
		this.name = name;
		this.routes = routes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}
	
	public void addRoute(Route route){
		this.routes.add(route);
	}
}
