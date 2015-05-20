package pl.dev.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import pl.dev.model.graph.Graph;
import pl.dev.model.graph.Node;
import pl.dev.model.graph.Route;
import pl.dev.model.xml.Path;
import pl.dev.model.xml.Paths;

public class GraphFactory {

	public static Graph buildGraph(Paths paths){
		Graph graph = new Graph();
		String first = paths.getPaths().get(0).getStartPoint().getName();
		Map<String,Node> nodesTemp = new HashMap<String,Node>(); 
		for(Path path : paths.getPaths()){
			if(!nodesTemp.containsKey(path.getStartPoint().getName())){
				nodesTemp.put(path.getStartPoint().getName(), new Node(path.getStartPoint().getName()) );
			}
			if(!nodesTemp.containsKey(path.getEndPoint().getName())){
				nodesTemp.put(path.getEndPoint().getName(), new Node(path.getEndPoint().getName()) );
			}
			nodesTemp.get(path.getStartPoint().getName()).addRoute(new Route(nodesTemp.get(path.getEndPoint().getName()),path.getLength()));
			nodesTemp.get(path.getEndPoint().getName()).addRoute(new Route(nodesTemp.get(path.getStartPoint().getName()),path.getLength()));
		}
		graph.setFirst(nodesTemp.get(first));
		for(Entry<String,Node> e : nodesTemp.entrySet()){
			graph.addNode(e.getValue());
		}
		return graph;
	}
}
