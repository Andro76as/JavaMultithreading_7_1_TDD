package ru.netology;

public class CreditCalculator {
    public static void main(String[] args) {
        int sum = 2000000;
        double rate = 11.8;
        int month = 60;

        CreditCalculator calculator = new CreditCalculator();

        System.out.println("Ежемесячный платеж " + calculator.sumPerMonth(sum, rate, month));
        System.out.println("Общая сумма за весь срок " + calculator.fullSumReturn(sum, rate, month));
        System.out.println("Переплата за весь срок " + calculator.overPaySum(sum, rate, month));

    }

    public int sumPerMonth(int sum, double rate, int month) {
        double monthRate = (rate / 12) / 100;
        double annuityRate = monthRate*(Math.pow(1+monthRate, month))/((Math.pow(1+monthRate, month))-1);
        return (int) (sum*annuityRate);
    }

    public int fullSumReturn(int sum, double rate, int month) {
        double monthRate = (rate / 12) / 100;
        double annuityRate = monthRate*(Math.pow(1+monthRate, month))/((Math.pow(1+monthRate, month))-1);
        return (int) (sum*annuityRate*month);
    }

    public int overPaySum(int sum, double rate, int month) {
        double monthRate = (rate / 12) / 100;
        double annuityRate = monthRate*(Math.pow(1+monthRate, month))/((Math.pow(1+monthRate, month))-1);
        return (int) ((sum*annuityRate)*month - sum);
    }
}