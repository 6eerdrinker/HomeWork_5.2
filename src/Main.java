public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Домашнее задание - 1. Задание 1");
        {int salary = 65635;
            int total = 0;
            int i = 0;
            while (total < 2_459_000) {
                total = total + total/100;
                total = total + salary;
                i++;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");

            }}
        System.out.println();
        System.out.println("Домашнее задание - 1. Задание 2");
        {int i = 1;
            while (i <= 10)
            {System.out.print(i + " "); i++;
            }
        }
        System.out.println();
        int i = 10;
        for (; i >= 1; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Домашнее задание - 1. Задание 3");
        double population = 12_000_000;
        double birthRate = (double) 17/1000;
        double deathRate = (double) 8/1000;
        int year = 0;
        while ( year < 10 ) {
            population = population - (population * deathRate) + (population * birthRate);
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + Math.round(population) );}

        System.out.println();
        System.out.println("Домашнее задание - 2. Задание 1");
        {int downPayment = 15_000;
            int total = 0;
            int month = 0;
            while (total < 12_000_000) {
                total = total + (total / 100) * 7;
                total = total + downPayment;
                month++;
                System.out.println("Месяц " + month + ", сумма накопления " + total + " рублей.");
            }}

        System.out.println();
        System.out.println("Домашнее задание - 2. Задание 2");
        {int downPayment = 15_000;
            int total = 0;
            for (int month = 1; total < 12_000_000; month++) {
                total = total + (total / 100) * 7;
                total = total + downPayment;
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + ", сумма накопления " + total + " рублей.");
                }}
        }
        System.out.println();
        System.out.println("Домашнее задание - 2. Задание 3");
        {int  downPayment = 15_000;
            int total = 0;
            int period = 12 * 9;
            int month = 1;
            for (; month <= period; month++){
                total = total + (total / 100) * 7;
                total = total + downPayment;
                if (month % 6 == 0 ) {
                    System.out.println("Месяц " + month + ", сумма накопления " + total + " рублей.");}
            }}

        System.out.println();
        System.out.println("Домашнее задание - 2. Задание 4");
        int friday = 3; //Пятница у нас каждые 7 дней, мы должны понять для каждого дня, прошло ли 7 дней с пятницы
        int day = 1;    // должно быть условие if friday % 7 == число каким была первая пятница
        while (day <= 31) {day++;
            if (day % 7 == 3)
                System.out.println("Сегодня пятница, " + day + " - е число. Необходимо подготовить отчет." );
        }

        System.out.println();
        System.out.println("Домашнее задание - 3. Задание 1");
        int zeroYear = 0;
        int pastYear = 2022 - 200;
        int futureYear = 2022 + 100;
        for (int a = zeroYear; a <= futureYear; a+=79){
            if (a > pastYear && a < futureYear)
                System.out.println(a);
        }
        System.out.println();
        System.out.println("Домашнее задание - 3. Задание 2");
        int a = 2;
        for (int o = 1; o <= 10; o++){
            System.out.println( a + "*" + o + "=" + (a * o));}
    }
}
