package abctech.interview.tasks;

import abctech.interview.tasks.arrayutil.ArrayOperations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {

//		SpringApplication.run(TasksApplication.class, args);
		// array input
		ArrayList<Integer> numberArray = new ArrayList<>();

		System.out.println("Enter numberArray (non-number to stop):");

		java.util.Scanner scanner = new java.util.Scanner(System.in);
		while (true) {
			String input = scanner.next();
			try {
				int number = Integer.parseInt(input);
				numberArray.add(number);
			} catch (NumberFormatException e) {
				System.out.println("Non-number entered. Stopping input.");
				break;
			}
		}
		// call ArrayOperations method on array and print them
		ArrayOperations arrayOperations = new ArrayOperations();
		System.out.println("Maximum in array is: " + arrayOperations.arrayMax(numberArray));
		System.out.println("Minimum in array is: " + arrayOperations.arrayMin(numberArray));
		System.out.println("Sum of all array elements is: " + arrayOperations.arraySum(numberArray));
		System.out.println("Arithmetic average of array element is: " + arrayOperations.arrayAverage(numberArray));
		System.out.println("Sorted array: " + arrayOperations.sortArray(numberArray));
	}

}
