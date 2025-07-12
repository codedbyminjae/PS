import java.io.*;

public class Num2002 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N =  Integer.parseInt(br.readLine());

        String[] go = new String[N];
        for (int i = 0; i < N; i++) {
            go[i] =  br.readLine();
        }

        String[] out = new String[N];
        for (int j = 0; j < N; j++) {
            out[j] =  br.readLine();
        }

        int[] badcar = new int[N];

        // 입구 기준으로 계속 틀려서
        // 출구 기준으로 변경
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(go[j].equals(out[i])) {
                    badcar[i] = j;
                    break;
                }
            }
        }
        int count = 0;
        for(int i = 0; i < N-1; i++){
            for(int j = i+1; j < N; j++){
                if (badcar[i] > badcar[j]) {
                    count++;
                    break;
                }
            }
        }
        bw.write(count + "\n");
        bw.flush();
    }
}