package exam23;

public class Utility {
	// 반환 타입 앞에 <T>를 붙여 제네릭 메서드임을 선언
	public static <T> void printArray(T[] array) { //{1,2, 3, 4, 5}
		for (T element : array) {
			System.out.println(element);
		}
	}
}
