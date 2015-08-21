package graph;

import java.util.LinkedList;
import java.util.List;

public class Vertex<T> {

	private T data;
	private List<Vertex<T>> neighbors;
	
    public Vertex(T vertex) {
        this.data = vertex;
        this.neighbors = new LinkedList<Vertex<T>>();
    }
    
    public T getData() {
 		return data;
 	}

	public void setData(T vertex) {
 		this.data = vertex;
 	}

	public LinkedList<Vertex<T>> getNeighbors() {
		return (LinkedList<Vertex<T>>) neighbors;
	}

	public void setNeighbors(LinkedList<Vertex<T>> neighbors) {
		this.neighbors = neighbors;
	}

	public int compareTo(Vertex<T> ob) {
        String tempA = this.toString();
        String tempB = ob.toString();
         
        return tempA.compareToIgnoreCase(tempB);
    }
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Vertex data: " + this.data;
	}
}
