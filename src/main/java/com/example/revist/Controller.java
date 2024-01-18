package com.example.revist;

import javafx.scene.control.TableView;

import java.io.*;

public class Controller {
    public TableView NBATV;
    public TableView OlympiaTV;

    
public void initialize() throws Exception {
    NBA.readData();
    Olympia.readData();

    for(Sports sports : Sports.getSports()) {
        System.out.println(sports);
        NBATV.getItems().add(sports);
        OlympiaTV.getItems().add(sports);
    }

    //void saveData() throws Exception {
        //File fileForData = new File("Angelos");
        //FileOutputStream outputStream = new FileOutputStream(fileForData);
        //ObjectOutputStream objOutputStream= new ObjectOutputStream(outputStream);
        //objOutputStream.writeObject(AnimeTierlist.getItems().size());
        //for (AnimeTier eachData : AnimeTierlist.getItems()) {
            //objOutputStream.writeObject(eachData);
        }
        //objOutputStream.flush();
    //}
    //void restoreData() throws Exception {
        //File fileForData = new File("Angelos");
        //FileInputStream inputStream = new FileInputStream(fileForData);
        //ObjectInputStream objInputStream = new ObjectInputStream(inputStream);
        //Integer numOfSavedObjects = (Integer)objInputStream.readObject();
        //for (int i = 0; i < numOfSavedObjects; i = i + 1) {
            //AnimeTier eachData = (AnimeTier) objInputStream.readObject();
            //AnimeTierlist.getItems().add(eachData);
        }
        //inputStream.close();
    //}
//}
    //}
