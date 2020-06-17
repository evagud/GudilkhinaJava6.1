package ru.netology.stats;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
//    {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}
    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.calculateSum(sales);

        assertEquals(expected,actual);
    }

    @Test
    void averageSelling() {
        StatsService service = new StatsService();
        long expected = 15;
        long actual = service.averageSelling(sales);
        assertEquals(expected,actual);
    }

    @Test
    void monthMaxSales() {
        StatsService service = new StatsService();
        long expected = 6;
        long actual = service.monthMaxSales(sales);
        assertEquals(expected,actual);
    }

    @Test
    void monthMinSales() {
        StatsService service = new StatsService();
        long expected = 9;
        long actual = service.monthMinSales(sales);
        assertEquals(expected,actual);
    }


//
    @Test
    void quantityMonthMinSales() {
        StatsService service = new StatsService();
        long expected = 5 ;
        long actual = service.quantityMonthMinSales(sales);
        assertEquals(expected,actual);
    }

    @Test
    void quantityMonthMaxSales(){
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.quantityMonthMaxSales(sales);
        assertEquals(expected,actual);
    }
}