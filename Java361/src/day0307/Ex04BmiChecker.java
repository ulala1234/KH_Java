package day0307;
// 사용자로부터 이름, 나이, 키, 몸무게 순으로 입력 받아서

// BMI를 계산하고 비만도 결과값을 출력하는 프로그램을 작성하세요.

// BMI 공식은 몸무게(kg) / 키 (m) / 키(m) 입니다.
// 기네스북에 따르자면, 세계에서 가장 키가 컸던 사람은 2.72M였습니다.
// 기네스북에 따르자면, 세계에서 가장 무거웠던 사람은 635kg였습니다.

// BMI에 따른 비만도
// 18.5 미만: 저체중
// 18.5 이상 23 미만: 정상 체중
// 23 이상 25 미만: 과체중
// 25 이상: 비만

// 5시 35분까지(쉬는시간 10분 포함)

import java.util.Scanner;

public class Ex04BmiChecker {

    public static void main(String[] args) {

        // 상수
        // (상수 입력은 scanner 변수 선언 전에 하는 것인듯)
        // 1. 입력 가능한 키의 최솟값
        final double HEIGHT_MINIMUM = 0;
        // 2. 입력 가능한 키의 최댓값
        final double HEIGHT_MAXIMUM = 2.72;
        // 3. 입력 가능한 몸무게의 최솟값
        final double WEIGHT_MINIMUM = 0;
        // 4. 입력 가능한 몸무게의 최댓값
        final double WEIGHT_MAXIMUM = 635;
        // 5. BMI 기준점 1
        final double BMI_STANDARD1 = 18.5;
        // 6. BMI 기준점 2
        final double BMI_STANDARD2 = 23;
        // 7. BMI 기준점 3
        final double BMI_STANDARD3 = 25;

        // 입력에서 사용할 Scanner 클래스 변수
        Scanner scanner = new Scanner(System.in);

        // 1. 이름을 입력 받는다.
        System.out.println("이름을 입력해주세요.");
        System.out.print("> ");
        String name = scanner.nextLine();

        // 2. 나이를 입력 받는다.
        System.out.println("나이를 입력해주세요.");
        System.out.print("> ");
        int age = scanner.nextInt();

        // 3. 키를 입력 받는다.
        System.out.println("키를 입력해주세요.");
        System.out.print("> ");
        double height = scanner.nextDouble();

        // 4. 키가 올바른지 체크한다.
        if (height > HEIGHT_MINIMUM && height <= HEIGHT_MAXIMUM) {
            // 4-1. 올바른 키의 범위에 속하므로 몸무게를 입력 받는다.
            System.out.println("몸무게를 입력해주세요.");
            System.out.print("> ");
            double weight = scanner.nextDouble();

            // 5. 몸무게가 올바른지 체크한다.
            if (weight > WEIGHT_MINIMUM && weight <= WEIGHT_MAXIMUM) {
                // 5-1. 올바른 몸무게의 범위에 속하므로
                // BMI 계산 후 결과 출력
                // 이름: ### 나이: 0##세 출력
                System.out.printf("이름: %s 나이: %03d세\n", name, age);
                // 키: #.##M 몸무게: 0##.##kg 출력
                System.out.printf("키: %.2fM 몸무게: %06.2fkg\n", height, weight);
                // BMI: ##.## 비만도: 출력
                double bmi = weight / height / height;
                System.out.printf("BMI: %.2f 비만도: ", bmi);

                // 비만도 결과값 출력
                // (비만도 0보다 작으면 안되지 생각했는데 키랑 몸무게 0보다 크다는 조건을 이미 만족시킨 후라 음수 안 나옴)
                if (bmi < BMI_STANDARD1) {
                    System.out.println("저체중");
                } else if (bmi < BMI_STANDARD2) {
                    System.out.println("정상 체중");
                } else if (bmi < BMI_STANDARD3) {
                    System.out.println("과체중");
                } else {
                    System.out.println("비만");
                }
            } else {
                // 5-2. 올바른 몸무게의 범위에 속하지 않으므로 경고 메세지만 출력
                System.out.println("잘못된 몸무게를 입력하여 프로그램을 종료합니다.");
            }
        } else {
            // 4-2. 올바른 키의 범위에 속하지 않으므로 경고 메세지만 출력
            System.out.println("잘못된 키를 입력하여 프로그램을 종료합니다.");
        }
    }
}
