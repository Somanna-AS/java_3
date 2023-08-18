package Classes;
import java.util.*;

public class instpos {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i,j,n,pos,val;
		System.out.println("enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter the value of the element to be inserted");
		val=sc.nextInt();
		System.out.println("enter the index");
		pos=sc.nextInt();
		System.out.println("new array is");
		inst(a,pos,val);
		/*int[] newa= inst(a,pos,val);
		for(i=0;i<n+1;i++) {
			System.out.print(newa+" ");
		}*/
	}


public static void inst(int[] c,int z,int x) {
	int sz=c.length,i,j;
	int nw[]= new int[sz+1];
	if(z<0||z>sz) {
		System.out.println("invalid size");
		System.exit(0);
	}
	for(i=0,j=0;i<sz;i++,j++) {
		if(i==z) {
			nw[j]=x;
			j++;
			nw[j]=c[i];
		}
		else
		{
			nw[j]=c[i];
		}
	}
	for(i=0;i<sz+1;i++) {
		System.out.print(nw[i]+" ");
	}
	}
}
