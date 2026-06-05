package day_5;

public class Rev_String_recursion {

	
	
	public static void main(String[] args) {

        String name = "hello";

        Rev_String_recursion obj = new Rev_String_recursion();

        String reverseString = obj.ReverseString(name);

        System.out.println(reverseString);
    }

    public String ReverseString(String name) {

        if(name.isEmpty())
            return "";

        return ReverseString(name.substring(1)) + name.charAt(0);
    }
}