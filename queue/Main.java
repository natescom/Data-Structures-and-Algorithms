package queue;

public class Main {

  public static void main(String[] args) {
    Queue queue = new Queue();
    System.out.println("Gente");
    for (int i = 0; i < 10; i++) {
      queue.push(i);
    }
    System.out.println(queue.toString());
    System.out.println("Primeiro a ser atendido: "+queue.peek());
    queue.pop();
    System.out.println(queue.toString());
  }
}
