package com.example.revist;


import javafx.scene.control.TableView;

import java.io.File;
import java.util.Scanner;

public class NBA extends Sports{
    private int Rank;
    private String Name;
    private String Team;
    private long Salary;

    public NBA(String name, int rank, String team, long salary) {
        super(name, rank);
        Rank = rank;
        this.Name = name;
        Team = team;
        Salary = salary;
    }

    public int getRank() {
        return Rank;
    }

    public void setRank(int rank) {
        this.Rank = rank;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = Team;
    }

    public long getSalary() {
        return Salary;
    }

    public void setSalary(long salary) {
        Salary = salary;
    }

    public String toString(){
        return (getRank() + " " + getName() + " " + getTeam() + " " + getSalary());
    }
    public static void readData(TableView tv) throws Exception {
        File dataFile = new File("src/main/java/com/example/revist/playerSalary Data");
        Scanner dataScanner = new Scanner(dataFile);
        dataScanner.useDelimiter("\t|\n");
        while (dataScanner.hasNext()) {
            int Rank = dataScanner.nextInt();
            String Name = dataScanner.next();
            String Team = dataScanner.next();
            Long Salary = dataScanner.nextLong();
            NBA teamData = new NBA (Name, Rank, Team, Salary);
            if (tv != null) {
                tv.getItems().add(teamData);
            } else {
                System.out.println(teamData);
            }
        }
    }
}