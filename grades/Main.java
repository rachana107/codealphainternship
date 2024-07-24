package grades;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students info you wanted to store: ");
        int n = sc.nextInt();
        StuInfo[] info = new StuInfo[n];
        for (int i = 0; i < n; i++) {
            String stuName = sc.next();
            float stuScore = sc.nextFloat();
            info[i] = new StuInfo(stuName, stuScore);
        }
        Calculator(info);
    }
    public static void Calculator(StuInfo[] info){
        float sum=0;
        float avg;
        for(int i=0; i<info.length; i++){
            sum = sum + info[i].stuScore;
        }
        avg = sum/info.length;
        System.out.println("The average student score is: " + avg);
        float highest = info[0].stuScore;
        String highestName = info[0].stuName;
        for(int i=1; i<info.length; i++){
            if(info[i].stuScore > highest){
                highest = info[i].stuScore;
                highestName = info[i].stuName;
            }
        }
        System.out.println("The highest student score is: " + highest + "scored by "+highestName);
        float lowest = info[0].stuScore;
        String lowestName = info[0].stuName;
        for(int j = 1; j<info.length; j++){
            if(info[j].stuScore < lowest){
                lowest = info[j].stuScore;
                lowestName = info[j].stuName;
            }
        }
        System.out.println("The lowest student score is: " + lowest+ "scored by "+lowestName);

    }
}
