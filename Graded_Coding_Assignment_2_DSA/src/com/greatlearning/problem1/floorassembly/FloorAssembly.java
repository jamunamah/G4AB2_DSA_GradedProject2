package com.greatlearning.problem1.floorassembly;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class FloorAssembly {

	public void getFloorAssembly() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of floors in the building: ");
		int numberOfFloors = sc.nextInt();

		int max = numberOfFloors;

		// using collections comparator we are reversing to make descending order
		Queue<Integer> queue = new PriorityQueue<Integer>(java.util.Collections.reverseOrder());

		// int floorSize[] = new int[numberOfFloors];
		int floorSize;

		for (int i = 0; i < numberOfFloors; i++) {

			System.out.println("Enter the floor size given on day: " + (i + 1));
			// floorSize[i] = sc.nextInt();
			floorSize = sc.nextInt();

			queue.add(floorSize);

			while (!queue.isEmpty() && queue.peek() == max)

			{

				System.out.print(queue.poll() + " ");

				max--;

			}

			System.out.println();

		}
		System.out.println("\nProgram completed successfully!");
		sc.close();

	}

}