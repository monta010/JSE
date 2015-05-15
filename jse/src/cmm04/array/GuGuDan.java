package cmm04.array;

public class GuGuDan {
	public static void main(String[] args) {

		for (int dan = 2; dan < 10; dan += 4) {

			for (int gob = 1; gob < 10; gob++) {
				System.out.print(dan + " * " + gob + " = " + dan * gob + "\t");
				System.out.print((dan + 1) + " * " + gob + " = " + (dan + 1)
						* gob + "\t");
				System.out.print((dan + 2) + " * " + gob + " = " + (dan + 2)
						* gob + "\t");
				System.out.print((dan + 3) + " * " + gob + " = " + (dan + 3)
						* gob + "\t");
				System.out.println("");

			}

			System.out.println("");
		}

	}
}
