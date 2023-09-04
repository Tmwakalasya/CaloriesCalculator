import java.util.Scanner;
public class CaloriesCalculator {
    public static int
            day1CalConsumed,
            day1CalBurned,
            day2CalConsumed,
            day2CalBurned,
            day3CalConsumed,
            day3CalBurned,
            day4CalConsumed,
            day4CalBurned,
            day5CalConsumed,
            day5CalBurned,
            day6CalConsumed,
            day6CalBurned,
            day7CalConsumed,
            day7CalBurned;
    public static int totalCaloriesConsumed,totalCaloriesBurned;
    public static double averageCaloriesConsumed,netWeeklyCalories;
    public static void main(String[] args){
        getUserInput();
        calculateCalories();
        displayCalories();
    }
    public static void getUserInput(){
        Scanner scnr = new Scanner(System.in);
        System.out.println("First day calories consumed");
        day1CalConsumed = scnr.nextInt();
        System.out.println("First day calories burned");
        day1CalBurned = scnr.nextInt();
        System.out.println("Second day calories consumed");
        day2CalConsumed = scnr.nextInt();
        System.out.println("Second day calories burned");
        day2CalBurned = scnr.nextInt();
        System.out.println("Third day calories consumed");
        day3CalConsumed = scnr.nextInt();
        System.out.println("Third day calories burned");
        day3CalBurned = scnr.nextInt();
        System.out.println("Fourth day calories consumed");
        day4CalConsumed = scnr.nextInt();
        System.out.println("Fourth day calories burned");
        day4CalBurned = scnr.nextInt();
        System.out.println("Fifth day calories consumed");
        day5CalConsumed = scnr.nextInt();
        System.out.println("Fifth day calories burned");
        day5CalBurned = scnr.nextInt();
        System.out.println("Sixth day calories consumed");
        day6CalConsumed = scnr.nextInt();
        System.out.println("Sixth day calories burned");
        day6CalBurned = scnr.nextInt();
        System.out.println("Seventh day calories consumed");
        day7CalConsumed = scnr.nextInt();
        System.out.println("Seventh day calories burned");
        day7CalBurned = scnr.nextInt();

    }
    public static void calculateCalories(){
         totalCaloriesConsumed = (day1CalConsumed + day2CalConsumed + day3CalConsumed + day4CalConsumed + day5CalConsumed + day6CalConsumed + day7CalConsumed);
         totalCaloriesBurned = (day1CalBurned + day2CalBurned + day3CalBurned + day4CalBurned + day5CalBurned + day6CalBurned + day7CalBurned);
         averageCaloriesConsumed = (double) totalCaloriesConsumed / 7;
         netWeeklyCalories = (double) (totalCaloriesConsumed - totalCaloriesBurned)/ 3000.0;
    }
    public static void displayCalories(){
        System.out.print("Total Calories Consumed  this week are: ");
        System.out.printf("%,d\n",totalCaloriesConsumed);
        System.out.print("Total calories burned this week are: ");
        System.out.printf("%,d\n",totalCaloriesBurned);
        System.out.print("The average calories that were consumed a day is: ");
        System.out.printf("%.2f\n",averageCaloriesConsumed);
        System.out.print("The net weekly/gain calories this week was: ");
        System.out.printf("%.3f\n",netWeeklyCalories);

    }
}
