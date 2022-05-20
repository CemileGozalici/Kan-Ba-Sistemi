/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Doktor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

/**
 *
 * @author user
 */
public class DoktorDAO extends DBConnection {

    private Connection db;

    public List<Doktor> getDoktorlist() {
        List<Doktor> doktorList = new ArrayList<>();
        try {

            Statement st = this.getDb().createStatement();
            String query = "select * from doktor";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                doktorList.add(new Doktor(rs.getInt("id"), rs.getString("ad_soyad"), rs.getString("hastane")));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return doktorList;

    }

    public Connection getDb() {
        if (this.db == null) {
            this.db = this.connect();
        }
        return db;
    }

    public void setDb(Connection db) {
        this.db = db;
    }

    public void ListeYazdir() {
        List<Doktor> list1 =getDoktorlist();
        for (Doktor c : list1) {
            System.out.println(c);
        }
    }

}
