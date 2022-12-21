package day0311;
// 메서드(Method)

// 메서드란, 우리가 일종의 코드를 압축시킨 축약어를 만들어서
// 그 축약어를 적으면 우리가 미리 설정한 코드가 차례대로 실행되는 것이다.

// 예를 들어서 우리가 어떤 프로그램의 단축키를 누르면
// 해당 단축키에 설정되어있는 기능이 실행되듯
// 우리가 그러한 단축키를 만들게 되는 것이다.

// 메서드는 선언과 구현으로 이루어진다.
// 메서드의 선언이란 해당 메서드가 외부 클래스에서 접근 가능한지, static인지, 메서드가 종료될 때
// 그 메서드를 실행시킨 곳으로 어떤 데이터타입의 값을 보내줄지, 이름은 무엇인지, 그 메서드를 실행시킬 때
// 외부에서 어떤 값을 보내줄지를 지정하는 것이다.

// 또한 해당 메서드를 선언하고 그 안에 그 메서드를 실행시켰을 때 실행할 코드를 우리가 구현하게 된다.

// 메서드의 선언과 구현은 다음과 같이 이루어진다.

// 접근제한자 static 리턴타입 메서드이름(파라미터) {
//      해당 메서드의 내용
// }

// 접근제한자
// 접근제한자는 해당 메서드를 외부 클래스가 접근 가능한지, 만약 접근 가능하면
// 외부 패키지에 있는 외부 클래스도 접근 가능한지 등을 설정하는 키워드이다.
// 접근제한자는 다음과 같이 이루어진다.
// public: 외부 패키지에 저장된 외부 클래스도 해당 메서드를 실행할 수 있다.
// protected: 내부 패키지면 상관 없지만 외부 패키지에 저장된 클래스의 경우에는
//            상속 관계의 클래스일 때만 해당 메서드를 실행할 수 있다.
// default: 내부 패키지의 다른 클래스만 실행 가능하고, 외부 패키지에 있을 경우에는
//          해당 메서드를 실행시킬 수 없다.
//          디폴트 접근제한자는 우리가 아무런 접근제한자를 적어주지 않으면 적용된다.
// private: 해당 메서드가 선언/구현되어있는 클래스 외에는 해당 메서드를 사용할 수 없다.
// 우리가 필요에 따라서 다양한 접근제한자를 사용할 수도 있지만
// 지금 단계에서는 우리가 public 접근제한자만 사용하게 될 것이다.

// static: 스태틱 키워드는 해당 메서드를 클래스 변수의 선언과 초기화 없이 곧장 실행시킬 수 있게
//         만들어준다.
//         단, static 메서드가 같은 클래스의 다른 메서드를 해당 클래스 변수 선언 없이 사용하려면
//         그 다른 메서드에서도 static이 모두 붙어야 한다.
//         이것도 지금 단계에서는 우리가 무조건 붙여준다.

// 리턴 타입: 리턴 타입이란, 해당 메서드가 종료될 때, 그 메서드를 실행시킨 곳으로 보내줄 값의
//         데이터타입을 적어주게 된다.
//         만약 아무런 값도 다시 돌려주지 않을 경우, 우리가 void 라고 적는다.
//         리턴 타입이 존재할 시에는, 해당 메서드를 구현할 때 반드시 "return" 이라는 키워드를 사용해서
//         해당 데이터타입의 값을 "돌려주"는 코드를 포함시켜야 한다.
//         만약 리턴 타입이 void일 경우에는, 반대로 return을 적으면 에러가 발생한다!

// 메서드 이름: 소문자로 시작하고 낙타등 표기법을 사용하는 동사

// 파라미터: 파라미터란, 해당 메서드를 실행할 때 필요로 하는 값을 변수의 형태로 선언만 해둔 것을 
//         파라미터라고 한다.
//         만약 외부로부터 아무런 값도 필요하지 않는다면, 우리가 () 안에 아무것도 안 적어주어도 되지만
//         만약 () 안에 파라미터를 설정했을 경우에는 외부에서 해당 메서드를 실행할 때
//         반드시 그 파라미터와 일치하는 데이터타입의 값 혹은 변수를 적어주어야 한다!

public class Ex05Method {
	public static void main(String[] args) {

		// 우리가 각자 이름을 예쁘게 출력하는 코드를 만들고 5번 반복해보자
		printName();
		printName();
		printName();
		printName();
		printName();

		// int 변수 2개의 산술연산 결과값을 예쁘게 출력하는 코드
		// 1. 5와 7에 대한 결과
		int num1 = 5;
		int num2 = 7;

		printCalcResult(num1, num2);

		// 2. 7과 5에 대한 결과
		printCalcResult(num2, num1);

		// 3. 변수가 아닌 int 값 10과 12에 대한 결과
		printCalcResult(10, 12);

		// int 값 3개에 대한 평균을 구하는 코드
		double average = calcAverage(3, 4, 5);
		System.out.println(average);

		average = calcAverage(4, 5, 10);
		System.out.println(average);

		average = calcAverage(4, 9, 10);
		System.out.println(average);

		average = calcAverage(4, 6, 10);
		System.out.println(average);

		average = calcAverage(4, 5, 12);
		System.out.println(average);
	}

	// 이름을 예쁘게 출력하는 printName() 메서드
	// 이 메서드의 리턴 타입은? 아니요 -> void
	// 이 메서드가 필요로 하는 외부의 값(=파라미터)는? 없다.
	public static void printName() {

		System.out.println("\n===================================");
		System.out.println("-----------------------------------");
		System.out.println("\t권\t은\t지");
		System.out.println("-----------------------------------");
		System.out.println("===================================\n");
	}

	// 2개의 int 값에 대한 산술연산자 결과값을 예쁘게 출력하는 printCalcResult() 메서드
	// 이 메서드의 리턴 타입은? void
	// 이 메서드의 파라미터는? int a, int b
	public static void printCalcResult(int a, int b) {

		System.out.println("\n===================================");
		System.out.println("\t결\t\t과");
		System.out.println("===================================\n");
		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		// %% -> %를 그대로 출력하려 할 때
		System.out.printf("%d %% %d = %d\n", a, b, a % b);
		System.out.println("===================================\n");
	}

	// 3개의 int 값에 대한 평균을 구해주는 calcAverage() 메서드
	// 이 메서드의 리턴 타입은? double
	// 이 메서드의 파라미터는? int, int, int
	public static double calcAverage(int a, int b, int c) {

		double average = (a + b + c) / 3.0;

		// return 명령어의 경우, 한 가지 주의할 점이 있는데,
		// return 키워드가 실행되면 곧장 해당 메서드는 거기서 종료가 된다.
		// if 같은 조건문 안에 return을 더 써줄 수도 있지만
		// 메서드의 가장 바깥쪽에 있는 return 키워드 이후에는
		// 아무런 코드를 실행시킬 수 없다.
		return average;

		// System.out.println("계산 완료"); // return 이후에 써서 에러

//		if (average > 0) {
//			return average;
//		} // 조건 안맞으면 리턴 실행 안 돼서 에러
	}
}
