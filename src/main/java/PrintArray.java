
public class PrintArray {
	public static void printArr(int [][] arr){
		System.out.println("Original Array:");
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr.length - i; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void printArrRev(int [][] arr){
		System.out.println("Reverse Array:");
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr.length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
