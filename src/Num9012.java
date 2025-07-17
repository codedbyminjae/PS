import java.io.*;
import java.util.Stack;

public class Num9012 {
    // 해당 문제는 스택의 본질적인 FILO 논리를 생각하는 구조는 아님.
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            // 괄호 입력, 스택 생성, 참 거짓 판별문
            String vps = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean isTrue = true;

            // 입력받은 문자열 순회
            for (int j = 0; j < vps.length(); j++) {
                char c = vps.charAt(j);

                // ( 입력시 스택 푸쉬
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.empty()) { // 첫 시작이 )면 vps 절대 불가능,
                        isTrue = false;
                        break;
                    } else { // 위 경우가 아니면, 짝이 맞기에 스택에서 '(' 삭제.
                        stack.pop();
                    }
                }
            }
            // 마지막 조건, 위 조건이 끝나고도 스택에 (가 남아있으면 false처리
            // vps 조건 충족 불가한 입력값이 남아있음을 의미.
            if (!stack.isEmpty()) {
                isTrue = false;
            }

            bw.write(isTrue ? "YES\n" : "NO\n");
        }
        bw.flush();
    }
}

