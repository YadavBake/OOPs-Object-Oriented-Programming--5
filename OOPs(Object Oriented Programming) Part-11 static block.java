
																		OOPs(Object Oriented Programming) Part-11 ||static block
																	===============================================================

--------------
 static Block
--------------

 -> static blocks will be executed at the time of class loading hence a at the time of class loading if we want to perform any activity we have to define that inside static block.

 Ex 1. 
 
	 - At the time of java class loading the corresponding native library should be loaded hence a we have to define these activity inside static block.

		class Test {
			
			static {
				
				System.loadLibrary("native library path");
			}
		}
		
 Ex 2 .
 
	- After loading every data base driver class we have to register driver class with driver manager but a inside database driver class there is static block to perform these activity and we are 
	  not responsible to register explicityl.
	
	
		class DBDrive {
			
			static {
				
				/*Register this Drive 
				with DriverManger*/
			}
		}
	
 Note:- Within a class we can declare any number of static blocks but all these static blocks will be executed from top to bottom.
	
	
Q.1) Without writing main method is it possible to print some statements to the console ?

		Yes By using static block.
		
		class Test {
			
			static {
				
				System.out.println("Hello I can print");
				system.exit(0);
			}
			
		}// Hello I can print 
		
 Q.2) Without writing main method and static block is it possible to print some statements to the console ?

		Yes ofcourse there are mutiple ways
		
				
		class Test {											class Test{													class Test {
			                                                    	                                                        	
			static int x = m1();                                	static Test t = new Test();                             	static Test t = new Test();
			                                                    	                                                        	
			public static int m1(){                             	{                                                       	Test (){
				                                                		System.out.println("Hello I can print");            		
				System.out.println("hello I can print");        		System.exit(0);                                     		System.out..println("Hello I can print");
				System.exit(0);                                 	}                                                       		System.exit(0);
				return 10;                                      	                                                        	}
			}                                                   }                                                           }
		}

	//By using method call 									by using instance block 										By using constructor.	
		

Note:- From 1.7v version onwords main() method mandatory to start a program execution hence a from 1.7v version onwords without writing main() method it is impossible to print some statements 
	   to the console.
	   
-------------------------------------------------------	   
 static controll flow in parent to child relationshipt 
-------------------------------------------------------

 ->  Whenever we are executing child class the following sequence of events will be executed automatically as the part of static controll flow. 
 
		
		1. Identification of static members form parent to child. [ 1 to 11 ]
		2. Execution of static variable assignments and static blocks from parent to child. [12 to 22]
		3. Execution of only child class main method. [23 toi 25 ] 
 
			
	class Base {																										class Drived extends Base {
        -------------- -------                                                                                                  -------------- ------              	
	  1 |static int i| |= 10;| 12                      					i = 0 [RIWO]                                          6 |static int x|| =100;| 17
		-------------- -------                                      	j = 0 [RIWO]                                            -------------- ------              	
		--------														x = 0 [RIWO]                                    	
	  2 |static| 														y = 0 [RIWO]	                                	--------
		-------- 														i = 10[R&W]                                       7 |static|
		 {                                                    			j = 20[R&W]                                         --------
			--------                                                    x = 100[R&W]                                    	{
			|m1(); | 13                                                 y = 200[R&W]                                    		-------
		    --------													                                                		|m2();| 18
			-------------------------------------------------                                                           		-------
			|System.out.println("Base class static block"); | 15                                                        	    -------------------------------------------------
			-------------------------------------------------			                                                		|System.out.println("Drived first static block");| 20
		}                                                               			java Base.java                      		--------------------------------------------------
	    ----------------------------------------	                    				  |                             	}
	  3	|public static void main(String args[])|                        	-----------------------------               	----------------------------------------
		----------------------------------------                        	|							|                 8 |public static void main(String args[])|
		{                                                               Base class 				  Drived class          	----------------------------------------
			                                                                                                            	{
			m1();                                                                                                       		-------
			System.out.println("Base main");                              java Derived                                  		|m2();| 23 
		}                                                               		0                                       	    -------
		-------------------------                                         Base class static block                       		------------------------------------
	  4 |public static void m1() |                                      		0                                       		|System.out.println("Derive main");| 25 
		-------------------------                                        Drived first static block		                		------------------------------------
		{                                                                Derived Second static block                    	}
			------------------------                                    		200                                     	-------------------------
			|System.out.println(j);| 14                                   Derived main 		                              9 |public static void m2()|
			------------------------	                                                                                	-------------------------
		}                                                                                                               	
		-------------- -----                                                                                            	{
	  5 |static int j||= 20;|  16                                                                                       		-----------------------
		-------------- -----                                                                                            		|System.out.println(y);| 19 24 
	}                                                                                                                   		-----------------------
	                                                                                                                    	}
	    java Base                                                                                                           --------
	                                                                                                                     10 |static|
        	0                                                                                                               --------
	    Base static block                                                                                                   {
        	20                                                                                                               	----------------------------------------------------
        Base main 	                                                                                                         	|System.out.println("Derived Second static block");| 21
                                                                                                                        		----------------------------------------------------
                                                                                                                        	}
	                                                                                                                    	 -------------- ---------
	                                                                                                                      11 |static int y| | = 200;| 22 
                                                                                                                             -------------- ---------
	                                                                                                                    }
    
 Note: whenever we are loading child clas automatically parent class will be loaded but whenever we are loading parent class child won't we loaded (because parent class members by default 
	   available to the child class where as child class members by default won't available to the parent).
	   

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 	
	
	
	
	
	
	
	
	
	
	
	  
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		





































 