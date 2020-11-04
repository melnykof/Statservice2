package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatserviceTest {
    Statservice service = new Statservice();
    double[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18, 5};

    @Test
    void shouldAverage() {
        double expected = 14.23076923076923;

        double actual = service.average(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSum() {
        double expected = 185;

        double actual = service.sum(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthWithMax(){
        double expected = 8;

        double actual = service.findMonthWithMax(purchases);

        assertEquals(expected, actual);
    }
    @Test
    void shouldMonthWithMin(){
        double expected = 13;

        double actual = service.findMonthWithMin(purchases);

        assertEquals(expected, actual);
    }
    @Test
    void shouldLessThenAverage(){
        double expected = 6;
        double actual = service.monthLessThenAverageCount(purchases);

        assertEquals(expected, actual);
    }
    @Test
    void shouldMoreThenAverage(){
        double expected = 7;

        double actual = service.monthMoreThenAverageCount(purchases);

        assertEquals(expected, actual);
    }


}

