package ru.netology.services;
public class MonthBudget {
    public int calculate(int income, int expenses, int threshold) {
        int initialBalance = 0;
        int counter = 0;
        for (int i = 0; i < 12; i++) {
            if (initialBalance >= threshold) {
                initialBalance = initialBalance - expenses;
                initialBalance = initialBalance / 3;
                counter++;
            } else {
                initialBalance += income;
                initialBalance -= expenses;
            }

        }
    return counter;}
}