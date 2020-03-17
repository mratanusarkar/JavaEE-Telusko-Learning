package com.telusko;

public class Varargs {
	
	public static int add(int ... n) {
		int sum = 0;
		for(int i:n) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(add(1,2,3,4,5));
	}
}
