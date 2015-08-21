package tree;

public class TestTree {

	public static void main(String[] args) {
	
		Node<String> parentNode = new Node<String>("Parent"); 
		Node<String> childNode = new Node<String>("Child 1", parentNode);

		Node<String> grandchildNode = new Node<String>("Grandchild of parentNode. Child of childNode1", childNode); 
		
		System.out.println("Parent depth: " + depth(parentNode));
		System.out.println("Child depth: " + depth(childNode));
		System.out.println("Grandchild depth: " + depth(grandchildNode));

	}
	
	public static int depth(Node<String> current){
    	int d = 0;
    	if(current.parent == null){
    		return d;
    	} else{
    		while(current.parent != null){
    			d++;
    			current = current.parent;
    		}
    		return d;
    	}
    }
}
