package Java_Assignment6;

abstract class Engine{
	public abstract void start();
	public abstract void stop();
	public void details(int cy, int hp) {
		System.out.println("The Engine " + hp + " horse Power and " + cy + " Cylinder");
	}
}
class car extends Engine {
	
	@Override
	public void start() {
		
		System.out.println("Car Engine Started");
	}
	@Override
	public void stop() {
		System.out.println("Car Engine Stopped");
	}
}
class TestEngine
{
	public static void main(String args[]) {
		car c=new car();
		c.start();
		c.stop();
		c.details(4, 200);
		
	}
}