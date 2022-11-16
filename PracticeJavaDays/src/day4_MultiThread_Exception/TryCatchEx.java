package day4_MultiThread_Exception;

class Eclipse extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("Eclipse thread name is "+Thread.currentThread().getName());
		try
		{
			sleep(2000);
		}catch(InterruptedException e){
			//catch block
			e.printStackTrace();
		  }
	
		}
	}
}

public class TryCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object created for accessing class
		Eclipse e=new Eclipse();
		e.start();
		
		Eclipse e1=new Eclipse();
		e1.start();
		
	}

}
