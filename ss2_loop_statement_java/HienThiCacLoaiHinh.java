import java.util.Scanner;

public class Hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        int flag=true;
        Scanner scanner= new Scanner(System.in);
        do {
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle" +
                    "(The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3.Print isosceles triangle");
        }while (flag)
    }
}
