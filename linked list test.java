import java.*;
class linkedlisttest
{
node head;
 
static class node
{
 int data;
 node next;
 node(int d)
 {
  data=d;
  next=null;
 }
}

// Inserts a new Node at front of the list
public void push(int new_data)
{
 node new_node=new node(new_data);
 new_node.next=head;
 head=new_node;
}

//Inserts a new node after the given prev_node.
public void insertAfter(node prev_node,int new_data)
{
 if(prev_node==null)
 {
  System.out.println("the given previous node cannot be null");
  return;
 }
 
 node new_node=new node(new_data);
 new_node.next=prev_node.next;
 prev_node.next=new_node;
}

//push a new node at the end
public void append(int new_data)
{
node new_node=new node(new_data);
if(head==null)
{
 head=new node(new_data);
 return;
 }
new_node.next=null;
node last=head;
while(last.next!=null)
last=last.next;
last.next=new_node;
}

// delete a particuler key 
void deletenode(int key)
{
 node temp=head;
 node prev=null;

if(temp!=null && temp.data==key)
  {
    head=temp.next;
    return;
   }
 while(temp!=null && temp.data!=key)
  {
   prev=temp;
   temp=temp.next;
   }
if(temp == null)
return;
prev.next=temp.next;
}

//delete a key at particuler position
void deletenodepo(int position)
{
 if(head == null)
 return;

 node temp=head;

 if(position == 0)
 {
  head=temp.next;
  return;
  }

for(int i=0;temp !=null && i<position-1;i++)
temp =temp.next;

if(temp == null || temp.next == null)
return ;

node next=temp.next.next;
temp.next = next;
}

//to get count of list
public int getCount()
{
 node temp=head;
 int count=0;
 while(temp!=null)
 {
  count++;
  temp=temp.next;
  }
return count;
}

//to print
public void printlist()
{
node n=head;
while(n!=null)
{
 System.out.print(n.data+ " ");
 n=n.next;
}
}

//driver program
public static void main(String args[])
{
linkedlisttest llist=new linkedlisttest();
llist.append(3);
llist.push(1);
llist.append(4);
llist.push(2);
llist.push(9);
llist.insertAfter(llist.head.next, 8);


System.out.println("created linkedlist is");
llist.printlist();
System.out.println(" ");
llist.deletenode(1);
llist.deletenodepo(3);
System.out.println("updated linkedlist is");
llist.printlist();
System.out.println(" ");
System.out.println("count of the nodes:" +llist.getCount());

}
}
 