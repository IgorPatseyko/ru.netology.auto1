package tests;

import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void shouldCalculateTotalSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedTotal = 180;
        long actualTotal = service.calculateTotalSales(sales);
        assertEquals(expectedTotal, actualTotal);
    }

    @Test
    void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedAverage = 15.0;
        double actualAverage = service.calculateAverageSales(sales);
        assertEquals(expectedAverage, actualAverage, 0.001);
    }

    @Test
    void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 6;
        int actualMaxMonth = service.findMaxSalesMonth(sales);
        assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int actualMinMonth = service.findMinSalesMonth(sales);
        assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    void shouldCalculateBelowAverageMonths() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelowAverage = 5;
        int actualBelowAverage = service.calculateBelowAverageMonths(sales);
        assertEquals(expectedBelowAverage, actualBelowAverage);
    }

    @Test
    void shouldCalculateAboveAverageMonths() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAboveAverage = 5;
        int actualAboveAverage = service.calculateAboveAverageMonths(sales);
        assertEquals(expectedAboveAverage, actualAboveAverage);
    }
}