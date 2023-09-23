package BaiTapB3;

import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.2,"Vàng");
        double dienTich1 = circle1.dienTich();
        double chuVi1 = circle1.chuVi();
        System.out.println("Thông tin hình tròn ban đầu: ");
        circle1.displayData();
        Circle circle2 = new Circle();
//        Nhập thông tin cho circle2
        System.out.println("Nhập thông tin hình tròn số 2");
        Scanner scanner = new Scanner(System.in);
        circle2.inputData(scanner);
        System.out.println("Thông tin hình tròn 2 là:");
        circle2.displayData();
    }
}
