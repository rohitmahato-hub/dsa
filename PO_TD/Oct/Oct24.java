public class Oct24{
    public static void main(String[] args) {
        String arriveAlice = "08-15";
        String leaveAlice = "08-18";
        String arriveBob = "08-16";
        String leaveBob = "08-19";
        System.out.println(Oct24.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }
    static int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        
        String arrive;
        String leave;

        if (arriveAlice.compareTo(arriveBob) > 0) {
            arrive = arriveAlice;
        } else {
            arrive = arriveBob;
        }
        if (leaveAlice.compareTo(leaveBob) < 0) {
            leave = leaveAlice;
        } else {
            leave = leaveBob;
        }
        if (arrive.compareTo(leave) > 0) {
            return 0;
        } else {
            return convertToDays(leave) - convertToDays(arrive) + 1;
        }
    }
    private static int convertToDays(String date) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));
        
        int totalDays = 0;
        for (int i = 1; i < month; i++) {
            totalDays += monthDays[i];
        }
        totalDays += day;
        
        return totalDays;
    }
}
