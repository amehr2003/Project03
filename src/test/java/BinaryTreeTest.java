import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeTest {
    @org.junit.jupiter.api.Test
    void testPostorderTraverse() {

        // Arrange
        BinaryTree<Object> testTree = new BinaryTree<Object>(5);
        BinaryNode<Object> L = new BinaryNode<Object>(4);
        BinaryNode<Object> R = new BinaryNode<Object>(3);
        testTree.getRootNode().setLeftChild(L);
        testTree.getRootNode().setLeftChild(R);

        // Act
        testTree.postorderTraverse();

        // Assert
        assertEquals("3, 4, 5", 5);
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