
														OOPs(Object Oriented Programming) Part-2 || Inheritance||IS-A
													=====================================================================
																				Module-2 
																			  ==============	
																		
-------------------------------
	5. IS-A Relanationship.
-------------------------------

 - It is also known as inheritance.
	
 - The main advantage of IS-A relationship is code reusability.
	
 - By using extends  keyword we can impliment IS-A Relationship.
	
 
	class P {										class Test{
		                                            	
		public void m1(){                           	public static void main(String args[]){
			                                        		
			System.out.println("Parent");           	1.	P p = new P();
		}                                           		p.m1(); //valid 
	}                                               		p.m2();//invalid CE: Cannot find Symbol: Symbol : method m2(), Location: class P 
	class C extends P {                             		
		                                            	2.  C c = new C();
		public void m2(){                           		c.m1();//valid
			                                        		c.m2();//valid
			System.out.println("child");            		
		}                                           	3.  P p1 = new C();
	}                                               		p1.m1();//valid 
	                                                		p1.m2();//invalid CE: Cannot find Symbol: Symbol : method m2(), Location: class P 
	                                                		
	                                                	4.  C c1 = new P();//invalid CE: incompatible types found: P required :C 
	                                                	
	                                                	}
	                                                }
	
	
	Conclusion: 
	
		1. Whatever methods parent has by default available to the child and hance a on the child reference we can call both parent class and child class method.
		
		2. Whatever methods child has by default not available to the parent and hence a on the parent reference we can't call child specific methods.
		
		3. Parent reference can be used to hold child object but by using that reference we can't call child specific methods but we can call the methods paresent in parent class.
		
		4. Parent reference can be used to hold child object but child reference can not be used to hold parent object.
		
		Ex. 
		
			-> Creating Loan module With Inheritance and without Inheritance 



					Without Inehertance 														With Inheritance
	Ex. 				
															
	class VLoan {      class HLoan {			class PLoan {										class Loan {									
		               	                        	            										
	 //300 methods      //300 methods            //300 methods  										// 250 Method 
	                                                            										
	}                  }                        }               									}
		                                                        									
			                                                    class VLoan extends Loand  {      class HLoan  extends Loand{			class PLoan extends Loand {		
																															
																		//50 specific methods      			//50 specific methods            		//50 specific methods 
																															
			                                                    }                 					 }                        					}		
	                                                            			
	
			/*900 Method we have to write        												400 method we have to write 			
	        90 hourse development time requied */												// 40 houese required for development.
	                                             
	
	Note: 
	
		- The most comman methods which are applicable for any type of child, We have to define in parent class.
		
		- The specific method which are applicable for a particular child we have to define in child class.
			
		- Total Java API is implimented based on inheritance concept.
		
		- The most comman methods which are applicable for any java object are defined in object class and hence every class in java is a child class of object either directly 
		  or indirectly so that object class methods by default available to every java without re-writing due to these object class access root for java classes.
		 
		- Throwable class the most comman methods which are required for every exception and error classes hence these class access root for java exception hirarchy.

																			
																	Object 
																	  |
										--------------------------------------------------------------------------
										|			 |															 |			
										|			 |	..........................								 |
									  String 	 StringBuffer											    Throwable
																											    |
																						----------------------------------------------------------
																					    |														 |
																						|														 | 	
																				    Exception 												    Error 
																					    |														  |	
																	----------------------------------------							------------------------
																	|							|	.......|							|					   |
																	|					 	IOException							OutOfMemoryError
																RuntimeException				|										....
																	|							|
																	|-AE						...
																	|-NPE
																	...	
	Multiple Inheritance 
  -------------------------	
	
	- A java class can't extends more than one class at a time hence a java won't provide support multiple inheritance in classes.
	
		class A extends B,c {
			
		}//invalid CE: 
		
		
    note: 

		- If our class doesn't extend any other class then only our class is directly child class of object 
		
				class A 
		        {				Object 
		        				  ^	
		        }				  |
		        				  |	
		        				  A 
								  
		- If our class extends any other class then our class is indirect child class of object.
		
			
		class A extends B {									
											Object					
											  ^						
			B			OBject 			 	  | 				
			|			  |					  |			
			|	 		  |					  B		
			|	 		  |				      ^	
			--->A<--------- 			      |	
			It is multiple				      |
			inheritance 				      A
			//invlaid 				multilevel inheritance valid 	
									    
		- Either directly or indirectly java won't support for  inheritance with respect to classes.

	
	-> why java won't provide support multiple inheritance ? 
	
		- There may be chance of ambiguity problem hence a java won't provide support for multiple inheritance.
		
		p1-m1()				p2-->m1()
	    |				    |
	    |	 		  		|
	    |	 		  		|
	    -------->C<----------
			c.m1();
		Ambiguity problem 	
	
	-> But interface and extends any number of interfaces simulateneously hence a java provide support for multiple inheritance with respect to interface.
	
		Ex. 
	
		interface A {		interface B {
			                	
		}                    }
		
		interface C extends A,B {
			
		}//valid 
		
	-> Why ambiguity problem won't be there in interfaces ? 
		
		- Even though multiple method declaration are available but implimentation unique and hence there is no chance of ambiguity problem in interfaces.
		
		Ex 
		
		Parent interface 1 							Parent interface 2 
		 |											  |
		 |	m1();									  |m1();	
		 |                                            |
		 |                                            |
	     |                                            |
	     |                                            |
		 |                                            |
		 ---------------->Child interface<------------- 	
								
							m1();
							 |
							 |
					Implementation classes 

							m1() {
								
								...
							}
							
	Note: 

		- Strically speeking thourgh interfaces we won't get any inheritance.
		
 
 -> cyclic inheritance : 
 
		- cyclic inheritance is not allowed in java ofcource it is not required.
		
		Ex. 

	class A extends  A {											class A extends B {
																											   -------
	}                           								    							            -->|  B  |---
																	}                                       |  -------  |
	  -------                   								    class B extends A {						|	  |	    |
	--|	A   |<--                								    										|	  |     |
	| -------  |                								    }										|	  |     |
	------------                								    										|  -------- |
																											--|  A   |<-
																											  --------
 //invalud CE: cyclic inheritance involving A  						//invalud CE: cyclic inheritance involving A 	
			
   
   
	
   
	
   
	
	
	
	
	
	
	
	
	