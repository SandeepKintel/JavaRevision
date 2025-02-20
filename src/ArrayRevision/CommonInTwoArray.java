package ArrayRevision;

import java.util.ArrayList;

public class CommonInTwoArray {
	public static void main(String[] args) {
		int[] array01= {1, 2, 2, 3};
		int[] array02= {2, 2, 4, 5};
		int[] count = new int[128];
		
		ArrayList<Integer> ar=new ArrayList();
		for(int i=0; i<array01.length; i++)
		{
			for(int j=0; j<array02.length; j++)
			{
				if(array01[i]==array02[j])
				{
					if(ar.contains(array01[i]))
					ar.add(array01[i]);

					
				}
			}
		}
		System.out.println(ar);
	}

}
