package testAsOn31stJuly2023;
import java.util.*;
public class ques4Jumps {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			int temp=sc.nextInt();
			list.add(temp);
		}
		int currIndex=0;
		int currStep=list.get(currIndex);
		int count=0;
		while(currIndex<n-1) {
			int max=Integer.MIN_VALUE;
			int maxIndex=-1;
			if((currIndex+currStep)>n-1) {
				count=count+1;
				currIndex=currIndex+currStep;
			}
			for(int i=currIndex;i<currIndex+currStep;i++) {
				if(max<list.get(i))
				{
					max=list.get(i);
					maxIndex=i;
				}
			}
			count=count+1;
			currIndex=currIndex+list.get(maxIndex);
			currStep=list.get(maxIndex);
		}
		System.out.println(count);
				// TODO Auto-generated method stub

	}

}
