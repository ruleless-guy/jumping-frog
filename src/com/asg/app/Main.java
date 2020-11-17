package com.asg.app;

public class Main {
	
	public static void main(String[] args) {
		Frog frog = new Frog();
		frog.jump(30);
		System.out.println("Total jump : "+frog.totalJump());
	}
	
}

class Frog{
	private int totalJump;
	private int jumpHeight = 3;
	private int fall = 2;
	
	public void jump(int depthOfPit) {
		totalJump = 0;
		int height = 0;
		while(height < depthOfPit) {
			++totalJump;
			height += jumpHeight - fall;
		}
	}
	
	public int totalJump() {
		return totalJump;
	}
	
	
}
