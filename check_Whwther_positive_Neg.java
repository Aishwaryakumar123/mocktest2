import java.util.Scanner;
public class check_Whwther_positive_Neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        if(n>0){
            System.out.println(" positivenumber");
        } else if (n==0) {
            System.out.println(" number entered is zero");

        }
        else {
            System.out.println(" negative number");
        }
    }
}
