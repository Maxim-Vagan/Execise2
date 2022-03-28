package ru.maxvagan;

import static java.lang.Math.round;

public class Main {

    public static void main(String[] args) {
	    float totalAmountOfCustomers = 100;
        float amountOfContractedCus = 41;
        float percentOfContracted;
        double amountOfUncontracted;
        percentOfContracted = amountOfContractedCus / totalAmountOfCustomers;
        amountOfUncontracted = round((1.0 - percentOfContracted)*100);
        System.out.println("Всего заказчиков: " + round(totalAmountOfCustomers));
        System.out.println("Заказчиков с контрактами: " + round(amountOfContractedCus));
        System.out.println("Процент без контрактов: " + amountOfUncontracted + " %");
        System.out.println("Процент контрактов: " + (percentOfContracted*100) + " %");
    }
}
