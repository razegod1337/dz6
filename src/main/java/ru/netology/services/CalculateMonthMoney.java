package ru.netology.services;

public class CalculateMonthMoney {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int count = 0;
        for (int month = 1; month < 13; month++) {
            if (money >= threshold) {
                count++;
                money = ((money - expenses) / 3);
                System.out.println("Месяц " + month + " Денег  " + money + " Буду отдыхать " + "Заработал +" + income + ", потратил -" + expenses);
            } else {
                money = money + income - expenses;
                System.out.println("Месяц " + month + " Денег " + money + " Придётся работать " + "Заработал +" + income + ", потратил -" + expenses);

            }
        }
        return count;
    }
}
