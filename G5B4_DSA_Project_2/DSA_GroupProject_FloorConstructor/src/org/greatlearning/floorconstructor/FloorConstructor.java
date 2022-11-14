package org.greatlearning.floorconstructor;

import java.util.*;

public class FloorConstructor {
	public static void floorConstructor() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Total Number of Floors in the Building - ");
		int floor = sc.nextInt();

		Queue<Integer> queue_floor = new LinkedList<>();
		List<Integer> arr_temp = new ArrayList<>(floor);

		int daycount = 1;
		int count = 1;

		while (floor > 0) {
			System.out.println("Enter the Floor Size given on Day " + daycount);
			int i = sc.nextInt();
			queue_floor.offer(i);
			daycount++;
			floor--;
		}
		sc.close();

		System.out.println();
		System.out.println("The Order of Construction is as follows - ");

		while (!queue_floor.isEmpty()) {
			int temp_floor = queue_floor.poll();

			System.out.print("Day " + count + " - ");

			if (queue_floor.isEmpty()) {
				System.out.println();
				System.out.print(temp_floor + " ");
				for (int i = 0; i < arr_temp.size(); i++) {
					if (arr_temp.get(i) < temp_floor)
						System.out.print(arr_temp.get(i) + " ");
				}
			}
			System.out.println();

			if (!queue_floor.isEmpty() && temp_floor > Collections.max(queue_floor)) {

				if (!arr_temp.isEmpty()) {
					System.out.print(temp_floor + " ");
					int currMax = Collections.max(queue_floor);
					for (int i = 0; i < arr_temp.size(); i++) {
						if ((arr_temp.get(i) > currMax) && arr_temp.get(i) < temp_floor) {
							System.out.print(arr_temp.get(i) + " ");
						}
					}
					System.out.println();

				} else
					System.out.print(temp_floor);
			}
			System.out.println();

			if (!queue_floor.isEmpty() && temp_floor < Collections.max(queue_floor)) {
				arr_temp.add(temp_floor);
				Collections.sort(arr_temp, Collections.reverseOrder());
			}

			else {
				if (queue_floor.isEmpty())
					return;
			}
			System.out.println();
			count = count + 1;
		}
	}
}