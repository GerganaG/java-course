package tree;

public class TestTreeNode {

	public static void main(String[] args) {
		TreeNode<String> root = new TreeNode<String>("root");
		System.out.println(root.depth(root));
		{
			TreeNode<String> node0 = root.addChild("node0");
			System.out.println(root.depth(node0));
			TreeNode<String> node1 = root.addChild("node1");
			System.out.println(root.depth(node1));
			TreeNode<String> node2 = root.addChild("node2");
			System.out.println(root.depth(node2));
		    {
		    	TreeNode<String> node20 = node2.addChild(null);
		    	System.out.println(root.depth(node20));
		    	TreeNode<String> node21 = node2.addChild("node21");
		    	System.out.println(root.depth(node21));
		        {
		        	TreeNode<String> node210 = node20.addChild("node210");
		        	System.out.println(node0.depth(node210));
		        }
		    }
		}
		
		root.print(root , 0);
	}
}
