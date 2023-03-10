import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static StringBuilder sb;

    static Map<Character, Node> map;

    static class Node {

        char data;

        char left;

        char right;

        Node(char data, char left, char right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        static void pre(Node node) {
            sb.append(node.data);
            if(node.left!='.') {
                pre(map.get(node.left));
            }
            if(node.right!='.') {
                pre(map.get(node.right));
            }
        }

        static void in(Node node) {
            if(node.left!='.') {
                in(map.get(node.left));
            }
            sb.append(node.data);
            if(node.right!='.') {
                in(map.get(node.right));
            }
        }

        static void post(Node node) {
            if(node.left!='.') {
                post(map.get(node.left));
            }
            if(node.right!='.') {
                post(map.get(node.right));
            }
            sb.append(node.data);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        sb = new StringBuilder();
        map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        String s;
        while(n-->0) {
            s = br.readLine();
            map.put(s.charAt(0), new Node(s.charAt(0), s.charAt(2), s.charAt(4)));
        }
        Node root = map.get('A');
        Node.pre(root);
        sb.append("\n");
        Node.in(root);
        sb.append("\n");
        Node.post(root);
        System.out.print(sb);
    }

}