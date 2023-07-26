package Classes;
	import java.util.Scanner;

	public class Altprime {

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the lower level of the range: ");
	        int lower = sc.nextInt();

	        System.out.print("Enter the upper level of the range: ");
	        int upper = sc.nextInt();
	        boolean cnt=false;
	        for (int n= lower; n<= upper; n++) {
	            if (isPrime(n)) {
	            	if(cnt) {
		                System.out.print(n+ " ");
	            	}
	            	cnt=!cnt;
	            }
	        }
	        
	    }

	    public static boolean isPrime(int n) {
	        if (n<=1) {
	            return false;
	        }

	        for (int i=2;i*i<=n;i++) {
	            if (n%i==0) {
	                return false;
	            }
	        }

	        return true;
	    }

	}
