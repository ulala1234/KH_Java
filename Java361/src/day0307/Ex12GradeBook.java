package day0307;
// 사용자로부터

// 번호, 이름, 국어, 영어, 수학 순으로 입력 받아서
// 다음과 같이 출력되는 프로그램을 작성하시오.

// 번호: 0##번 이름: ###
// 국어: 0##점 영어: 0##점 수학: 0##점
// 총점: 0##점 평균: 0##.##점

// 단, 입력과 출력을 분리해서
// 사용자가 입력을 누를 때에만 입력이 되고
// 출력을 누르면 출력이 되게 코드를 작성하시고
// 사용자가 종료를 선택하기 전까지는
// 해당 기능이 무한하게 반복되게 코드를 작성해보세요.

// 힌트) 변수의 선언위치
// if문 안이면 else if 땐 선언한게 아님
// while문 안이면 반복될 때 선언한게 다시 초기화 됨
// 따라서 while문 이전에 있어야 함

// 심화과정: 만약 사용자가 입력한적 없이
// 출력을 선택하면
// "아직 입력된 정보가 없습니다."만 출력되게
// 코드를 작성하시오.

// 쉬는시간 포함 30분까지

import java.util.Scanner;

public class Ex12GradeBook {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 입력받은 값을 저장할 변수
        // Ex05While01 1~3번 참고
        String name = "";
        int id = 0;
        int korean = 0;
        int english = 0;
        int math = 0;

        // 사용자가 입력 했는지 안 했는지를 저장할 boolean 변수
        boolean inputSwitch = false;

        while (true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                // 번호 입력
                System.out.println("학생의 번호를 입력해주세요.");
                System.out.print("> ");
                id = scanner.nextInt();

                // 이름입력
                System.out.println("학생의 이름을 입력해주세요.");
                System.out.print("> ");
                scanner.nextLine();
                name = scanner.nextLine();

                // 국어 점수 입력
                System.out.println("국어 점수를 입력해주세요.");
                System.out.print("> ");
                korean = scanner.nextInt();

                while (korean < 0 || korean > 100) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("국어 점수를 입력해주세요.");
                    System.out.print("> ");
                    korean = scanner.nextInt();
                }

                // 영어 점수 입력
                System.out.println("영어 점수를 입력해주세요.");
                System.out.print("> ");
                english = scanner.nextInt();

                while (english < 0 || english > 100) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("영어 점수를 입력해주세요.");
                    System.out.print("> ");
                    english = scanner.nextInt();
                }

                // 수학 점수 입력
                System.out.println("수학 점수를 입력해주세요.");
                System.out.print("> ");
                math = scanner.nextInt();

                while (math < 0 || math > 100) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.println("수학 점수를 입력해주세요.");
                    System.out.print("> ");
                    math = scanner.nextInt();
                }

                // inputSwitch에 true를 저장한다. (점수 입력 끝난 후)
                inputSwitch = true;

            } else if (userChoice == 2) {

                if (inputSwitch == true) {
                    System.out.printf("번호: %03d번 이름: %s\n", id, name);
                    System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);

                    int sum = korean + english + math;
                    double average = (double) sum / 3;

                    System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);
                } else {
                    System.out.println("아직 입력된 정보가 없습니다.");
                }
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");

                break;
            }
        }
    }
}
