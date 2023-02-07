// 프로그램을 만들 때 간편하게 쓸 만한 클래스를 모아놓은 패키지를 util이라고 한다.
package util;

// Scanner 클래스의 메소드를 사용할 때
// 편리해질 메소드를 정의해둔 ScannerUtil 클래스

import java.util.Scanner;

public class ScannerUtil {

	// 1. 사용자가 출력하고자 하는 메시지를 양식에 맞추어 출력해줄
	// printMessage()
	public static void printMessage(String message) {
		System.out.println("-----------------------------");
		System.out.println(message);
		System.out.println("-----------------------------");
		System.out.print("> ");
	}

	// 2. 사용자가 출력하고자 하는 메시지를 출력하고
	// int 데이터타입의 값을 입력 받아서 리턴해주는
	// nextInt(Scanner, String)
	public static int nextInt(Scanner scanner, String message) {
		printMessage(message);

		int temp = scanner.nextInt();

		return temp;
	}

	// 3. 특정 범위의 int 값만 입력을 받아 리턴하는
	// nextInt(Scanner, String, int, int)
	// 같은 유효범위 내에서는 똑같은 이름을 못쓰는 변수와 달리
	// 메소드는 파라미터의 내용이 다르면 똑같은 이름을 써도 문제가 없다.
	public static int nextInt(Scanner scanner, String message, int min, int max) {

		// printMessage(message);

		// int temp = scanner.nextInt();

		int temp = nextInt(scanner, message); // 위의 코드가 2번 메소드와 같아서 합침

		while (!(temp >= min && temp <= max)) {
			System.out.println("잘못 입력하셨습니다.");

			temp = nextInt(scanner, message);
		}

		return temp;
	}

	// 4. Scanner 버그를 자동으로 해결해주는
	// nextLine(Scanner, String)
	public static String nextLine(Scanner scanner, String message) {
		printMessage(message);

		String temp = scanner.nextLine();

		// scanner.nextLine()으로 초기화한
		// temp가 아무것도 없는 스트링일 경우,
		// 즉 비어있을 경우에는
		// (숫자를 입력받는 메소드 실행 후 엔터를 누르면 개행문자(\r\n)가 남아있다.
		// 그걸 nextLine()이 읽어서 두 번 써주지 않으면 비어있는 값이 출력된다.)
		// 다시한번 scanner.nextLine()을 실행해준다.
		// String 변수 혹은 값이 비어있는지 확인할 때에는
		// isEmpty() 라는 메소드를 실행시켜서
		// 비어있으면 true, 비어있지 않으면 false의 값을 받아서
		// 처리하면 된다.
		if (temp.isEmpty()) {
			temp = scanner.nextLine();
		}

		return temp;
	}

	// 5. double 입력을 처리하는
	// nextDouble(Scanner, String)
	public static double nextDouble(Scanner scanner, String message) {
		printMessage(message);

		// double temp = scanner.nextDouble();

		// return temp; // temp가 굳이 하는 일 없어서 곧장 결괏값을 리턴해줘도 됨
		return scanner.nextDouble();
	}

	// 6. 범위 내 double 입력을 처리하는
	// nextDouble(Scanner, String, double, double)
	// 단, 이상/이하가 아니라 초과/미만으로 처리한다.
	public static double nextDouble(Scanner scanner, String message, double min, double max) {
		double temp = nextDouble(scanner, message);

		while (!(temp > min && temp < max)) {
			System.out.println("잘못 입력하셨습니다.");

			temp = nextDouble(scanner, message);
		}

		return temp;
	}
}
