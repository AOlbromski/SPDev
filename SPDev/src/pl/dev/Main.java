package pl.dev;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import pl.dev.factory.GraphFactory;
import pl.dev.model.graph.Graph;
import pl.dev.model.xml.Paths;

public class Main {
	
	public static Graph buildGraph() {
		Paths paths = null;
		try {

			File file = new File("input.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Paths.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			paths = (Paths) jaxbUnmarshaller.unmarshal(file);

		} catch (JAXBException e) {
			System.out.println("Invalid input data.");
		}

		return GraphFactory.buildGraph(paths);
	}

	public static void main(String[] args) {
		Graph graph = buildGraph();
	}
}
