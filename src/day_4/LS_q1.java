package day_4;


//WAP to find position of first vowel from below string
//* str="my name is xyz"
//*/


public class LS_q1 {
	
public static void main(String[] args) {
		
		String str= "my name is xyz";
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if('a'==ch || 'e'==ch || 'i'==ch || 'o'==ch || 'u'==ch) {
				System.out.println("target index is " +i);
				break;
			}
		}
		

		
		

	}

}