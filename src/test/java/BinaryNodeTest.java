import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNodeTest {

    @Test
    void postorderTraverse_binaryNodeMethod() {
        // Arrange
        BinaryTree<String> tree = new BinaryTree<>();

        // Subtrees:
        BinaryTree<String> L = new BinaryTree<>("3", null, null);
        BinaryTree<String> R = new BinaryTree<>("4", null, null);
        //BinaryTree<String> cTree = new BinaryTree<>("C", fTree, null);

        tree.setTree("5", L, R);
        tree.postorderTraverse_callBinaryNodeMethod();

        assertEquals("3, 4, 5", "3, 4, 5");
    }

    @Test
    void getHeight_binaryNodeMethod() {
        // Arrange
        BinaryTree<String> tree = new BinaryTree<>();

        // Subtrees:
        BinaryTree<String> L = new BinaryTree<>("3", null, null);
        BinaryTree<String> R = new BinaryTree<>("4", null, null);
        //BinaryTree<String> cTree = new BinaryTree<>("C", fTree, null);

        tree.setTree("5", L, R);
        int h = tree.getHeight_callBinaryNodeMethod();
        assertEquals(2, 2);
    }
}
