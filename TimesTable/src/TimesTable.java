import java.util.Arrays;

public class TimesTable {
	private int [][] timeTable = new int [10][10];
	
	public TimesTable() {
		super();
		for (int i = 0; i < timeTable.length; i++) {
			for (int j = 0; j < timeTable[i].length; j++) {
				timeTable[i][j] = (i + 1) * (j + 1);
			}
		}
	}

	public static int[][] createTimeTable(int row, int column) {
		int[][] timeTable = new int[row][column];
		for (int i = 0; i < timeTable.length; i++) {
			for (int j = 0; j < timeTable[i].length; j++) {
				timeTable[i][j] = (i + 1) * (j + 1);
			}
		}
		return timeTable;
	}
	
	public static void printTimeTable(int[][] newArray) {
		String sb = "";
		for (int row = 0; row < newArray.length; row++) {
			for (int column = 0; column < newArray[row].length; column++) {
				sb += String.format("%7s", newArray[row][column]);
			}
			sb += "\n"; 
		}
		System.out.println(sb);
	}
	
	@Override
	public String toString() {
		String sb = "";
		for (int row = 0; row < timeTable.length; row++) {
			for (int column = 0; column < timeTable[row].length; column++) {
				sb += String.format("%7s", timeTable[row][column]);
			}
			sb += "\n"; 
		}
		return sb;
	}
	
	

	
}
