package com.bl.lineComparison;

public class Equalequal {

	public static void main(String[] args) {
		String s1 = "A";
		String s2 = "B";
		String s3 = "C";
		String s4 = new String("A");
		System.out.println(s1 +" == " + s2 + " : " + (s1 == s2));
		System.out.println(s1 +" == " + s3 + " : " + (s1 == s3));
		System.out.println(s2 +" == " + s3 + " : " + (s2 == s3));
		System.out.println(s1 +" == " + s4 + " : " + (s1 == s4));

	}

}
