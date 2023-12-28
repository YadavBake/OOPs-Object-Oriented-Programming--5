
																		OOPs(Object Oriented Programming) Part-8||coupling
																	=========================================================

----------------
 13. Coupling 																	
----------------

 -> The Degree of dependancy between the component is called coupling.

 -> If dependancy is more then it is considard as tightly coupling and If dependancy is less then it is considard as loosally coupling.

 -> 

	Ex. 
	
	class A {						class B {					class C {							class D {
		                            	                        	                                	
		static int i = B.j;         	static int j = C.k;     	static int  k = D.m1();         	public static int m1(){
	}                               }                           }                                   		
	                                                                                                		return 10;
	               above code  is  Tightly coupling                                                 	 }
	
 -> The above component are said to be tightly coupled each other becouse dependancy between the component is more.

 -> Tightly coupling is not a good programming practice because it has several serious disadvantages.

	 1. Without effecting remaining components we can't modify any component and hence a Ehancement will dificult.

	 2. It seprases reuseability.
	 
	 3. it reduces maintainbility of the application.
	 
 -> Hence a we have to maintaine dependancy between the component as less as possible. That is loosally coupling is a good programming practice.


-------------------
   14. Cohesion. 
-------------------   

 -> For Every component a clear well define funcationality is defined then that is said to be follow High Cohesion.
  
	Ex. 
																																					------------------	
																																					|				 | 
	   TotalServlet																													|-------------- |     Reply      | 
    -------------------------																						  				|	            |                | 
	|					    |														------------------					------------------	        ------------------ 
	|                       |														|				 |                  |				 |             reply.jsp       
	| Login Page display    |														|                |----------------- |    Indox       | 
	|                       |							------------------			|                |                  |                | 
	| Validation page       |						    |				 |          |                |                  ------------------ 			------------------	
	|                       |							|    longin      |          |                |                     inbox.jsp  |             |				 | 
	| Inbox page            |							|                |          |                |								  |-------------|    Compose     | 		
	|                       | /*70 lacks line 			------------------          |                |                                              |                | 
	| reply page            |  code here write*/		   login.jsp                |                |                                              ------------------ 
	|                       |                                                       |                |                                                 cpmpose.jsp       
	| Compose page          |                                                       |                |				   ------------------	
	|                       |                                                       |                |                 |			    | 
	| Error Page            |                                                       |                |-----------------|    Error       | 
	| .                     |                                                       |                |                 |                | 
	| .                     |														------------------                 ------------------ 
	| .                     |														  validate.jsp                        error.jsp       
	|                       |
	-------------------------
	
	 It is called Low Cohesion 															It is called high-cohesion
	 
	
  -> High-cohesion 	 is always a good programming practice because it has several advantages.
  
		1. Without effecting remaining components we can modify any component hence a Enhancement will become easy.
		
		2. It pramotes re-useability of the code (wherever validation is required we can use re-use the validate servlet without rewriting).
		
		3. It improves maintainbility of the application.
	
	
	
 Note: 

	- Loosly copuling and High-cohesion are good programming practices.
	

----------------------------	
 15. Object Type-Casting.	
----------------------------
 
 -> We can use parent reference to hold child object.
 
	Ex.
	
		Object o = new String("Durga");// valid 
		
 -> We can interface reference to hold implemented class object.
 
	Ex. 
		Runnable r = new Thread();
	
	Syntax 
		
	-------------------------------------------------------------------------------------------------
	|		A		 			b 					= 		(C) 					d;              |
	|	  -----				  ----						  ------				  -----             |
	|		|					|							 |					    |               | 
	|class or interface	  Name of reference			class or interface			reference variable  |
	|	name 				variable 						name 					name            |
	-------------------------------------------------------------------------------------------------
	
	
	Mantra-1 For types-casting 
  ------------------------------

		-------------------------------------------------------------------------------------------------
        |		A		 			b 					= 		(C) 					d;              |
        |	  -----				  ----						  ------				  -----             |
        |		|					|							 |					    |               | 
        |class or interface	  Name of reference			class or interface			reference variable  |
        |	name 				variable 						name 					name            |
        -------------------------------------------------------------------------------------------------
	
	1. Compile-time checking one :- The type of 'd' and 'C' must have some relation either child to parent or parent to child or same type otherwise we will get compile time error saying inconvertable 
		type found : 'd' type, required 'C'.
	
	
	
		Ex.1 
		
			class Test {
				
					public static void main(String args[]) {
		
						Object o = String("Durga");
						StringBuffer sb = ( StringBuffer) o;
					}
			}
					
	
		Ex. 2 
		
			class Test {
				
					public static void main(String args[]) {
						
						Stirng s = new String("Durga");
						StringBuffer sb =(StringBuffer) s;
						
					}
			} //invalid CE: inconvertable type found: java.lang.String, required : java.lang.StringBuffer
			

    Mantra-2 For type-casting 
 --------------------------------

	-------------------------------------------------------------------------------------------------
	|		A		 			b 					= 		(C) 					d;              |
	|	  -----				  ----						  ------				  -----             |
	|		|					|							 |					    |               | 
	|class or interface	  Name of reference			class or interface			reference variable  |
	|	name 				variable 						name 					name            |
	-------------------------------------------------------------------------------------------------
	
	
	2. Compile-time checking 2 -: 'C' must be either same or drived(child) type of 'A' otherwise we will get compile time error saying incompatible types found: 'C', required 'A'.

		Ex.1 
		
			class Test {
				
					public static void main(String args[]) {
		
						Object o = String("Durga");
						StringBuffer sb = ( StringBuffer) o;
					}
			}
					
		
		Ex 2. 

			Ex.1 
		
			class Test {
				
					public static void main(String args[]) {
		
						Object o = String("Durga");
						StringBuffer sb = (String) o;
					}
			} //invalid CE: incompatible types found: java.lang.Stirng, required java.lang.StringBuffer
					
	
   Mantra-3 (Runtime checking) For type-casting
-------------------------------------------------

	-------------------------------------------------------------------------------------------------
	|		A		 			b 					= 		(C) 					d;              |
	|	  -----				  ----						  ------				  -----             |
	|		|					|							 |					    |               | 
	|class or interface	  Name of reference			class or interface			reference variable  |
	|	name 				variable 						name 					name            |
	-------------------------------------------------------------------------------------------------
	
	3. Runtime object type of 'd' must be either same or drive(child)'C' otherwise we will get runtime exception ClassCastException.

		
		Ex 1. 
						
			class Test {
				
					public static void main(String args[]) {
		
						Object o = String("Durga");
						StringBuffer sb = ( StringBuffer) o;
					}
			}//invalid RE: ClassCastException java.lang.Stirng cannot be cast to java.lang.StringBuffer
					
		
		Ex 2. 
									
			class Test {
				
					public static void main(String args[]) {
		
						Object o = String("Durga");
						Object o1 = ( String) o;
					}
			} //valid 
					

-> 
	
							Object	
							  |
			 -----------------------------------
			 |								   |		
		 Base-1 							Base-2
			|								   |
	-----------------			 ----------------------------
	|				|		     |							|
Derive-1		Derive-2	Derive-3				   Derive-4




	Base2  b = new Derive4();
	
	Object o = (Base2)b; // valid 
	Object o = (Base1)b; // invalid CE: inconvertable types found Base2 required :Base1 
	Object o = (Drive3)b; // invalid RE: ClassCastException
	Base2 b1 = (Base1)b; // invalid CE: inconvertable types, found: Base2 required: Base1
	Base1 b1 = (Drive4)b; // invalice CE: incompatible type found: Derived4 required Base1
	Base1 b1 = (Derive1)b;// invalid CE : inconvertable types found: Base2, required: Drived1 
	
	
	




			
	
	
	
	
	
	
	
	