import java.util.Scanner;

public class SternBrocot {

	static class Node {
		private int num;
		private int den;
		private Node leftParent;
		private Node rightParent;

		Node(int top, int bottom,  Node leftParent, Node rightParent) {
			this.num = top;
			this.den = bottom;
			this.leftParent = leftParent;
			this.rightParent = rightParent;
		}
	}

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		while (true) {
			int firstNumber = Scan.nextInt();
			int secondNumber = Scan.nextInt();
			if (firstNumber == 1 && secondNumber == 1) {
				break;
			} else {
				double fraction = ((double)firstNumber) / ((double)secondNumber);
				String answer = "";
				Node current = new Node(1, 1, new Node(0, 1, null, null), new Node(1, 0, null, null));
				while (true) {
					double currentFraction = ((double)current.num)/current.den;
					if (currentFraction == fraction){
						break;
					} else if (currentFraction > fraction){
						answer = answer + "L";
						int top = current.num + current.leftParent.num;
						int bot = current.den + current.leftParent.den;
						current = new Node (top, bot, current.leftParent, current);
					}else{
						answer = answer + "R";
						int top = current.num + current.rightParent.num;
						int bot = current.den + current.rightParent.den;
						current = new Node (top, bot, current, current.rightParent);
					}
				}
				System.out.println(answer);
			}
		}
		Scan.close();
	}
}
