
public class CreateArray {
	public int[][] createArr(int size){
		int [][] arr = new int[size][size];
		for (int i = 0; i < size; i++){
			for (int j = 0; j < size - i; j++){
				arr[i][j] = (int) (Math.random() * 10);
			}
		}
		return arr;
	}
	public int[][] createArr(){
		int [][] arr = new int[4][4];
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 4 - i; j++){
				arr[i][j] = (int) (Math.random() * 10);
			}
		}
		return arr;
	}
}
