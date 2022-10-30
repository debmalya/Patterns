package patterns;

import java.util.Scanner;

public class StarFigure {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int noOfRows = sc.nextInt();
			String[][] ar = new String[noOfRows][noOfRows];
			for (int i = 0; i < noOfRows; i++) {
				for (int j = 0; j < noOfRows; j++) {
					if (i == noOfRows / 2 || j == noOfRows / 2 || j == i || noOfRows - j == i + 1) {
						ar[i][j] = "* ";
					} else {
						ar[i][j] = ". ";
					}
					System.out.print(ar[i][j]);
				}
				System.out.println("");
			}
		}
	}

}
