package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {


    @Test
    public void totalSales() {
        StatsService service = new StatsService();

        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = (int) service.totalSales(sale);
        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void saleMiddleMonth() {
        StatsService service = new StatsService();

        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double actual = (double) service.saleMiddleMonth(sale);
        double expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();

        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = (int) service.minSales(sale);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();

        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = (int) service.maxSales(sale);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthUnderMiddle() {
        StatsService service = new StatsService();

        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = (int) service.monthUnderMiddle(sale);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthOverMiddle() {
        StatsService service = new StatsService();

        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = (int) service.monthOverMiddle(sale);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }


}