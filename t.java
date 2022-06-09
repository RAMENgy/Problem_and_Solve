import java.util.*;

public class t {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력할 숫자의 총 갯수를 먼저 입력하세요 : ");
		int size = scanner.nextInt();
		// 배열 크기 선입력
		
		int[] arr = new int[size];
		// 입력된 값으로 배열 크기 지정
		
		for (int i = 0; i < size; i++) {
			System.out.println(size+"개의 숫자중 "+(i+1)+"번째 숫자를 입력하세요 : ");
			arr[i] = scanner.nextInt();
		}
		// 배열의 각 값들 입력
		
		List list = new ArrayList();
		for (int i : arr) {
			list.add(i);
		}
		// list에 배열 담기
		
		Set set = new HashSet(list);
		// set에 담아서 중복 제거
		
		List newList = new ArrayList(set);
		Collections.sort(newList);
		// Collections.sort()로 오름차순 정렬
		
		// System.out.println("결과 출력 : "+newList.size());
		// 결과물이 [1, 2, 3]의 형태와 같이 나와서 아래와 같이 변경
		
		System.out.print("결과 출력 : ");
		for(int i=0; i<newList.size(); i++) {
			System.out.print(newList.get(i)+" ");
		}
		// 출력
	}

}
