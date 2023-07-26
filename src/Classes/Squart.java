package Classes;

public class Squart {

	    public static double squareRoot(double num) {
	       
	        if (num == 0 || num == 1) {
	            return num;
	        }
	        double precision = 1e-15; 
	        double x = num; 
	        while (Math.abs(x - num / x) > precision * x) {
	            x = (x + num / x) / 2;
	        }
	        return x;
	    }
	    public static void main(String[] args) {
	        double number = 4;

	        double result = squareRoot(number);
	        System.out.println(result);
	    }
	

}
