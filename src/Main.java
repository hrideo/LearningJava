public class Main{

    public static double grossWeeklySalary( double hoursPerWeek, double moneyPerHour){
        double result = hoursPerWeek * moneyPerHour;
        return result;
    }

    public static void main(String[] args){
        double weeklySalary = grossWeeklySalary(40, 2);
        System.out.println(weeklySalary);

        double yearlySalary = weeklySalary * 52;
        System.out.println(yearlySalary);
    }
}