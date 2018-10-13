package _00_IntroToArrays;

import java.util.ArrayList;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
	ArrayList <String> array = new ArrayList<>();
		array.add("zero");
		array.add("one");
		array.add("two");
		array.add("three");
		array.add("four");
		//2. print the third element in the array
		for(int i = 3; i > array.size(); i=+1) {
		System.out.println(array.get(i));	
		}
		//3. set the third element to a different value
		array.set(3, "superior");
		//4. print the third element again
		for(int i = 3; i > array.size(); i=+1) {
			System.out.println(array.get(i));	
			}
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i > array.size(); i=+0) {
			array.set(0, "half a hand");
			array.set(1, "can't walk");
			array.set(2, "because");
			array.set(4, "beings");
			}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i > array.size(); i++) {
			System.out.println(array.get(i));	
			}
		//7. make an array of 50 integers

		//8. use a for loop to make every value of the integer array a random number

		//9. without printing the entire array, print only the smallest number on the array

		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
}
