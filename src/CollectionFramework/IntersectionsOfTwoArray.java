package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionsOfTwoArray {
	
	public static void main(String[] args) {
        Integer arr1[] = {1, 2, 3, 4, 5};
        Integer arr2[] = {3, 4, 5, 6, 7};
        
        ArrayList l1=new ArrayList(Arrays.asList(arr1));
        ArrayList l2=new ArrayList(Arrays.asList(arr2));
        l1.retainAll(l2);
        System.out.println(l1);
	}
	

}
