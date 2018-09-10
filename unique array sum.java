//unique array sum number



import java.util.*;


class man2
{

	
  static void sum(int arr[])
  {
		
   ArrayList<Integer> a=new ArrayList<>();
		
   for(int i:arr)
   {
			
    if(a.contains(i) == false) 
     {  
 				
       a.add(i);
			
     }
    else
     { 
				
       int temp=i+1;
				
       boolean bool=true;
				
      while(bool)
       {
					
        if(a.contains(temp) == true)
         {    
						
           temp=temp+1;
					
         }  
        else
         { 
						
           a.add(temp);
						
           bool=false;
					
         }  
 				
       } 
			
     }
		
  }
		
 
  int sum=0;
		
  for(int i:a)  
   {
			 
     sum =sum+i;
		
   } 
		
 System.out.println(sum);
	
}

	

public static void main(String args[])
  {
		
    int arr[]={2,3,7,2};
		  
    man2.sum(arr);
	
  } 



}
