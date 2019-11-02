package z_exam;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		
		
//		 * - 선택정렬: 첫 번째 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은 수와 자리 바꾸기를 반복해 앞에서부터 작은 수를 채워나가는 방식 
//		 * - 버블정렬: 첫 번째 숫자부터 바로 뒤 숫자와 비교해서 작은 수와 자리 바꾸기를 반복해 뒤에서부터 큰 수를 채워나가는 방식
//		 * - 삽입정렬: 두 번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰 수들을 뒤로 밀고 중간에 삽입하는 방식
//		 * - 석차구하기: 모든 점수가 1등으로 시작해서 다른 점수들과 비교해 자신의 점수가 작으면 1씩 증가시키는 방식
		
		
		
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++){
			arr[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		shuffle(arr);
		prinkRank(arr); 
		selectSort(arr);
		bubbleSort(arr);
		insertSort(arr);
		
			
			
			
			
		
		
		
		
		

	}

	private static void insertSort(int[] arr) {
		
		
		for(int i = 1; i < arr.length - 1; i++){
			int tmp = arr[i];
			int j = 0;
			for(j = i - 1; j >= 0; j--){
				if(tmp < arr[i - 1]){
					arr[j + 1] = arr[j];
				}else{
					break;
				}
			}arr[j + 1] = tmp;
		}
		System.out.println(Arrays.toString(arr));
		
		
		
	}

	private static void bubbleSort(int[] arr) {
		
		boolean change = false;
		for(int i = 0; i < arr.length; i++){
			for(int j = i; j < arr.length - 1 -i; j++){
				if(arr[j] > arr[j + 1]){
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					change = true;
				}
				}
			if(change == false){
				break;
			}
		}System.out.println(Arrays.toString(arr));
		
		
		
		
	}

	private static void selectSort(int[] arr) {
		
		
		for(int i = 0; i < arr.length; i++){
			for(int j = i + 1; j < arr.length; j++){
				if(arr[i] > arr[j]){
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}

	private static void prinkRank(int[] arr) {
		
		int[] rank = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++){
			rank[i] = 1;
		}System.out.println(Arrays.toString(rank));
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(arr[i] < arr[j]){
					rank[i]++;
				}
			}System.out.println(arr[i] + ": " + rank[i] + "등");
		}
		
		
		
	}

	private static void shuffle(int[] arr) {
		
		for(int i = 0; i < 10; i++){
			int j = (int)(Math.random() * 10);
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}

}





