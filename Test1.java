package com.lti.misc;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//uncomment this part of the code and check its o/p and also change the code remove some nextLine() and check its op
	/*
	String[] arr = new String[5]; 

 int[] arr1 = new int[5]; 
 Scanner kb = new Scanner(System.in);
 for(int i=0;i<5;i++) 
 {  System.out.println(" Enter Example:");
 arr[i] = kb.nextLine(); 
 System.out.println("Enter Another Example:"); 
  arr1[i] = kb.nextInt(); 
  arr[i]=kb.nextLine();
 }
 */
		//switch without break
 int a=3;    int b=0;    switch(a)    {   case 1:  b=a+2;  case 2:  b=a+3;  case 3:  b=a+4;  case 4:  b=a+5;  case 5:  b=a+6;  default:  b=a*2;  }
 System.out.println(b);
 //int and double 
 int i1 = 2; int i2 = 5; double d; d = 3 + i1 / i2 + 2; 
 System.out.println(d);
 
 //working with Arrays data  and manipulating it thru other references
 int[] Array1={3,6,2,9,5,8}; int[] Array2=Array1; int[] Array3=Array2; Array1[2]=2; Array2[3]=5; Array3[4]=7; Array2[4]=Array3[4]; 
 System.out.println(Array1[4]);
 
	
	// What is the value of c after the code is executed? 
			 int aa=5,bb=7; int cc = aa+=2*3+bb--; 
			 
//. What will be the output when running the following program? 
			 //uncomment this main class and check the o/p
			//public  class MyClass { public static void main(String[] args) { int i=0; int j; for (j=0; j<10; ++j) { i++; } System.out.println(i + " " + j);  } } 


			 
// What is the result of the following code? 
			 /*int y = 1;  do {
			  *   System.out.print(y + “ “);
			  *    }while(y < = 10); 
			  *    
			  *    a. The code does not compile.
			  *     b. 1 2 3 4 5 6 7 8 9 
			  *     c. 1 2 3 4 5 6 7 8 9 10 
			  *     d. 1 2 3 4 5 6 7 8 9 10 11
			  *      e. ‘ 1 ‘ an infinite number of times 
			  */
	
			 
			 /*public class SportsReference {   
			  * public static void main(String[] args) { 
			  *   Sport ref;   Baseball aBaseball = new Baseball();  
			  *    Basketball aBasketball = new Basketball(); 
			  *      Football aFootball = new Football();   
			  *      ref = aBaseball; ref.color();   
			  *      ref = aBasketball; ref.color();  
			  *       ref = aFootball; ref.color();   } }// Which type of polymorphism is used in the sample code above? 	 
			  */
			 
			 //Sample Code // Assume DateValue is a class that represents a date 
			 //  in some unspecified format.
			 /*public void printIfEqual(DateValue dv1, DateValue dv2) 
			  * { if (dv1==dv2)
			  *  { System.out.println("Dates "+dv1+" and "+dv2 +"are the same day"); } } 
			  */
			 //What is the potential usage error in the sample code above? 
	
			/* You override the finalize() method when: 
			 * a. an object needs to be written on disk.
			 *  b. there is a cleanup activity needed before an object is created. 
			 *  c. You want to kill a thread.
			 *   d. You instantiate a final class.
			 *    e. The object is declared on a heap, so its memory may be reclaimed. 
			 */
			 
			/* class sample { 
 void example() { 
  System.out.println(“sample case”);
 } 
} 
 public class model extends sample { 
  void example() { 
   System.out.println(“model case”); 
 } 
  private static void main(string args[]) { 
   model d = new model(); 
   sample a = new sample(); 
  d.example(); 
  a.example(); 
 } 
 } 
			  
			 Given the above sample code, what needs to be changed for the code to execute? a. Change Line 2 to: static example() { 
			  
			 b. Change Line 6 to : Private class model extends sample { 
			  
			 c. Change Line 10 to: public class void main(String[] args){ 
			  
			 d. Change Line 10 to: public static void main(String[] args){ 
			  
			 e. Change Line 10 to: public static void case(String[] args){ 
			 */
			 
			/* 
private String thing;
			 *  String getThing(){   return thing; } 
			 */
			  
			 //Based on the above sample code, what do you add to the declaration of getThing() method for the method to be callable within a non-subclass class in a different package? a. private b. protected c. super d. public e. transient 
			  
			
			//  public class Test {      
			 /*public static void main(string[] args) {
			  *   int x = getValue(); 
			  *     System.out.println(x);   } 
			  *       public static getValue() { 
   return 10; 
 } 
 }    What change do you make to the sample code above to for it execute? a. Change Line 2 to  private static void main(string[] args b. Change Line 2 to  public static void(main) c. Change Line 3 to  int x = main(String[] args) d. Change Line 6 to  private static getValue() { e. Change Line 6 to  private static int getValue() { 
			  */
			  
			 /*7. 
			  * public class Main{ private void example() 
			  * {  System.out.println(“sample example”); } 
			  * public static void main(String[] args) 
			  * { Main obj = new Main(); obj.example(); } 
			  *  }
			  *   Assuming the main method is static,
			  *    why does the sample code above not
			  *     produce a compile error? 
			  *     a. Member methods of a class can access public members of the same class regardless of their modifiers. b. The method is called from outside the class, and a class can use its public members. c. The method is invoked using the instance class obj. d. The access modifier allows the private method to execute as long as the outside class is set to public. e. The abstract methods are implemented in an abstract class. 
			  */
			  
			   
			/*
			 8. Sample Code class Animal
			 {  void speak()
			 { System.out.println("speak"); } }
class Dog extends Animal{ 

 void speak(){System.out.println("woof!"); } } 
 
 class Cat extends Animal{  void speak()
 {System.out.println("meow!"); } } 
 
 public class AnimalTest{
  public static void main( String[] args )
  { Animal[] animals = new Animal[3]; 
  animals[0] = new Animal();
   animals[1] = new Cat(); 
   animals[2] = new Dog();
    for( int i=0; i < animals.length; i++ )
     animals[i].speak(); } } 
     What is the result of executing the sample code above? 
     a. speak  meow!  woof! 
			  
			 b. woof! speak  meow! Speak 
			  
			 c.  speak  meow!  speak  woof! 
			  
			 d. speak  speak  speak 
			  
			 e. speak  woof!  meow!  Speak 
			  
			  */
			 
			/* 
			 9. Sample Code 
			 import java.io.*; 
			 public class TestScope{ 
			 public static void main(String args[]) {
			  int i=0,k=0; for (i=1;i<20;i++) {  
			               int j=i*2;           
			                          k=j*k; 
			                          System.out.println(j);
			                           } for
			                            (int m=1;m<10;m++)
			                             {        
			       System.out.println(m);    
			             } System.out.println("Value is "+m);  } } 
			             
			             Which line in the sample code above contains the compile-time error? a. for (i=1;i<20;i++) { b. int j=(i*2); c. for (int m=1;m<10;m++) { d. System.out.println(m) e. System.out.println("Value is " + m); 
			  */
			 
			 
			 
			 /*10. Sample Code 
			  * public boolean testVal(int a) 
			  * { // ???? } 
			  * Which line of code do you insert in place of ???? in the sample code above for the function to return true, if the value of "a" is greater than 5 and false otherwise? a. do {if (a>5) true else false};  b. return (a<5)?true:false; c. do { return false } if (a<=5); d. return (a>5); e. if (a<=5) {return=false;} else {return=false;} 
			  */
			  
			   
			 
			/*11.
			 *  class A { int i=0; public A() 
			 *  { i=8; } 
			 *  public static void main(String args[]) 
			 *  { int i = 0; A h = new A(); 
			 *  while (h.i <= 10)  h.doIt(); } 
			 *  public static void doIt() 
			 *  {  i++; System.out.println("Hello"); } }
			 *   What is the result of the sample code above when executed? a. It prints "Hello" 2 times. b. It prints "Hello" 3 times. c. It prints "Hello" 11 times. d. It does not compile because variable i has been declared twice. e. It does not compile because doIt() cannot reference nonstatic variable i. 
			 */
			  
			/* 12. What do you define in an interface?
			 *  a. Transient variables
			 *   b. 
			 *  Instance variables 
			 *  c. Final methods 
			 *  d. Constants 
			 *  e. Static methods 
			 */
			  
			   
			 /*
			 13. public class A 
			 { public void a()
			 { System.out.println("class A"); } }
			  public class B extends A{ public void a()
			  { System.out.println("class B"); } } 
			  public class C extends B{ public void a()
			  { super.a(); System.out.println("class C"); } } 
			  public class D { public static void main(String[] args) { A c=new C(); c.a(); } }
			   What is the output of the sample code above? a. Class A  Class C b. Class C  Class B c. class A  class B d. class B  class C e. Class B  Class A 
			  */
			 
			   
			 /*
			 14. Sample Code 
			  
			   public class Sample {   
 private String un;   
  private String te;   
  public Sample(String unit, String test){  
   un = unit;   
   te = test;   
   myExample = new Example(100);  
 what do you change to allow the sample code above to    compile and be used by another class to create an instance of the class Sample? a. Insert public void main(String[] args) {} after Line 8. b. Change Line 2 to: public un; c. Insert private Example myExample; after Line 2. d. Change Line 7 to: myExample = new example.count < 100) e. Remove new Example(100); from Line 7. 
			  
			 }  
} Assuming the proper imports,  */
			 /*
			 
			 15. Sample Code  
			 class SuperClass 
			 {   public void printIt()
			  { System.out.println("SuperClass"); }
			   public void printIt(boolean print)
			    {  if (print) {
			      System.out.println("Super-part 2");  } 
			       else {  printIt();  }  }  } 
			        class SubClass extends SuperClass 
			        {  public void printIt() 
			        { System.out.println("SubClass"); } 
			         } 
			         
			         public class TestSub 
			     {  public static void main(String args[])
			      { SuperClass sc=new SubClass(); 
			       sc.printIt();  sc.printIt(false);  } 
			        } 
			        
			        What is the output of the sample code above? a. SubClass Super-part 2 b. SuperClass SubClass c. SubClass SuperClass d. SubClass SubClass e. SuperClass SuperClass 
			  
			  */
			   
			/*
			 16. public class TestOrder {
			   static int deck[]=new int[25]; 
			    static {  for (int j=0;j<deck.length;j++) 
deck[j]=j;  System.out.println("Finished creating the deck");  } 
 public static void main(String args[])
  {  System.out.println("Creating an Object");
    TestOrder to=new TestOrder(); 
     System.out.println("Finished creating");  }  }
     
      What is the output of the sample code above? a. Creating an Object Finished creating Finished creating the deck b. Finished creating the deck Creating an Object Finished creating c. Finished creating Creating an Object Finished creating the deck d. Creating an Object Finished creating the deck Creating an Object e. Finished creating the deck Finished creating Creating an Object 
			  
			   
			*/
			 
			 
			   
			/*
			 18. Sample Code
public class One {  public String getX() {  return "One";  } 

 public static void main(String args[])
  {  One one = new Five();  System.out.println(one.getX()); 
    }  }  class Two extends One {  public String getX()
     {  return "Two";  }  }  
     class Three extends Two 
     {  public String getX() {  return "Three";  }  } 
      class Four extends Three
       { public String getX() {  return "Four";  }  }  
       class Five extends Four {  public String getX()
        {  return "Five";  } } 
        
			  
			 What is printed when you execute the sample code above? a. One b. Two c. Three d. Four e. Five 
			*/
			 /*
			   
			 OOPS 
			 19. Line 1 
			 
			 public class MyString {  
public static void main(String args[]) {  
   System.out.println("Hello, World");

 } 
 } 
			  
			 Which line of code do you use to replace Line 2 in the sample code above in order to print "Hello, World" when you pass just the class name to the Java command? a. public static main void(String []args{}) { b. public static main void(String[] args) { c. public static void main(String args...) { d. public static void main(String... args) { e. static public void main(String args[*]) { 
			 */
			 
			  
			  
			/* 20. Which one of the following is
			 *  a valid declaration in an interface? 
			 *  a. public abstract static int getPsno(); 
			 *  b. protected int getPsno(); 
			 *  c. static final int psno = 3; 
			 *  d. public static int getPsno();
			 *   e. public static transient int psno = 3; 
			 */
			  
			/* 21. Which lists access modifiers ranked
from LEAST visibility to MOST? 
a. public, <none>, protected, private
b. public, protected, <none>, private
 c. <none>, private, protected, public
  d. private, <none>, protected, public 
  e. private, protected, <none>, public 
			  
			*/
			 
			 /*22.
Scrollable is an interface. 
-Writable is an interface. 
-TextScreen is an abstract class 
VideoScreen is a class that extends TextScreen and 
implements both Scrollable and Writable. 
			  
			 In reference to the scenario above, 
			 which one of the following statements 
			 is always true? 
			  
			 a. A Scrollable object can be cast 
			 to produce a VideoScreen.
			  b. A VideoScreen object 
			  cannot be passed to a method that 
			  expects a Scrollable 
			  c. A VideoScreen object cannot 
			  be passed to a method that expects a Writable
			   d. A VideoScreen object cannot be 
			   passed to a method that expects a TextScreen 
			   e. A VideoScreen object can be cast as 
			   Scrollable 
			  
			  
			  */
			/*
			   
			 OOPS 
			 23.
			  What is the result of the following code?
			  
 public class Shape 
			   {
  private String color;
  public Shape(String color) { 
   System.out.print(“Shape”); 
  this.color = color; 
  } 
  public static void main(String [] args) { 
  new Rectangle(); 
  }

 } 
 class Rectangle extends Shape 
 { 
  public Rectangle() { 
   System.out.print(“Rectangle”);
  }



 } 
			  
			
			 a. ShapeRectangle 
			 b. RectangleShape
			  c. Rectangle 
			  d. 
			  
 generates a compiler error. 
 e. Line 15 generates a compiler error. 
			  
			  */
			   
			 /*OOPS 
			 24. Given the following class definitions:
1. public class Parent { 
2.  public Parent() { 
3.   System.out.print(“A”); 
4.  } 
5. } 
6. 
7. 
class Child extends Parent {
 8.  public Child(int x) { 
 9.   System.out.print(“B”); 
10.  } 
11. 
12. public Child() { 
13.  this(123); 
14.  System.out.print(“C”); 
15. } 
16.} 
			  
			 what is the output of the following statement? new Child(); 
			  
			 a. ABC b. ACB c. AB d. AC e. This code does not compile. 
			  */
			 /*
			  
			 25. What is the output of the following program?
			  1. public class WaterBottle { 
			  2.  private String brand; 
			  3.  private boolean empty; 
			  4. 
			  5.  
			  public static void main(String [] args ) {
			   6.   WaterBottle wb = new WaterBottle();
			    7.   if(!wb.empty) { 
			    8.    System.out.println(“Brand = “ + wb.brand); 
			    9.   } 
			    10.  } 
			    11.} 
			  
			 a. Line 6 generates a compiler error.
			  b. Line 7 generates a compiler error. 
			  c. Line 8 generates a compiler error. 
			  d. There is no output. e. Brand = null*/
			 
			 /*
			 OOPS 
			 26. Given the following class definition: 
			 1. public class Television { 
			 2.  private int channel = setChannel(7); 
			 3. 
			 4.  public Television(int channel) { 
			 5.   this.channel = channel; 
			 6.   System.out.print(channel + “ “);
7.  } 
8. 
9.  public int setChannel(int channel) { 
10.  this.channel = channel; 
11.  System.out.print(channel + “ “); 1
2.  return channel; 
13. } 
14.} 
			  
			 what is the output of the following statement? 
			 new Television(12); 
			 
			  
			 a. 12 b. 12 7 c. 7 12 d. 7 e. The code does not compile. 
			  
			   */
		
			/* 27. Given the following my.school.ClassRoom 
			 * and my.city.School class definitions: 
			 * 1. //ClassRoom.java 
			 * 2. package my.school; 
			 * 3. public class ClassRoom 
			 * { 4.  private int roomNumber;
			 *  5.  protected String teacherName;
			 *   6.  static int globalKey = 54321; 
			 *   7. 
			 *   8.  ClassRoom(int r, String t) { 
			 *   9.   roomNumber = r; 
			 *   10.   teacherName = t; 
			 *   11.  } 
			 *   12. } //School.java
			 *    1. package my.city; 
			 *    2. import my.school.ClassRoom; 
			 *    3. public class School { 
			 *    4.  public static void main(String [] args) {
			 *     5.   System.out.println(ClassRoom.globalKey);
			 *      6.   ClassRoom room = new ClassRoom(101, “Mrs.Anderson”); 
			 *      7.   System.out.println(room.roomNumber);
			 *       8.   System.out.println(room.teacherName); 
			 *       9.  } 
			 *       10. } 
			
			  
			 which of the following line numbers in main generate a compiler error? (Select all that apply.) 
			  
			 a. None; the code compiles fine. b. Line 5 c. Line 6 d. Line 7 e. Line 8   
		*/
			/* 28. Given the following interface and 
			 * class defined in a file named Traceable.java , 
			 * what is the result of compiling this code? 
			 * 1. public interface Traceable {
			 *  2. public static int MAX_TRACE; 
			 *  3. public void trace(); 
			 *  4. } 5. 6. 
			 *  class Picture implements Traceable { 
			 *  7. public void trace() { 
			 *  8. System.out.println(“Tracing a picture”); 
			 *  9. } 10. } 
			 
			  
			 a. Two bytecode files: Traceable.class 
			 and Picture.class 
			 b. One bytecode file: Traceable.class
			  c. Compiler error on line 2
			   d. Compiler error on line 3 
			   e. Compiler error on line 6 
			   f. Compiler error on line 7 
			  
			  */
			 
			 
			 /*
			 29. Given the following class definitions: 
			 1. class Parent { 2
			   public void printResults(String... results) { 
			   3.   System.out.println(“In Parent”);
			    4.  } 5. } 6. 
			    7. class Child extends Parent { 
			    8.  public int printResults(int id) { 
			    9.   System.out.println(“In Child”); 
			    10.   return 0; 11. } 12.} 
			  
			 what is the result of the following statement? new Child().printResults(0); 
			  
			 a. In Parent b. In Child c. 0 d. Line 2 generates a compiler error. e. Line 8 generates a compiler error. 
			  
			  
			*/
			 
			 /*
			 30. What is the result of the following program?
			  1. class Parent 
			  { 2.  public float computePay(double d) { 
			  3.   System.out.println(“In Parent”);
			   4.   return 0.0F; 5.  } 6. } 7. 
			   8. public class Child extends Parent {
			    9.  public double computePay(double d) { 
			    10.   System.out.println(“In Child”); 
			    11.   return 0.0; 12.  } 13. 
			    14. public static void main(String [] args)
			     { 15.   new Child().computePay(0.0); 
			     16. } 17. } 
			  
			 a. In Parent b. In Child c. 0.0 d. null e. The code does not compile. 
			  */
			 
			  
			/*31. Suppose a method in a class has 
			 * the following method declaration:
			 *  public java.io.OutputStream 
			 *  createStream(String fileName) {
			 *   //method body here... } 
			 *   
			
			  
			 Which of the following methods could
			 appear in a child class and override 
			 createStream ? 
			  
			 a. public java.io.OutputStream
			 createStream(String f) 
			 b. public java.io.OutputStream
			 createStream(char c) 
			 c. public java.io.FileOutputStream 
			 createStream(String f) 
			 d. public void createStream(String c) 
			 e. public java.io.OutputStream 
			 createStream(StringBuffer fileName) 
			 f. protected java.io.OutputStream
			 createStream(String fileName) 
			  
			  
			   
			 */
			 
			 /*
			 32. Given the following class definitions,
			  what is the output of the statement  new Child(); ? 
			  
			 1. class Parent { 
			 2. { 
			 3. System.out.print(“1”); 4. } 5. 6. public Parent(String greeting) { 7. System.out.print(“2”); 8. } 9. } 10. 11. class Child extends Parent { 12. static { 13. System.out.print(“3”); 14. } 15. 16. { 17. System.out.print(“4”); 18. } 19. } a. 1234 b. 3123 c. 3142 d. 3124 e. The code does not compile 
			  
			  
			 33. Given the following interface definitions: 1. //Readable.java 2. public interface Readable { 3.  public abstract void read(); 4. } 
			  
			 1. //SpellCheck.java 2. public interface SpellCheck extends Readable { 3.  public void checkSpelling(); 4. } which of the following statements are true? (Select all that apply.) a. The SpellCheck interface does not compile. b. A class that implements Readable must override the read method. c. A class that implements SpellCheck inherits both the checkSpelling and read methods. d. A class that implements SpellCheck only inherits the checkSpelling method.  e. An interface cannot extend another interface. 
			 OOPS 
			 34. Which one of the following method declaration is valid? a. static public void ( ) { } b. static public protected intgetInt() { return 2; } c. static public intgetInt() { return Integer.SIZE; } d. public static intgetInt() { return Math.PI; } e. public static int() { return 2; } 
			  
			 35. Given the below code Class Base{} class Derived1 extends Base{} class Derived2 extends Base{} class Test{     public static void main(String[]args){ Base b = new Base(); Derived1 d1 = new Derived1(); Derived2 d2 = newDerived2(); //assignment here }} Which of the following assignments is legal
	
	
	
	
	}
	
}
