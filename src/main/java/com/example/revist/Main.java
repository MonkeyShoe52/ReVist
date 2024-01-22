package com.example.revist;

class Main {
    public static void main(String[] args) throws Exception{

        NBA.readData(null);
        Olympia.readData(null);

        for(Sports sports : Sports.getSports()) {
            System.out.println(sports);
        }
    }
}