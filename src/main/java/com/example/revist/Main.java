package com.example.revist;

class Main {
    public static void main(String[] args) throws Exception{

        NBA.readData();
        Olympia.readData();

        for(Sports sports : Sports.getSports()) {
            System.out.println(sports);
        }
    }

}