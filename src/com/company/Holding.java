package com.company;
import java.util.ArrayList;

public class Holding {
    private ArrayList<SMI> masCar = new ArrayList<SMI>();
    // метод для добавления машины в гараж
    public void addCar(SMI m) {
        masCar.add(m);
    }
    public Holding() {
    }

    public Boolean findCar(SMI m) {
        return masCar.contains(m);
    }

    public void Remove(int m) {
        masCar.remove(m);
    }

    public Holding(ArrayList<SMI> n) {
        // в гараж
        masCar = n;
    }

    public void printGarage() {
        System.out.println("В гараже: ");
        for (SMI a : masCar) {
            System.out.println("\t" + a.toString());
        }
    }


}
