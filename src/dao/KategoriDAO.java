package dao;

import entity.Kategori;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class KategoriDAO extends DBConnection {

    private Connection db;

    public List<Kategori> getKategorilist() {
        List<Kategori> kategoriList = new ArrayList<>();
        try {

            Statement st = this.getDb().createStatement();
            String query = "select * from kangrubları";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                kategoriList.add(new Kategori(rs.getInt("id"), rs.getString("grup"), rs.getInt("stok_id")));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return kategoriList;

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
        List<Kategori> list = getKategorilist();
        for (Kategori c : list) {
            System.out.println(c);
        }
    }

}
