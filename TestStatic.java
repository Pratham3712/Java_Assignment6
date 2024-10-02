package Java_Assignment6;

class Parent
{
	static void print() {
		System.out.println("Parent");
	}
}
class Child extends Parent
{
	static void print() {
		System.out.println("Child");
	}
}
public class TestStatic {

	public static void main(String[] args) {
		Parent.print();
        System.out.println("============================================");
        Child.print();
        System.out.println("============================================");
		Parent obj=new Child();
		obj.print();

	}

}
