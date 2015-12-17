import java.util.Iterator;

public class Sorting {

	public static String[] sort(String[] testArray) {
		String[] giveArray = new String[testArray.length];
		// loops through all objects in testArray
		for (String s : testArray) {

			// prints out S
			System.out.println("");
			System.out.println("----NEXT WORD----");
			System.out.println("-WORD IS- " + s);

			// loops through all objects in giveArray
			for (int i = 0; i < giveArray.length; i++) {

				String current = giveArray[i];
				System.out.println("i = " + i + " current = " + current);
				
				if (current == null) {
					giveArray[i] = s;
					System.out.println("LAST WORD OVERIDED null");
					System.out.println("<><><><><>");
					System.out.println("NEW LIST IS");
					//debuging
					for (String string : giveArray) {
						if (string != null) {
							System.out.println(string);
						}
					}
					break;

				} else if (s.compareToIgnoreCase(current) < 0) {

					// adds it to the spot then moves each other one down the list
					System.out.println("STARTING WORD MOVE");
					System.out.println("---->LOOP START POS " + (giveArray.length - 1));
					System.out.println("---->LOOP END POS " + (giveArray.length - i));
					System.out.println("---->LOOP TOTAL RUNS " + ((giveArray.length - 1) - (giveArray.length - i)));
					for (int j = giveArray.length - 1; j > i; j--) {
						String moveCurrent = giveArray[j];

						if (giveArray[j] != null) {
							System.out.println("---->MOVING WORD " + moveCurrent);
							System.out.println("----> TO " + giveArray[j - 1]);
							giveArray[j - 1] = moveCurrent;

						}

					}
					System.out.println("--->WORD MOVEING DONE");
					giveArray[i] = s;
					System.out.println("-->LAST WORD TOOK ANOTHER WORDS SPOT");
					System.out.println("<><><><><>");
					System.out.println("NEW LIST IS");
					for (String string : giveArray) {
						if (string != null) {
							System.out.println(string);
						}
					}
					break;

				}
			}
		}
		System.out.println("XYZXYZXYZXYZXYZXYZXYZXYZXYZ");
		for (String string : giveArray) {
			if (string != null) {
				System.out.println(string);
			}
		}
		return giveArray;
	}

}
