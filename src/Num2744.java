import java.io.*;

public class Num2744 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch =  s.charAt(i);

            if (Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
            }
            sb.append(ch); // 이거 하나 때문에 틀렸었음.
        }

        bw.write(sb.toString());
        bw.flush();
    }
}