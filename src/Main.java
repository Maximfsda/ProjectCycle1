public class Main {
    public static void main(String[] args) {
        //HomeworkOne
        //task1
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        //task2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        //task3
        for (int i = 0; i < 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //task4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //HomeworkTwo
        //task1
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();
        //task2
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.printf(i + " ");
        }
        System.out.println();
        //task3
        System.out.printf("1 ");
        for (int i = 2; i <= 512; i = i * 2) {
            System.out.printf(i + " ");
            System.out.println();
        }

        //HomeworkThree
        //task1
        int depositAmount = 29000;
        int accrualAmount = 0;
        for (int i = 1; i <= 12; i++) {
            System.out.println("Месяц " + i + ",сумма накоплений равна " + accrualAmount + " рублей.");
            accrualAmount += depositAmount;
        }
        System.out.println();
        //task2
        System.out.println();
        double depositAmount1 = 29000;
        double accrualAmount1 = 0;

        for (int i = 1; i <= 12; i++) {
            accrualAmount1 = (depositAmount1+accrualAmount1)* 1.01;
            System.out.println("Месяц " + i + ",сумма накоплений равна " + accrualAmount1 + " рублей.");

        }
    }
}






