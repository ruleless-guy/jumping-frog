package com.asg.app;

public class Main {
	
	public static void main(String[] args) {
		Frog frog = new Frog();
		frog.jump(30);
		System.out.println("Total jump : "+frog.totalJumps());
	}
	
}

class Frog{
	private int totalJumps;
	private int jumpHeight = 3;
	private int fall = 2;
	
	public void jump(int depthOfPit) {
		totalJumps = 0;
		int height = 0;
		while(height < depthOfPit) {
			++totalJumps;
			height += jumpHeight - fall;
		}
	}
	
	public int totalJumps() {
		return totalJumps;
	}
	
	
}
