package com.example.revist;

import java.io.File;
import java.util.Scanner;

public class Olympia extends Sports {

    private int Total;
    private int Judging;

    private int Finals;

    private long Prize;


    // Jonathan wuz here


    public Olympia(String name, int rank, int total, int judging, int finals, long prize) {
        super(name, rank);
        Total = total;
        Judging = judging;
        Finals = finals;
        Prize = prize;
    }

    public int getTotal() {
        return Total;
    }

    public int getJudging() {
        return Judging;
    }

    public void setJudging(int judging) {
        this.Judging = judging;
    }

    public void setTotal(int total) {
        this.Total = total;


    }

    public int getFinals() {
        return Finals;
    }

    public void setFinals(int finals) {
        this.Finals = finals;
    }

    public long getPrize() {
        return Prize;
    }

    public void setPrize(long prize) {
        Prize = prize;
    }

    public String toString() {
        return ( "Rank: " + getRank() + " " + "Prize: " + getPrize() + " " + "Name: " + getName() + " " + "Judging: " + getJudging() + " " + "Finals: " + getFinals() + " " + "Total: " + getTotal());
    }

    public static void readData() throws Exception {
        File dataFile = new File("src/main/java/com/example/revist/Olympia Data");
        Scanner dataScanner = new Scanner(dataFile);
        dataScanner.useDelimiter("\n");

        while (dataScanner.hasNext()) {

            //1
            //400000
            //Hadi Choopan
            //7
            //6
            //13
            int Rank = Integer.parseInt(dataScanner.next());
            long Prize = dataScanner.nextLong();
            String Name = dataScanner.next();
            int Judging = Integer.parseInt(dataScanner.next());
            int Finals = Integer.parseInt(dataScanner.next());
            int Total = Integer.parseInt(dataScanner.next());
            Olympia athlete = new Olympia(Name,Rank,Total, Judging, Finals, Prize  );
            System.out.println(athlete);
        }
    }
}



