import java.util.Scanner;
/**
 * 
 * @author Willis
 * @version 4.10.2021
 */
public class Run {

	/**
	 * Main method.
	 * @param args accepts command line arguments.
	 */
	public static void main(String[] args) {
		// TODO
		runLocal();
		// runGUI();
	}

	/**
	 * Run WBS program from console.
	 */
	private static void runLocal() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Q to quit");
		int count = 1;
		while (!scan.next().equalsIgnoreCase("q")) {
			WBS wbs = new WBS();
			Task t = new Task();
			t.setNum(count);
			System.out.print("Set Task " + count + " name");
			t.setName(scan.next());
			System.out.print("Set Task ");
			System.out.print(wbs.toString());
			count++;
		}
		scan.close();
	}
	
	/**
	 * Run WBS program from GUI.
	 */
	private static void runGUI() {
		// TODO
	}
	
}
