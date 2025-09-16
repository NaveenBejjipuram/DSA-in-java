package stack;

class Node{
  public int data;
  public Node next;

  Node(int data){
    this.data=data;
    this.next=null;
  }
}

class stack {
  private Node top;

  stack(){
    this.top=null;
  }

  //push method
  void push(int data){
    Node newNode=new Node(data);
    newNode.next=top;
    top=newNode;
  }

  //pop method
  int pop(){
    if(isEmpty()){
      System.out.println("Stack Underflow");
      return -1;
    }
    int popped=top.data;
    top=top.next;
    return popped;
  }

  //isEmpty()
  boolean isEmpty(){
    return top==null;
  }

  //peek method
  void peek(){
    if(isEmpty()){
      System.out.println("Stack Underflow");
    }else{
      System.out.print("Peek Element: ");
      System.out.print(top.data+"\n");
    }
  }

  //display method
  void display(){
    if(isEmpty()){
      System.out.println("Stack Underflow");
    }else{
      Node temp=top;
      System.out.print("Stack: ");
      while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
      }
    }
  }
}

public class stackLL {
  public static void main(String[] args) {
    stack s=new stack();
    s.display();
  }  
}

