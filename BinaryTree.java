package p1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


class Node1{
	int data;
	Node1 left,right;
	
	public Node1(int data){
		this.data= data;
		left= right= null;
	}
}
class BinaryTree {
	static Node1 n;
		
	//to insert values in a node
		public Node1 insert(Node1 n, int data){
			
			if(n==null){
				return (new Node1(data));
			}
			if(data<= n.data){
				n.left= insert(n.left, data);
			}
			else if(data>= n.data){
				n.right= insert(n.right,data);
			}
			
			return n;
			
		}
		
		public static void inOrderDisplay(Node1 n){
			if(n== null) return;
			
			inOrderDisplay(n.left);
			
			System.out.print(n.data+ " ");
			inOrderDisplay(n.right);
			
		}
		
		public static void preOrderDisplay(Node1 n){
			if(n== null) return;
			System.out.print(n.data + " ");
			preOrderDisplay(n.left);
			preOrderDisplay(n.right);
		}
		public static void postOrderDisplay(Node1 n){
			if(n== null) return;
			postOrderDisplay(n.left);
			postOrderDisplay(n.right);
			System.out.print(n.data + " ");
		}
		public static void insertinLevelOrder(Node1 n, int data){
			Queue<Node1>  apnaQ= new LinkedList<Node1>();
			apnaQ.add(n);
			while(!apnaQ.isEmpty()){
				n= apnaQ.peek();
				apnaQ.remove();
				if(n.left == null){
					n.left = new Node1(data);
					break;
				}
				else 
					apnaQ.add(n.left);
				if(n.right== null){
					n.right = new Node1(data); break;
				}
				else
					apnaQ.add(n.right);
			}
			
		}
		public static boolean isIdentical(Node1 x, Node1 y){
			if(x == null && y== null) return true;
			
			if((x.data == y.data) && isIdentical(x.left, y.left) && isIdentical(x.right, y.right))
				return true;
			else
				return false;
		}
		
		public static void levelOrderTraversal(Node1 root){
			// Level order traversal using Queue and reverse order traversal using Stack
			Queue<Node1> que= new LinkedList<Node1>();
			que.add(root);
			Stack <Node1>reverseTrav = new Stack<Node1>();
			
			if(root == null) return;
			while(!que.isEmpty()){
				Node1 n2= que.poll();
				System.out.print(n2.data + " ");
				reverseTrav.push(n2);
				if(n2.left != null){
					que.add(n2.left); //reverseTrav.push(n2.left);
				}
				if(n2.right != null){
					que.add(n2.right); //reverseTrav.push(n2.right);
				}
			
			}
			System.out.println("\nReverse level order traversal");
			while(!reverseTrav.isEmpty()){
				Node1 nx= reverseTrav.pop();
				System.out.print(nx.data+ " ");
			}
			
		}
		
		public static void zigzagTraversal(Node1 n){
			System.out.println("\\\\NOT COMPLETE////");
			Queue<Node1> que= new LinkedList<Node1>();
			HashMap<Node1, Integer> hmZig= new HashMap<Node1, Integer>();
			Stack<Node1> stLtoR= new Stack<Node1>();
			Stack<Node1> stRtoL = new Stack<Node1>();
			que.add(n);
			int evenOrOdd= 1;
			while(!que.isEmpty()){
				//why Poll because remove gives NoSuchElementFound excep when que is empty but poll gives null
				Node1 nx= que.poll();
				//evenOrOdd++;
				
				hmZig.put(nx, evenOrOdd);
				if(nx.left != null){
					que.add(nx.left);
					//change level
					System.out.println("Level now: " + evenOrOdd);
					evenOrOdd++;
				}
				if((nx.right != null)){
					que.add(nx.right);
				}
			
				
			}
			
			
		for(Node1 i : hmZig.keySet()){
			
			System.out.print(i.data+" -> ");
		}
			
			
		}

	public static void main(String[] args){
		
		BinaryTree bt= new BinaryTree();
		n= new Node1(10);
		n.left= new Node1(11);
		n.right= new Node1(9);
		n.left.left= new Node1(7);
		n.right.left= new Node1(15);
		n.right.right= new Node1(8);
		//System.out.println("Level order traversal: ");
		//levelOrderTraversal(n);
		System.out.println("\nZig Zag traversal: ");
		zigzagTraversal(n);
		//System.out.println("Inorder traversal : ");
		 //inOrderDisplay(n);
		 //System.out.println("\n Level order: ");
		
/*		Node1 n2= new Node1(10);
		n2.left= new Node1(7);//this
		n2.right= new Node1(9);
		n2.left.left= new Node1(11);//this
		n2.right.left= new Node1(15);
		n2.right.right= new Node1(8);
		System.out.println(isIdentical(n, n2));
		Node1 x= new Node1(5);
		Node1 y= new Node1(5);
		//System.out.println(isIdentical(x, y));
*/		/*bt.insert(root, 2);
		bt.insert(root, 3);
		bt.insert(root, 4);
		bt.insert(root, 5);
		bt.insert(root, 6);*/
/*		System.out.println("Inorder Traversal");
		inOrderDisplay(bt.n);
		System.out.println("\nPre Order traversal");
		preOrderDisplay(bt.n);
		System.out.println("\nPost Order Display: ");
		postOrderDisplay(bt.n); 
		insertinLevelOrder(n, 12);
		System.out.println("Inorder Traversal now: ");
		inOrderDisplay(n);*/
		
		
	}	

}
