1.What is the difference between compile time and runtime?
Ans-The compailetime is the Programming term Which is performs compliation of the code written by the Programmer.and it convertes source code into byte code.
Runtime is the time where Byte code is running using JRE it refers to Java Runtime Environment Bytecode can be Exicuted.
 
 
 2.Explain types of variables with example.
 A variable is a name which is associated with a value that can be changed. OR Variables are containers for storing data values.
 For example int i=50; here variable name is i which is associated with value 50, int is a data type that represents that this variable can hold integer values.

 String - stores text, such as "Hello". ...
 
int - stores integers (whole numbers), without decimals, such as 128or -127.

float - stores floating point numbers, with decimals, such as 19.99 or -19.99.

char - stores single characters, such as 'a' or 'B'.
 

 3.Write example to convert string to primitive(8)
 
 Ex:public class Calender
{
public static void main(String[] days)
{
System.out.println("familyMembers");
byte numberOfMembers;
numberOfMembers= 6;
System.out.println(numberOfMembers);

System.out.println("minutesInADay");
short minutesInADay;
minutesInADay= 1440;
System.out.println(minutesInADay);

System.out.println("students");
int numbersOfEmployersInBengalur;
numbersOfEmployersInBengalur= 1000000;
System.out.println(numbersOfEmployersInBengalur);

System.out.println("area");
long areaOfEarth;
areaOfEarth= 510100000;
System.out.println(areaOfEarth);

System.out.println("percentage");
float highesttwodegitdecimalNr;
highesttwodegitdecimalNr = 90.99f;
System.out.println(highesttwodegitdecimalNr);

System.out.println("chargeOf");
double chargeOfElectron;
chargeOfElectron= 1.620217662000000000000;
System.out.println(chargeOfElectron);
 
System.out.println("sweet");
boolean sugarIsBitter;
sugarIsBitter = false;
System.out.println(sugarIsBitter);
 
System.out.println("name");
char sugar;
sugar = 'S';
System.out.println(sugar);
  
System.out.println("fruit");
String fruit;
fruit= "Banana";
System.out.println(fruit);
}
}
  
 
 
 4.Explain method, parameter, argument and return types with example
 
 Ans-Parameters act as variables inside the method. Parameters are specified after the method name, inside the parentheses.
 You can add as many parameters as you want, just separate them with a comma. 
 The following example has a method that takes a String called fname as parameter.
 public class mobile {
	Public static void main(String[] vivo)
	{
System,out,println("model is new");
	}
 }
 
An argument is a value passed to a method when the method is called. 
Whenever any method is called during the execution of the program there are some values passed with the method. These values are called arguments.

the return type defines and constrains the data type of the value returned from a subroutine or method.


  5.What is Encapsulation? Explain with an example
We hide the data members(field).We provide access using methods.
Using access Specifiers we achieve encapsulation in java.
   
   
   Ex: public class Tv
{
	private  static String channel="colours";
	
	public static String getChannel()
	{
		
		return channel;
	}
	
	public static void setChannel(String newChannel)
	{
		
		if(newChannel.equals("suvarna") || newChannel.equals("starMaa") || newChannel.equals("zee") || newChannel.equals("uday"))	//compare the string 		
		{
			System.out.println("new channel is "+newChannel);
			channel=newChannel;
		}
		else{
			System.out.println("you cannot change the channel");
		}
		}
	}	
	
	
	public class TvTester{
	
	
	public static void main(String[] remote)
{
System.out.println("JVM invoked main");

String value=remote[0];

String channelName=Tv.getChannel();

System.out.println("channelName"+channelName);
//System.out.println("unlockValue"+Mobile.getUnlock);

Tv.setChannel(value);

channelName=Tv.getChannel();

System.out.println("channelName"+channelName);
//System.out.println("unlockValue"+Mobile.getUnlock);

System.out.println("EXIT :: main");

}
	
}

6.Explain array with example.
 
 Array is a Collection of Elements which can store a fixed-size collection of elements of the same data type.
  
  public class India {	
  
	public static void main(String[] map)
	{
		System.out.println("JVM invokes main");		
		String[] statesArray={"Goa","Harayan","Manipur","Karnataka","Gujarat","Assam","Bihar","AdrharPradesh","Odisha","Mizoram"};
		
		satesOfIndia(statesArray);	

			
		System.out.println("exit main ");
	}		
	public static void satesOfIndia(String[] states)
	{

		System.out.println("statesOfIndia "+ states);		
		int size=states.length;
		System.out.println(size);
		
		System.out.println("statesOfIndia @ index 0 "+states[0]);
		System.out.println("statesOfIndia @ index 1 "+states[1]);
		System.out.println("statesOfIndia @ index 2 "+states[2] );
		System.out.println("statesOfIndia @ index 3 "+states[3]);
		System.out.println("statesOfIndia @ index 4 "+states[4]);

	}
	}
7.Write code to display elements of an array?

public class DisplayElementes 
{
 public static void main(String[] percentage )
 {
 System.out.println("invoked main method by JVM");
 arrayOfPercentage();
 }
 public static void arrayOfPercentage()
 {
 System.out.println("invoked arrayOfPercentage");

float sslcPercentage= 88.16f;
 float pucPercentage= 80.19f;
 float degreePercentage= 70.12f;
 
 float[] percentage={88.16f,80.19f,70.12f};
 float sizeOfArray= percentage.length;
 System.out.println("Total elements "+sizeOfArray);
 
 float elementAtIndex1=percentage[1];
 System.out.println("ElementAtIndex1 "+elementAtIndex1);
 
 }
}

8.Explain Method overloading with two example.
  
  Two Methods having same Signature but different in Parameters.
  
  Ex: 
   public class Charger

{
   public static void charging(String light)

{
   System.out.println("invoked Charging");

		System.out.println("arg light: "+light);

		}

	public static void  charging(String wire,String priceOfCharger)

	{
	    System.out.println("invoked Charging with two parameters ");

		System.out.println("String and String");

		System.out.println("arg1 wire"+wire);

		System.out.println("arg2 priceOfCharger"+  priceOfCharger);

			}
	
	public static void charging(String wire,int priceOfCharger)

	{

		System.out.println("invoked charging with two parameters ");

		System.out.println("String and int");

		System.out.println("arg1 wire"+wire);

		System.out.println("arg2 priceOfCharger"+ priceOfCharger);

	}

	public static void charging(int  priceOfCharger,String wire)

	{

		System.out.println("invoked charging with two parameters ");

		System.out.println("int and String");

		System.out.println("arg1 pirceOfCharger"+ priceOfCharger);

		System.out.println("arg2 wire"+wire);

		
}
}
	
public class ChargerTester{

public static void main(String[] laptop)

{

	System.out.println("JVM invoked main");	

	System.out.println("main method args length"+laptop.length);	

        

		String model="ViVO";

		Charger.charging(model);
        
		Charger.charging(model,14000);

        Charger.charging("model","Computer");

       System.out.println("EXIT :: main");	

}
}

