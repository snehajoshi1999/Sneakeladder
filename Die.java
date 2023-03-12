package com.brizlabs.snekeladder;


import java.util.Random;
public class Die {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int dice = ran.nextInt(6)+1;
		System.out.println("Dice Outcome : "+dice);

	}

}
