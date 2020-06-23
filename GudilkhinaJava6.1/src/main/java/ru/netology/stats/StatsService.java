package ru.netology.stats;

import java.util.stream.Stream;

public class StatsService<count> {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }

        return sum;
    }

    public long averageSelling(long[] sales) {
        long sum = calculateSum(sales);
        long aver = sum / 12;
        return aver;
    }

    public long monthMaxSales(long[] sales) {
        long currentMax = sales[0];
        int indexMax = 1;
        for (int i = 1; i < sales.length; i++) {
            long sale = sales[i];
            if (currentMax < sale) {
                currentMax = sale;
                indexMax = i+1;
            }
        }
        return indexMax;

    }

    public long monthMinSales(long[] sales) {
        long min = sales[0];
        int indexForMin = 1;
        for (int i = 1; i < sales.length; i++) {
            long sale = sales[i];
            if (min > sale) {
                min = sale;
                indexForMin = i+1;
            }
        }
        return indexForMin;
    }

    public long quantityMonthMinSales(long[] sales) {
        long aver = averageSelling(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            long sale = sales[i];
            if (aver > sale)
                count++;
        }
        return count;
        }

    public long quantityMonthMaxSales(long[] sales) {
        long aver = averageSelling(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            long sale = sales[i];
            if (aver < sale)
                count++;
        }
        return count;

    }
}





