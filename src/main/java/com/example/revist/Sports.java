package com.example.revist;


import java.io.Serializable;
import java.util.ArrayList;

public class Sports implements Serializable {

    private String Name;

    private int rank;


 public Sports(String Name, int rank) {
    this.Name= Name;
    this.rank= rank;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }


}