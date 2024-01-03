
																	OOPs(Object Oriented Programming) Part-15 || default constructor
																======================================================================

----------------------------------
 Prototype of Default Constructor 																
----------------------------------

 1. It is always no-arg constructor.

 2. The access modifier of default constructor is exactly same as access modifier of class (This rule is applicable only for public and default).

 3. It containes only one line  it is a 'super().' It is a no-argument call to Super class constructor.
 
 
	--------------------------------------------------------------------------------------------------------------------------------------
	|	Programmer's Code 				|Compiler genareted  Code			|	Programmer's Code 			|	Compiler genareted  Code |
    --------------------------------------------------------------------------------------------------------------------------------------																					
    |                                   |                                   |                               |                            |
	|1. 		Class Test {			|		Class Test {				|		class Test {			|		class Test {         |
	|									|	                                |                               |                            |
	|									|		Test(){						|		Test(){					|		Test(){              |
	|		}							|			                        |    							|		super();             |
	|									|		super();					|		}						|		}                    |
	|									|	}							    |    }							|	}                        |
	|                                   |                                   |                               |                            |
	|                                   |                                   |                               |                            |
	|2. 		public class Test {		|	public class Test {             |                               |                            |
	|	                                |                                   |                               |                            |
	|									|	public Test() {                 |    class Test {               |   class Test {             |
	|		}							|		                            |    	                        |  	                         |
	|									|		super();                    |    	Test(int i){            |  	Test(int i){             |
	|									|	}                               |    		                    |  		                     |
	|									|	                                |    		super();            |  		super();             |
	|3.      public class Test {		|	public class Test {             |        	}                   |      	}                    |
	|	                                |                                   |     }                         |    }                       |
	|			void Test() {			|	public Test(){                  |                               |                            |
	|				                    |                                   |                               |                            |
	|			}						|		super();                    |    class Test {				|class Test {	             |
	|									|	}                               |    	                        |	                         |
	|									|		                            |    	Test(){                 |	Test(){                  |
	|		}							|	void Test() {				    |    		                    |		                     |
	|									|	}                               |    	this(10);               |	this(10);                |
	|									|}                                  |     	}                       |	}                        |
	|									|                                   |     	Test(int i){            |	Test(int i){             |
	|                                   |                                   |      	                        |	 super();                |
    |                                   |                                   |      	}                       |	}                        |
	|	                                |                                   |     }                         |  }                         |
    |                                   |                                   |                               |                            |
    --------------------------------------------------------------------------------------------------------------------------------------
    
    
  -> The first line inside every constructor should be either super() or this() and If we are not writing any thing then compiler will always place super().
  
  
  
  Case 1:  We can take super() or this() only in first line of constructor If we are trying to take any where else we will get compile time error.
  
		Ex. 
	
		class Test {
			
			
			Test (){
				
				System.out.println("constructor");
				super();
			}
		} // invalid CE: call to super() must be first statement in constructor.
	
   Case 2: within the constructor we take either super() or this but not both simultaneously.

	
	Ex. 
	
		class Test {
			
			Test() {
				
				super();
				this();
			}
		}//invalid CE: call to this must be first statement in constructor.
		
	
	
	Case 3: We can use super() or this() only inside constructor If we are trying to use outside of constructor we will get compile time error.
	
		Ex. 
		
		class Test {
			
			public void m1() {
				
				super();
				System.out.println("Hello");
			}
		}//invalid CE: call to super() must be first statement in constructor 
	
		- That is we can call a constructor directly from another constructor only.
		

   Summary:-
	
				| -> We can use only in constructor
		super();| -> only in first line.
		this(); |
				| -> Only one but not both simultaneously.
	
 -> 

	-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	|		super(), this() 																 |		super,this 																	|	
	-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	|1. 	Thess are constructor calls to calls super class and current class constructor.	 |	1. These are keywords to refer super class and current class instance members.  |
	|                                                                                        |                                                                                  |
	|2.  We can use only in constructor as first line.										 |   2. We can use any where except static area.                                    |
	|                                                                                        |                                                                                  |
	|3. we can use only once in constructor.												 |	3. We can use any number of times.                                              |
	-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	
	
		class Test {
			
			public static void main(String args[]){
				
				System.out.println(super.hashCode());
			}
		}//CE: non-static variable super cannot be referenced from a static context.
		
		
		
		class P  {
			
			int x = 100;
		}
		class C extends P {
			
			int x = 200;
			
		  public static void main(String args[]) {
			  
			  System.out.println(this.x); //200
			  System.out.println(super.x);//100
		  }
		}
	
	
			
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
    
    
    
    
	
	
	
    