//import statements
import java.util.Scanner;
public class ArrayDemo1 {

    public static void main(String[] args) {
        //test scores
        int[] scores = {20, 41, 28, 40, 37, 35, 12, 33, 50};

        //RETRIEVAL
        //Print the last quiz score

        int last = scores.length-1;
        System.out.println("Last" + last);
        System.out.println("Last Quiz Score:" + scores[last]);

        //Print all scores
        System.out.print("My Quiz scores: ");
        for (int score : scores) {
            System.out.print(score + ",");
        }
        System.out.println();
        
        //SEARCH
        Scanner sc = new Scanner(System.in);
        //ask user to enter a score
        System.out.print("Enter a score to find:");
        int score_to_find = sc.nextInt();

        //isa-isahon og check kada element
        boolean isFound = false;
        int n = 0;
        while (n < scores.length) {
            if (score_to_find == scores[n]) {
                isFound = true;
                break;
            }
            n++;      
        }
        if (isFound) {
            System.out.printf("Naa kayscore na %d sa imu mga quizzes.", score_to_find);
            
        }else {
            System.out.printf("Wala kay score na %d sa imu mga quizzes.", score_to_find);
            
        }

        sc. close();
        System.out.println();
        calculateGrade(scores);

    }
       
    public static void calculateGrade(int[] scores){
        int total_score = 0;
        for (int score : scores) {
            total_score += score;
        }
        //assuming na kada quiz is 50 items
        double quiz_grade = (double) total_score / (scores.length * 50);
        System.out.printf("Total Score: %d \n", total_score);
        System.out.printf("Total number of Items: %d \n", scores.length * 50);
        System.out.printf("Quiz grade: %.2f \n", quiz_grade*100);

    }

}

