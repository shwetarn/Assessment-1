package testAsOn31stJuly2023;
import java.util.*;
public class ques3DeveloperGame {
	public static List<Integer> globalSum=new ArrayList<Integer>();
	public static void allCombinations(int arr[], int dist[], int min, int max, int index, int r) {
	if(index==r)
	{int summ=0;
		for(int i=0;i<r;i++)
		{
			summ=summ+dist[i];
		}
		globalSum.add(summ);
		return;
	}
	for(int i=min;i<=max&&max-i+1>r-index;i++) {
		dist[index]=arr[i];
		allCombinations(arr,dist,i+1,max,index+1,r);
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int totalSum=0;
		for(int i=0;i<n;i++) {
			int temp=sc.nextInt();
			arr[i]=temp;
			totalSum=totalSum+temp;
		}
		if(n%2!=0)
			System.out.println("False");
		else {
			int boolPresent=-1;
			for(int i=1;i<n;i++) {
				int[] dist=new int[i];
				allCombinations(arr,dist,0,n-1,0,i);
			}
			for(int i=0;i<globalSum.size();i++)
			{
				if((globalSum.get(i)*2)==totalSum) {
					if(boolPresent==-1)
					System.out.println("True");
					boolPresent=1;
				}
			}
			if(boolPresent==-1)
				System.out.println("False");
		}
		// TODO Auto-generated method stub

	}

}
