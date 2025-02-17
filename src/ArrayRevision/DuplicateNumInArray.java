package ArrayRevision;

import java.util.ArrayList;

public class DuplicateNumInArray {
	public static void main(String[] args) {
		int[] input= {4, 3, 2, 7, 8, 2, 3, 1};
		int[] count = new int[128];
		
		
		ArrayList<Integer> ar=new ArrayList();
		for(int i=0; i<input.length; i++)
		{
			int num = input[i];
			if(count[num]>0)
			{
				ar.add(num);
			}
			count[num]++;
			
		}
		
		System.out.println("duplicate numbers are "+ar);
		System.out.println("test");
	}

}
