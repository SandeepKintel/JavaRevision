package ArrayProgram;

public class IncedoArray {
	public static void main(String[] args) {
		int input[] = {55,99,80,12,9};
		
		int highest = 0;
		int sechighest = 0;
		
		for(int i =0; i<input.length; i++)
		{
			if(highest<input[i])
			{
				highest=input[i];
			}else if(sechighest!=highest && sechighest<input[i])
			{
				sechighest=input[i];
			}
		}
		System.out.println(sechighest);
		
		

}
}