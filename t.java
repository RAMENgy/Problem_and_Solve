import java.util.*;

public class t {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("생성할 배열의 크기를 입력하세요: ");
		int size = scanner.nextInt();
		// 배열 크기 선입력
		int[] arr = new int[size];
		// 입력된 값으로 배열 크기 지정
		for (int i = 0; i < size; i++) {
			System.out.println("배열에 입력할 정수를 하나씩 입력하세요: ");
			arr[i] = scanner.nextInt();
		}
		// 배열의 각 값들 입력
		
		
		List list = new ArrayList();
		for (int element : arr) {
			list.add(element);
		}
		// list에 배열 담기
		
		Set set = new HashSet(list);
		// set에 담아서 중복 제거
		
		List newList =new ArrayList(set);
		Collections.sort(newList);
		// Collections.sort()로 오름차순 정렬
		
		System.out.println(newList);
		// 출력
		
		
	}

}
