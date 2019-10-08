import java.util.Scanner;

public class studentdetails {
	

		
	
	
	public void input() {
		String name;
		int roll, math, phy, eng;
		Scanner SC = new Scanner(System.in);
		System.out.print("Enter Name: ");
		name = SC.nextLine();
		System.out.print("Enter the Roll Number: ");
		roll = SC.nextInt();
		System.out.print("Enter marks in maths, physics and english: ");
		math = SC.nextInt();
		phy = SC.nextInt();
		eng = SC.nextInt();
		
		operation(math,phy,eng);

		
	}
	public static void operation(int a,int b,int c) {
		String name;
		int roll,math,phy,eng;
		int total = a + b + c;
		float perc = (float) total / 300 * 100;
		
		result(total,perc);
		
	}
	public static  void result(int total,float perc) {
		String name;
		int roll,math,phy,eng;
		
//		System.out.println("Roll Number:" + roll + "\tName: " + name);
//		System.out.println("Marks (maths,physics,english): " + math + "," + phy + "," + eng);
		System.out.println("Total: " + total + "\tPercentage: " + perc);
		int num = 100;
		if (num < 30) {
			System.out.println("RESULT WILL BE FAIL");

		} else {
			System.out.println("RESULT WILL BE PASS");

			if (num < 95) {
				System.out.println("GOOD STUDENT");
			} else {
				System.out.println("GOOD STUDENT");
				if (num <= 100) {
					System.out.println("RANK HOLDER");
					if (num >= 90) {
						System.out.println("U HAVE TO BECOME THE ROLEMODEL");
					}

				}
			}

		}
		
	}

	public static void main(String[] args) {
		studentdetails std=new studentdetails();
		std.input();
//		operation();
//		std.result();

	}
}