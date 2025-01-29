package ArrayRevision;

import java.util.ArrayList;

public class IncedoSecondLargestNum {
	public static void main(String[] args) {
		//int marks[]= {};
		ArrayList<Integer> al= new ArrayList<>();
		al.add(55);
		al.add(99);
		al.add(80);
		al.add(12);
		al.add(9);
		System.out.println(al);
		al.sort(null);
		System.out.println(al.reversed().get(1));
		System.out.println(al.get(al.size()-2));

}
}
