package day0304;
// 사용자로부터 국어 영어 수학 점수를 입력 받아서

// 검정고시 결과를 출력해주는 프로그램을 작성하시오

// 검정고시의 경우 만약 평균이 70미만이거나 혹은
// 한 과목이라도 60점 미만일 경우 탈락이 됩니다.

// 예시: 50 50 50 -> 탈락
//      80 80 80 -> 합격
//      100 100 20 -> 탈락

import java.util.Scanner;

public class Ex09ResultChecker {
    public static void main(String[] args) {

        // 프로그램에서 사용할 상수들(조건이 바뀌어도 코드 안 찾아도 되게: 유연한 코드)
        // 상수: final 데이터타입 변수명(대문자) = 값;
        // 1. 통과 기준의 총점
        final int SUM_MINIMUM = 210;
        // 2. 통과 기준의 개별 점수
        final int SCORE_MINIMUM = 60;

        Scanner scanner = new Scanner(System.in);

        // 국어 점수 입력
        System.out.println("국어 점수를 입력해주세요.");
        System.out.print("> ");
        int korean = scanner.nextInt();

        // 영어 점수 입력
        System.out.println("영어 점수를 입력해주세요.");
        System.out.print("> ");
        int english = scanner.nextInt();

        // 수학 점수 입력
        System.out.println("수학 점수를 입력해주세요.");
        System.out.print("> ");
        int math = scanner.nextInt();

        // 탈락 조건 1.
        // 평균이 70 미만일 경우((A+B+C)/3 = 70) -> 총점이 210 미만일 경우
        // 탈락 조건 2.
        // 국어 점수가 60점 미만일 경우
        // 탈락 조건 3.
        // 영어 점수가 60점 미만일 경우
        // 탈락 조건 4.
        // 수학 점수가 60점 미만일 경우
        // (조건 중 하나라도 만족하면 탈락: OR 연산자)

        // 총점을 계산하여 변수에 저장
        int sum = korean + english + math;

        if (sum < SUM_MINIMUM || korean < SCORE_MINIMUM || english < SCORE_MINIMUM || math < SCORE_MINIMUM) {
            System.out.println("탈락입니다.");
        } else {
            System.out.println("합격입니다.");
        }
    }
}
