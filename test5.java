//#EXPERIMENT -1 (INPUT OUTPUT IN JAVA)
//#Q5: Write a program to print first five values which are divisible by 2, 3, and 5.


class test5 {
    public static void main(String[] args) {
        int count = 0;
        int num = 1;

        System.out.println("First 5 values divisible by 2, 3, and 5:");

        while (count < 5) {
            if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
