package ru.netology.stats;

public class StatsService {

    public int calcSum(int[] sales) { //сумма продаж за год
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double calcAverageSum(int[] sales) { //средняя сумма продаж в мес
        return calcSum(sales) / sales.length;

    }

    public int calcFindMax(int[] sales) { // последний месяц с пиком продаж
        int findMax = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[findMax] <= sales[i]) {
                findMax = i;
            }
        }
        findMax +=1;
        return findMax;
    }

    public int calcFindMin(int[] sales) { //последний месяц с минимумом продаж
        int findMin = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[findMin] >= sales[i]) {
                findMin = i;
            }
        }
        findMin += 1;
        return findMin;
    }

    public int calcUnAverage(int[] sales) { //количество мес, где продажи были меньше средней
        int count = 0;
        double averageSum = calcAverageSum(sales);
        for (int sale : sales) {
            if (sale < averageSum) {
                count = count + 1;
            }
        }
        return count;
    }

    public int calcUpAverage(int[] sales) { //количество мес, где продажи были больше средней
        int count = 0;
        double averageSum = calcAverageSum(sales);
        for (int sale : sales) {
            if (sale > averageSum) {
                count = count + 1;
            }
        }
        return count;
    }

}