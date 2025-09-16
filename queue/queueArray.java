package queue;

public class queueArray {
  private int front=0;
  private int rear=-1;
  private int queue[];
  private int size=0;

  queueArray(int size){
    queue=new int[size];
  }

  //enqueue operation
  void enqueue(int val){
    if(rear==queue.length-1){
      System.out.println("Queue is full");
    }else{
      queue[++rear]=val;
      size++;
    }
  }

  //dequeue method
  void dequeue(){
    if(front>rear){
      System.out.println("Queue is empty");
    }else{
      display();
      System.out.println(queue[front]+" dequeued");
      front++;
      size--;
    }
  }

  //peek method
  void peek(){
    if(isEmpty()){
      System.out.print("Queue is empty");
    }else{
      System.out.println(queue[front]);
    }
  }

  //isEmpty method
  boolean isEmpty(){
    return front>rear;
  }

  //size method
  void size(){
    if(isEmpty()){
      System.out.println(size);
    }else{
      System.out.println(size);
    }
  }

  //display method
  void display(){
    if(isEmpty()){
      System.out.println("Queue is empty");
    }else{
      System.out.print("Queue: ");
      for(int i=front;i<=rear;i++){
        System.out.print(queue[i]+" ");
      }
      System.out.println();
    }
  }

  //main method
  public static void main(String[] args) {
    queueArray qa=new queueArray(5);
    qa.enqueue(2);
    qa.enqueue(4);
    qa.enqueue(6);
    qa.enqueue(8);
    qa.enqueue(10);
    qa.enqueue(11);
    qa.size();
    qa.dequeue();
    qa.size();
    qa.display();
    System.out.println(qa.isEmpty());
  }
}
