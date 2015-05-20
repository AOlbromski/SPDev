package pl.dev.model.xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Paths implements Serializable{

	List<Path> paths = new ArrayList<Path>();
	
	public Paths(){
		super();
	}

	public Paths(List<Path> paths) {
		super();
		this.paths = paths;
	}

	public List<Path> getPaths() {
		return paths;
	}

	public void setPaths(List<Path> paths) {
		this.paths = paths;
	}
	
}
