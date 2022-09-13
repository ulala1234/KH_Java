package day0307;
// 제어문 02

// while 반복문

// while 반복문은
// 특정 조건식이 true가 나오는 동안
// 속해있는 코드 블락을 계속 실행시킨다.

// while 반복문의 구조
// while(조건식) {
//          조건식의 결과값이 true이면
//          실행할 코드
// }
// (if문 처럼 while문도 조건식이 false면 실행문을 실행 안한다.)

public class Ex05While01 {

    public static void main(String[] args) {

        // while의 조건식에서 사용할 int 변수 선언 및 초기화
        int number = 3;

        // number의 현재 값이 0보다 클 동안
        // number의 현재 값을 출력하는 코드
        // 단, number의 현재 값을 출력하고 나서는
        // 값을 1 감소 시킨다.
        while (number > 0) {
            System.out.println(number);
            number--;
        }

        // while문을 안 쓸 경우: if문 3번 반복
        // (if문을 각각 반복하는 것과 중첩으로 반복하는 게 여기선 별 차이가 없다.
        // 어차피 true면 실행되고 false면 무시돼서)
        number = 3;

        if (number > 0) {
            System.out.println(number);
            number--;

//            if (number > 0) {
//                System.out.println(number);
//                number--;
//                
//                if (number > 0) {
//                    System.out.println(number);
//                    number--;
//                }
//            }
        }

        if (number > 0) {
            System.out.println(number);
            number--;
        }

        if (number > 0) {
            System.out.println(number);
            number--;
        }

        // 1. while문 밖에서 int a를 선언하고 while문 안에서 초기화 한 후 a++을 할 경우
        // 출력: number는 줄고 a는 그대로
        // (코드블락 끝나고 a가 다시 0으로 초기화 되면서 반복돼서)
        number = 3;
        int a;

        while (number > 0) {
            a = 0;
            System.out.println(number);
            number--;
            System.out.println("a의 현재 값: " + a);
            a++;
        }

        // System.out.println(a);
        // (코드블락 끝나면 int a만 선언한게 되고 초기화가 안되어 있어서 출력하려면 에러가 뜬다.)

        // 2. while문 안에서 int b 선언과 초기화 한 후 b++을 할 경우
        // 출력: number는 줄고 b는 그대로
        // 코드블락이 끝나고 변수의 유효범위도 끝남
        // (코드블락이 끝나면 메모리에서 실행했던 기록도 사라짐)
        number = 3;

        while (number > 0) {
            int b = 0;
            System.out.println(number);
            number--;
            System.out.println("b의 현재 값: " + b);
            b++;
        }

        // (변수 선언을 while문 바깥에 한 것과 안에 한 것의 결과는 똑같음
        // 그 변수명을 다시 선언 할 수 있냐 못하냐의 차이)

        // 3. while문 밖에 int c 선언과 초기화를 한 후 c++을 할 경우
        // 출력: number는 줄고 c는 늘고
        number = 3;
        int c = 0;

        while (number > 0) {
            System.out.println(number);
            number--;
            System.out.println("c의 현재 값: " + c);
            c++;
        }
    }
}
