package posttest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan angka pertama: ");
            double num1;
            while (true) {
                try {
                    num1 = scanner.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Input tidak valid. Masukkan angka: ");
                    scanner.next(); // Clear invalid input
                }
            }

            System.out.print("Masukkan angka kedua: ");
            double num2;
            while (true) {
                try {
                    num2 = scanner.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Input tidak valid. Masukkan angka: ");
                    scanner.next(); // Clear invalid input
                }
            }

            System.out.println("Pilih Operasi:");
            System.out.println("1. Tambah (+)");
            System.out.println("2. Kurang (-)");
            System.out.println("3. Kali (*)");
            System.out.println("4. Bagi (/)");
            System.out.print("Input pilihan Anda: ");
            int choice;
            while (true) {
                try {
                    choice = scanner.nextInt();
                    if (choice >= 1 && choice <= 4) {
                        break;
                    } else {
                        System.out.print("Pilihan tidak valid. Masukkan angka antara 1-4: ");
                    }
                } catch (InputMismatchException e) {
                    System.out.print("Input tidak valid. Masukkan angka: ");
                    scanner.next(); // Clear invalid input
                }
            }

            Operation operation;
            switch (choice) {
                case 1:
                    operation = new Addition();
                    break;
                case 2:
                    operation = new Subtraction();
                    break;
                case 3:
                    operation = new Multiplication();
                    break;
                case 4:
                    operation = new Division();
                    break;
                default:
                    System.out.println("Pilihan Tidak valid");
                    return;
            }

            double result = operation.operate(num1, num2);
            System.out.println("Hasil: " + result);
        }
    }
}