package zEclipsDemo;

public class Demo {
	
	
      void master(){
    	   
    	   
    	   System.out.println("this is master branch");
       }
   
      
      void deploy() {
    	  
    	  System.out.println("this is deploy branch");
    	  System.out.println("1stdeployment");
    	  System.out.println("this is practice");
    	  System.out.println("using eclipse terminal");
    	  
      }
  
      
      void feachar() {
    	  
    	  System.out.println("this is feacher branch");
    	  System.out.println("1sttesting branch");
    	  System.out.println("this is testing branch");
    	  System.out.println("using eclips terminal and configure");
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
           Demo d=new Demo();
           d.master();
           d.deploy();
           d.feachar();
    

    	
     
}

}