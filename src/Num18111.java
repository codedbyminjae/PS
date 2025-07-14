import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Num18111 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] num =  br.readLine().split(" ");
        int N = Integer.parseInt(num[0]);
        int M = Integer.parseInt(num[1]);
        int B = Integer.parseInt(num[2]);

        int[][] map = new int[N][M];

        // 배열 입력
        for (int i = 0; i < N; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(row[j]);
            }
        }

        // 리스트 생성 후 그 리스트에 모든 배열값 넣기
        List<Integer> heightList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                heightList.add(map[i][j]);
            }
        }

        // 가장 많이 등장 한 값 찾기
        // 해시맵 제작 리스트를 순회하면서 해당 높이 +1
        Map<Integer, Integer> heightFreq = new HashMap<>();

        for (int j = 0; j < heightList.size(); j++) {
            int value = heightList.get(j);
            heightFreq.put(value, heightFreq.getOrDefault(value, 0) + 1);
        }

        // 가장 많이 나온 key 값 찾기
        int mostCommonHeight = -1;
        int maxCount = -1;

        for (int height : heightFreq.keySet()) {
            int count = heightFreq.get(height);
            if (count > maxCount) {
                maxCount = count;
                mostCommonHeight = height;
            }
        }
        // System.out.println("최빈 높이 = " + mostCommonHeight + ", 개수 = " + maxCount);

        // 이제 맵을 전체 순회하면서 블록 설치, 제거 판단
        int totalTime = 0; // 땅고르기에 걸리는 총 시간
        int inventory = B; // 인벤토리에 있는 블록 수, 근데 풀면서 느낀게 굳이 생각해야 할까?
        int targetBlock = mostCommonHeight; // 앞서 구한 제일 많이 나온 높이 -> 기준

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // 맵 전체 순회 후, 최빈 높이와 다른 블록 찾기
                // 1. 최빈 높이와 다른 블록 / 2. 최빈 높이 블록
                // 1 - 2 를 통해 그 차를 diff변수에 저장
                int diff = map[i][j] - targetBlock;

                // diff가 0보다 크면 블록 제거 수행
                // 2초 증가, 제거한 만큼 인벤토리 블록 증가
                if (diff > 0) {
                    totalTime = totalTime + (diff * 2);
                    inventory = inventory + diff;
                }
                // diff 가 0보다 작으면 블록 추가
                // 1초 증가, 설치한 만큼 인벤토리 증가
                else if (diff < 0) {
                    totalTime = totalTime + -diff;
                    inventory = inventory - -diff;
                }
            }
        }
        bw.write(totalTime + " " + targetBlock + "\n");
        bw.flush();
    }
}
