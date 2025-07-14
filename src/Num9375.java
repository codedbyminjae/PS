import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Num9375 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        // 테스트 케이스 개수 입력
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            // 옷의 개수 입력
            int num = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();

            for (int j = 0; j < num; j++) {
                // 옷 이름, 종류 입력
                // 옷의 종류를 키값으로 설정
                String[] input = br.readLine().split(" ");
                String type = input[1];
                // 종류 시작은 0 for문 돌면서 각 종류당 1씩 증가
                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            // 곱셉 이용 위해 초기값 1로 설정
            int count = 1;

            // values값을 인덱스로 접근하기 위해서 리스트 사용
            // 후에 리스트로 사용해야만 values.get 가능
            List<Integer> listvalues = new ArrayList<>(map.values());

            for (int k = 0; k < listvalues.size(); k++) {
                int val = listvalues.get(k);
                // 안 입는 경우 + 1
                count = count * (val + 1);
            }
            // 벌거 벗은 경우 1가지 (안입 선택 + 안입 선택)
            bw.write((count-1)+"\n");
        }
        bw.flush();
    }
}
