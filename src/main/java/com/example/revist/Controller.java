package com.example.revist;

import javafx.scene.control.TableView;

public class Controller {
    public TableView NBATV;
    public TableView OlympiaTV;

    
public void initialize() throws Exception {
    NBA.readData();
    Olympia.readData();

    for(Sports sports : Sports.getSports()) {
        System.out.println(sports);
        NBATV.getItems().add(sports);
    }


}
    }
