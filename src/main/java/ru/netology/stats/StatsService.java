package ru.netology.stats;

public class StatsService {
    public long allSales(long[] sales) {   //сумма всех продаж
        long allSales = 0;
        for (long sale : sales) {
            allSales = sale + allSales;

        }
        return allSales;

    }

    public long average(long[] sales) {   //средняя сумма продаж в месяц
        long allSales = 0;
        for (long sale : sales) {
            allSales = sale + allSales;
        }
        long averageSale = allSales / 12;

        return averageSale;
    }

    public int monthMaxSales(int[] sales) {   // номер месяца, в котором был пик продаж
        int monthMax = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }
            return monthMax + 1;
        }

    public int monthMinSales(int[] sales) {   // номер месяца, в котором был минимум продаж
        int monthMin = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    public long belowAverageSales (long[] sales) { //месяцы, где продажи ниже среднего
        long monthBelowAverage = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                monthBelowAverage++;
            }
        }
        return monthBelowAverage;
        }
    public long aboveAverageSales (long[] sales) { //месяцы, где продажи выше среднего
        long monthAboveAverage = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                monthAboveAverage++;
            }
        }
        return monthAboveAverage;
    }

}


