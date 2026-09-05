package Basics;

import java.util.Scanner;

public class OrderDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.veg biryani -----100/-");
		System.out.println("2.pizza------140/-");
		System.out.println("3.chicken dum biryani-----200/-");
		System.out.println("4.burger-------150/-");
		System.out.println("5.exit");

		System.out.println("enter item number");
		int order=sc.nextInt();
		switch (order) {
		case 1->System.out.println("veg biryani -100/\n your item is sucessfull ordered ");
		case 2->System.out.println("pizza------140/-/\n your item is sucessfull ordered ");
		case 3->System.out.println("chicken dum biryani-----120/\n your item is sucessfull ordered ");
		case 4->System.out.println("burger-------150/\n your item is sucessfull ordered ");
		case 5->System.out.println("exit/\n sucessfull  ");
		}
	}

}
