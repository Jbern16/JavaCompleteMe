import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class NodeTest {
  Node node = new Node();

  @Test
  public void testNodeInitializedWithEndOfWordFlag() {
    assertEquals(false, node.endOfWord);
  } 

  @Test
  public void testNodeConstructedWithChild() {
    assertEquals("{}", node.child.toString());
  }
}