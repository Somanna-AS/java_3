package Classes;
import java.util.*;
public class Fibi {
	static int fib(int i){
		if(i>1) {
		return fib(i-1)+fib(i-2);
		}
		else 
			return i;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		for(int j=0;j<n;j++)
			System.out.print(" "+fib(j));
	}

}
