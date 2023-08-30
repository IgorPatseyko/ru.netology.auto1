package ru.netology.Statistics;

public class StatisticsService {
    public long findMax(long[] incomes) {
        if (incomes.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        long currentMax = incomes[0];
        for (long income : incomes) {
            if (currentMax < income) {
                currentMax = income;
            }
        }
        return currentMax;
    }
}
