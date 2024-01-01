
											OOPs(Object Oriented Programming) Part-10 ||static control flow
										     ======================================================================

=======================
  Static control Flow 																
======================= 
 
 
	Rules For Static contol Flow
   ------------------------------	
 
	  -> Whenever we are executing a java class the following sequeance of steps will be executed as the part of static contorll flow.
	  
			1. Identification static members from top to bottom [1 to 6].
			
			2. Execution of static variable assignment and static blocks from top to bottom [7 to 12].
			
			3. Execution of main method [13 to 15].
			
			- RIWO = Read Indirect write only , R&w= Reand and Write.
 
 
					class Base 	
						{
	i = 0[RIWO]			   --------------- --------							
	j = 0[RIWO]			1-|static int  i || = 10; | -7
	i=10[R&W]			  ---------------- --------			
	i=20[R&W]			  
					       ----------
					  2-  | static |
					      ----------								     java Base 
			 	   	      {											 0 
						-------									  First static block 
					     8 -|m1();|									  Second static block 
				    	         -------									20
						-------------------------------------------				   Main method	
					     10-|System.out.println("First static block");|
						-------------------------------------------
							}
			   		           ------------------------------------------						
						3-|  public static void main(String []args) |
						  ------------------------------------------							
							{
							    -------
							 13-|m1();|
							    -------
						        ---------------------------------------
						    15- |System.out.println(" Main Method "); |
						        ---------------------------------------		
							}
						 
						   -------------------------		
						4-| public static void m1()|
						   -------------------------
							{
								-----------------------
							 9-	|System.out.println(j);|-14
								------------------------
							}
						   ---------	
						5- |static |
						   ---------
						   
							{   --------------------------------------------
							11 -|System.out.println("Second static block");|
							    --------------------------------------------
							}
					  	  ------------  -------
						6-|static int j||= 20 |-12
						  ------------  -------	
						}
						
						
  Read Indirectly write only[RIWO]
 ----------------------------------

  ->  Inside static block if we are trying to read a variable that read operation is called direct read.
  
  -> If we are calling a method and within that method if we are trying to read a variable that read operation is called indirect read.

		Ex. 
		
		class Test {
			
			static int i = 10;
			
			
			static {
				
				m1();
				System.out.println(i); //Direct read 
			}
			public static void m1(){
				
				System.out.println(i); // Indirect read 
			}
		}
 
   -> If a variable is just identified by the JVM and origenal value not yet assign then the variable is said to be in Read Indirectly Write only state[RIWO].
   
   -> If a variable is in Read indirectly write only state then we can't performe direct read but we can performe indirect read.
   
   -> If we aer trying to read directly then we will get compile time error sayin Illegal forward reference.
   
   
  class Test {								class Test {					class Test {
     ---------------- ------- 					    ----------			                                    
 1  | static int x | |= 10; |  3        			1 - | static |                                              	   ---------	
    -------------------------                                       ----------                                              	 1 |static |
	--------                                                  {                                                       	   ---------
	|static| 2                                                	System.out.println(x); // direct read           	{					x = 0 [RIWO]
	--------                                                  }                                                     		m1();
	{                           					            			                       		}
		System.out.println(x);  // indirect read	   --------------  -------	                            				
	 }                          				2- |static int x| |= 10; | -3  // i= 0 [RIWO]               	   ----------------------------	
 } 	                            				   --------------  -------                                  	 2 |public static void m1(  ) |
													            		    ----------------------------
							}	 // CE: Illegal forward reference                           		{
o/p: 10 											                                                                                			
RE: NoSuchMetodError:main 						                                                            		System.out.println(x);
                                                                                                                                    		}
                                                                                                                                    	   -------------- --------	
                                                                                                                                    	 3 |static int x| |=  10;|
                                                                                                                                    	   -------------  --------
                                                                                                                                    } 
                                                                                                                                      0 
                                                                                                                                      RE: NosuchMethodError: main 


	
		
		
		
      
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
