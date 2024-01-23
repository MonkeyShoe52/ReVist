package com.example.revist;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.IntegerStringConverter;
import javafx.util.converter.LongStringConverter;

import java.io.*;

public class Controller {
    public TableView<NBA> NBATV;
    public TableColumn<NBA, Integer> Ranking;
    public TableColumn<NBA, String> Name;
    public TableColumn<NBA, String> Team;
    public TableColumn<NBA, Long> Salary;
    public TableView<Olympia> OlympiaTV;
    public TableColumn<Olympia, Integer> Total;
    public TableColumn<Olympia, Integer> Judging;
    public TableColumn<Olympia, Integer> Finals;
    public TableColumn<Olympia, Long> Prize;

    public void initialize() throws Exception {

        if (true) {
            this.restoreData();
        } else {
            NBA.readData(NBATV);
            Olympia.readData(OlympiaTV);
        }

        NBATV.setEditable(true);
        Ranking.setCellValueFactory(new PropertyValueFactory<NBA, Integer>("Rank"));
        Ranking.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        Ranking.setOnEditCommit(event -> {
            NBA cellData = event.getRowValue();
            cellData.setRank(event.getNewValue());
        });
        Name.setCellValueFactory(new PropertyValueFactory<NBA, String>("Name"));
        Name.setCellFactory(TextFieldTableCell.forTableColumn());
        Name.setOnEditCommit(event -> {
            NBA cellData = event.getRowValue();
            cellData.setName(event.getNewValue());
        });
        Team.setCellValueFactory(new PropertyValueFactory<NBA, String>("Team"));
        Team.setCellFactory(TextFieldTableCell.forTableColumn());
        Team.setOnEditCommit(event -> {
            NBA cellData = event.getRowValue();
            cellData.setTeam(event.getNewValue());
        });
        Salary.setCellValueFactory(new PropertyValueFactory<NBA, Long>("Salary"));
        Salary.setCellFactory(TextFieldTableCell.forTableColumn(new LongStringConverter()));
        Salary.setOnEditCommit(event -> {
            NBA cellData = event.getRowValue();
            cellData.setSalary(event.getNewValue());
        });

        OlympiaTV.setEditable(true);
        Total.setCellValueFactory(new PropertyValueFactory<Olympia, Integer>("Total"));
        Total.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        Total.setOnEditCommit(event -> {
            Olympia cellData = event.getRowValue();
            cellData.setTotal(event.getNewValue());
        });
        Judging.setCellValueFactory(new PropertyValueFactory<Olympia, Integer>("Judging"));
        Judging.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        Judging.setOnEditCommit(event -> {
            Olympia cellData = event.getRowValue();
            cellData.setJudging(event.getNewValue());
        });
        Finals.setCellValueFactory(new PropertyValueFactory<Olympia, Integer>("Finals"));
        Finals.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        Finals.setOnEditCommit(event -> {
            Olympia cellData = event.getRowValue();
            cellData.setFinals(event.getNewValue());
        });
        Prize.setCellValueFactory(new PropertyValueFactory<Olympia, Long>("Prize"));
        Prize.setCellFactory(TextFieldTableCell.forTableColumn(new LongStringConverter()));
        Prize.setOnEditCommit(event -> {
            Olympia cellData = event.getRowValue();
            cellData.setPrize(event.getNewValue());
        });
    }


    void saveData() throws Exception {
        File fileForData = new File("Angelos");
        FileOutputStream outputStream = new FileOutputStream(fileForData);
        ObjectOutputStream objOutputStream= new ObjectOutputStream(outputStream);
        objOutputStream.writeObject(NBATV.getItems().size());
        for (NBA eachData : NBATV.getItems()) {
            objOutputStream.writeObject(eachData);
        }
        objOutputStream.writeObject(OlympiaTV.getItems().size());
        for (Olympia eachData : OlympiaTV.getItems()) {
            objOutputStream.writeObject(eachData);
        }

        objOutputStream.flush();
    }
    void restoreData() throws Exception {
        File fileForData = new File("Angelos");
        FileInputStream inputStream = new FileInputStream(fileForData);
        ObjectInputStream objInputStream = new ObjectInputStream(inputStream);
        Integer numOfSavedNBAObjects = (Integer)objInputStream.readObject();
        for (int i = 0; i < numOfSavedNBAObjects; i = i + 1) {
            NBA eachData = (NBA) objInputStream.readObject();
            NBATV.getItems().add(eachData);
        }
        Integer numOfOlympiaSavedObjects = (Integer)objInputStream.readObject();
        for (int i = 0; i < numOfOlympiaSavedObjects; i = i + 1) {
            Olympia eachData = (Olympia) objInputStream.readObject();
            OlympiaTV.getItems().add(eachData);
        }
        inputStream.close();
    }
}

