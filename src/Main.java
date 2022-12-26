public class Main {
    public static void main(String[] args) {
        // Задача 1;
        System.out.println("Задача 1");
        int sugar = 1000;
        System.out.println("Значение переменной sugar с типом int равно "  + sugar);
        byte apples  = 100;
        System.out.println("Значение переменной apples с типом byte равно "  + apples);
        short box = 300;
        System.out.println("Значение переменной box с типом short равно "  + box);
        long lemon = 6000L;
        System.out.println("Значение переменной lemon с типом long равно "  + lemon);
        float milk = 32.6f;
        System.out.println("Значение переменной milk с типом float равно "  + milk);
        double weight = 690;
        System.out.println("Значение переменной weight с типом double равно "  + weight);

        // Задача 2;
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        // Задача 3;
        System.out.println("Задача 3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        short paper = 480;
        System.out.println("На каждого ученика рассчитано " + (paper/ (class1 + class2 + class3))+ " листов бумаги");

        // Задача 4;
        System.out.println("Задача 4");
        short bottles = 16;
        float time16B = 2f;
        float powerForOneBottle = time16B/bottles;
        System.out.println("За 20 минут машина произвела " + (20/powerForOneBottle ) + " штук бутылок");
        System.out.println("За 1 сутки  машина произвела " + (24*60/powerForOneBottle ) + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + (24*3*60/powerForOneBottle ) + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + (24*30*60/powerForOneBottle ) + " штук бутылок");

        // Задача 5;
        System.out.println("Задача 5");
        short totalTins = 120;
        short tinsForOneClass = 6;
        int totalClasses = totalTins/tinsForOneClass;
        int whiteForOneClasses = 2;
        int browneForOneClasses = 4;
        System.out.println ("В школе, где " + ( totalClasses  ) + " классов, нужно " + ( totalClasses  * whiteForOneClasses ) +
                " банок белой краски и " + ( totalClasses  * browneForOneClasses ) + " банок коричневой краски");

        // Задача 6;
        System.out.println("Задача 6");
        short bananas = 5*80;
        short milkWeight = 2*105;
        short iceCream = 2*100;
        short eggs = 4*70;
        float weightGr = bananas + milkWeight + iceCream + eggs;
        int grPerKg = 1000;
        float weightKg = weightGr/grPerKg;
        System.out.println (weightGr);
        System.out.println (weightKg);

        // Задача 7;
        System.out.println("Задача 7");
        short diet1LoseOneDay = 250;
        short diet2LoseOneDay = 500;
        int dietMiddleLoseOneDay = ((diet1LoseOneDay + diet2LoseOneDay)/ 2);
        short totalLoseKg = 7;
        int loseGrPerKg = totalLoseKg * grPerKg;
        int dayForDiet1 = loseGrPerKg / diet1LoseOneDay;
        int dayForDiet2 = loseGrPerKg / diet2LoseOneDay;
        int dayForMiddle = loseGrPerKg / dietMiddleLoseOneDay;
        System.out.println ( dayForDiet1 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм и "
                + dayForDiet2 + " если каждый день будет худеть на 500 грамм");
        System.out.println ( dayForMiddle + " дней может потребоваться в среднем, чтобы добиться результата похудения ");


        // Задача 8;
        System.out.println("Задача 8");
        int mashaMonthSalary = 67760;
        int denisMonthSalary = 83690;
        int kristiMonthSalary = 76230;
        float rise = 0.1f;
        float mashaMonthSalaryNew = mashaMonthSalary * rise + mashaMonthSalary;
        float denisMonthSalaryNew = denisMonthSalary * rise + denisMonthSalary;
        float kristiMonthSalaryNew = kristiMonthSalary * rise + kristiMonthSalary;
        float mashaDifferenceYearSalary = ((mashaMonthSalaryNew - mashaMonthSalary) * 12);
        float denisDifferenceYearSalary = (( denisMonthSalaryNew - denisMonthSalary) * 12);
        float kristiDifferenceYearSalary = ((kristiMonthSalaryNew - kristiMonthSalary) * 12);
        System.out.println ("Маша теперь получает " + mashaMonthSalaryNew + " рублей. " +
                " Годовой доход вырос на " + mashaDifferenceYearSalary + " рублей");
        System.out.println ("Денис теперь получает " + denisMonthSalaryNew + " рублей. " +
                " Годовой доход вырос на " + denisDifferenceYearSalary + " рублей");
        System.out.println ("Кристина теперь получает " + kristiMonthSalaryNew + " рублей. " +
                " Годовой доход вырос на " + kristiDifferenceYearSalary + " рублей");




    }
}