package p1;

import java.util.Stack;

public class LinkedList_All {

	//head
	Node head;
	
	class Node{
		
		int data;
		Node next;
		//constructor to create new node
		Node(int data){
		this.data=data;
		this.next=null;
		}
	}
	//insert new data
	public void push1(int data){
		
		Node new_n= new Node(data);
		new_n.next = head;
		head= new_n;
			
	}
	
	public void display(Node node){
		Node n= node;
		while(n != null){
			if(n.next == null) System.out.print(n.data);
			else System.out.print(n.data + "-->");
			n= n.next;
		}
		System.out.println("  ");
	}
	
	//delete data
	public Node removeLast(Node head){
		
		if(head == null) return null;
		if(head.next == null){
			//removeLast(head);
			return null;
		}
		Node sec_last = head;
		while(sec_last.next.next != null){
			sec_last= sec_last.next;
		}
		removeLast(sec_last.next);
		sec_last.next= null;
		
		return head;	
		
	}
	
	//reverseList
	public Node reverseList(Node head){
		Node prev = null;
		Node curr= head;
		Node next1= null;
		
		while(curr != null){
			next1= curr.next;
			curr.next= prev;
			prev= curr;
			curr= next1;
		}
		head = prev;
		return head;
		
	}
	//swap consecutive two elements
	public static void swapTwo(Node node){
		Node temp= node;
		int temp1;
		while(temp!= null && temp.next != null){
			temp1= temp.data;
			temp.data= temp.next.data;
			temp.next.data= temp1;
			temp= temp.next.next;
			//System.out.println(temp.data);
		}
		
	}
	// check if LL is pallindrome or not
	public static void pallindromeLL(Node node){
		Node nextPtr= node;
		Stack st= new Stack();
		while(node!= null){
			st.push(node.data);
			node= node.next;
		}
		while(nextPtr != null){
			int popped= Integer.parseInt(String.valueOf(st.pop()));
			
			if(popped != nextPtr.data){
				System.out.println(popped+ String.valueOf(nextPtr.data) + "Not a pallindrome");
				return;
			}
			nextPtr= nextPtr.next;
	}
		System.out.println( "Pallindrome! YAY!");
	}
	
	//print reverse without actually reversing
	public static void reverseFalse(Node node){
		Stack st= new Stack();
		Node temp= node;
		while(temp!= null){
			st.push(temp.data);
			temp= temp.next;
		}
		while(!st.isEmpty()){
			System.out.print("--> ");
			System.out.print(st.pop());
		}
	}
	
	public static void deleteWithoutHead(Node n){
		Node nextData= n.next; // gives us next node
		n.data= nextData.data;
		n.next = nextData.next;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_All lnk= new LinkedList_All();
/*	Trial test	
 * int i=1;
		if(i==0){
			System.out.println("first"+ i);
			return;
		}
		i++;
		System.out.println("Sec" + i);
		
		System.out.println("third" + i);
		*/
		lnk.push1(1);
		lnk.push1(12);
		lnk.push1(13);
		lnk.push1(14);
		lnk.push1(15);
		lnk.push1(16);

		//lnk.display();
		//lnk.removeLast(lnk.head);
		lnk.display(lnk.head);
		//lnk.display(lnk.reverseList(lnk.head));
		//lnk.swapTwo(lnk.head);
		//lnk.display(lnk.head);
		//pallindromeLL(lnk.head);
		//reverseFalse(lnk.head);
		int a= 299;
		byte b= (byte)a;
		System.out.println(b);
		
		
	}

}
