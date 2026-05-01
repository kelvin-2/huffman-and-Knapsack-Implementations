public class Node {
    private char character;
    private int frequency;
    private Node left;
    private Node right;

    // constructor for a leaf node
    public Node(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
        this.left = null;
        this.right = null;
    }

    // constructor for an internal node
    public Node(int frequency, Node left, Node right) {
        this.character = '\0'; // placeholder 
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }

    public char getCharacter() {
        return character;
    }

    public int getFrequency() {
        return frequency;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }
}
