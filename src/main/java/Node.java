import java.util.HashMap;

public class Node {
  public boolean endOfWord;
  public HashMap<String,Node> children;

  public Node() {
    this.endOfWord = false;
    this.children = new HashMap<>();
  } 
}