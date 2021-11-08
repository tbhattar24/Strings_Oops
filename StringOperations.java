package Strings;

public class StringOperations {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1 = "Java String pool refers to collection of strings which are stored in heap memory";
		
		// To find the Lower case of the given string
		String s1lower =s1.toLowerCase(); //toLowercase can converted the all strings into lowercase letters
		System.out.println(s1lower);
		
		// To find the Upper case of the given string
		String s2upper =s1.toUpperCase(); //touppercase can converted the all strings into Uppercase letters
		System.out.println(s2upper);
		
		// To find the replace $ with a character of the given string
		String s3replacestring = s1.replace('a', '$');
		System.out.println(s3replacestring);
		
		// to check whether the string contains collections  or not 
		System.out.println(s1.contains("collection"));
		
		// to check whether the given  two sentences are equals or not
		String s2 ="java String pool refers to collection of strings which are stored in heap memory";
		System.out.println(s1.equals(s2));
		
		//to check whether the given two sentences are equals or not with using another equals method 
		System.out.println(s1.equalsIgnoreCase(s2));
		
		
		
	}

}
