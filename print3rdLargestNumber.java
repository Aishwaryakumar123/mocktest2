import java.util.Scanner;
public class print3rdLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the first number");
        int n1= sc.nextInt();
        System.out.println(" enter the second number");
        int n2= sc.nextInt();
        System.out.println(" enter the third number");
        int n3= sc.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println(+ n1+" n1 is greater ");
        } else if (n2> n1&& n2>n3) {
            System.out.println(+n2+"  n2 is greater");

        }
        else{
            System.out.println( n3+" n3 is  greater");
        }

    }
}
