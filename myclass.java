package laptopService;

import java.util.ArrayList;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("Do you want to play the game: press 1");
			int continueOrNot = scan.nextInt();
			if (continueOrNot == 1) {
				ArrayList<String> box = new ArrayList<String>();
				for (int i = 0; i < 5; i++) {
					box.add("Chocolate");
				}
				for (int i = 0; i < 1; i++) {
					box.add("Chilli");
				}
				System.out.println("Game Started");

				int count = 1;
				while (true) {
					try {

						int user = 1;
						if (count % 2 == 0) {
							user = 2;
						}
						System.out.println(
								"User : " + user + " You enter the pickup position : Press 1, press 2, press 3");
						int position = scan.nextInt();
						if (position == 1 || position == 2 || position == 3) {
							count++;
							if (box.get(position - 1) == "Chocolate") {
								System.out.println("Let's continue the game");
								box.remove(position - 1);
							} else {
								System.out.println("You are lose the game, User : " + user);
								break;
							}
						} else {
							System.out.println("You only enter the position 1,2,3");
						}
					} catch (Exception e) {
						System.out.println("Only available : " + box.size() + " So, you can select first" + box.size()
								+ " number(s)");
					}
				}
			} else {
				System.out.println("You are not playing the game");
			}
		}
	}

}
