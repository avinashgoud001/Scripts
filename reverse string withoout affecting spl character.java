import java.*;
import java.util.Arrays.*;

class reversenospl
{
 public static void reverse(char str[])
 {
  int r=str.length-1,l=0;

 while(l<r)
{
  if(!Character.isAlphabetic(str[l]))
   l++;
  else if(!Character.isAlphabetic(str[r]))
  r--;
else
{
  char tmp=str[l];
  str[l]=str[r];
  str[r]=tmp;
  l++;
  r--;
}
}
}
public static void main(String args[])
{
 String str="a66*b!@cd23";
 char[] charArray=str.toCharArray();
 System.out.println("input is " +str);
 reverse(charArray);
 String revstr=new String(charArray);
 System.out.println("output is "+ revstr);
}
}