package day5_Multithreading;

//MultiThread by using Thread class
class Eclipse extends Thread{
	public void run()                                                       
	//Constructor for Thread 1
	{                                                                       
		//run method
		System.out.println("Eclipse thread name is "+Thread.currentThread().getName());
		System.out.println("Eclipse thread Id is "+Thread.currentThread().getId());
		
	}
}
class Calculater extends Thread{
	//Thread 2
	public void run()
	{
		System.out.println("Calulater Thread name is"+Thread.currentThread().getName());
		//To print name of Thread
		System.out.println("Eclipse thread Id is "+Thread.currentThread().getId());
	}
}
class Chrome extends Thread{
	//Thread 3
	public void run()
	{
		System.out.println("Chrome Thread name is"+Thread.currentThread().getName());
		System.out.println("Eclipse thread Id is "+Thread.currentThread().getId());
	}
}
class OneNote extends Thread{
	//Thread 4
	public void run()
	{
		System.out.println("OneNote Thread name is"+Thread.currentThread().getName());
		System.out.println("Eclipse thread Id is "+Thread.currentThread().getId());
	}
}
public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclipse e=new Eclipse();                                          
		//Object to call Thread 1
		e.start();                                                        
		//start method
		Calculater c=new Calculater ();
		c.start();
		Chrome ch=new Chrome();
		ch.start();
		OneNote on=new OneNote();
		on.start();
		
		System.out.println("Eclipse thread name is "+Thread.currentThread().getName());
		System.out.println("Eclipse thread Id is "+Thread.currentThread().getId());
	}

}
