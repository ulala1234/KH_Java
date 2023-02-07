package homework;
// 0311 숙제 2번.

// 메서드를 실행시킬 때 파라미터로 값을 넘겨주는 경우
// Call by Value(값에 의한 호출)과 Call by Reference(참조에 의한 호출)
// 이라는 2가지 방법 중 하나가 실행됩니다.
// 각각이 무엇인지 그리고 언제 실행되는지를 조사해 오세요.

// Call by Value:
// 값에 의한 호출은 파라미터로 넘어온 값이 실젯값이 아니라 실젯값을 복사한 값이 넘어오는 경우이다.
// 만약 파라미터의 데이터타입이 기본형 데이터타입일 경우에는 값에 의한 호출이 발생한다.

// Call by Reference:
// 참조에 의한 호출은 파라미터로 넘어온 값이 실제 주솟값이 넘어오는 경우이다.
// 만약 파라미터의 데이터타입이 참조형 데이터타입일 경우에는 참조에 의한 호출이 발생한다.
// -> 위의 설명 틀림
// C언어는 둘 다 존재하지만 자바는 기본형이든 참조형이든 Call by Value만 존재한다.

public class Ex02CallMethod {
	public static void main(String[] args) {

		// 값에 의한 호출의 경우
		// (기본형 데이터타입의 경우)
		// stack 영역에 변수와 값이 저장되고
		// 파라미터로 넘어온 값이 복사된 값이기 때문에 원래 값이 변하지 않는다.
		System.out.println("-------------------------------");
		System.out.println("1. Call By Value");
		System.out.println("-------------------------------\n");

		int num = 3;

		System.out.println("num의 현재 값: " + num); // 3

		callByValue(num); // 4

		System.out.println("num의 현재 값: " + num); // 3

		// 참조에 의한 호출의 경우 (-> 틀림. 참조형 데이터타입의 경우)
		// stack 영역에 변수와 주솟값이 저장되고
		// heap 영역에 객체 타입과 실젯값이 저장되는데
		// 똑같은 주솟값이 복사되어 값이 변하면 영향을 미치게 된다.
		System.out.println("-------------------------------");
		System.out.println("1. Call By Reference");
		System.out.println("-------------------------------\n");

		int[] array = new int[3];

		System.out.println("array[0]의 현재 값: " + array[0]); // 0
		System.out.println(array); // [I@6504e3b2(주솟값)

		callByReference(array); // 30
		System.out.println(array); // [I@6504e3b2(주솟값)

		System.out.println("array[0]의 현재 값: " + array[0]); // 30
		System.out.println(array); // [I@6504e3b2(주솟값)

		// 단, 참조에 의한 호출을 사용할 때 한가지 주의할 점은 (-> 틀림. 참조형 데이터타입의 경우)
		// 파라미터로 들어간 참조형 데이터타입의 변수에
		// 새로운 주솟값이 부여되면 실젯값이 변경되지 않는다.
		// 이유는 stack 영역에 다른 주솟값으로 복사되기 때문에 각각 생성되어 원래 값은 변하지 않는다.
		// 따라서, 원래 값을 변경해주려면 새 주솟값으로 덮어씌워줘야 한다.
		System.out.println("-------------------------------");
		System.out.println("3. 새로운 주솟값 부여");
		System.out.println("-------------------------------\n");

		System.out.println("array의 현재 길이: " + array.length); // 3
		System.out.println(array); // [I@6504e3b2(주솟값)

		// increaseLength(array); // 1. 5
		array = increaseLength(array); // 2. 5
		System.out.println(array); // 1. [I@6504e3b2(주솟값), 2. [I@515f550a(주솟값)

		System.out.println("array의 현재 길이: " + array.length); // 1. 3, 2. 5
		System.out.println(array); // // 1. [I@6504e3b2(주솟값), 2. [I@515f550a(주솟값)
	}

	public static int[] increaseLength(int[] arr) {

		System.out.println("increaseLength() 실행");

		arr = new int[5];

		System.out.println("arr.length: " + arr.length);
		System.out.println("increaseLength() 종료");

		return arr;
	}

	public static void callByValue(int num) {

		System.out.println("callByValue() 실행");

		num++;

		System.out.println("num의 현재 값: " + num);
		System.out.println("callByValue() 종료");
	}

	public static void callByReference(int[] arr) {

		System.out.println("callByReference() 실행");

		arr[0] = 30;

		System.out.println("arr[0]의 현재 값: " + arr[0]);
		System.out.println("callByReference() 종료");
	}
}
