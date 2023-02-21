package queue;

import queue.LinkedList;
import queue.linkedList.ObjetoNaoEncontradoException;

public class Queue {
  private LinkedList list;

  public Queue(){
    list = new LinkedList();
  }

  /**
   * Inserir dado na pilha
   * @param o
   */
  public void push(Object o){
    list.add(o);
  }

  /**
   * Remove o elemento do final da fila
   * @return
   */
  public Object pop() {
    try {
      if(list.length()>0) {
        Object o = peek();
        list.remove(o);
        return o;
      }
    } catch (ObjetoNaoEncontradoException e) {
      e.printStackTrace();
    }
    return new ObjetoNaoEncontradoException(null);
  }

  /**
   * Retorna o topo da pilha sem remover
   * @return
   */
  public Object peek(){
    return list.getData(0);
  }

  public int length(){
    return list.length();
  }

  public String toString(){
    String r = list.toString();
    return r;
  }

}
