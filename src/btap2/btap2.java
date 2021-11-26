package btap2;

import java.util.Scanner;

public class btap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen a bat ky : ");
        int a = scanner.nextInt();
        int sum = a * (1+11+111);
        System.out.printf("%d + %d%d + %d%d%d = %d ",a,a,a,a,a,a,sum);
    }
}
