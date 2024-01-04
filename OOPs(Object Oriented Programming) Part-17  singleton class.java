
																	OOPs(Object Oriented Programming) Part-17 || singleton class
																==================================================================

------------------------
  16. Singleton class. 	
------------------------

 -> For any java class if are allowed to create only one object such type of class is called singleton class.

	Ex. 
	
		Runtime
		BussinessDelegate.
		ServiceLocator.
		Ect.
		

  Advantage of Singleton class 
-------------------------------

 -> If several pepole have same requirement then it is not recomanded to create a separete object for every requirement.
 
 -> We have create only one object and we can reuse same object for every similar requirement so that performance and memory utilization will be improved.
 
 -> This is the central idea of singleton classes.
 
 -> 
	Ex. 
																	-------------------
	Runtime r1 = Runtime.getRuntime(); 								|				  |
	Runtime r2 = Runtime.getRuntime(); 								|                 |<--------------- r1
																	| Runtime object  | 
																	|                 |<--------------- r2 
																	|                 |
	Runtime r100000 = Runtime.getRuntime();							|                 |<---------------- r100000
																	-------------------																


-> How to create our own singleton classes ?

	Approach-1

	- we can create our own singleton classes for this we have to use private constructor and private static variable and public factory method.

		
																									class Test {
												-------------------                                 	
    Test t1 = Test .getTest();					|				  |<----------------t             	private static Test t = new Test();
    Test t2 = Test .getTest();					|                 |<--------------- t1              	
												| Runtime object  |                                 	private Test() {
												|                 |<--------------- t2              		
	Test t100000 = Test .getTest();				|                 |                                 	}
												|                 |<---------------- t100000        	
												-------------------                                 	public static Test getTest() {
                                                                                                    		
	                                                                                                		return t ;
	                                                                                                	}
	                                                                                                }
	
	Note: Runtime class is internally implemented  by using this approach .
	
	
	
	Approach -2 
	
	- At any point of time for test class we can create only one object hence a Test class singleton class. 

		
																									class Test {	
												-------------------                                 	
	Test t1 = Test .getTest();					|				  |<----------------t             	private static Test t = new Test();
	Test t2 = Test .getTest();					|                 |<--------------- t1              	
												| Runtime object  |                                 	private Test() {
    											|                 |<--------------- t2              		
    Test t100000 = Test .getTest();				|                 |                                 	}
    											|                 |<---------------- t100000        	
    											-------------------                                 	public static Test getTest() {
                                                                                                    		
                                                                                                    		if(t==null){
																												
																												t = new Test();
																											}
																											return t ;
                                                                                                    	}
                                                                                                    }
	
	
 -> class is not final but we are not allowed to create child classes how to it is  possible ?
 
	- by declaring every constructor as private we can restrict child class creation.
	
		Ex. 
	
		class P {
			
			private P () {
				
			}
		}
		
	- For the above class it is impossible to create child class.

	- IF we are creating child class we will get compiltime error.
	
	Ex.
	class C extends P {
			
		C() {	
					
			super();|--> compiler genareted code		
		}	
			
	}//invalid CE: P() has private access in P 	
		
	
	
	
	
	
	