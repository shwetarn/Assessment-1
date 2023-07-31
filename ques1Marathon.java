package testAsOn31stJuly2023;
import java.util.*;

public class ques1Marathon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a starting distance (between 5km to 8km):");
		int n=sc.nextInt();
		if(n>5 && n<8)
		{}
		else {
			int booll=-1;
			while(booll==-1) {
				System.out.println("Sorry, Choose between 5km to 8km");
				System.out.println("Enter a starting distance (between 5km to 8km):");
				int temp=sc.nextInt();
				if(temp>5 && temp<8) {
					booll=1;
					n=temp;
				}
			}
		}
		for(int i=n;i>0;i--) {
			System.out.println("Distance to run: "+i);
			if(i==n-1)
				System.out.println("Good start, keep it up!");
			if(i<3)
				System.out.println("Almost there!");
		}
		System.out.println("Done for the day!");
			
		// TODO Auto-generated method stub

	}

}
