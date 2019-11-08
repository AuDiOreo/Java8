public class Employee{
	public static void main(String[] args) {
		A tmp = new A();
	}
} 
class A{
	private B b;
	public A (){
		this.b = new B(this);
		this.b.get();
	}
	public void print(){
		System.out.println("Hello World!");
	}

}
class B{
	private A a;
	public B(A a){
		this.a = a;
	}
	public void get(){
		this.a.print();
	}
}