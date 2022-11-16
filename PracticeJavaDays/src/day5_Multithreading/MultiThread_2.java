package day5_Multithreading;

class Eclips extends Thread{
	
	public void run()
	{
		//using for loop
		for(int i=0; i<4; i++) {
			System.out.println("Eclipse Thread name is "+Thread.currentThread().getName());
			System.out.println("Eclipse Thread id is "+Thread.currentThread().getId());
		}
	}
}
public class MultiThread_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclips e=new Eclips();
		e.start();
		for(int i=0; i<4; i++) {
			System.out.println("Main Thread name is "+Thread.currentThread().getName());
			System.out.println("Main Thread Id is "+Thread.currentThread().getId());
		}

	}

}
