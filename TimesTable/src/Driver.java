
public class Driver {

	public static void main(String[] args) {
		TimesTable timeTable = new TimesTable();
		System.out.println(timeTable.toString());
		
		int [][] newTable = TimesTable.createTimeTable(12, 12);
		TimesTable.printTimeTable(newTable);
		newTable = TimesTable.createTimeTable(5, 9);
		TimesTable.printTimeTable(newTable);

	}

}
