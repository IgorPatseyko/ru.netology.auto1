package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxIfMaxNotFirst() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 14, 3, 8, 6, 11, 11, 12};
        long expected = 14;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxWithUpdatedCurrentMax() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {12, 5, 8, 4, 14, 3, 8, 6, 11, 11, 12};
        long expectedMax = 14;

        long actualMax = service.findMax(incomes);

        assertEquals(expectedMax, actualMax);
    }

    @Test
    void findMaxWithUpdatedCurrentMax2() {
        StatisticsService service = new StatisticsService();

        long[] incomes = {14};
        long expectedMax = 14;

        long actualMax = service.findMax(incomes);

        assertEquals(expectedMax, actualMax);
    }


}