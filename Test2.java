package com.lti.misc;

public class Test2 {
/*
 * 1. Float f=new Float(3.1); 
 * Integer i=new Integer(1);
 *  long m=2; 
 
System.out.println(“Result is “+m+f+i); 
 
What is the output of the sample code above? a. Result is 4.12 b. Result is 5.11 c. Result is 6.1 d. Result is 23.11 e. Result is 24.11 
 
 
 ====
2. String str1= “My name is Billy.”  

 String str2= “My name is Billy.” 
 
Referring to the sample code above, 
which code string do you use to compare the strings in an “if” statement, checking only to see if the strings have same characters? a. if ((str1 – str2 ) ==0){ b. if (str1.compareTo(str2)){ c. if (str1 ==str2) { d. if (str1 <> str2) { e. if (str1.equals(str2)) { 

 
 ===================
3. Which code fragment returns a string representation of j,
 where j is an int? 
 a. ((Object j).newString(j) 
 b. Str(j) c. new String(j) 
 d. (String) j e. new integer(j).toString() 
 
 
 
 ========================
4. String currencyValue="10.000,25 DM"; 
// German format for currency 
 *  NumberFormat nf = 
 *  
 *  
 *  NumberFormat.getCurrencyInstance(Locale.GERMANY);
 *   Based on the sample code above, 
 *   how do you return the value of the string as a double? 
 *   a. Double.parseString(currencyValue,nf);
 *    b. sscanf(currencyValue, "%00.000,00d",nf); 
 *    c. Locale.GERMANY.parseCurrency(currencyValue).toDouble(); 
 *    d. nf.getDouble(currencyValue).(Locale.GERMANY);
 *     e. nf.parse(currencyValue).doubleValue(); 
  
STRING, UTIL CLASSES & INTERNATIONALIZATION 
5. Which code fragment do you use to generate a
 random whole number from 1 to 100? 
 a. int i = Random.nextInt(100) + 1;
  b. Random r = new Random(); 
  int i = r.nextInt(100) + 0.5;
   c. Random r = new Random(); 
   int i = r.nextInt(100) + 1; 
   d. int i = Math.random(100) + 0.5;
    e. int i = (int)(Math.random() * 100); 
 
 
6. Sample Code   
class Class1 {  static void fix(String s) 
{  String t = s;   t = t.trim();  
 t = t.replace(' ', '_');   s = t;  
 }  
 public static void main(String args[]) 
 {  String x = "> This is a test <";  fix(x); 
  System.out.println(x);  }  }
   What is the output of the sample code above?
    a. > This is a test < b. >Thisisatest< c. >This_is_a_test< d. >_This_is_a_test_< e. >_This is a test < 
 ======
7. Sample code  
public class Test 
{  public static void main(String[] args) 
{  StringBuffer[] messages = new StringBuffer[5];
 messages[0].append("Hello, World!");  
 System.out.println("First message is " + messages[0]);  }
   } 
   What is the result of the sample code above?
    a. First message is null. b. A NullPointerException is thrown. c. The code does not compile. d. An ArrayIndexOutOfBounds is thrown. e. First message is Hello, World! 
STRING, UTIL CLASSES & INTERNATIONALIZATION 
8. Code 
 String test = "";   
 for(int i = 0; i < 50000; i++) 
 {  test += "abc";  } 
 How do you rewrite the sample code above to optimize linear concatenations? a. StringBuffer test = new StringBuffer(); for(int i = 0; i < 50000; i++) {  test.append("abc");  } b. StringBuffer test = new StringBuilder();  for(int i = 0; i < 50000; i++) {  test.append("abc");  } c. StringBuilder test = new StringBuilder();  for(int i = 0; i < 50000; i++) {  test.append("abc");                } d. String test = new String();  for(int i = 0; i < 50000; i++) {  test.append("abc");  } e. String test = new String("");  for(int i = 0; i < 50000; i++) { test += "abc";  } 
 
 
9. 
You perform localization by: 
a. loading all the libraries that were not 
previously loaded.
 b. translating the code into the local language.
  c. removing all components other than the local
   components. 
   d. adding locale-specific components and input methods.
    e. changing the time stamp of the local machine.   
STRING, UTIL CLASSES & INTERNATIONALIZATION 
 
10. public void printIt(String txt) 
{  Pattern wordBreakPattern = Pattern.compile("[\\s]");  
String words[] = wordBreakPattern.split(txt);  
for (String word: words) {  System.out.println(word);  } } 
Referring to the sample code above, 
what is the result when you invoke the 
following statement?  
printIt("Hello\nWorld\t!" ); 
a. prints: Hello World! 
b. Throws java.util.NoSuchElementException. 
c. prints: Hello World ! 
d. prints: Hello World 
e. prints: Hello World ! 
 
11. Sample Code
 RoundingMode mode = RoundingMode.????; 
 BigDecimal big1 = new BigDecimal(-11);
  BigDecimal big2 = new BigDecimal(2);
   System.out.println(big1.divide(big2, mode)); 
 
Based on the sample code above, 
which enumerated type of RoundingMode
 do you insert in place of ???? 
 to produce a rounding behavior resulting in -5? 
 a. UNNECESSARY b. CEILING c. HALF_EVEN d. UP e. HALF_UP 
  
STRING, UTIL CLASSES & INTERNATIONALIZATION 
 
12. class Person implements Comparable<Person> 
{  private static final Collator collator =
 Collator.getInstance(Locale.ITALY);  
 private final String lastname; 
  private final CollationKey key; 
    Person(String lastname) {  
    this.lastname = lastname;  } 
     public int compareTo(Person person)
      {  return key.compareTo(person.key);  } } 
      How do you get the sample code above to execute?
       a. Remove "Collator.getInstance(Locale.ITALY);"
        from the class. b. Remove
         "private final CollationKey key;" 
         from the class.
          c.
          Add "int compareTo=Person(String lastname)" 
          to the Person constructor. 
          
          d. Add "Collate.getcollator = this.(lastname);" 
           to the Person constructor. 
           e. Add "this.key = 
           collator.getCollationKey(lastname);" 
           to the Person constructor. 
 */



/*
	switch(season)
	{ case Season.WINTER: … break;
	 case Season.SPRING: … break; 
	 case Season.SUMMER: … break;
	  case Season.FALL: … } 
	  Which assertion clause do you add to 
	  the default clause of the switch block in 
	  the sample code above in order to catch the condition,
	   when season is not one of the given four values? 
	   a. default: assert true: season; 
	   b. default: assert false: season; 
	   c. default: throw new AssertionException(season); 
	   d. default: assertion true: season;
	    e. default: assertion false: season; 
	 
	  

	 
	2. try { 
	  // some code here that throws IOException } 
	   * catch (IOException ex)
	   * { System.out.println(“Line 1: Sample Error!”); 
	   * throw ex; } finally 
	   * { System.out.println(“Line 2: Example Error!”); }
	   *  What is the output of the sample code above? 
	   *  a. Line 1: Sample Error! 
	   *  Line 2: Example Error! 
	   *  b. Line 2: Example Error! 
	   *  c. Line 2: Example Error! Line 1: Sample Error! d. Line 1: Sample Error! e. Sample Error and Example Error! 
	  
	 
	3.  int a=5; int b=0; 
	try { int c = a/b; } 
	catch (FileNotFoundException a| IOException b| ArithmeticException 
	c) {      System.out.println
	(c.getMessage(“Cannot do this!”));   
	   System.out.println(b.getMessage(“Nope!”));   
	      System.out.println(a.getMessage(“Wrong Again!”)); } 
	 
	What is the outcome of the sample code above?
	 a. Wrong Again! b. Cannot do this! c. Nope! d. Nope! Wrong Again! e. Cannot do this! Nope! 
	 
	  
	4. public double SquareRoot(double value) 
	throws ArithmeticException { if (value >= 0)
	 return Math.sqrt(value); else 
	 throw new ArithmeticException(); }
	   public double func(int x) 
	   { double y = (double) x; 
	   try { y = SquareRoot( y ); } 
	   catch(ArithmeticException e)
	    {  y = 0;  } finally {  --y;  }
	        return y; } 
	Referring to the sample code above, what value is returned when you invoke method func(4)? 
	a. -2.0 b. -1.0 c. 0 d. 1.0 e. 2.0 
	 
	  
	5. Sample Code try
	{  //code throwing exception     }
	catch(IllegalArgumentException iae)
	{ //code throwing exception }catch(Exception e){ 
	//code throwing exception 
	}catch(DataFormatException dfe){ 
	} 
	
	How do you rewrite the sample code above to 
	reduce size? 
	a) try{  //code throwing exception } c
	atch(IllegalArgumentException iae, Exception e, DataFormatException dfe){ } b) try{ 
	//code throwing exception 
	}catch(IllegalArgumentException iae | Exception e | 
	DataFormatException dfe) { } 
	c) try{  //code throwing exception }
	 catch(IllegalArgumentException iae), 
	  (Exception e),  (DataFormatException dfe){ } 
	  d) try{  //code throwing exception } 
	  catch(IllegalArgumentException iae; Exception 
	  e; DataFormatException dfe){ } e) 
	  try{  //code throwing exception } 
	  catch("IllegalArgumentException iae" - 
	  "Exception e" - "DataFormatException dfe"){ } 
	  
	  
	  
	6. Sample Code 
	try{ //code }
	catch (Exception ex)
	{ if( ex instanceof SubSubException)
	{               //code }
	else if(ex instanceof SubException)
	
	{ //code }else{ //code } } 
	Why does the sample code above produce an error?
	 a. The code is not structured properly for a try catch 
	 exception.
	  b. The second if condition will never be evaluated, 
	  and its body is effectively unreachable code.
	   c. The code is not valid java code. 
	   d. The catch block cannot contain 
	   if-then-else statements. 
	   The if-then-else statement 
	   needs to be run first. 
	   e. The code is ordered in a way 
	   that will not cycle through all the proper checks. 
	 
	 
	7. Line 1 try 
	Line 2 { Line 3  
	  //some code Line 4 } Line 5 
	   * catch {Exception e} Line 6 { Line 7 
	   *    if (e instanceof FooException) Line 8  
	   *        throw e;
	   *         Line 9 }
	   *          How do you fix the sample code 
	   *          above for it to throw an exception? 
	   *          a. Change Line 5 to catch (Exception e).
	   *           b. Change Line 8 to throw
	   *            catch (Exception e).
	   *             c. Insert throw e after Line 5.
	   *              d. Insert try {//some code} 
	   *              after Line 5. 
	   *              e. Change Line 7 
	   *              to if {e instanceof FooException}. 
	  
	  
	8. public class TestEx 
	{ static class Ex1 extends Exception
		{} static class Ex2 extends Ex1 {} 
		static class Ex3 extends Exception {} 
		static void method1() throws Ex1,Ex2,Ex3 
		{ throw  new Ex2(); }
		public static void main(String args[]) 
		{ try { method1(); } catch (Ex3 e) 
		{  System.out.print("C");  } catch
		(Ex2 e) {  System.out.print("B");  } 
		catch (Ex1 e) {  System.out.print("A");  }
		catch (Exception e) {  System.out.print("D");  } 
		finally {  System.out.println("F");  } } } 
	What is the output of the sample code above?
			a. AF b. BAF c. BF d. CF e. DF 
	 
	  
	9. Sample Code 
	public double SquareRoot(double value) 
			throws ArithmeticException  
	{  if (value >= 0)  return Math.sqrt(value);  
	else  throw new ArithmeticException();  } 
	public double func(int x) {  double y = (double) x; 
	y *= -9.0;  try {  y = SquareRoot( y );  } 
	catch(ArithmeticException e) {  y /= 3;  } 
	finally {  y += 10;  }  return y;  }
	Referring to the sample code above, 
	what value is returned when 
	you invoke method func(9)? a. -27 b. -17 c. 7 d. 9 e. NaN 
			 
			 
	*/
	}




