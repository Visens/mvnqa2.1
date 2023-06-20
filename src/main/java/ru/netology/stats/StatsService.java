package ru.netology.stats;
public class StatsService {
    public int minSales(int[] sales) {
        //int[] arr = {74, 54, 23, 13, 78, 53, 82, 41, 38, 16, 24, 50};
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++)
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        return minMonth + 1;
    }
    public int maxSales(int[] sales) {
        //int[] arr = {74, 54, 23, 13, 78, 53, 82, 41, 38, 16, 24, 50};
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++)
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        return maxMonth + 1;
    }
    public int findSalesSum(int [] salesSum) {
        int sum = 0;
        for (int i = 0; i < salesSum.length; ++i)
            sum += salesSum[i];
        return sum;
    }
    public int findAverageSale(int [] averageSale) {
/*        int sum = 0;*/
        int average = findSalesSum(averageSale) / 12;
/*        for (int i = 0; i < averageSale.length; ++i)
            sum += averageSale[i++];*/
        return average;
    }
    public int underAverageSale(int [] underAverage) {
        int underAverageSale = 0;
        for (int i : underAverage) {
            if (i < findAverageSale(underAverage)) {
                underAverageSale += 1;
            }
        }
        return underAverageSale;
    }
    public int overAverageSale(int [] overAverage) {
        int overAverageSale = 0;
        for (int i : overAverage) {
            if (i > findAverageSale(overAverage)) {
                overAverageSale += 1;
            }
        }
        return overAverageSale;
    }
}
