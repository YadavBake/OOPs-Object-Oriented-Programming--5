
											OOPs(Object Oriented Programming) Part-6 ||overriding ||access
										     ====================================================================


------------------------------------------------
 Rules :- Overriding rule related to Exception . 
------------------------------------------------

 -> If child class method throws any checked exception compulsory parent class method should throw the same checked exception or its parent otherwise we will get compile time 
	error But there are no restriction for unchecked exceptions.
	
		Ex.
		
			import java.io.*;
			class P {
		
				public void m1() throws IOException {
					
				}
			}
			class C extends P {
				
				public void m1() throws IOException, InterruptedException {
					
				}
			}//invalid  CE: m1() in C cannot override m1() in P; overriden method does not throws java.lang.InterruptedException.
		
				
			1.	Parent class : public void m1() throws Exception  //valid 
				Child class :  public void m1()
				
			2.	Parent class: public void m1()
				Child class : public void m1() throws Exception		// invlaid 
				
			3. Parent class: public void m1() throws Exception		//valid 			
			   Child class: public void m1() throws IOException
				
			4.	parent class : public void m1() throws IOException	//invalid
				Child class : public void m1() throws Exception
				
			5.	Parent class : public void m1() throws IOException	//valid 
				Child class: public void m1() throws FileNotFoundException,EOFException
				
			6.	Parent class: public void m1() throws IOException	//invlid 
				Child class : public void m1() throws EOFException,InterruptedException
				
			7.	Parent class: public void m1() throws IOException	//valid 	
				Child class: public void m1() throws ArithmeticException, NullPointerException, ClassCastException
				

-------------------------------------------------				
	Overriding with respect to static methods 
-------------------------------------------------

 Case 1:  we can't override a static method as non-static otherwise we will get compile time error.
 
	Ex. 

	class P {
		
		public static void m1(){
			
		}
	}
	class  C extends P {
		
		public void m1(){
			
		}
	}//invalid CE: m1() in C cannot override in m1() in P ; override method is static 
	
	
 Case 2: Similarly we can't override a non-static method as static.

	Ex.

		class P {
			
			public void m1(){
			}
		}
		class C extends P {
			
			public static void m1(){
				
			}
		}//invalid CE: m1() in C cannot override m1() in P ; overriding method is static 

 
 Case 3: If both parent and child class methods are static then we won't get any compile time error. It's seems overriding concept applicable for static methods but it is not 
	     overriding and it is method hiding.
	
	Ex.
	
		class P {
			
			public static void m1(){<---------
				}			 |
		}					 |
		class C extends P {			 |//==> It is method hiding but not overriding.		
							 |
			public static void m1(){	 |
							 |
			}<--------------------------------	
		}

----------------	
  Method hiding
----------------

 -> All rules of method hiding are excetly same as overriding except the following differences.
 
    ------------------------------------------------------------------------------------------------------------------
	|		Method hiding 			    |				Overriding 		     |	
	|---------------------------------------------------|--------------------------------------------------------|		
	| 1. Both parent and child class method should 	    | 1. Both parent and child class method should be        |
	|	be static 				    |	non-static.                                          |
        |                                                   |                                                        |
	| 2. Compiler is responsible for method resovlution |	 2. JVM is always responsible for method resovlution |
	|	based on reference type.		    |	based on runtime object.                             |
	|	                                            |                                                        |
	| 3. It is also know as Compile time polymorphisam  | 3. It is also know runtime polymorphisam or dynamic    |
	|	or static polymorphisam or early binding.   |	polymorphisam or late binding.                       |
    --------------------------------------------------------------------------------------------------------------

	Ex. 	
    
	class P {												class Test {
		                                                                                                    	
		public static void m1(){----------------                                                               	public static void main(String args[]){
						        |                                                               		
			System.out.println("Parent");   |                                                               		P p = new  P ();
		}                                       |//==> It is method hiding but not overriding.                  		p.m1();//parent 
	}                                       	|                                                               		
	class C extends P {                     	|                                                               		C c = new C();
		                                    	|                                                               		c.m1();//child 
		public static void m1(){		|                                                               		
							|                                                               		P p1 = new P();
			System.out.println("Child");	|                                                               		p1.m1();//parent 
		}<---------------------------------------                                                               		
	}                                                                                                       	}
	                                                                                                        }

  -> If both parent and child class methods are non-static then it will become overriding in these case is parent, child child.

  
 

 
	
	
	
	
	
	
	
	
	
	
	
	
	

















