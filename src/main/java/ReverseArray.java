
public class ReverseArray {
	public static int[][] reverseArr(int [][] arr){
		int[][] revArr = new int[arr.length][arr.length];
		
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr.length - i; j++){
				revArr[arr.length - j - 1][arr.length - i - 1] = arr[i][j];
			}
		}
		
		return revArr;
	}
	
	public static void main(String[] args) {
		int[][] array = null;
		CreateArray cA = new CreateArray();
		array = cA.createArr(7);
		PrintArray.printArr(array);
		int[][] arrayRev = null;
		arrayRev = ReverseArray.reverseArr(array);
		PrintArray.printArrRev(arrayRev);
	}
	
}
