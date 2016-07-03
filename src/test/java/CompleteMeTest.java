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

  // @Test
  // public void testInsertNode() {
  //   trie.insert("pizza");
  //   assertEquals(true, trie.head.child.containsKey(String "p"))
  // }
}