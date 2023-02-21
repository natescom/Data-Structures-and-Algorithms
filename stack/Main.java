package stack;

public class Main {

  public static void main(String[] args) {
    Stack pilha = new Stack();
    for (int i = 0; i < 3; i++) {
      pilha.push(i);
    }
    System.out.println(pilha.toString());
    System.out.println("Top:"+pilha.peek());

    // -------- Remover o topo -------//

    pilha.pop();
    System.out.println(pilha.toString());
    System.out.println("Top:"+pilha.peek());
  }
}
