package z_exam;

import java.util.Arrays;
import java.util.Scanner;




public class P_Array {

	public static void main(String[] args) {
		
		/*
		 * << 정렬 >>
		 * - 선택정렬: 첫 번째 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은 수와 자리 바꾸기를 반복해 앞에서부터 작은 수를 채워나가는 방식 
		 * - 버블정렬: 첫 번째 숫자부터 바로 뒤 숫자와 비교해서 작은 수와 자리 바꾸기를 반복해 뒤에서부터 큰 수를 채워나가는 방식
		 * - 삽입정렬: 두 번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰 수들을 뒤로 밀고 중간에 삽입하는 방식
		 * - 석차구하기: 모든 점수가 1등으로 시작해서 다른 점수들과 비교해 자신의 점수가 작으면 1씩 증가시키는 방식
		 */
		
		
		
		// 숫자를 입력받아 입력받은 숫자에 3자리마다 콤마(,)를 붙여 출력해주세요.
		// ex) 1234567 → 1,234,567
		
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자열을 입력해주세요.");
		String input = s.nextLine();
		String newNumber = "";
		int cnt = 0;
		
		for(int i = input.length() - 1; i >= 0; i--){
			newNumber = input.charAt(i) + newNumber;
			cnt++;
			
			if(i % 3 == 0 && cnt != input.length()){
				newNumber = "," + newNumber;
			}
		}System.out.println(newNumber);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int[] numbers = new int[10];
		
		for(int i = 1; i < numbers.length; i++){
			numbers[i] += i;
		}System.out.println(Arrays.toString(numbers));
		
		
		shuffle(numbers);
		prinkRank(numbers);
		selectRank(numbers);
		bubbleRank(numbers);		
		insertRank(numbers);
		

	}

	private static void insertRank(int[] numbers) {
		
		
		for(int i = 1; i < numbers.length; i++){
			int tmp_3 = numbers[i];
			int j = 0;
			for(j = i - 1; j >= 0; j--){
				if(numbers[j] > tmp_3){
					numbers[j + 1] = numbers[j];
				}else{
				break;
				}
			}numbers[j + 1] = tmp_3;
		}System.out.println(Arrays.toString(numbers));
		
		
		
		
		
		
	}

	private static void bubbleRank(int[] numbers) {
		
		 
		
		for(int i = 0; i < numbers.length - 1; i++){
			boolean changed = false;
			for(int j = 0; j < numbers.length - i - 1; j++){
				if(numbers[j] > numbers[j + 1]){
					int tmp_2 = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = tmp_2;
					}
				}if(!changed){
					break;
			}
		}System.out.println(Arrays.toString(numbers));
		
		
		
		
	}

	private static void selectRank(int[] numbers) {
		
		
		
	/*	for(int i = 0; i < numbers.length - 1; i++){
			for(int j = i + 1; j < numbers.length; j++){
				if(numbers[i] > numbers[j]){
					int tmp = numbers[i]; 
					numbers[i] = numbers[j];
					numbers[j] = tmp; 
				}
			}
		}System.out.println(Arrays.toString(numbers));*/
		
		
		for(int i = 0; i < numbers.length - 1; i++){
			for(int j = i + 1; j < numbers.length; j++){
				if(numbers[i] > numbers[j]){
					int tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}System.out.println(Arrays.toString(numbers));
		
		
		
		
	}

	private static void prinkRank(int[] numbers) {
		
		int[] rank = new int[numbers.length];
		for(int i = 0; i < rank.length; ++i){
			rank[i] = 1;
		}
		
		for(int i = 0; i < numbers.length; i++){
			for(int j = 0; j < numbers.length; j++){
				if(numbers[i] < numbers[j]){
					rank[i]++;
				}
			}
		}	
		
		for(int i = 0; i < numbers.length; i++){
			System.out.println(numbers[i] + " : " + rank[i] + "등");
		}
			
		
		
		
		
		
		
		
		
	}

	private static void shuffle(int[] numbers) {
		
		for(int i = 1; i < numbers.length; i++){
			int random = (int)(Math.random() * numbers.length);
			
			int tmp = numbers[0]; 
			numbers[0] = numbers[random];
			numbers[random] = tmp;
		}System.out.println(Arrays.toString(numbers));
		
		
	}

}
