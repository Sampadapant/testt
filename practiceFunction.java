package javaClass;

public class practiceFunction {
	
	public static void main (String[]  args)  {
		
		favorite();
		multiply (588,10 );
		
		multiply (2,3); 
		
		multiply (5, 15);
		
		substract (32, 16);
		
		addition (278, 654);
		
		divide (21,3);
		divide (500, 35);
		divide (4000, 14);
	miss();
	sanjay();
	
	printThis();
		printSomething("Sampada");
		printSomething("laptop");
		printSomething("rose");
		printSomething("adaptor");
		printDetail("Mike", 43);
		
		
		System.out.println(add(4,5));
		System.out.println(additionB (50, 10));
		int s1 = additionB(100, 600);
		int s2 = additionB(300, 200);
		int s3 = additionB(400, 500);
		int s4 = additionB(800, 900);
		
		int result1 = add(6,8);
		int result2 = add(122,43);
		int result3 = add(233,21);
		int result4 = add(611,80);
		

}
	public static void favorite() {
		System.out.println("horse is my favorite");
	}
	
	public static void divide (int a, int b) {
		System.out.println(a/b);
		
	}
	
	public static void printThis() {
		System.out.println("paper");
	}
	
	public static void printSomething(String horse) {
		System.out.println(horse);
	}
	
	public static void printDetail(String name, int age) {
		System.out.println(name + " is " + age + " years old " );
	}
	
	public static void substract (int e, int f) {
	System.out.println(e-f);	
	}
	
	public static void addition (int c, int d) {
		System.out.println(c+d);
	}
	
	public static int add (int x, int y) {
		return x + y;
	}
	
	public static int additionB (int x, int y) {
		return x + y;
		
	}
	
	public static void miss() {
		System.out.println("i  miss nepal");
	}
	
	public static void sanjay () {
		System.out.println("hello sanjay");
	}
	 
public static void multiply(int a, int b) {
	System.out.println(a*b); 
}
}
	
