package tree;

import java.util.LinkedList;
import java.util.List;

public class TreeNode<T> {

	T data;
    TreeNode<T> parent;
    List<TreeNode<T>> children;

    public TreeNode(T data) {
        this.data = data;
        this.children = new LinkedList<TreeNode<T>>();
    }

    public TreeNode<T> addChild(T child) {
    	TreeNode<T> childNode = new TreeNode<T>(child);
        childNode.parent = this;
        this.children.add(childNode);
        return childNode;
    }
    
    public void print(TreeNode<T> node, int depth){
    	for (int i = 0; i < depth; i++) {
    	  	System.out.print("\t");	
		}
    	System.out.println(node.data);
    	depth++;

    	for (int i = 0; i < node.children.size(); i++) {
			print(node.children.get(i), depth);
		}
    }
    
	public int depth(TreeNode<String> current){
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
