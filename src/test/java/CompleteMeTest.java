import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class CompleteMeTest {
  CompleteMe cm = new CompleteMe();

  @Test 
  public void testHeadNode() {
    assertThat(cm.head, instanceOf(Node.class));
  }

  @Test
  public void testInsertNode() {
    cm.insert("pizza");

    Node node = cm.head;
    assertEquals(true, node.children.containsKey("p"));

    Node nodeTwo = node.children.get("p");
    assertEquals(true, nodeTwo.children.containsKey("i"));

    Node nodeThree = nodeTwo.children.get("i");
    assertEquals(true, nodeThree.children.containsKey("z"));

    Node nodeFour = nodeThree.children.get("z");
    assertEquals(true, nodeFour.children.containsKey("z"));

    Node nodeFive = nodeFour.children.get("z");
    assertEquals(true, nodeFive.children.containsKey("a"));
  }

  public void testWordEndIsFlagged() {
    cm.insert("piz");
    Node node = cm.head;
    Node nodeTwo = node.children.get("p");
    Node nodeThree = nodeTwo.children.get("i");

    assertEquals(true, nodeThree.endOfWord);
  }
}