package day5_Multithreading;

	// use abstraction 
	class Eclipsee implements 
	Runnable
	{
		public void run()
		{
			System.out.println("Main Thread name is"+Thread.currentThread().getName());
			System.out.println("Main Thread Id is"+Thread.currentThread().getId());
		}
	}

	public class MultiTr_ImplEx {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Eclipsee e=new Eclipsee();
	Thread t=new Thread(e);
	t.start();
	
	//get name and id
	System.out.println("Main Thread name is "+Thread.currentThread().getName());
	System.out.println("Main Thread ID is "+Thread.currentThread().getId());
	
	
	}

}
