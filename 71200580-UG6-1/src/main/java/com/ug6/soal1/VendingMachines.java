package com.ug6.soal1;

import java.util.ArrayList;

public class VendingMachines {
    private int code;
    private int capacity;
    private int usedCapacity;
    private ArrayList<Goods> goods;
    private ArrayList<Double> acceptenceBalance;
    private double consumerMoney;

    public VendingMachines(int code, int capacity, int usedCapacity, ArrayList<Goods> goods, ArrayList<Double> acceptenceBalance, double consumerMoney) {
        this.code = code;
        this.capacity = capacity;
        this.usedCapacity = usedCapacity;
        this.goods = goods;
        this.acceptenceBalance = acceptenceBalance;
        this.consumerMoney = consumerMoney;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getUsedCapacity() {
        return usedCapacity;
    }

    public void setUsedCapacity(int usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

    public ArrayList<Double> getGoods() {
        return goods;
    }

    public void setGoods(ArrayList<Double> goods) {
        this.goods = goods;
    }

    public ArrayList<Double> getAcceptenceBalance() {
        return acceptenceBalance;
    }

    public void setAcceptenceBalance(ArrayList<Double> acceptenceBalance) {
        this.acceptenceBalance = acceptenceBalance;
    }

    public double getConsumerMoney() {
        return consumerMoney;
    }

    public void setConsumerMoney(double consumerMoney) {
        this.consumerMoney = consumerMoney;
    }
}
