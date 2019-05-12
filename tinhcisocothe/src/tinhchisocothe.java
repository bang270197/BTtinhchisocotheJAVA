import java.util.Scanner;

public class tinhchisocothe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double cannang,chieucao;
        double BMI;
        System.out.println("Nhap can nang ");
        cannang=scanner.nextDouble();
        System.out.println("Nhap chieu cao ");
        chieucao=scanner.nextDouble();
        BMI=cannang/Math.pow(chieucao,2);
        
        if (BMI < 18)
            System.out.printf("%-20.2f%s", BMI, "Underweight");
        else if (BMI < 25.0)
            System.out.printf("%-20.2f%s", BMI, "Normal");
        else if (BMI < 30.0)
            System.out.printf("%-20.2f%s", BMI, "Overweight");
        else
            System.out.printf("%-20.2f%s", BMI, "Obese");
    }
}
