package com.asg.app;

public class Main {
	
	public static void main(String[] args) {
		Frog frog = new Frog();
		System.out.println("Total jump : "+frog.totalJumps(30, true));
		System.out.println("Total jump : "+frog.totalJumps(30, false));
		
	}
	
}

class Frog{
	private int jumpHeight = 3;
	private int fall = 2;
	
	public int totalJumps(int depth , boolean inclusive) {
		
		if(!inclusive && ( (totalJumps(depth,true) - 2) * ( jumpHeight - fall ) ) == (depth - jumpHeight)) {
			return totalJumps(depth,true) -1;
		}else {
			return ( (depth-jumpHeight) / (jumpHeight - fall) ) + 2;
		}
	}
}
