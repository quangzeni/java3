package BaiTapB3;

import java.util.Scanner;

public class MainQuadratic {
    public static void main(String[] args) {
        QuadraticEquation phuongTrinh1 = new QuadraticEquation();
        Scanner scanner = new Scanner(System.in);
        phuongTrinh1.inputData(scanner);
        phuongTrinh1.display();
    }
}
