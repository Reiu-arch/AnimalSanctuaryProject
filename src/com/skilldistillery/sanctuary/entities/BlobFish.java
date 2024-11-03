package com.skilldistillery.sanctuary.entities;

public class BlobFish extends Animal{
//TODO noise, nakenoise, eat

	private static String noise = "glub glub";
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
		super.makeNoise();
	}
	
		@Override
		public int eat(int amount) {
			makeNoise();
			System.out.println("You fed the blob fish," +amount + " blobs.");
			return super.eat(amount);
	}
}
