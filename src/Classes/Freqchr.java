package Classes;

public class Freqchr {

	public static void main(String[] args) {
		String s="aaaasssddddfffg";
		int cnt=0;
		char t='s';
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==t) {
				cnt++;
			}
			
		}
		System.out.println(cnt);
	}

}
