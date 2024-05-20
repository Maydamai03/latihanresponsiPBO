/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import DAOdata.datahewanDAO;
import DAOimplement.dataimplement;
import model.*;
import view.*;


/**
 *
 * @author ASUS
 */
public class datahewancontroller {
    frameDataHewan frame;
    dataimplement impldatahewan;
    List<dataHewan> dp;
    
    public datahewancontroller(frameDataHewan frame){
        this.frame = frame;
        impldatahewan = new datahewanDAO();
        dp = impldatahewan.getAll();
        
    }
    public void isitabel(){
        dp = impldatahewan.getAll();
        modeltabeldatahewan mp = new modeltabeldatahewan(dp);
        frame.getTabelDataHewan().setModel(mp);
    }
    
    public void insert(){
    dataHewan dp = new dataHewan();
    //int id = Double.parseInt(frame.getJTxt().getText());
    //dp.setAlur(alur);
    dp.setNama(frame.getJTxtNamaHewan().getText());
    dp.setKelas(frame.getJTxtKelas().getText());
    dp.setMakanan(frame.getJTxtMakanan().getText());
    
    
    impldatahewan.insert(dp);
}
    public void update(){
    dataHewan dp = new dataHewan();
    //int id = Double.parseInt(frame.getJTxt().getText());
    //dp.setAlur(alur);
    dp.setNama(frame.getJTxtNamaHewan().getText());
    dp.setKelas(frame.getJTxtKelas().getText());
    dp.setMakanan(frame.getJTxtMakanan().getText());
    dp.setId(Integer.parseInt(frame.getJTxtID().getText()));
    impldatahewan.update(dp);
}
    public void delete() {
    int id = Integer.parseInt(frame.getJTxtID().getText());
    impldatahewan.delete(id);
    isitabel();
}
}