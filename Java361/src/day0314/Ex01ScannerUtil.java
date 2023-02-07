package day0314;

// ScannerUtil을 우리가 원하는대로 사용 가능하지 확인하는 클래스

import java.util.Scanner;
import util.ScannerUtil;

public class Ex01ScannerUtil {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1. nextInt(Scanner, String)
		// 직접 스트링 값을 넘기기
		int temp = ScannerUtil.nextInt(scanner, "임시로 값을 입력해보기");
		System.out.println("temp의 현재 값: " + temp);

		// 스트링 변수 만들어서 변수로 넘기기
		String message = "nextInt(Scanner, String) 체험해보기";

		temp = ScannerUtil.nextInt(scanner, message);
		System.out.println("temp의 현재 값: " + temp);

		// 2. nextInt(Scanner, String, int, int)
		temp = ScannerUtil.nextInt(scanner, "0이상 10이하 입력받기", 0, 10);
		System.out.println("temp의 현재 값: " + temp);

		// 3. nextLine(Scanner, String)
		String str = ScannerUtil.nextLine(scanner, "스캐너 버그가 발생할까?");
		System.out.println("str의 현재 값: " + str); // 아니오

		str = ScannerUtil.nextLine(scanner, "스캐너 버그가 발생할까?");
		System.out.println("str의 현재 값: " + str); // 아니오

		// 내가 추가한 것
		// 4. nextDouble(Scanner, String)
		double doubleTemp = ScannerUtil.nextDouble(scanner, "nextDouble()");
		System.out.println("doubleTemp의 현재 값: " + doubleTemp);

		// 5. nextDouble(Scanner, String, double, double)
		doubleTemp = ScannerUtil.nextDouble(scanner, "0초과 10미만 실수 입력받기", 0, 10);
		System.out.println("doubleTemp의 현재 값: " + doubleTemp);
	}
}
