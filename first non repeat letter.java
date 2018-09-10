import java.io.*;
class firstnonrepeat
{
 static final int no_char =200 ;
 static char count[]=new char[no_char];
static void getcharcount(String str)
{
 for(int i=0;i<str.length();i++)
  count[str.charAt(i)]++;
}

static int firstnonrepeat(String str)
{
 getcharcount(str);
 int index= -1,i;
for(i=0;i<str.length();i++)
{
 if(count[str.charAt(i)]==1)
{
 index=i;
 break;
 }
}
return index;
}
public static void main(String args[])
{
 String str= "avinash";
 int index=firstnonrepeat(str);
 System.out.println(index==-1 ? "either all are repeating or empty" : "first non repeat is " + str.charAt(index));
}
}