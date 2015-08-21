package graph;

public class TestGraph {

	public static void main(String[] args) {
		
		Graph<String> graph = new Graph<String>();
		Vertex<String> node1 = new Vertex<String>("node1");
		Vertex<String> node2 = new Vertex<String>("node2");
		Vertex<String> node3 = new Vertex<String>("node3");
		Vertex<String> node4 = new Vertex<String>("node4");
		Vertex<String> node5 = new Vertex<String>("node5");
		Vertex<String> node6 = new Vertex<String>("node6");
			
		graph.addVertex(node1);
		graph.addVertex(node2);
		graph.addVertex(node3);
		graph.addVertex(node4);
		graph.addVertex(node5);
		graph.addVertex(node6);
		
		graph.addEdge(node1, node2);
		graph.addEdge(node1, node3);
		graph.addEdge(node2, node3);
		graph.addEdge(node2, node4);
		graph.addEdge(node4, node5);
		
		System.out.println("Vertices and their neighbors: ");
		System.out.print(node1 + ", neighbors: ");
		System.out.println(node1.getNeighbors());
		System.out.print(node2 + ", neighbors: ");
		System.out.println(node2.getNeighbors());
		System.out.print(node3 + ", neighbors: ");
		System.out.println(node3.getNeighbors());
		System.out.print(node4 + ", neighbors: ");
		System.out.println(node4.getNeighbors());
		System.out.print(node5 + ", neighbors: ");
		System.out.println(node5.getNeighbors());
		
		boolean result = graph.containsEdge(node1, node3);
		System.out.println("\nIs there edge between node1 and node3: " + result);
		boolean res = graph.containsEdge(node1, node5);
		System.out.println("Is there edge between node1 and node5: " + res);
		
		System.out.print("Is there path between node1 and node5: ");
		graph.hasPath(node1, node4);
		
	}

}
