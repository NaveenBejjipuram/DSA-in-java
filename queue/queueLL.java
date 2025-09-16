package queue;

class Node{
  int data;
  Node next;

  Node(int data){
    this.data=data;
    this.next=null;
  }
}

class queue{
  Node front;
  Node rear;
  int sizee;

  queue(){
    this.front=null;
    this.rear=null;
  }

  //enqueue method
  void enqueue(int data){
    Node newNode=new Node(data);
    if(isEmpty()){
      front=newNode;
      rear=newNode;
    }else{
      rear.next=newNode;
      rear=newNode;
    }
    sizee++;
  }

  //dequeue method
  void dequeue(){
    if(isEmpty()){
      display();
    }else if(sizee==1){
      front=null;
      rear=null;
      sizee--;
    }else{
      Node temp=front;
      front=front.next;
      temp.next=null;
      sizee--;
    }
  }

  //isEmpty method
  boolean isEmpty(){
    return rear==null;
  }

  int size(){
    return sizee;
  }

  //display method
  void display(){
    if(isEmpty()){
      System.out.println("Queue is Empty");
    }else{
      Node temp=front;
      System.out.print("Queue: ");
      while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
      }
      System.out.println();
    }
    if(sizee>0)
    System.out.println("Front: "+front.data+"\n"+"Rear: "+rear.data);
  }
}

public class queueLL {
  public static void main(String args[]){
    queue q=new queue();
    // q.enqueue(2);
    // q.enqueue(4);
    // q.enqueue(6);
    // q.enqueue(8);
    // q.enqueue(10);
    q.dequeue();
    q.display();
    System.out.println(q.size());
    System.out.println(q.isEmpty());
  }
}
