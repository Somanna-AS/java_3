package Classes;
import java.util.*;
public class Largest {

	public static void main(String[] args) {
		int a,b,c,lag;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 3 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				lag=a;
			}
			else {
				lag=c;
			}
		}
		else {
			if(b>c) {
				lag=b;
			}
			else {
				lag=c;
			}
		}
		System.out.println("the largest of three number is "+lag);
	}

}
