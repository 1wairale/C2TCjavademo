package day6_Collection;

import java.util.Iterator;
import java.util.LinkedList;
public class ItaratorEx {
	
	//itarator used
	void display(LinkedList<String> list) {
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			
			System.out.println("player Name is :"+it.next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> player=new LinkedList<String>();
		
		player.add("Dhoni");
		player.add("Virat");
		player.add("Rohit");
		player.add("Yuvraj");
		player.add("surya");
		
		System.out.println(player);
		
		ItaratorEx it=new ItaratorEx();
		it.display(player);
		
	}

}
