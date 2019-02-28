package p1;

public class ChildExcep extends Excep{

	int a= 10;
	public ChildExcep(){
	super();
	}
	public void func(){
	
		System.out.println("from Child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildExcep obj= new ChildExcep();
		Excep obj2= new Excep(12);
		obj.func();
		obj2.func();
	}

}
