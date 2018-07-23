import java.util.Scanner;
class Lab4Ex2{

public static void main(String args[]){
	
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter num1:");
	int a = scn.nextInt();
	
	System.out.println("Enter num2:");
	int b = scn.nextInt();
	
	System.out.println("Enter num3:");
	int c = scn.nextInt();
	
	System.out.println("Enter num4:");
	int d = scn.nextInt();
	
	System.out.println("Enter num5:");
	int e = scn.nextInt();
	
	int avg = (a+b+c+d+e)/5 ;
	System.out.println("Average:"+avg);
	
	
}	
	
}