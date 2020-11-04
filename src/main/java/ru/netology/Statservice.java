package ru.netology;

public class Statservice {

    public double sum(double[] purchases) {
        double sum = 0;
        for (double purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public double average(double[] purchases) {
        double sum = sum(purchases);
        return sum / purchases.length;
    }
    public double findMonthWithMax(double[] purchases){
        double max = findMax(purchases);
        double numberOfMonth = 0;
        double numberOfMonthWithMax = 0;

        for (double purchase : purchases){
            numberOfMonth += 1;
            if (purchase == max) {
                numberOfMonthWithMax = numberOfMonth;
            }
        }
        return numberOfMonthWithMax;
    }

    public  double findMax(double[] purchases) {
        double max = purchases[0];

        for (double purchase : purchases) {
            if (purchase > max) {
                max = purchase;
            }
        }
        return  max;
    }
    public double findMonthWithMin(double[] purchases){
        double min = findMin(purchases);
        double numberOfMonth = 0;
        double numberOfMonthWithMin = 0;

        for (double purchase : purchases){
            numberOfMonth += 1;
            if (purchase == min) {
                numberOfMonthWithMin = numberOfMonth;
            }
        }
        return  numberOfMonthWithMin;
    }
    public double findMin(double[] purchases) {
        double min = purchases[0];

        for (double purchase : purchases) {
            if (purchase < min) {
                min = purchase;
            }
        }
        return min;
    }
    public double monthLessThenAverageCount(double[] purchases) {
        double average = average(purchases);
        double count = 0;
        for (double purchase : purchases) {
            if (purchase < average) {
                count++;
            }
        }
        return count;
    }
    public double monthMoreThenAverageCount(double[] purchases) {
        double average = average(purchases);
        double count = 0;
        for (double purchase : purchases) {
            if (purchase > average) {
                count++;
            }
        }
        return count;
    }
}

