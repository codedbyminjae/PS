import java.io.*;
import java.util.*;

public class Num1043 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        // 사람 수 N, 파티 수 M
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        // 진실을 아는 사람 수 K와 번호들 입력 (번호는 1부터 N까지)
        String[] truthPeople = br.readLine().split(" ");
        int K = Integer.parseInt(truthPeople[0]);

        // 진실을 아는 사람은 HashSet에 저장 -> 변수 이름 truthPeopleSet
        Set<Integer> truthPeopleSet = new HashSet<>();
        for (int i = 1; i <= K; i++) {
            truthPeopleSet.add(Integer.parseInt(truthPeople[i]));
        }

        // 각 파티 정보를 HashMap에 저장
        // 파티 당 참석자들을 담을 해쉬 HashSet 생성
        Map<Integer, Set<Integer>> partyMap = new HashMap<>();
        for (int i = 0; i < M; i++) {
            String[] input = br.readLine().split(" ");
            int num = Integer.parseInt(input[0]);

            Set<Integer> partyMembers = new HashSet<>();
            for (int j = 1; j <= num; j++) {
                partyMembers.add(Integer.parseInt(input[j]));
            }

            partyMap.put(i, partyMembers);
        }
        // 여기서 의문 예제 입력 4에서 순차 판단으로 진행한다면,
        // 결과는 3이 나와야 하지만, 2가 나옴. -> 순차 판단이 아니라 전체 입력후 판단

        // 진실 전파
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                // 0번 파티부터 순서대로 파티 참석자를 party변수의 Set에 저장
                Set<Integer> party = partyMap.get(j);
                // 인덱스마다 비교를 위해서 해당 값을 리스트로 변환
                List<Integer> partyList = new ArrayList<>(party);

                for (int k = 0; k < partyList.size(); k++) {
                    int person = partyList.get(k);
                    // 파티 참석자 중 진실을 아는 사람이 있다면,
                    if (truthPeopleSet.contains(person)) {
                        // 해당 파티 참석자 인원 전부를 truthPeopleSet에 추가
                        truthPeopleSet.addAll(party);
                        break;
                    }
                }
            }
        }
        // 초기 값은 어차피 모든 파티에서 거짓말 예정
        // 앞서 선별한 진실을 아는 사람이 포함되어있으면 거짓말 감소
        int count = M;

        // 각 파티당 참석자 호출
        for (int i = 0; i < M; i++) {
            Set<Integer> party = partyMap.get(i);
            // 인덱스 접근을 위해 다시 리스트로 변환
            List<Integer> partyList = new ArrayList<>(party);
            for (int j = 0; j < partyList.size(); j++) {
                int member = partyList.get(j);
                // 진실을 아는 사람이 파티에 있으면 거짓말 횟수 감소
                if (truthPeopleSet.contains(member)) {
                    count = count - 1;
                    break;
                }
            }
        }
        bw.write(count + "\n");
        bw.flush();
    }
}
