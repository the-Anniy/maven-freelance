package ru.netology.services;

public class FreelanceService {
    public int calculate(int income, int expenses, int threshold) {
        int initialBalance = 0;
        int restMonths = 0;
        for (int i = 0; i < 12; i++) {
            if (initialBalance >= threshold) {
                initialBalance -= expenses;
                initialBalance /= 3;
                restMonths++;
            } else {
                initialBalance += income;
                initialBalance -= expenses;
            }
        }
        return restMonths;
    }
}

