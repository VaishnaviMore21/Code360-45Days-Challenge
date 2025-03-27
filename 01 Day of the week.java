public class Solution {
	public static String dayOfTheWeek(int day, int month, int year) {
		// Write your code here.
		 String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        
        int k = year % 100;  // Last two digits of the year
        int j = year / 100;  // First two digits of the year
        
        int h = (day + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        
        return days[h];
	}
}
