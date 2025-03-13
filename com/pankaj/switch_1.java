package com.pankaj;
import java.util.Scanner;
public class switch_1 {
	public static void main(String args[]){
	System.out.println("Enter Your Name : ");
	try (Scanner sc = new Scanner(System.in)) {
		String name = sc.next();

		switch (name) {
		case "Pankaj": {
			System.out.println("18420");
		}
			break;

		case "Kritika": {
			System.out.println("17459");
		}
			break;

		case "Sumedha": {
			System.out.println("18442");
		}
			break;
		default:
			System.out.println("Invalid Java Student");
		}
	}

    }
}
