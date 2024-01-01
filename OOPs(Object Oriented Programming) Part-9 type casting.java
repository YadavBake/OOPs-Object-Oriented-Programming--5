
												OOPs(Object Oriented Programming) Part-9||type casting
											     ===========================================================

 
 -> Strically speeking through type casting we are not creating any object.
 
 -> For the exisiting object we are providing another type of reference variable that is we are performing type casting but not object casting.

	Ex. 
														  ---------------
				      |      String s = new String("Durga")'                			  |		|
	Object o = new String("Durga")|==					        String s ---------------->|		|
				      |		 Object o = (Object)s;                          		  |	 Durga	|
                                                                                        OBject o ---------------->|		|
                                                                                                                  |		|
                                                                                        			  ---------------

-> 
									
				    |	Integer i = new Integer(10); |									---------------
	Number n new Integer (10);  |==                              |                                              			|	      |
				    |	Number n = (Number)i;        |==  Object o = new Integer(10);         Integer i --------------->|	      |         
								     |                                            			|      10     |
				    Object o =(Object)n;             |                                        Number n ---------------->|	      |
                                    System.out.println(i==n);//true                                                                     |	      |
                                     System.out.println(n==o);//true                                          Object o ---------------->|	      |
																	 ---------------


-> Note:  

	C c = new C();								                A
												^
												|
	B b = new C(); == (B)c						                        |
	A a = new C(); == (A)((B)c)					                        B
												^
												|
												|
												C
 Ex 1. 

   C c = new C();			    P----->m1(){}
   c.m1(); //valid 			    ^			
   c.m2(); //valid                          |
   ((p)c).m1(); == P p = new C();           |	
    p.m1(); //valid    	                    C----->m2(){}
   
   ((p)c).m2(); == P p = new C(); 
				   p.m2();//invalid 
	  
	- Reasion:- Parent reference can be used to hold child object but by using that reference we can't call child specific methods and we can call only methods available in parent class.
	
 
  Ex 2.

	C c = new c();							A----------->m1(){
	c.m1(); //valid C                                               ^	 SOP("A");
	                                                                |	}
	((B)C).m1(); == B b = new C();                                  |
	b.m1()// C 				  	                B---------->m1(){
					                                ^	SOP("B"); 
	((A)((B)c)).m1(); == A a = new C();			        |	}
	a.m1();//C             						|
                                                                        C---------->m1(){
                                                                    			SOP("C");
                                                                    		  }
	
	- It is overriding and method resovlution is always based on runtime object.
	
	
 Ex 3. 

	
    C c = new c();							A----------->static m1(){
    c.m1(); //valid C                                               	^	 SOP("A");
	                                                                |	}	
	((B)C).m1(); == B b = new C();                                  |
    	b.m1()// B                                      		B---------->static m1(){
    				                                        ^	SOP("B"); 
    ((A)((B)c)).m1(); == A a = new C();				        |	}
    a.m1();//A           			                        |
                                                                    	C---------->static m1(){
                                                                    			SOP("C");
                                                                    		  }
	
    - It is method hiding and  method resovlution is always based on reference type.
	
	
 Ex 4 . 
 
	C c = new c();							A----------->int x = 777;
	c.m1(); //valid 999                                             ^			
	                                                                |			
	 (((B)C).x); == B b = new C();                                  |
	  b.m1()// 888                                  		B---------->int x = 888;
					                                ^			 
	((A)((B)c)).x; == A a = new C();				|			
	a.m1();//777                               			|
	                                                                C----------> int x = 999;
	 
	 - Variable resovlution is always based on reference types  but not based on runtime object. 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 
 
 
 
 
 
 
 
 
