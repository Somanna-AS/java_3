package Classes;
import java.util.*;
public class Subpos {
	public static void main(String[] args) {
		int a,b,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers ");
		a=sc.nextInt();
		b=sc.nextInt();
		r=a-b;
		if(r<0) {
			r=r*(-1);
		}
		System.out.println("result = "+r);
	}

}
