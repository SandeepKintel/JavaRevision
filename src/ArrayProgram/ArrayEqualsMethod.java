package ArrayProgram;

import java.util.Arrays;

public class ArrayEqualsMethod 
{
	public static void main(String[] args) 
	{
		   int input[] = new int[3];
		   input[0]= 30;
		   input[1]= 54;
		   input[2]= 34;
		   
		   int output[] = new int[3];
		   for(int i =0; i<input.length; i++)
		   {
			   output[i]=input[i];
			   
		   }
		   System.out.println(Arrays.toString(output));
		   boolean b1 =Arrays.equals(input, output);
		   if(b1==true)
		   {
			   System.out.println("arrays are equals");
		   }else {
			   System.out.println("Not true");
		   }
	}

   
   
   

}
