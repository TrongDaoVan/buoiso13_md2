package bai1;

import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập chuỗi: ");
        String chuoi = scanner.nextLine();

        System.out.println(chuoi);

//        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> arr = new LinkedList<>();
        for (int i = 0; i < chuoi.length(); i++) {
            arr.add(chuoi.charAt(i));
        }
        System.out.println(arr);
    }
}
