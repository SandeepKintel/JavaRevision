package ArrayRevision;

public class SecLargestNo {
	public static void main(String[] args) {
		int[] input= {10, 5, 8, 20, 15};
		int max=0;
		int secmax=0;
		
		for(int i=0; i<input.length; i++)
		{
			if(input[i]>max)
			{
				 max=input[i];
			}else {
				if(input[i]<max && input[i]>secmax )
				{
					secmax=input[i];
				}
			}
		}
		
		System.out.println(secmax);
	}

}
