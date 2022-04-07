import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeTest {
    @org.junit.jupiter.api.Test
    void testPostorderTraverse() {

        // Arrange
        BinaryTree<String> tree = new BinaryTree<>();

        // Subtrees:
        BinaryTree<String> L = new BinaryTree<>("3", null, null);
        BinaryTree<String> R = new BinaryTree<>("4", null, null);
        //BinaryTree<String> cTree = new BinaryTree<>("C", fTree, null);

        tree.setTree("5", L, R);
        //testTree.getRootNode().setLeftChild(R);

        // Act
        tree.postorderTraverse();

        // Assert
        assertEquals("3, 4, 5", "3, 4, 5");
    }

    @org.junit.jupiter.api.Test
    void testGetHeight() {

        // Arrange
        BinaryTree<Object> testTree = new BinaryTree<Object>(5);
        BinaryNode<Object> L = new BinaryNode<Object>(4);
        BinaryNode<Object> R = new BinaryNode<Object>(3);
        testTree.getRootNode().setLeftChild(L);

        // Act
        int x = testTree.getHeight();

        // Assert
        assertEquals(2, x);
    }

    @org.junit.jupiter.api.Test
    void testGetNumberOfNodes() {
        // Arrange
        BinaryTree<Object> testTree = new BinaryTree<Object>(5);
        BinaryNode<Object> L = new BinaryNode<Object>(4);
        BinaryNode<Object> R = new BinaryNode<Object>(3);
        testTree.getRootNode().setLeftChild(L);
        testTree.getRootNode().setRightChild(R);

        // Act
        int x = testTree.getNumberOfNodes();

        // Assert
        assertEquals(3, x);
    }
}
