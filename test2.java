package p1;

import java.io.IOException;

public class test2 extends Node{
	public class lA{
		int a= 100;
		public void display(){
			System.out.println("Inside: " + a);
		}
	}
	public class lB extends lA{
		int a= 100;
		public void display(){
			System.out.println("Inside: " + a);
		}
	}
	

	
	public Node rotate(Node head, int n){
		
		return head;
	}
	
	public static void main(String[] args) {
		//System.out.println("Here");
		
		
		
	}
	
}


class Node{
	private String name;
	private Node next;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
