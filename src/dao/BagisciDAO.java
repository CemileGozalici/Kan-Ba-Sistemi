package dao;

import entity.Bagisci;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class BagisciDAO extends DBConnection {

    private Connection db;

    public void createBagisci(Bagisci c) {
        try {
            Statement st = this.getDb().createStatement();
            String query = "insert into bagisci(tc,ad_soyad,kangrup_id,randevutarihi,doktor_id,telefon) values ('" + c.getTc() + "','" + c.getAdSoyad() + "','" + c.getKangrubu() + "','" + c.getTarih() + "','" + c.getDoktor() + "','" + c.getTelefon() + "')";
            int r = st.executeUpdate(query);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }

    public void delete(Bagisci c) {
        try {
            Statement st = this.getDb().createStatement();
            String query = "delete from bagisci where tc=" + c.getTc();
            st.executeUpdate(query);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }

    public void update(Bagisci c) {
        try {
            Statement st = this.getDb().createStatement();
            String query = "update stok set adet=adet-1 where id=(select stok_id from kangrubları where id=(select kangrup_id from bagisci where tc='" + c.getTc() + "'))";
            st.executeUpdate(query);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }

    public List<Bagisci> getBagiscilist() {
        List<Bagisci> bagisciList = new ArrayList<>();
        try {

            Statement st = this.getDb().createStatement();
            String query = "select * from bagisci";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                bagisciList.add(new Bagisci(rs.getInt("id"), rs.getInt("tc"), rs.getString("ad_soyad"), rs.getInt("kangrup_id"), rs.getString("randevutarihi"), rs.getInt("doktor_id"), rs.getString("telefon")));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return bagisciList;

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
        List<Bagisci> list2 = getBagiscilist();
        for (Bagisci c : list2) {
            System.out.println(c);
        }
    }
}
