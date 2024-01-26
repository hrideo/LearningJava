public class Main{

    public static double grossYearlySalary( double hoursPerWeek,
                                            double moneyPerHour,
                                            int vacationDays){
        if (hoursPerWeek < 0){
            return -1;
        }
        if (moneyPerHour < 0){
            return -1;
        }

        double weeklySalary = hoursPerWeek * moneyPerHour;
        double unpaidTime = vacationDays * moneyPerHour * 8; //8 is used bcoz it is given hours in 1 vacation day
        return (weeklySalary * 52) - unpaidTime;
    }

    public static void main(String[] args){
        double salary = grossYearlySalary(40, 2, 8);
        System.out.println(salary);
    }
}