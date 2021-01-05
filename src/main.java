package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // hello word
        System.out.println("~~~~~~Довільне повідомлення~~~~~~~");

        System.out.print("Введіть інтервал наприклад [х;у]  ");
        Scanner begin_of_integral = new Scanner(System.in);
        Scanner end_of_integral = new Scanner(System.in);
        Integral integral1 = new Integral();
        integral1.setBegin(begin_of_integral.nextInt());
        integral1.setEnd(end_of_integral.nextInt());
        integral1.print_list_not_even_nums();
        integral1.print_list_even_nums();
        integral1.sum_of_nums();
        int minimal_number = 0;
        while(minimal_number < 2)
        {
            Scanner amount_of_fibonacci;
            System.out.print("Введіть кількість чисел ряду Фібоначчі - ");
            amount_of_fibonacci = new Scanner(System.in);
            minimal_number = amount_of_fibonacci.nextInt();
        }
        integral1.func_fibonacci(minimal_number);
    }
}