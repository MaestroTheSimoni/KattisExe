package abcKatties;

import java.util.Scanner;

//import com.sun.tools.javac.util.ArrayUtils;

//import java.util.*;
import java.util.Arrays;

public class Katties {

	public static int indexOf(char needle, char[] haystack) {
		for (int i = 0; i < haystack.length; i++) {
			if (haystack[i] == needle)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {

		// int A = 0;
		// int B = 0;
		// int C = 0;
		// char firstIn;
		// char secondIn;
		// char therdIn;

		Scanner tryScan = new Scanner(System.in);

		// String input0 = tryScan.nextLine();
		int A = tryScan.nextInt();
		int B = tryScan.nextInt();
		int C = tryScan.nextInt();

		String input = tryScan.nextLine();
		input = tryScan.nextLine();
		char firstIn = input.charAt(0);
		char secondIn = input.charAt(1);
		char therdIn = input.charAt(2);
		// System.out.println(therdIn);
		int[] order = { A, B, C };
		Arrays.sort(order);
		char[] finalArray = new char[100];
		// rimepimento
		for (int i = 0; i < finalArray.length; i++) {
			finalArray[i] = 'F';
		}

		finalArray[order[0]] = 'A';
		finalArray[order[1]] = 'B';
		finalArray[order[2]] = 'C';
		// Arrays.sort(finalArray);
		int toReturn1 = indexOf(firstIn, finalArray);
		int toReturn2 = indexOf(secondIn, finalArray);
		int toReturn3 = indexOf(therdIn, finalArray);
		System.out.print(toReturn1 + " ");
		System.out.print(toReturn2 + " ");
		System.out.println(toReturn3);
		//System.out.println(A + B + C);
		tryScan.close();

		// System.out.println(A + B + C);

	}

}
