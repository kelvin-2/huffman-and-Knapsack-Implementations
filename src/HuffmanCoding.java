import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HuffmanCoding {
    
    private Node root;
    private Map<Character, String> codes;

    public HuffmanCoding() {
        root = null;
        codes = new HashMap<>();
    }

    public Node getRoot() {
        return root;
    }

    public Map<Character, String> getCodes() {
        return codes;
    }

    // builds a frequency table from the input string
    private Map<Character, Integer> buildFrequencyTable(String text) {
        Map<Character, Integer> frequencyTable = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (frequencyTable.containsKey(ch)) {
                frequencyTable.put(ch, frequencyTable.get(ch) + 1);
            } else {
                frequencyTable.put(ch, 1);
            }
        }
        return frequencyTable;
    }

    // builds the Huffman tree
    public void huffman(String text) {


    }

    // generates Huffman codes by traversing the tree
    public void generateCodes(Node current, String code) {
        if (current == null) {
            return;
        }
        if (current.getLeft() == null && current.getRight() == null) {
            codes.put(current.getCharacter(), code);
            return;
        }
        generateCodes(current.getLeft(), code + "0");
        generateCodes(current.getRight(), code + "1");
    }

    // encodes input string using Huffman codes
    public String encode(String text) {
    StringBuilder encoded = new StringBuilder();

    for (int i = 0; i < text.length(); i++) {
        char ch = text.charAt(i);
        encoded.append(codes.get(ch));
    }
    return encoded.toString();
}
}
