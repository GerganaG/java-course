package graph;

import java.util.ArrayList;
import java.util.List;

public class Graph<T> {
	
	 private List<Vertex<T>> vertices;
	 
	 public Graph() {
		 vertices = new ArrayList<Vertex<T>>();
	 }
	  	 
	 public void addVertex(Vertex<T> vertex){
		 if (!vertices.contains(vertex)) {
			 vertices.add(vertex);
		 }
	 }
	 
	 public void addEdge(Vertex<T> vertex1, Vertex<T> vertex2){
		 vertex1.getNeighbors().add(vertex2);
		 vertex2.getNeighbors().add(vertex1);
	 }
	 
	 public boolean containsEdge(Vertex<T> vertex1, Vertex<T> vertex2){
		 if(vertex1.getNeighbors().contains(vertex2)){
			 return true;
		 } else{
			 return false;
		 }
	 }
	 
	 public void hasPath(Vertex<T> start, Vertex<T> end){	
		 if(start.getNeighbors().contains(end)){
			 System.out.println("have");			 
		 } else{
			 for(int i = 0; i < start.getNeighbors().size(); i++){
				 Vertex<T> temp = start.getNeighbors().poll();
				 hasPath(temp, end);
			 }
			 return;
		 }
	 }
}
