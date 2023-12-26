
											OOPs(Object Oriented Programming) Part-5 ||overriding
										    ============================================================

---------------------
   9. Overriding.*
---------------------

 -> Whatever methods parent has by default available to the child through inheritance if child class not saticefied with parent class implementation then child is allowed to 
	redefine that method based on it's requirement these process is called overriding.
	
 -> The parent class method which is overriden is called Overriden method and  the child class method which is overriding is called overriding method.

		Ex. 

		class Parent {
			
			public void property(){
				
				System.out.println("Gold|Cash|Land");
			}
			public void marry(){<-----------------------------------------------------------------------
										 |//->Overriden method 		   |
				System.out.println("Subh Laxmi");		 |				   |
			}<--------------------------------------------------------				   |						
		}												   |
		class Child extends Parent {									   |//==> These is called overriding 
														   |
			public void marry(){<---------------------------------					   |	
								              |					   |	
				System.out.println("Thrisha|Naintara|charmi");|//-> Overriding Method 		   |	
			}<------------------------------------------------------------------------------------------
		}
		
		
		class Test {
			
			public static void main(String args[]) {
				
				Parent p = new Parent();
				p.marry();// Subh laxmi parent method 
				
				Child c = new Child();
				c.marry();// Thrisha|Naintara|Charmi. child method 
			
				Parent P1 = new Child();
				p1.marry();//Thrisha|Naintara|Charmi. child method 
		
			}
		}
		
 ***> In overriding method resolution always takes care by JVM based on runtime object and hence a overriding is also considard as runtime polymorphisam or dynamic polymorphisam 
	  or late binding.
	  

 Rules For OVerriding 
----------------------
	
	-> In overriding methods names and arguments types must be matched that is method signature must be same.

	-> In overriding return type must be same but these rule is applicable until 1.4v version only from 1.5v version onwords we can take co-veriant return types according to these 
	   child class method return type need not be same as parent method return method it's child type also allowed.
	   
		Ex. 
	
		class P {
			
			public Object m1() {
				
				return null;
			}						// It is invalid in 1.4v version 
		}							// But from 1.5v version onwords it is valid 
		class C extends P {
			
			public String m1(){
				
				return null;
			}
		}
	
	  
	-> Co-veriant return type concept applicable only for object types but not for primitive types.

		
	  
	   Parent class method return type :-   	   Object 		    Number 		  String   	  double 
							     | 			      |			     |		     | 	
							     |                        |                      |               |
							     |                        |                      |               |
	   child class method return type  :-  Object|String|StringBuffer        Number|Integer 	  Object 	    int 
						   //valid 			   valid 		invalid 	  invalid 
		
		
-> Parent class private methods not available to the child and hence overriding concept not applicable for private methods.	  
	  
	  - Based on our requirement we can define execatly same private method in child class it is valid but not overriding.
	
		class P {
			
			private void m1(){<----------
						    |
			}                           |
		}                                   |//=> It is valid but not overriding.
		class C extends P {		    |
			                            |
			private void m1(){          |
			}<---------------------------
			
		}

-> We can't override parent class final method in child classes if we are trying to override we will get compile time error.

		Ex. 

			class P {
				
				public final void m1(){<-------
							       |
				}                              |
			}                                      |
			class C extends P {                    |//==> CE: m1() in C cannot override m1() in P, Overriden method is final 
				                               |
				public void m1(){              |
							       |	
				}<------------------------------	
			}
		
-> Parent class abstract methods we should override in child class to provide implementation.

		Ex. 

		abstract class P {
			
			public abstract void m1();
			
		}
		class C extends P {
			
			public void m1(){
			}
		} //valid 
		
		
->  We can override non-abstract method as abstract.

		Ex. 

			class P {
				
				public void m1(){
					
				}
			}
			abstract class C extends P {
				
				public abstract void m1();
			}
		
	   - The main advantage of these approach is we can stop the availability of parent method implementation to the next level child classes.
	   
-> In overriding the following modifiers won't keep any restriction.

	synchronized,native,strictfp 


Parent Methos -:    final   non-final    abstract    non-abstract    synchronized     non- synchronized	   native     non-native       strictfp	      non-strictfp
		     |	       |	    |		|		|		    |		     |		   |		   |		   |
		     |	       |            |           |               |                   |                |             |               |               |
		     |         |            |           |               |                   |                |             |               |               |
chaild method -:  non-final  final     non-abstract   abstract	  non-synchronized      synchronized      non-native     native        non-strictfp      strictfp
		 //invalid   valid 	valid 	       valid     	valid 		   valid 	   valid 	  valid		valid 		  valid 
	  
	  
->  While overriding we can't raduce scope of access modifiers but we can increase the scope.

	Ex. 

		class P 
		{
			public void m1(){
			}
		}
		class C extends P {	
			
			 void m1(){
				
			}
		} //CE: m1() in C cannot override m1() in P, attemting to assign weeker access privilages; was public 
	  
	  
-> 

		private < default < protected < public 
		
		
		
	parent class Method ->		public 		protected 	  default			private 
					 |		   |		      |				  |
                                 	 |             	   |                  |                           |
                                         |                 |                  |                           |
	child class Mehod -> 		public     protected|public   default|protected|public   	   |--> //OVerriding concept not applicable for private method.
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
