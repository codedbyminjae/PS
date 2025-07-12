import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Num10699 { // 내 실력 아님
    public static void main(String[] args) {
        // 서울 시간대 설정
        ZoneId seoulZone = ZoneId.of("Asia/Seoul");
        // 현재 서울 날짜 가져오기
        LocalDate todayInSeoul = ZonedDateTime.now(seoulZone).toLocalDate();
        // 출력 형식 지정
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // 날짜 출력
        System.out.println(todayInSeoul.format(formatter));
    }
}