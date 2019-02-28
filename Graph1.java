package p1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;

public class Graph1 {
	
	private int vertices;
	private LinkedList<Integer> adj[];
	
	//constructor to make a graph
	Graph1(int v){
		vertices= v;
		adj= new LinkedList[v];
		for(int i=0;i<v;++i){
			adj[i]= new LinkedList();
		}
		
	}
	
	public void addEdge(int u, int v){
		adj[u].add(v);
	}
	
	public void BfsTraversal(int source){
		
		boolean visited[] = new boolean[vertices];
		LinkedList<Integer> que= new LinkedList<Integer>();
		int level[]= new int[vertices];
		visited[source]= true;
		que.add(source);
		level[source]=0;
		while(que.size()!= 0){
			//System.out.println("Size: "+que.size());
			
			int ij= que.poll();
			System.out.print("\n---> "+ij+ "\n");
			System.out.println("Its level: " +level[ij]);
			
			Iterator<Integer> itr= adj[ij].listIterator();
			while(itr.hasNext()){
				
				int i= itr.next();
				System.out.print("Next options are: " + i +" ");
				if(!visited[i]){
				//System.out.println("Status: " + visited[i]);
				visited[i]= true;
				que.add(i);
				level[i] = level[ij]+1;
				System.out.println();
				
				}
				
			}
			
		}
		
	}
	public static void main(String[] args) {
		
		Graph1 g= new Graph1(4);
		//insert according to the adjacency matrix
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,2);
		g.addEdge(2,0);
		g.addEdge(2,3);
		//g.addEdge(3,3);
		g.BfsTraversal(2);
		

	}

}
