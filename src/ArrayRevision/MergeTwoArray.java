package ArrayRevision;

import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoArray {
	public static void main(String[] args) {
		int[] array01= {2,3, 4, 6};
		int[] array02= {3, 1, 3, 5};
		ArrayList<Integer> ar = new ArrayList();
		
		int[] array03= new int[128];
		
		for(int i=0;i<array01.length; i++)
		{
			int num=array01[i];
			if(array03[num]==0)
			{
				ar.add(num);
			}
			array03[num]++;
		}
		for(int i=0;i<array02.length; i++)
		{
			int num=array02[i];
			if(array03[num]==0)
			{
				ar.add(num);
			}
			array03[num]++;
		}

		
		Collections.sort(ar);
		System.out.println(ar);
		
		
				
		
	}

}
