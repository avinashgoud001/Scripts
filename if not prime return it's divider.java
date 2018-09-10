//prinme number



import java.util.*;


class man
{

	
 static void find_prime(int x)
  {
		
   int i;
		
   for(i=2;i<x;i++)
    {
			
     if(x % i == 0)
	{
			
	break;
			
	}
		
     }
		
    if(i == x)
    {
			
      System.out.println("Yes...prime number");
		
     }
     else
     {
			
       for(int j=2;j<x;j++)
        {
				
          if(x % j == 0)
          {
					
            System.out.println(j);
				
          }
			
        }
     }

	
  }


	
public static void main(String args[])
 {
		
    Scanner sc=new Scanner(System.in);
		
    int x=sc.nextInt();
		
    man.find_prime(x);
	
 }



}