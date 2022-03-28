package ru.maxvagan;

import static java.lang.Math.floor;
import static java.lang.Math.round;

public class Main {

    public static void main(String[] args) {
//	    Task1
        byte amountOfContractedCus = 41;
        short amountOfStuffInSubDepartment = 1000;
        int qtyOfMachines = 30654;
        long summarizeAmountOfBudget = 1000000L;
        float percentOfCustomers = 0.456f;
        double percentOfContractedCus = 37.8569;
//      Task2
        System.out.println("Task 2");
        float boxer1Weight = 78.2f;
        float boxer2Weight = 82.7f;
        float totalWeight = boxer1Weight + boxer2Weight;
        float diffOfBoxersWeight = boxer2Weight - boxer1Weight;
        System.out.println("Общий вес боксёров: " + totalWeight + " кг");
        System.out.println("Разница между боксёрами составляет: " + diffOfBoxersWeight + " кг");
//      Task3
        System.out.println("Task 3");
        byte amountBananas = 5; byte weightPerBanana = 80;
        short amountMilk = 200; float weightPerMilkGramms = 1.05f;
        byte amountIceCreamBricks = 2; byte weightPerICBrick = 100;
        byte amountOfRawEggs = 4; byte weightPerEgg = 70;
        float mealWeightGramms = amountBananas*weightPerBanana +
                amountMilk*weightPerMilkGramms +
                amountIceCreamBricks*weightPerICBrick +
                amountOfRawEggs*weightPerEgg;
        float mealWeightKilos = mealWeightGramms / 1000;
        System.out.println("Вес завтрака составил: " + mealWeightGramms + "в грамм");
        System.out.println("Что составляет " + mealWeightKilos + " кг");
//      Task 4
        System.out.println("Task 4");
        byte totalWeightLost = 7; //Кг
        short minCaloriesPerDay = 250; //грамм
        short maxCaloriesPerDay = 500; //грамм
        int minWeightLostPeriod = (totalWeightLost * 1000) / maxCaloriesPerDay;
        int maxWeightLostPeriod = (totalWeightLost * 1000) / minCaloriesPerDay;
        int avgWeightLost = (minWeightLostPeriod + maxWeightLostPeriod) / 2;
        System.out.println("Минимум дней для сброса веса: " + minWeightLostPeriod + " дней");
        System.out.println("Максимум дней для сброса веса: " + maxWeightLostPeriod + " дней");
        System.out.println("Среднее кол-во дней для сброса веса: " + avgWeightLost + " дней");
//      Task 5
        System.out.println("Task 5");
        long salaryOfMasha = 67760; double incrSalaryMasha = salaryOfMasha * 1.10;
        long salaryOfDenis = 83690; double incrSalaryDenis = salaryOfDenis * 1.10;
        long salaryOfChristina = 76230; double incrSalaryChristina = salaryOfChristina * 1.10;
        double yearSalaryProfitOfMasha = salaryOfMasha * 0.10 * 12;
        double yearSalaryProfitOfDenis = salaryOfDenis * 0.10 * 12;
        double yearSalaryProfitOfChristina = salaryOfChristina * 0.10 * 12;
        System.out.println("Зарплата Маши составляет: " + incrSalaryMasha + " руб. " +
                "За год её прибыль увеличилась на " + yearSalaryProfitOfMasha + " руб.");
        System.out.println("Зарплата Дениса составляет: " + floor(incrSalaryDenis) + " руб. " +
                "За год его прибыль увеличилась на " + yearSalaryProfitOfDenis + " руб.");
        System.out.println("Зарплата Кристины составляет: " + incrSalaryChristina + " руб. " +
                "За год её прибыль увеличилась на " + yearSalaryProfitOfChristina + " руб.");
    }
}
