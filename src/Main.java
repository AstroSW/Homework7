public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");
        int total = 0;
        int month = 1;
        while (total < 2459000) {
            total += 15000;
            System.out.println("Месяц "+ month +", сумма накоплений равна "+ total +" рублей");
            month ++;
        }
        System.out.println();

        // Задача 2
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print( i +"   ");
            i ++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print( i +"   ");
        }
        System.out.println();
        System.out.println();

        // Задача 3
        System.out.println("Задача 3");
        double population = 12000000;
        int birth = 17;
        int death = 8;
        for (i = 1; i <= 10; i ++) {
            double delta = population /1000 * (birth - death);
            population = population + delta;
            System.out.println("Год "+ i +", численность населения составляет "+ population);
        }
        System.out.println();

        // Задача 4
        System.out.println("Задача 4");
        double total1 = 15000;
        month = 1;
        while (total1 < 12000000) {
            total1 = total1 * 1.07;
            System.out.println("Месяц "+ month +", сумма накоплений равна "+ total1 +" рублей");
            month ++;
        }
        System.out.println();

        // Задача 5
        System.out.println("Задача 5");
        total1 = 15000;
        month = 1;
        while (total1 < 12000000) {
            total1 = total1 * 1.07;
            if (month % 6 == 0) {
                System.out.println("Месяц "+ month +", сумма накоплений равна "+ total1 +" рублей");
            }
            month ++;
        }
        System.out.println();

        // Задача 6
        System.out.println("Задача 6");
        total1 = 15000;
        for (month = 1; month <= 12 * 9; month ++) {
            total1 = total1 * 1.07;
            if (month % 6 == 0) {
                System.out.println("Месяц "+ month +", сумма накоплений равна "+ total1 +" рублей");
            }
        }
        System.out.println();

        // Задача 7
        System.out.println("Задача 7");
        int friday = 6;
        for (int day = friday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println();

        // Задача 8
        System.out.println("Задача 8");
        int year = 2025;
        int start = year - 200;
        int finish = year + 100;
        for (year = start; year <= finish; year ++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}