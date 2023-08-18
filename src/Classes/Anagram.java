package Classes;

import java.lang.reflect.Array;

public class Anagram {
	public static char[] sortch(char[] a) {
		char tmp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<=a.length;j++) {
				if(a[j]<a[i ]) {
					tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
		}
		
		return a;
	}
	public static void main(String[] args) {
		String s1="race",s2="caae";
		boolean flg=false;
		char[] r1=s1.toCharArray(),r2=s2.toCharArray();
		char[] a1=sortch(r1),a2=sortch(r2);
		
		if(a1.length==a2.length) {
			for(int i=0;i<a1.length;i++) {
					if(a1[i]==a2[i]) {
						flg=true;
					}
					else {
						flg=false;
						break;
					}
				
			}
		}
		if(flg) 
			System.out.println("the Strings r Anagram");
		else
			System.out.println("the Strings r not Anagram");
	}

}
