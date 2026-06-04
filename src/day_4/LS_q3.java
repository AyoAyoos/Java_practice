package day_4;




//// WAP find either below substring exsit or not
//
//substring = "my"
// String = " india is my country"
//
//
//




public class LS_q3 {
	
	
	public static void main(String[] args) {
		
		String str = "india is my country";
		String sub ="my";
		 
		if(str.contains(sub))
            System.out.println("Substring exists");
		else
			System.out.println("Substring does not exist");
		
}
}