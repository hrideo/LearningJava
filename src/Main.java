public class Main{

    public static double grossYearlySalary( double hoursPerWeek,
                                            double moneyPerHour){
        if (hoursPerWeek < 0){
            return -1;
        }
        if (moneyPerHour < 0){
            return -1;
        }

        double weeklySalary = hoursPerWeek * moneyPerHour;
        return weeklySalary * 52;
    }

    public static void main(String[] args){
        double salary = grossYearlySalary(40, 2);
        System.out.println(salary);
    }
}