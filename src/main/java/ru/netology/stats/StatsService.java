package ru.netology.stats;


public class StatsService {

    public long totalSales(int[] sale) {
        long sum = 0;
        for (long buy : sale) {    // вычисляем сумму всех продаж
            sum = sum + buy;
        }
        return sum;

    }

    public double saleMiddleMonth(int[] sale) {
        double sum = totalSales(sale);
        double middleMonth = sum / 12;   // вычисляем среднюю сумму продаж в месяц

        return middleMonth;

    }


    public int minSales(int[] sale) {
        int minMonth = 0;

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] <= sale[minMonth]) {     // номер месяца, в котором был минимум продаж
                minMonth = i;
            }
        }

        return minMonth + 1;
    }


    public int maxSales(int[] sale) {
        int maxMonth = 0;

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] >= sale[maxMonth]) {     // номер месяца, в котором был пик продаж
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }


    public int monthUnderMiddle(int[] sale) {
        int middleSum = (int) saleMiddleMonth(sale);
        int numberUnderMiddle = 0;

        for (int i = 0; i < sale.length; i++) {   // количество месяцев, в которых продажи были ниже среднего
            if (sale[i] < middleSum) {
                numberUnderMiddle = numberUnderMiddle + 1;
            }
        }
        return numberUnderMiddle;
    }


    public int monthOverMiddle(int[] sale) {
        int middleSum = (int) saleMiddleMonth(sale);
        int numberOverMiddle = 0;

        for (int i = 0; i < sale.length; i++) {     // количество месяцев, в которых продажи были выше среднего
            if (sale[i] > middleSum) {
                numberOverMiddle = numberOverMiddle + 1;
            }
        }
        return numberOverMiddle;
    }


}
