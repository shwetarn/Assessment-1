package testAsOn31stJuly2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ques5SortString {
	public static void singleName(int n) {
		Scanner sc=new Scanner(System.in);
		String list[]=new String[n];
//		List<String> list=new ArrayList<String>();
		for(int i=0;i<n;i++) {
			String tems=sc.next();
			list[i]=tems;
//			String s3=String.format("%d", 101);
//			byte b1[]=list[i].getBytes();
//			System.out.print("byte "+b1);
//			list.add(tems);
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(list[i].compareTo(list[j])>0) {
					String temp=list[i];
					list[i]=list[j];
					list[j]=temp;
				}
			}
		}
//		Arrays.sort(list);
		for(int i=0;i<n;i++)
			System.out.print(list[i]+"  ");
	}
	
	public static void doubleName(int n) throws Exception {
		Scanner sc=new Scanner(System.in);
		String list[]=new String[n];
//		List<String> list=new ArrayList<String>();
		for(int i=0;i<n;i++) {
			BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
			String e1=b1.readLine();
			list[i]=e1;
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(list[i].compareTo(list[j])>0) {
					String temp=list[i];
					list[i]=list[j];
					list[j]=temp;
				}
			}
		}
//		Arrays.sort(list);
		for(int i=0;i<n;i++)
			System.out.println(list[i]+"  ");
	}

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of students for Scenario 1");	
		int n=sc.nextInt();
		singleName(n);
		System.out.println();
		System.out.println("Scenario 2: Number of students for First Name and Surname");
		int m=sc.nextInt();
		doubleName(m);
		// TODO Auto-generated method stub

	}

}
