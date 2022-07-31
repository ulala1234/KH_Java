package day0304;
// 사용자로부터 번호, 이름, 영어 점수, 수학 점수, 국어 점수를

// 차례대로 입력 받아서
// 다음과 같은 양식으로 출력되는 프로그램을 작성하시오.

// 결과)
// 번호: 0##번 이름: ###
// 국어: 0##점 영어: 0##점 수학: 0##점
// 총점: 0##점 평균: 0##.##점
// 5시 10분까지

import java.util.Scanner;

public class Ex02GradeBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 과목의 개수를 저장한 상수
        final int SUBJECT_SIZE = 3;

        // (단계별로 쪼개기)
        // 입력

        // 1. 번호 입력
        // 1-1. 번호를 저장할 int 변수 선언
        int id;

        // 1-2. 사용자한테서 int 값 입력을 받아
        // int 변수에 저장
        System.out.println("번호를 입력해주세요.");
        System.out.print("> ");
        id = scanner.nextInt();

        // 2. 이름 입력
        // 2-1. 이름을 저장할 변수 선언
        String name;

        // 2-2. Scanner 클래스 버그 방지용 nextLine()
        // (그래야 스트링 입력을 받을 수 있음)
        scanner.nextLine();

        // 2-3. 사용자로부터 입력 받은 String 값을 name에 저장
        System.out.println("이름을 입력해주세요.");
        System.out.print("> ");
        name = scanner.nextLine();

        // 3. 영어 점수 입력
        // 3-1. 영어 점수를 저장할 변수
        int english;

        // 3-2. 사용자가 입력한 int값을 변수에 저장
        System.out.println("영어 점수를 입력해주세요.");
        System.out.print("> ");
        english = scanner.nextInt();

        // 4. 수학 점수 입력
        // 4-1. 수학 점수를 저장할 변수를 선언하고 사용자가 입력한 int 값을 변수에 저장
        System.out.println("수학 점수를 입력해주세요.");
        System.out.print("> ");
        int math = scanner.nextInt();

        // 5. 국어 점수 입력
        // 5-1. 수학 점수를 저장할 변수를 선언하고 사용자가 입력한 int 값을 변수에 저장(선언과 초기화 과정 합쳐도 됨)
        System.out.println("국어 점수를 입력해주세요.");
        System.out.print("> ");
        int korean = scanner.nextInt();

        // 출력
        // printf("형식", 변수나 값)

        // 1. 번호: 0##번 이름: ### 을 담당하는 printf()
        System.out.printf("번호: %03d번 이름: %s\n", id, name);

        // 2. 국어: 0##점 영어: 0##점 수학: 0##점 을 담당하는 printf()
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);

        // 3. 총점: 0##점 평균: 0##.##점 을 담당하는 printf()
        // 3-1. 총점을 담당할 변수를 선언하고 총점을 계산하여 저장한다.
        int sum = korean + english + math;

        // 3-2. 평균을 담당할 변수를 선언하고 평균을 계산하여 저장한다.
        // 평균에서 나누는 값이 3이면 int / int라 소숫점이 안 나온다.(몫만 나와서)
        // int / double 하면 실수값이 나오니 3.0이라고 써야 한다. -> 하드코딩
        // 소프트코딩 -> 상수로 과목의 개수를 저장한다. 명시적 형변환을 한다. 
        double average = sum / (double) SUBJECT_SIZE;

        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
    }
}