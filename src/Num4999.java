import java.io.*;

public class Num4999 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String patient =  br.readLine();
        String doctor =  br.readLine();

        int patientA = countA(patient);
        int doctorA = countA(doctor);

        if (doctorA <= patientA) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }

    }
    private static int countA(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a') count++;
        }
        return count;
    }
}

