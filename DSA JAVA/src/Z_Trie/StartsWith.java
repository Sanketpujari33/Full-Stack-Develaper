package Z_Trie;

public class StartsWith {
    static class Node{
        Node[] children;
        boolean eow;
        public Node(){
            children=new Node[26];  // a to z
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    //    Insert In Trie
    static Node root = new Node();

    public static void insert(String word) { //O(n)
        Node current=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(current.children[index]==null){
                current.children[index]=new Node();
            }
            if(i==word.length()-1) {
                current.children[index].eow = true;
            }
            current=current.children[index];
        }
    }


    public static boolean search(String key) { //O(n)
        Node current=root;
        for(int i=0;i<key.length();i++){
            int index=key.charAt(i)-'a';
            if(current.children[index]==null){
                return false;
            }
            if(i==key.length()-1 && current.children[index].eow==true){
                return true;
            }
            current=current.children[index];
        }
        return false;
    }
    public static boolean startsWith(String prefix) {
        Node curr = root;
        for(int i=0; i<prefix.length(); i++) {
            int idx = prefix.charAt(i)-'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String args[]) {
    String words[]={"apple", "app", "mango", "man", "woman"};
    String prefix ="ap";
    for(int i=0;i<words.length;i++){
        insert(words[i]);
    }
        System.out.println(search(prefix));
        System.out.println(startsWith(prefix));
    }
}
