package Classes;

public class Lexopalli {
    public static String lexo(String s) {
        char[] ch = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        
        while(start <= end) {
            if(ch[start] != ch[end]) {
                if(ch[end] > ch[start]) {
                    ch[end] = ch[start];
                } else {
                    ch[start] = ch[end];
                }
            }
            start++;
            end--;
        }
        
        return String.valueOf(ch);
    }
    public static void main(String[] ags) {
    	String p= new String("hello");
    	System.out.print(lexo(p));
    }
}
