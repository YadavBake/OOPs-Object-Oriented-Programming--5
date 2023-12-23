
																OOPs(Object Oriented Programming)Part-4 ||overloading
															===========================================================
															
-------------------------		
	 8. OverLoading.*	
-------------------------	 

Case 1: Automatic pramosion in Overloading.

	-> while resolving overloaded method if exact matched method is not available then we won't get any compile time error immediatly first it will promote arugment to the next 
	   level and check whether matched method is available or not if matched method is available then it will be considard and if the matched method is not available then 
	   compiler promotes argument once again to the next level these process will be continued until all possible promosions still if the matched method is not available then 
	   we will get compile time error.
	   
	-> The following are all possible promosions in overloading. 
	
			
			byte--->short-->|
					|------>|-->int-->long-->float-->double
			char----|	
			
	-> These is process is called automatic pramosion in overloading.		
	
	   Ex. 

		class Test {
			
			public void m1(int i ){<----------------------
														 |
				System.out.println("Int-arg method");	 |
			}											 |//These are overloaded method.
			public void m1(float f ){					 |
														 |
				System.out.println("float-arg method");	 |
			}<--------------------------------------------

			public static void main(String args[]){
				
				Test t = new Test();
				t.m1(10); //Int-arg						byte--->short-->|
				t.m1(10.5);//float-arg							|------>|-->int-->long-->float-->double
				t.m1('a')// int-arg						char---|	
				t.m1(10l);//float-arg
				t.m1(10.5);//invalid CE: cannot finad symbol, Symbol:method m1(double), Location: class Test
				
				
	Case 2: 

		-> While resolving overloaded methods compiler will always gives pricidence for child type argument when compaired type argument.
		
		
		Ex. 
								
		class Test {		
					
			public void m1(String s  ){<------------------		
														 |		
				System.out.println("String version ");	 |		
			}											 |//These are overloaded method.		
			public void m1(Object o  ){					 |		
														 |		
				System.out.println("Object version");	 |		
			}<--------------------------------------------		
        
        	public static void main(String args[]){						Object (Parent)
																			  ^
        		Test t = new Test();										  |
        		t.m1(new object );//object version 							  |	
        		t.m1("durga"); //Streing version 							  |
        		t.m1(null);// String 									String (child)
        		t.m1(10l);
        		t.m1(10.5);
        		
        		
    Case 3: 

		-> If object has same level then compiler through the error reference to method is ambigues.
		
		Ex. 

	
		class Test {		
        	
        	public void m1(String s ){<-------------------
        												 |
        		System.out.println("String version");	 |
        	}											 |//These are overloaded method.
        	public void m1(StringBuffer sb ){			 |
        												 |
        	System.out.println("StringBuffer version");	 |
        }<------------------------------------------------
        
        	public static void main(String args[]){
																							Object 
        		Test t = new Test();														  |
        		t.m1("durga);//String version								------------------------------------				
        		t.m1(new StringBuffer("durga");//StringBuffer version		|								   |			
        		t.m1(null);//CE: reference to m1 is ambigues	  		 String							StringBuffer
			}
		}
        		
    Case 4: 

		->
		
		Ex. 
		
		
		class Test {
			
			public void m1(int i,float f ){<--------------
														 |
				System.out.println("Int-float version"); |
			}											 |//These are overloaded method.
			public void m1(float f,int i  ){			 |
														 |
				System.out.println("float-int version"); |
			}<--------------------------------------------
		
			public static void main(String args[]){
				
				Test t = new Test();
				t.m1(10,10.5f);// Int-float version
				t.m1(10.5f,10);//float-int version 
				t.m1(10,10);// CE: reference to m1 is ambigues.
				t.m1(10.5f,10.5f);// CE: cannot finad symbol, Symbol: method m1(float,float), Location class Test.
			}
		}
	
		
	Case 5: 
	
		-> In general var-arg method will get list priority that is if no other method matched then only var-arg method will get the chance it is execatly same as default case 
		   inside switch.
		
		Ex. 
		
			class Test {
					
				public void m1(int x ){<----------------------	
															 |	
		    		System.out.println("General method");	 |
		    	}											 |//These are overloaded method.
		    	public void m1(int... x ){					 |
		    												 |
		    		System.out.println("var-arg method");	 |
		    	}<--------------------------------------------
		    
		    	public static void main(String args[]){
		    		
		    		Test t = new Test();
		    		t.m1();//var-arg method 
            		t.m1(10,20);//var-arg method 
            		t.m1(10);// General method 
				}
			}
            		
    
	Case 6: 

	 Note: Overloading Method resolving always takes care by compiler based on reference type. In overloading runtime object won't play any role.
		
		Ex. 
		
		class Animal {
			
		}

		class Monkey extends Animal {

		}
		class Test {
			
			public void m1(Animal a ){<-----------------
				System.out.println("Animal version");  |
			}                                          |
			public void m1(Monkey m ){                 |
				System.out.println("Monkey verison");  |
			}<------------------------------------------
	           
			   public static void main (String args[]){
				   Test t = new Test();
				   
				   Animal a = new Animal();
				   t.m1(a);//Animal verison
				   
				   Monkey m = new Monkey();
				   t.m1(m);// Monkey version 
				   
				   Animal a1 = new Monkey();
				   t.m1(a1); //Animal version
			   }
		}