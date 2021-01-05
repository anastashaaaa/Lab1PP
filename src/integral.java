package com.company;

public class Integral {
    /*
     * class Integral is created to several methods which are written here
     * begin - it is a begin of integral
     * end - the end of the integral
     * they are private and has setters to set values of integral
     * */
    private int begin;
    private int end;

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    /*
     * function print_list_not_even_nums prints non even nums which are in array
     */
    public void print_list_not_even_nums ()
    {
        if(begin % 2 == 1)
        {
            for(int i = begin; i <= end; i += 2)
            {

                System.out.print(" " + i + " ");
            }
        }
        else
        {
            for(int i = begin + 1; i <= end; i += 2)
            {

                System.out.print(" " + i + " ");
            }
        }
        System.out.println();
    };
    /*
     * function print_list_even_nums prints even nums which are in array
     */
    public void print_list_even_nums ()
    {
        if(end % 2 == 1)
        {
            for(int i = end - 1; i >= begin; i -= 2)
            {
                System.out.print(" " + i + " ");
            }
        }
        else
        {
            for(int i = end; i >= begin; i -= 2)
            {
                System.out.print(" " + i + " ");
            }
        }
        System.out.println();
    };

    // sum_of_nums - prints sum of even nums of integral and print sum of  non even
    public void sum_of_nums ()
    {
        int sum1 = 0, sum2 = 0;
        for(int i = begin; i < end; i++)
        {
            if(i % 2 == 0)
                sum1+=i;
            else
                sum2+=i;
        }
        System.out.println("Sum of even numbers - " + sum1 + "\nSum of non even numbers - " + sum2);
    }

    // statistic_of_num - count percents of even nums  at func_fibonacci
    void statistic_of_num(int array[],int amount_of_nums) {
        int even_nums = 0;
        for(int i = 0; i < amount_of_nums; i++)
        {
            if (array[i] % 2 == 0) {
                even_nums++;
            }
        }
        double percent_of_even = 0;
        percent_of_even = (((double)even_nums) / ((double)amount_of_nums)) * 100;
        System.out.println("\nПроцент парних чисел у ряді - " + percent_of_even + "%" + "\nПроцент непарних чисел у ряді - " + (100 - percent_of_even) + "%");
    }

    public void func_fibonacci (int amount)
    {
        int [] fibonacci_array = new int [amount];
        if(end % 2 == 1)
        {
            fibonacci_array[0] = end;
            fibonacci_array[1] = end - 1;
        }
        else
        {
            fibonacci_array[0] = end - 1;
            fibonacci_array[1] = end;
        }
        System.out.print("Ряд Фібоначчі: " + fibonacci_array[0] + ", " + fibonacci_array[1] + ", ");
        for(int i = 2; i < amount; i++)
        {
            fibonacci_array[i] = fibonacci_array[i-1] + fibonacci_array[i-2];
            System.out.print(fibonacci_array[i] + ", ");
        }
        statistic_of_num(fibonacci_array,amount);
    }

}