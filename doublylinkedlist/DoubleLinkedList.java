package doublylinkedlist;

public class DoubleLinkedList {
  private Node head;
  private Node tail;
  private int size;

  /**
   * Busca um no de acordo ao index passado
   * @param index
   * @return
   */
  private Node search(int index){
    Node pointer;
    if(index==0){
      return head;
    }
    if(index==size-1) {
      return tail;
    }
    if(index<size/2) { // Fazendo essa verificacao eu agilizo a busca
      pointer = head;
      for (int i = 0; i < index; i++) {
        pointer = pointer.getNext();
      }
    }
    else{
      pointer = tail;
      for (int i = size; i > index+1; i--) {
        pointer = pointer.getPrevious();
      }
    }
    return pointer;
  }

  /**
   * Busca um no de acordo seu Dado
   * @param data
   * @return
   */
  private Node search(Object data){
    Node pointer = head;
    for (int i = 0; i < size; i++) {
      if (pointer.getData().equals(data))
        return pointer;
      pointer = pointer.getNext();
    }
    throw new NullPointerException(); //todo: ObjetoNaoEncontradoException
  }

  /**
   * Remove o no da lista
   * @param node
   */
  private void remove(Node node){
    node.getPrevious().setNext(node.getNext());
    node.getNext().setPrevious(node.getPrevious());
    size--;
  }

  /**
   * Adiciona ao final da lista
   * @param data
   */
  public void add(Object data){
    Node newerNode = new Node(data);
    if(head==null) { // Se não houver primeiro elemento entao o novo objeto deve ser colocado na primeira posicao da lista
      head = newerNode;
    }else{ // Se houver
      if(tail==null) { // Se a tail for vazia significa que não há um segundo elemento, logo o proximo sera adicionado como tail
        tail = newerNode;
        tail.setPrevious(head);
        head.setNext(tail);
      }else{ // Se a cauda nao for vazia siginica que ha dois elementos ou mais entao eu posso utilizala para colocar o ultimo elemento
        newerNode.setPrevious(tail); // Entao a tail atual vira antes do novissimo no
        tail.setNext(newerNode); // O novissimo no vira depois de tail
        tail = newerNode; // E o novissimo nova sera o ultimo elemento da lista
      }
    }
  size++; // aumento o tamanho da lista
  }

  /**
   * Adiciona no inicio da lista
   * @param data
   */
  public void addAtBeginning(Object data){
    Node newerNode = new Node(data);
    if(head==null){ // Se não houver primeiro elemento entao o novo objeto deve ser colocado na primeira posicao da lista
      head = newerNode;
    }else{ // Se houver
      head.setPrevious(newerNode);
      newerNode.setNext(head);
      if(tail==null){ // Se tail ta vazio significa q nao ha segundo elemento entao a antiga head passa a ser o segundo elemento e a tail
        tail = head;
      }
      head = newerNode;
    }
    size++;
  }

  /**
   * Adiciona no indice fornecido
   * @param index
   * @param data
   */
  public void add(int index, Object data){
    if(index>=size){ // Se o indice passado for maior que o tamanho eu retorno um erro de ponteiro nulo
      throw new NullPointerException();
    }
    if(index==0){
      addAtBeginning(data);
      return;
    }
    if(index==size-1){
      add(data);
      return;
    }
    Node newerNode = new Node(data);
    Node pointer = search(index);
    newerNode.setNext(pointer);
    newerNode.setPrevious(pointer.getPrevious());
    pointer.getPrevious().setNext(newerNode);
    pointer.setPrevious(newerNode);

    size++;
  }

  /**
   * Remove o objeto passado da lista
   * @param data
   */
  public void remove(Object data){
    remove(search(data));
  }

  /**
   * Remove o objeto do indice passado da lista
   * @param index
   */
  public void remove(int index){
    remove(search(index));
  }

  /**
   * Limpa a lista
   */
  public void clear(){
    head = null;
    tail = null;
  }

  /**
   * Pega o objeto do index
   * @param index Indice do objeto requerido
   * @return      Objeto
   */
  public Object get(int index){
    return search(index).getData();
  }

  /**
   * Atualiza o dado em certo no
   * @param index
   * @param data
   */
  public void set(int index, Object data){
    search(index).setData(data);
  }

  /**
   * Tamanho da lista
   * @return
   */
  public int length(){
    return size;
  }


}
