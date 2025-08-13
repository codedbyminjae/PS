import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Num17219 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] input =  br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        Map<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            int space = line.indexOf(' ');
            String site = line.substring(0, space);
            String pw =   line.substring(space + 1);
            map.put(site,pw);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String query = br.readLine();
            sb.append(map.get(query)).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();

    }
}
