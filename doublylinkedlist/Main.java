package doublylinkedlist;

public class Main {

  public static void main(String[] args) {
    DoubleLinkedList list = new DoubleLinkedList();
    // -------- ADICIONANDO NO INICIO DA LISTA -------- //
    System.out.println("ADICIONANDO NO INICIO DA LISTA");
    for (int i = 0; i < 11; i++) {
      list.addAtBeginning(i);
    }
    printLista(list);
    // -------- ADICIONANDO NO FINAL DA LISTA -------- //
    list = new DoubleLinkedList();
    System.out.println("ADICIONANDO NO FINAL DA LISTA");
      for (int i = 0; i < 11; i++) {
        list.add(i);
      }
      printLista(list);
    // -------- ADICIONANDO EM POSICAO QUALQUER DA LISTA -------- //
    System.out.println("ADICIONANDO EM POSICAO QUALQUER DA LISTA");
    System.out.println("Add objeto: 100   em indice: 0");
    System.out.println("Add objeto: 54    em indice: 4");
    System.out.println("Add objeto: 500   em indice: TamanhoDaLista-1");
    list.add(0,100);
    list.add(4,54);
    list.add(list.length()-1,500);
    printLista(list);

    // -------- ALTERANDO DADO DE UM INDICE DA LISTA -------- //
    System.out.println("ALTERADO DADO DE UM INDICE DA LISTA");
    System.out.println("Antes: 3-"+list.get(3));
    list.set(3,800);
    System.out.println("Depois: 3-"+list.get(3));
    printLista(list);

    // -------- REMOVENDO UM OBJETO DA LISTA -------- //
    System.out.println("REMOVENDO UM OBJETO DA LISTA");
    System.out.println("Removendo: 54");
    list.remove(new Integer(54));
    printLista(list);

    // -------- REMOVENDO UM OBJETO DA LISTA PELO INDICE -------- //
    System.out.println("REMOVENDO UM OBJETO DA LISTA PELO INDICE");
    System.out.println("Removendo indice: 7");
    list.remove(7);
    printLista(list);

    // -------- REMOVENDO TODOS OS OBJETO DA LISTA -------- //
    System.out.println("REMOVENDO TODOS OS OBJETO DA LISTA");
    list.clear();
    printLista(list);
  }

  public static void printLista(DoubleLinkedList list){
    System.out.println("-------------------------------------");
    for (int i = 0; i < list.length(); i++) {
      System.out.println(i+":"+list.get(i));
    }
    System.out.println("-------------------------------------");
  }
}
