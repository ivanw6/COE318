/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab4;

/**
 *
 * @author Ivan Wang 501086429
 */
public class Account {

    private String name;
    private double bal;
    private int num;

    public Account(String name, int number, double initialBalance) {
        this.name = name;
        this.num = number;
        this.bal = initialBalance;
    }

    String getName() {
        return name;
    }

    double getBalance() {
        return bal;
    }

    int getNumber() {
        return num;
    }

    boolean deposit(double amount) {
        if (amount > 0) {
            this.bal += amount;
            return true;
        }
        return false;
    }

    boolean withdraw(double amount) {
        if (amount > 0) {
            if (amount <= this.bal) {
                this.bal -= amount;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", "
                + String.format("$%.2f", getBalance()) + ")";
    }
}
