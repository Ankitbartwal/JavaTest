package b2b.test;

public class Palindrom {
public static void main(String args[]) {	
String name= "pop";
String reverse="";
int length = name.length();
for (int i = length - 1; i >= 0; i--)
   reverse = reverse + name.charAt(i);   
if (name.equals(reverse))
   System.out.println("The string is a palindrome.");
else
   
System.out.println("The string is not a palindrome.");
}}