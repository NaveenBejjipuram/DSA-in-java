package stack;

class stackArray{
  private int top=-1;
  private int stack[];

  stackArray(int size){
    stack=new int[size];
  }

  //push method
  void push(int val){
    if(top==stack.length-1){
      System.out.println("Stack Overflow");
    }else{
      stack[++top]=val;
    }
  }

  //pop method
  void pop(){
    if(top==-1){
      System.out.println("Stack Underflow");
    }else{
      top--;
    }
  }

  //peek method
  void peek(){
    if(top==-1){
      System.out.println("Stack Underflow");
    }else{
      System.out.println("Peek Element: " + stack[top]);
    }
  }

  //print method
  void display(){
    if(top>-1){
      System.out.print("Stack: ");
      for(int i=0;i<top;i++){
        System.out.print(stack[i]+" ");
      }
    }else{
      System.out.print("Stack is Empty");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    stackArray sa=new stackArray(5);
    sa.display();
    sa.peek();
  }
}