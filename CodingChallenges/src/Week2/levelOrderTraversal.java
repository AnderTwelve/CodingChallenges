package Week2;

import java.util.LinkedList;
import java.util.Queue;

class Node { 
	int data; 
	Node left, right; 
	
	public Node(int item) { 
		data = item; 
		left = null; 
		right = null; 
	}
}

class BinaryTree { 
	Node root; 
	
	void levelOrderTraversal() { 
		Queue<Node> queue = new LinkedList<Node>(); 
		queue.add(root);
		
		while(!queue.isEmpty()) { 
			Node saved = queue.poll(); 
			System.out.print(saved.data + " " ); 
			
			if (saved.left != null) { 
				queue.add(saved.left) ;
			}
			
			if (saved.right != null) { 
				queue.add(saved.right);
			}
		}
	}
}

public class levelOrderTraversal {
	public static void main(String[] args) { 
		BinaryTree tree = new BinaryTree(); 
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		tree.root.right.left = new Node(6); 
		tree.root.right.right = new Node(7); 
		tree.root.left.right.left = new Node(8); 
		tree.root.left.right.right = new Node(9); 
		tree.root.left.right.left.left = new Node(10); 
		tree.root.left.right.left.right = new Node(11); 
		
		// Tree structure -> 
		//		    1
		//		2       3	
		//            4   5   6   7
		//              8   9
		//           10  11
		
		System.out.print("Level order traversal of the provided "
				+ "binary tree is: "); 
		tree.levelOrderTraversal();
		
	}

}
