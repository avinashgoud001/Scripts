import java.*;
public class pattern 
{
 public static void main(String[] args) 
{
 int N=4;
 for(int i=1;i<=N;i++) 
{
 for(int j=1;j<=i;j++) 
 System.out.print(i+2);
 System.out.println();
}
for(int i=N-1;i>=1;i--)
{
for(int k=1;k<=i;k++)
System.out.print(i+2);
System.out.println();
 }
}
}