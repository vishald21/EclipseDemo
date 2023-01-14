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
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
           Demo d=new Demo();
           d.master();
           d.deploy();
           d.feachar();
    

    	
     
}

}