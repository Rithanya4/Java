import java.io.*;
import java.util.*;

public class intersect {
	static ArrayList<Integer>
	RemoveElements(ArrayList<Integer> A,
				ArrayList<Integer> B)
	{
		for (int i = 0; i < A.size(); ++i) {
			if (B.contains(A.get(i)) == false) {
				A.remove(i);
			}
		}
		return A;
	}
	static void print(ArrayList<Integer> A)
	{
		for (int element : A) {
			System.out.print(element + " ");
		}
	}
	public static void main(String[] args)
	{
		ArrayList<Integer> A = new ArrayList<>();
		A.add(11);
		A.add(32);
		A.add(33);
		A.add(46);
                A.add(76);
		ArrayList<Integer> B = new ArrayList<>();
		B.add(11);
		B.add(33);
		B.add(35);
                B.add(46);
		ArrayList<Integer> UpdatedCollection= RemoveElements(A, B);
              	print(A);
	}
}
