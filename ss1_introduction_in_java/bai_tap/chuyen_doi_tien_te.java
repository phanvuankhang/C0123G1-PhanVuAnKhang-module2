import java.util.Scanner;

public class chuyen_doi_tien_te {
    public static void main(String[] args) {
        int vnd = 23000;
        int usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD.");
        usd = scanner.nextInt();
        int quyDoi = usd * vnd;
        System.out.println("Số tiền VNĐ là: " + quyDoi);
    }
}