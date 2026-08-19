package com.bucket.debug;

import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>(); //16
		
		set.add("iPhone17");
		set.add("samsungs26");
		set.add("lg32");
		set.add("mac-pro324");
		
		int iPhone17Hash = "iPhone17".hashCode();
		System.out.println("hash: "+iPhone17Hash);
		int iPhone17SpreadHash = iPhone17Hash ^ (iPhone17Hash >>> 16);
		System.out.println(iPhone17SpreadHash);
		int iPhone17Bucket = iPhone17SpreadHash & 15;
		System.out.println("iPhone17 bucket number is : "+iPhone17Bucket);
		
		int samsungs26Hash = "samsungs26".hashCode();
		int samsungs26SpreadHash = samsungs26Hash ^ (samsungs26Hash >>> 16);
		int samsungs26Bucket = samsungs26SpreadHash & 15;
		System.out.println("samsungs26 bucket number is : "+samsungs26Bucket);

		int lg32Hash = "lg32".hashCode();
		int lg32SpreadHash = lg32Hash ^ (lg32Hash >>> 16);
		int lg32Bucket = lg32SpreadHash & 15;
		System.out.println("lg32 bucket number is : "+lg32Bucket);
		
		int macpro324Hash = "mac-pro324".hashCode();
		int macpro324SpreadHash = macpro324Hash ^ (macpro324Hash >>> 16);
		int macpro324Bucket = macpro324SpreadHash & 15;
		System.out.println("samsung26 bucket number is : "+macpro324Bucket);
	}

}
