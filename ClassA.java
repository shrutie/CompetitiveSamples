package p1;

class ClassB{
	
	int a= 100;
	public void display(){
		System.out.println("Inside: " + a);
	}
	public void trial(){
		System.out.println("Trial in parent");
	}
}
public class ClassA extends ClassB{

	int b= 11;
	public void display(){
		System.out.println("Inside: " + b);
	}
	public void trial(){
		System.out.println("Trial here");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB cb= new ClassB();
		cb.display();
		ClassA ca = new ClassA();
		ca.display();
		ClassB c1= new ClassA();
		c1.display();
		c1.trial();
		
		
	}

}

