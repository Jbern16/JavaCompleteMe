public class CompleteMe {
  public Node head;

  public CompleteMe() {
    this.head = new Node();
  }

  public void insert(String word) {
    insert(word, 0, this.head);
  }

  private void insert(String word, int index, Node currentNode) {
    String chr = String.valueOf(word.charAt(index)); 
    
    if (!currentNode.children.containsKey(chr)) {
        currentNode.children.put(chr, new Node());
    } 
    if (index < word.length() - 1) {
        int nextIndex = index + 1;
        Node nextNode = currentNode.children.get(chr);  
        insert(word, nextIndex, nextNode);
    }
  }
}
  // public static void main(String args[]) 
  //   CompleteMe cm = new CompleteMe();
  //   cm.insert("pizza");
  //   System.out.println(cm.head.children);
  // }
