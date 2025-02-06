package ArrayProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class PrintArrayuptoanIndex {
	public static void main(String[] args) {
		int array[] = {34, 54, 87, 45, 98};
		int array02[] = new int[6];
		
		System.out.println(Arrays.toString(array));
		
		for(int i=array.length-1,k=0; i>=array[0]; i--, k++)
		{
			array02[k]=array[i];
		}	
		
		System.out.println(Arrays.toString(array02));
	}
}
