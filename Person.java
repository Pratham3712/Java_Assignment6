package Java_Assignment6;

public class Person {

	private final String name;
    private final int age;
    
    public Person() 
    {
    	name="Prathamesh";
    	age=24;
	}
    
    public String getName() {
		return name;
	}
    

	public int getAge() {
		return age;
	}

	
	/*public void setName(String name) 
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}*/
	
	public void display()
    {
    	System.out.println("Name of Person - "+name);
    	System.out.println("Age of Person - "+age);
    }
    
	public static void main(String[] args)
	{
		Person person=new Person();
		person.display();
		
}
		
}


