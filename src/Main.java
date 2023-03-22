public class Main {
    public static void main(String[] args) {
        double radius = 5.60;
        double pi = Math.PI;
        System.out.println(radius*radius*pi);

        int A = 15;
        int B = 3;
        if ( (A > 10) && (A % 3 == 0) && (A < 10000) && (A % B == 0)) {
            System.out.println(A + " is divisible by " + B);
        }

        if (A>B) {
            System.out.println(A+B);
        } else if (A<B) {
            System.out.println(B-A);
        } else {
            System.out.println(A*B);
        }

        int x = 5;
        int result = ((x + x + 6) / 2 ) - x;
        if(result % 2 == 0) {
        System.out.println("The result of ((x + x + 6) / 2 ) - x is divisible by 2");
        } else {
            System.out.println("The result of ((x + x + 6) / 2 ) - x is not divisible by 2");
        }

        A = 500;
        B = 51;
        int C = 11;
        int D = 13;
        int sum = A + B + C + D;
        if ((A > 0 && B > 0) || (C > 0 && D > 0)) {
            System.out.println("All numbers are grater than 0 and their sum is: " + sum);
        }
        if ((sum > 100) && (sum % 2 == 0)) {
            System.out.println("The sum of numbers are divisible by 2: " + sum / 2);
        } else if ((sum - 1) % 2 == 0) {
            System.out.println("The sum of numbers minus 1 is divisible by 2: " + (sum - 1) / 2);
        } else {
            System.out.println("The number is still not divisible by 2");
        }

        int cashRegister = 100;
        int bill = 20;
        int payment = 30;
        int change = payment - bill;
        int banknoteTwenty = (int) (change / 20);
        change = change % 20;
        int banknoteTen = (int) (change / 10);
        change = change % 10;
        int coinTwo = (int) (change / 2);
        change = change % 2;
        int coinOne = (int) (change / 1);
        change = change % 1;

        if (cashRegister > 100 && bill > 0) {
            System.out.println("You have too much money");
        } else if (bill == 0) {
            System.out.println("You didn't buy anything, did you?");
        } else if (bill < 0) {
            System.out.println("Did you maybe break something?");
        } else {
            System.out.println("Number of banknote 20 to be returned: " + banknoteTwenty + "x");
            System.out.println("Number of banknote 10 to be returned: " + banknoteTen + "x");
            System.out.println("Number of coin 2 to be returned: " + coinTwo + "x");
            System.out.println("Number of coin 1 to be returned: " + coinOne + "x");
        }
    }
}