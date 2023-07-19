package Classes;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,a,flg = 0;
		System.out.println("enter the number ");
		a=sc.nextInt();
		if(a==0)
			System.out.println("not defined");
		else
		{
		n=a/2;
		for(i=2;i<=n;i++) {
			if(a%i==0) {
				flg=0;
			}
			else {
				flg=1;
				break;
			}
		}
		if(flg==0) {
			System.out.println("it is not a prime number");
		}
		else
			System.out.println("it is  a prime number");
		}
	}

}
