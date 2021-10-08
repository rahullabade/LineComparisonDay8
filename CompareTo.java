package com.bl.lineComparison;

public class CompareTo {

	public static void main(String[] args) {
		String s1 = "A";
		String s2 = "A";
		String s3 = "A";
		String s4 = new String("A");
		System.out.println(s1 +" .compareTo " + s2 + " : " + s1.compareTo(s2));
		System.out.println(s1 +" .compareTo " + s3 + " : " + s1.compareTo(s3));
		System.out.println(s3 +" .compareTo " + s3 + " : " + s3.compareTo(s2));
		System.out.println(s1 +" .compareTo " + s4 + " : " + s1.compareTo(s4));

	}

}
