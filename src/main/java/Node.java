import java.util.HashMap;

public class Node {
  public boolean endOfWord;
  public HashMap child;

  public Node() {
    this.endOfWord = false;
    this.child     =  new HashMap<String, Node>();
  } 
}