import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Num10828 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int T =  Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < T; i++) {
            String[] str =  br.readLine().split(" ");

            if (str[0].equals("push")) {
                stack.push(Integer.parseInt(str[1]));
            } else if (str[0].equals("pop")) {
                if (stack.isEmpty()) {
                    bw.write("-1" + "\n");
                } else {
                    bw.write(stack.pop() + "\n");
                }
            } else if(str[0].equals("top")) {
                if (stack.isEmpty()) {
                    bw.write("-1" + "\n");
                } else {
                    bw.write(stack.peek() + "\n");
                }
            } else if (str[0].equals("size")) {
                bw.write(stack.size() + "\n");
            } else if (str[0].equals("empty")) {
                if (stack.isEmpty()) {
                    bw.write("1" + "\n");
                } else {
                    bw.write("0" + "\n");
                }
            }
        }
        bw.flush();
    }
}
