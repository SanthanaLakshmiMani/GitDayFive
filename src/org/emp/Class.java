package org.emp;
public class Class {
public static void main(String[] args) {
	String s1 ="GreensTechnology";
	String s2 ="SeleniumAutomationTool";
	String s3 ="velmurugan";
	String s4 ="j a v a p r o g r a m";
	String s5 ="9551376279";	
    System.out.println("String length is: "+s1.length());
	System.out.println("String length is: "+s2.length());
	System.out.println("String length is: "+s3.length());
	System.out.println("String length is: "+s4.length());
    System.out.println("String length is: "+s5.length());
int lastIndexOf = s1.lastIndexOf('o');
System.out.println("Last index of O is:   "+lastIndexOf);
int index1 = s2.indexOf('o');
System.out.println(index1);
int index2 = s3.indexOf('n');
System.out.println(index2);
boolean empty = s4.isEmpty();
System.out.println(empty);
System.out.println("Hi");
}
}