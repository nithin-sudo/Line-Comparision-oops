package linecomparision;

import java.util.Scanner;

public class LineComparision {
	public static void lineDistance() {
		System.out.println("Welcome to Line Comparison Computation Program");
		int x1,x2,y1,y2;
		double distance;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x1 point:");
		x1=sc.nextInt();
		System.out.println("enter x2 point:");
		x2=sc.nextInt();
		System.out.println("enter y1 point:");
		y1=sc.nextInt();
		System.out.println("enter y2 point:");
		y2=sc.nextInt();
		distance=Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
		System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")"+"is"+" " + distance);
	}

	public static void main(String[] args) {
		LineComparision lineCompariosion = new LineComparision();
		lineCompariosion.lineDistance();
	}
}
