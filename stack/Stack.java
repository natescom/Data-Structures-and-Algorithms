package stack;

public class Stack{
  private LinkedList list;

  public Stack(){
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
   * Remove o elemento do topo da pilha
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
    return list.getData(list.length()-1);
  }

  public int length(){
    return list.length();
  }

  public String toString(){
    String r = "";
    for (int i = list.length() -1 ; i >= 0 ; i--) {
      r += "\n|"+ list.getData(i).toString() + "|";
    }
    return r;
  }
}
