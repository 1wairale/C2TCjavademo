package oopsConcepts;

class Car {

	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public int getSpeed()
	{
		return speed;
	}
	public class Hello
	{
		public static void main(String[] args) 
		{
			Car_1 car=new Car_1();
			Car_1.setSpeed(10);
			System.out.println(car.getSpeed());
		
	}

}

}
