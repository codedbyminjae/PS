import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

public class Num2525 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] time =  br.readLine().split(" ");
        int a =  Integer.parseInt(time[0]);
        int b = Integer.parseInt(time[1]);

        int c = Integer.parseInt(br.readLine());

        int totalMinutes = a * 60 + b + c;
        int hour = (totalMinutes / 60) % 24;
        int minute = totalMinutes % 60;

        bw.write(hour + " " + minute + "\n");
        bw.flush();
    }
}
