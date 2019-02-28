package p1;

public class Excep extends Exception{

	int a= 10;
	Excep(){
		
	}
	
	public Excep(int a){
		this.a= a;
	}

	public void func(){
		System.out.println("from parent");
	}

}
