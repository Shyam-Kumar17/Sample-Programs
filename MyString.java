package String;
import java.util.Scanner;
public class MyString {

	public static void main(String[] args) {
		String s="java";
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.contains("a"));
		System.out.println(s.startsWith(s, 'a'));
		System.out.println(s.endsWith('a'));
		System.out.println(s.concat("program"));
		System.out.println(s.replace('a', '@'));
		System.out.println(s.replace('a', '@'));
		System.out.println(s.equals("python"));
		System.out.println(s.equalsIgnoreCase("Java"));
		System.out.println(s.trim);

	}

}
