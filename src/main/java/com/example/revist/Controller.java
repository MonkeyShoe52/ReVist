package com.example.revist;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.IntegerStringConverter;

import java.io.*;

public class Controller {
    public TableView NBATV;
    public TableColumn Ranking;
    public TableColumn Name;

    public TableView OlympiaTV;
    public TableColumn Total;
    public TableColumn Judging;



    public void initialize() throws Exception {

    NBA.readData(NBATV);
    Olympia.readData(OlympiaTV);

        Olympia.setEditable(true);
        Ranking.setCellValueFactory(new PropertyValueFactory<NBA, Integer>("Rank"));
        Ranking.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        Ranking.setOnEditCommit(event -> {
            Olympia cellData = event.getRowValue();
            cellData.setRank(event.getNewValue());
        });
        Total.setCellValueFactory(new PropertyValueFactory<Olympia, Integer>("Total"));




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
