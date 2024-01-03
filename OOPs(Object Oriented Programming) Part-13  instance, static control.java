
														OOPs(Object Oriented Programming) Part-13 || instance, static control
													============================================================================


-> 

	class Test {
		---
	7	|{| 15
		---
			---------------------------------------------
		10	|System.out.println("First Instance Block");| 18
			---------------------------------------------
		}
		--------																	Static control flow rules 	
	1	|static|																			
		--------
		{																			1. Identification of static members form Top to Bottom. [ 1 to 3 ]
			-------------------------------------------                             2. Execution of static variable assignments and static blocks from Top to bottom. [4 to 5]
		4	|System.out.println("First static Block");|                             3. Execution of only Test class main method. [ 6 ,13,14 ] 
			-------------------------------------------
		}
		---------																	Instance Control Flow Rules
	8	|Test ()| 16
		---------
		{																			1. Identification of instance members from top to bottom. [7 to 9] [15 to 17]
			------------------------------------                                    2. Execution of instance variable assignments and instance blocks from top to bottom. [ 10 to 11] [18 to 19]
		12	|System.out.println("Constructor");| 20                                 3. Execution of constructor. [12][20]
			------------------------------------
		}
		--------------------------------------
	2	|public static void main(String args)|
		--------------------------------------
		{
			-----------------------													First Static Block 	
		6	|Test t1 = new Test();|                                                 Second Static Block
			-----------------------                                                 First Instance Block 
			-----------------------------                                           Second Instance Block
		13	|System.out.println("Main");|                                           Constructor
			-----------------------------                                           Main 
			-----------------------                                                 Fist Instance Block 
		14	|Test t2 = new Test();|                                                 Second Instance Block
			-----------------------                                                 Constructor 
		}
		--------
	3	|static|
		--------
		{
			---------------------------------------------
		5	|System.out.println("Second Static Block"); |
			---------------------------------------------
		}
		---
	9	|{| 17
		---
			----------------------------------------------
		11	|System.out.println("Second Instance Block");| 19
			----------------------------------------------
		}
	}
		
		
		
		
		
->  

			public class Initialization {																						class Initialization2 {
				                                                                                                                	
				--------------------------------------                                                                          	private static String m1(String msg) {
			1	|private static String m1(String msg)|                                                                          		
				--------------------------------------                                                                          		System.out.println(msg);
				                                                                                                                		return msg;
				{                                                                                                               	}											m = null  o/p: 1   
					-----------------------------                                                                               	                                            	  1		   3	
					|System.out.println("Msg"); |<----|                                                                         	static String m = m1("1");                  	  3        2   
					-----------------------------     |                                                                         	                                            	  2		
					-------------		  ^	 ^        |                                                                         	{
					|return msg;|		  |  |        |                                                                         		
					-------------		  |  | 	      |                                                                         		m = m1("2");
				}						  |  |        |                                                                         	}
				--------------------------|	 |        |                                                                         	static 
			4	|public Initialization ()||	 |        |                                                                         	{
				--------------------------|  |arg(2)  | arg(3)                                                                  		m = m1("3");
				{                         |  |        |                                                                         	}
					--------------  arg(1)|  |        |                                                                         	public static void main(String args[]) {
					|m = m1("1");|---------  |        |                                                                         		
					--------------			 |		  |						m = null  o/p: 2                                    		Object obj = new Initialization2();
				}                            |        |							  2		   3	                                	}
				----                         |        |							  3        1                                    }
			5	|{ |                         |        |							  1		
				----                         |        | 
					--------------           |        |
				7	|m = m1("2");|-----------|		  |
					--------------					  |	
				}									  |	
				----------  ------------			  |	
			6	|String m | |= m1("3");|--------------|			
				----------- -----------
				----------------------------------------
			2	|public static void main(Stirng args[])|{
				----------------------------------------
				
					----------------------------------	
				3	|Object o = new Initialization();|
					----------------------------------
				}
			}
		
		
			
Note: From static area we can't access instance members directly becuase while executing static area JVM may not identify instance members.

	Ex. 
		 
		class Test {
			
			int x = 10;
			
			public static void main(String args[]) {
				
				System.out.println(x);
			}
		} //CE: non static variable x cannot be referenced from a static context.
		
		
			
Q.1) In how many ways we can create an object in java or In how ways we can get object in java ?

				
	1. By using new operator    2. By using newInstance() method:							3. By using factory method.							4. By using clone() method.
	                                                                                                                                            
	                            	Test t = (Test)Class.forName("Test").newInstance();     	Runtime r = Runtime.getRuntime();               	Test t1 = new Test();
		Test t = new Test();                                                                	DateFormat df = DateFormat.getInstance();       	Test t2 = (Test)t1.clone();
		
	
	5. By using Deserialization.
		
		FileInputStream fis = new FileInputStream("abs.ser");		
		ObjectInputStream ois = new ObjectInputStream(fis);	
		Dog d2 = (Dog)ois.readObject();	
		
		
			
		

		
		
			
		

		
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		