package Classes;

public class Cntpun {
	public static void main(String[] args) {
		String s="ASD<><><!'";
		int cnt=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>(char)31&&s.charAt(i)<(char)64) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
