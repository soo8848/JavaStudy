/** 김재욱 */
/** 요구사항: 입력값인 월(inputMonth)을 받아서 해당 월의 마지막 날짜(lastDay)를 계산한다. */
public class DayMonthTest {
    public static void main(String[] args) {
        
        // 연도
        int year = 2025;
        // 확인할 월
        int inputMonth = 6;
        // 마지막 날짜 저장 변수
        int lastDay = 0;
        
        /*
         * [2월인 경우]
         * 윤년이면 29일, 평년이면 28일로 설정한다.
         * 윤년 판정 공식:
         * - year % 4 == 0  : 4의 배수 해
         * - year % 100 != 0 : 100의 배수 해는 제외
         * - year % 400 == 0 : 400의 배수 해는 다시 윤년
         */
        if (inputMonth == 2) {
            lastDay = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 29 : 28;
        } 
        /*
         * [31일인 달의 조건]
         * - 8월 전: 홀수 달 → 1, 3, 5, 7
         * - 8월 이후: 짝수 달 → 8, 10, 12
         */
        else if ((inputMonth < 8 && inputMonth % 2 == 1) || (inputMonth >= 8 && inputMonth % 2 == 0)) {
            lastDay = 31;
        } 
        /*
         * [나머지 경우] → 30일인 달
         * 4, 6, 9, 11월
         */
        else {
            lastDay = 30;
        }
        
        // 결과 출력
        System.out.println(year + "년 " + inputMonth + "월 " + lastDay + "일까지입니다.");
    }
}
