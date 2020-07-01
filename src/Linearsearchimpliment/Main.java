package Linearsearchimpliment;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	int[] array ={10,20,30,40,50,60,70};
	Linearsearch obj = new Linearsearch(array);
	Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		 int searchelement = sc.nextInt();
		boolean res= obj.linearsearch(searchelement);
		if(res){
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
