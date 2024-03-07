import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a no. of student: ");
        int noOfStudent = input.nextInt();
        double[] student = new double[noOfStudent];
        double sum = 0.0;
        if (noOfStudent == 0) {
            System.out.println("$0");
        } else{
            int k = 1;
            for (int i = 0; i < noOfStudent; i++) {
                System.out.print("No. " + k++ + "student spent: ");
                student[i] = input.nextDouble();
                sum += student[i];
            }
            double avg = (long)((sum / noOfStudent) * 100.0 )/100.0;
            double take = 0,give = 0;
            
            for (int j = 0; j < noOfStudent; j++) {
                
                if (student[j] > avg) {
                    // take += student[j];
                    take += ((student[j]-avg)*100.0) / 100.0;
                }
                else {
                    give += ((avg-student[j])*100.0)/100.0;
                    // give += Math.abs(student[j]);
                }

            }
            if (take > give) {
                System.out.printf("$%.2f", give);

            } else {
                System.out.printf("$%.2f", take);
            }
        } 

    }
}
