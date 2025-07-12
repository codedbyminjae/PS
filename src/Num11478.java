import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Num11478 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String st;
    static HashSet<String> dt = new HashSet<>();

    public static void main(String[] args) throws IOException {
        st = br.readLine();

        for(int i = 0; i < st.length(); i++){
            dt.add(st.substring(i, i+1));
            // System.out.println(dt);
            for (int j = i + 1; j <= st.length(); j++){
                String sub = st.substring(i, j);
                if (sub.length() >= 2){
                    dt.add(sub);
                }
                // System.out.println(dt);
            }
        }
        System.out.println(dt.size());
    }
}