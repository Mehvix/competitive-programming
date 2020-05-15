import java.util.ArrayList;

class Trie {
    private ArrayList<String> words;

    /** Initialize your data structure here. */
    public Trie() {
        this.words = new ArrayList<>();
    }

    public Trie(String word) {
        this.words = new ArrayList<>();
        insert(word);
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        words.add(word);
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return words.contains(word);
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        for (String s : words) {
            if (prefix.length() <= s.length() && s.startsWith(prefix)) {
                return true;
            }
        }
        return false;
    }
}