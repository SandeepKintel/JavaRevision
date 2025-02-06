package ArrayRevision;

import java.util.Arrays;

public class SecondHighestNumInArray {
public static void main(String[] args) {
	int array01[] = {65, 34, 54, 98, 12};
	
	int highest_num=0;
	int sec_highest= 0;
	
	for(int num: array01)
	{
		if(num>highest_num)
		{
			//sec_highest=highest_num;
			highest_num =  num;
		}else if(num>sec_highest && num<highest_num)
		{
			sec_highest = num;
		}
	}
	System.out.println(highest_num);
	System.out.println(sec_highest);
		
	}
}
