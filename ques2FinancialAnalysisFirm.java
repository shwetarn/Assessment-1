package testAsOn31stJuly2023;
import java.util.*;
public class ques2FinancialAnalysisFirm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			int temp=sc.nextInt();
			list.add(temp);
		}
		int maxFinal=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int maxTillHere=0;
				for(int k=i;k<=j;k++) {
					maxTillHere=maxTillHere+list.get(k);
					if(maxTillHere>maxFinal)
						maxFinal=maxTillHere;
				}
			}
		}
		System.out.println(maxFinal);
		// TODO Auto-generated method stub

	}

}
