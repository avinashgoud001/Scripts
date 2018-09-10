import java.util.Stack;
class checkparantesismatch
{
 public static void main(String args[])
 {
  String exp=checkbalance("[(ttj)]");
 System.out.println("it is " +exp+ "parantesis");
 }
 public static String checkbalance(String exp)
 {
  if(exp.isEmpty())
  return "balanced";

  Stack<Character> stack=new Stack<Character>();
 for(int i=0;i<exp.length();i++)
{
 char current=exp.charAt(i);
 if(current == '{' || current == '(' || current == '[')
  {
   stack.push(current);
  }
 if(current == '}' || current == ')' || current == ']')
{
 if(stack.isEmpty())
return "not balanced";

 char last=stack.peek();
 if(current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
stack.pop();
 else
return "not balanced";
}
}
return stack.isEmpty()?"balanced ":"not balanced";
}
}
