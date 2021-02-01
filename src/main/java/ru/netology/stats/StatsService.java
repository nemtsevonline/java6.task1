package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long findMean(long[] sales) {
        return calculateSum(sales) / sales.length;
    }
    public long highestSales(long[] sales) {
            long resultMonth = 0;
            long sale = sales[0];
            for (int i = 0; i < sales.length; i++) {
                if (sale <= sales[i]) {
                    sale = sales[i];
                    resultMonth = i;
                }
            }
            return resultMonth + 1;
    }
    public long lowestSales(long[] sales) {
        long resultMonth = 0;
        long sale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sale >= sales[i]) {
                sale = sales[i];
                resultMonth = i;
            }
        }
        return resultMonth + 1;
    }
    public long belowAverageSalesMonths(long[] sales) {
        long averageSum = findMean(sales);
        int resultMonth = 0;
        for (long month : sales) {
            if (month < averageSum) {
                resultMonth++;
            }
        }

        return resultMonth;
}
    public long aboveAverageSalesMonths(long[] sales) {
        long averageSum = findMean(sales);
        int resultMonth = 0;
        for (long month : sales) {
            if (month <= averageSum) {
                resultMonth++;
            }
        }

        return resultMonth;
}}






