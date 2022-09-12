public class Main {
    public static void main(String[] args) {

        var task1=1;
        int salary = 29000;
        int total =0;
        int months=0;
        while (total < 2_459_000) {
            total = total + salary;
            months = total/salary;
        }
        { System.out.println("За " + months + "месяцев "  + "сумма накоплений равна " + total);

            var task2=2;
            int number=0;
            while (number<10 ) {
                number = number+1;
                System.out.println(number);
            }
            {
                for ( int i =10; i>=1; i -- ){
                    System.out.println(i);
                }


                var task3=3;
                int population = 12_000_000;
                int birthRate = population/1000*17;
                System.out.println(birthRate);
                int mortality= population/1000*8;
                System.out.println(mortality);
                for (int i = 2022; i<=2032; i ++) {
                    population = population +birthRate- mortality;
                    System.out.println( " за " + i + " популяция" + population);}


                        var task4 = 4;
                        int salary1 = 15000;
                        int total1 = 0;
                        for ( int i1 = 0; total1 < 12_000_000; i1 ++) {
                            total1 = total1 + total1 /100 *7;
                            total1 = total1 + salary1;
                            {
                                System.out.println(" за " + i1 + " василий накопит" + total1);}


                                    var task5 = 5;
                                            int salary2 = 15000;
                                            int total2 = 0;
                                            for (int i2 = 0; total2 < 12_000_000; i2++) {
                                                total2 = total2 + total2 / 100 * 7;
                                                total2 = total2 + salary2;
                                                if (i2 % 6 == 0) {
                                                    System.out.println(" за " + i2 + " василий накопит" + total2);}


                                                    var task6 = 6;
                                                    int salary3 = 15000;
                                                    int total3 = 0;
                                                    for (int r = 0; r < 9*12; r++) {
                                                        total3 = total3 + total3 / 100 * 7;
                                                        total3 = total3 + salary3;
                                                        if (r % 6 == 0) {
                                                            System.out.println(" за " + r + " василий накопит" + total3);}


                                                    var task7 = 7;
                                                    int friday =2;
                                                    for (int n =7; n >7; n++) {
                                                        if (n % 7 == 2) {
                                                            System.out.println(friday);
                                                        }
                                                    }













                                                    }
                                                }


                                    }
                                }
                            }
            }



}