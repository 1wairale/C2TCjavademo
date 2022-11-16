package day6_Collection;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> player=new LinkedList<String>();
		
		player.add("Dhoni");
		player.add("virat");
		player.add("Rohit");
		player.add("Yuvraj");
		player.add("surya");
		
		System.out.println(player);
	
		//System.out.println(player.remove());
		System.out.println(player.remove());
		System.out.println(player);
		
		player.add("Hardik");
		System.out.println(player);
		
		//String added at first and last
		player.addFirst("Pant");
		System.out.println(player);
		player.addLast("KL");
		System.out.println(player);
		
		//String added in between 1 and 3
		player.add(2,"Bhumrahhhhh");
		System.out.println(player);
		
		//Modify 
		player.set(2,"Bhumrah");
		System.out.println(player);
		
		//LinkedList is casesensitive i.e. it show -1
		System.out.println(player.indexOf("hardik"));
		System.out.println(player.indexOf("Hardik"));
	
		System.out.println(player.get(2));
	
	}

}
