package ru.maxvagan;

public class Main {

    public static void main(String[] args) {
	    byte totalAmountOfCustomers = 100;
        byte amountOfContractedCus = 41;
        float percentOfContracted = 0;
        int amountOfUncontracted = 0;
//        percentOfContracted = amountOfContractedCus / totalAmountOfCustomers;
        amountOfUncontracted = amountOfContractedCus % totalAmountOfCustomers;
        System.out.println("Всего заказчиков: " + totalAmountOfCustomers);
        System.out.println("Заказчиков с контрактами: " + amountOfContractedCus);
        System.out.println("Процент контрактов: " + amountOfUncontracted + " %");
    }
}
