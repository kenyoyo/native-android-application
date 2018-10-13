package com.example.android.coffeebreaktime;

public class Coffee {
    private String name;
    private String cost;
    private static double totalCost = 0.00;
    private static String bill = "";

    public Coffee(String n, String c) {
        name = n;
        cost = c;
    }

    public String getCoffeeName() {
        return name;
    }

    public static String getBill() {
        return bill;
    }

    public static double getCost() {
        return totalCost;
    }

    public String getCoffeeCost() {
        return cost;
    }

    public static void addCost(double c) {
        totalCost += c;
    }

    public static void addOrder(String s) {
        bill += s + "\n";
    }
}
