/**
 * <h1>Leet Code: </h1>
 * <h3>Challenge: Implement Trie (Prefix Tree)</h3>
 *
 * <h4>Runtime: 30ms - beats 92% of Java submissions</h4>
 *
 * @author Aiyush Jain
 * @version 1.0
 * @since 2020-08-07
 * */
class Trie {
    private TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        int length = word.length();
        TrieNode node = root;
        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);
            if (!node.contains(ch))
                node.put(ch, new TrieNode());
            node = node.get(ch);
        }
        node.setWordEnd(true);
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = contains(word);
        if (node != null) {
            return node.isWordEnd();
        }
        return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return contains(prefix) != null;
    }

    private TrieNode contains(String term) {
        int length = term.length();
        TrieNode node = root;
        for (int i = 0; i < length; i++) {
            char ch = term.charAt(i);
            if (node.contains(ch)) {
                node = node.get(ch);
            } else {
                return null;
            }
        }
        return node;
    }
}

class TrieNode {
    private boolean wordEnd = false;
    private TrieNode[] links;
    private final int N = 26;

    public TrieNode() {
        links = new TrieNode[N];
    }

    public boolean contains(char ch) {
        return links[ch - 'a'] != null;
    }

    public TrieNode get(char ch) {
        return links[ch - 'a'];
    }

    public void put(char ch, TrieNode node) {
        links[ch - 'a'] = node;
    }

    public void setWordEnd(boolean wordEnd) {
        this.wordEnd = wordEnd;
    }

    public boolean isWordEnd() {
        return this.wordEnd;
    }
}