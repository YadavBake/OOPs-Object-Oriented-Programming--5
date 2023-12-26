
											OOPs(Object Oriented Programming) Part-7||overriding ||varargs method
										    ===========================================================================

												
----------------------------------------------
  Overriding with Respect to var-arg methods  
----------------------------------------------

 -> We can override var-arg method with another var-arg method only if we are trying to override with normal method then it will become overloading but not overriding.
 
	Ex. 

	class P {							class Test {
		                                                        	
		public void m1(int... x ){<------------                     public static void main(String args[]){
			                               |                     		
			System.out.println("Parent");  |                     		P p = new P();
		}                                      |                     		p.m1(10); //parent 
	}                                     	       |                     		
	class C extends P {                    	       |=>// It is overloading 		C c = new C ();
		                                       |  //butnot overriding 		c.m1(10); //child 
		public void m1(int x ){                |                     		
			                               |                     		P p1 = new C();
			System.out.println("Child");   |                       		p1.m1(10);  // parent 
		}<--------------------------------------                              }
	}                                                           	}
	
	
	- In the above program if we replace child method with var-arg method then it will become overriding  in these case the output is Parent child child.
	
	
----------------------------------------	
  Overriding with respect to variables 
----------------------------------------

 -> Variable resovlution always takes care by compiler based on reference type Irrespective of whether the variables is static or non-static(Overriding concept applicable only
	 for methods but not for variables).  

	Ex 
 
  
	class P {				class Test {						Parent:		non-static	static 		non-static	static
		                                    	                                                
		int x = 888;                        	public static void main(String []){             child :		non-static	non-static	static		static
		                                    		                                        	
	}                                       		P p = new P();                              		888		  888		888		888
	class C extends P {                     		System.out.println(p.x); //888              O/P	  : 	999               999           999             999
		                                    		                                            		888               888           888             888
		int x = 999;                        		C c = new C();
	}                                       		System.out..println(c.x); //999
	                                        		
	                                        		P p1 = new C();
	                                        		System.out.println(p1.x); //888
	                                        	}
	                                        }
	
---------------------------------------------------
   Difference between Overloading and Overriding  	
----------------------------------------------------

	-----------------------------------------------------------------------------------------------------------------------------------------------------------------------		
	|	Property 	|		Overloading			     |		                            	Overriding 				      |				
	|-----------------------|----------------------------------------------------|----------------------------------------------------------------------------------------|		
	| 		        |                                                    |                                                                                        |
	| 1. Method name 	| 	 Must be same 				     |	Must be same 			                                                      |
	|                       |                                                    |                                                                                        |
	| 2. Arguments types 	| 	 Must be same[Atleast Order]		     |	Must be same[including order]                                                         |
	|                       |                                                    |                                                                                        |
	| 3. Method Signatures  | 	 Must be differnt 			     |	Must be same.		                                                              |
	|                       |                                                    |                                                                                        |
	| 4. Return types 	| 	 No rules or No restriction 		     |	Must be same until 1.4v version from 1.5v version onwords co-veriant types allowed    |
	|                       |                                                    |                                                                                        |
	| 5. private,static	|     Can be overloaded				     |	Can not be overriden.                                                                 |
	|	 final method   |                                                    |                                                                                        |
    	|                  	|                                                    |                                                                                        |
    	| 6. Access modifiers   |     No restriction in overloading 		     |	 we can't reduce  scope of access modifiers but  we can increase.                     |
    	|                       |                                                    |                                                                                        |
    	| 7. throws class	|     No restriction 				     |	If child class method throws any checked exception compulsory parent class method     |
    	|			|						     |	should throws the same checked exception or it parent but no restriction for          |
	|			|						     |  unchecked exception.                                                                  |
	| 			|                                                    |                                                                                        |
	| 8. Method resolution  |     Always takes care by compile based reference   |	Always takes care by JVM based runtime object.                                        |
    	| 			|     type.                                          |                                                                                        |
    	|                       |                                                    |                                                                                        |
    	| 9. It is also known   |     Compile time polymorphisam static polymorphisam|	runtime polymorphisam or dynamic polymorphisam or late binding.                       |
    	|    as.		|     early binding                                  |                                                                                        |
    	|                       |                                                    |                                                                                        |
    	|                       |                                                    |                                                                                        |
    	----------------------------------------------------------------------------------------------------------------------------------------------------------------------- 


Note: 

	- In overloading we have to check only method names(must be same) and argument types (must be differnt).
	
	- We are not required to check remaining like a return type,access modifiers ect.
	
	- But in overriding every thing we have to check like methods name, argument types,return types,access modifiers, throws class etc.
	

-> considard the following method in parent class ?

	- In the child class which of the following method we can take ? 


		Parent class: public void m1(int x) throws IOException {}
		
			public void m1(int i) //by Overriding rule we take these method 
			
			public static int m1(long l) // By overloding we take these method 
			
			public static void m1(int i) // invalid we can't take based on overriding rules 
			
			public void m1(int i) throws Exception  //invalid We can't take based on overridig rules 
			
			public static abstract void m1(double d)  // invalid illegal combination of modifiers  
		
	
================
 Polymorphisam 	
================

 -> One name but multiple forms is the concept of polymorphisam.
 
  Ex 1. 
  
	- Method name is same but we can apply for differnt types of arguments(overloading)
	
		Ex. 
		
			abs(int)
			abs(long)
			abs(float)
			
			
  Ex 2. 
  
	- Method signature is same but in parent class one type of implementation and in the child class another type of implementation (overriding).
	
		Ex. 
		
			class P 
			{
				Marry(){
					
					System.out.println("SubhLaxmi");
				}
			}
			class C extends P {
				
				Marry(){
					
					System.out.println("Naintata");
				}
			}
			
	Ex 3. 

		- Uses of parent reference to hold child object is the concept of polymorphisam.
			
			    Collection(I)
				|								List l = new ArrayList 	
				|                               List l = new LinkedList 
			      List 	                        List l = new Vector  	
			        |                               List l = new Stack 		
		        -----------------------
	 	       |	   |	      |	
   		   ArrayList   LinkedList    Vector 
					       |
				   	     Stack 

							
-> Parent class reference can be used to hold child object but by using that reference we can call only the methods available in parent class and we can't child specific methods 

			P p = new P();																							P----->m1()
			p.m1();//valid 																							^
			p.m2();//invalid CE: cannot find symbol; symbol method m2(). Location class Test 						|
																													|
																													C----->m2()	

-> But by using child reference we can call both parent and child class methods.

		C c = new C ();
		c.m1(); //valid 
		c.m2(); // valid 
		
		
-> When we should go for parent reference to hold child object ?

	- If we don't konw exact runtime type of object then we should go for parent reference.
	
		Ex. For example the first element prasent in the ArrayList can be any type It may be student object or Customer object or String Object or StringBuffer object hence a 
			the return type of get() method is object, which can hold any object. 
			
			
							
											-----------------------------
					Object o = al.get(0);			al----> | O  |	O  |	O   |	O   | 		public List m1(){
											-----------------------------	         	
											      Hetrogeneous object 	             AL|LL|V|S
			                                                                                                																											}


	----------------------------------------------------------------------------------------------------------------------------------------------------																									
	|		C c = new C ()				   |			P p = new C()                                                       |
	|		                                           |                                                                                        |
	|		Ex ArrayList l = new ArrayList		   |			List l = new ArrayList();                                           |
	|----------------------------------------------------------|----------------------------------------------------------------------------------------|
    	|                                                          |                                                                                        |
	|1. We can use these aprroach if know exact runtime type   | 	1. We can use these approach if we don't know exact runtime type of	            |
	|   of object.						   |	   object.                                                                          |
	|		                                           |                                                                                        |
	|2. By child using reference we can call both parent 	   |	2. By using parent reference we can call only methods available in parent class     |
	|   class and child class methods(these is the advantage   | 		and we can't call child specific methods(these is the disadvantage of these |
	|	of these approach).				   |		approach).                                                                  |
	|	                                                   |                                                                                        |
	|3. We can use child reference to hold only particular 	   | 3. We can use parent reference to hold any child class oebject these is the advantage  |
	|   child class object (these is the disadvantage of 	   |	   these approach.                                                                  |
	|   these approach).	                                   |                                                                                        |
	|----------------------------------------------------------|----------------------------------------------------------------------------------------|	
	



																					---------------------------------
																					|		 			            |
																					|		Encapsulation			|
																					|								|		
																					---------------------------------
																									^
                                                                                                    |
                                                                                                    |
                                                                                                    | //It is talks about security 
                                                                                                    |
                                                                                                    |
                                                                                                    |
                                                                                                    |
				---------------------------------									---------------------------------									---------------------------------					
                |		 			            |    It is talks about flexibility  |		 			            | It is talks about reuseability    |		 			            |
                |		Polymorphisam			|---------------------------------->|				OOP'S			|---------------------------------->|		Inheritance 			|
                |								|                                   |								|                                   |								|
                ---------------------------------                                   ---------------------------------                                   ---------------------------------



																	3 Pillers of Object Oriented Programmmings (OOP's)


																
																Polymorphisam
															-------------------
																	 |
																	 |
				---------------------------------------------------------------------------------------------------------
				|																									   |
		Static Polymorphisam																				 Dynamic Polymorphisam	
				or																									   or 
		compile-time polymorphisam																			 runtime polymorphisam
				or																										or
		 Early biding 																							    late binding 
				Ex.																										Ex.
	Overloading and method hiding																		    		Overriding  				
				
				
-> Beautiful defination of Polymorphisam ?

	- A boy start love with the worf friendship, but girl ends love with the same word friendship. word is the same but attitude is defferent. This beautiful concept of OOPS is nothing but 
	  polymorphisam.  
