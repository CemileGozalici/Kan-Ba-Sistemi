
package proxy;

import entity.Bagisci;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class DoktorErisim extends DBConnection implements BagisciBilgileri {

    private Connection db;

    @Override
    public List<Bagisci> getBagiscilist() throws IllegalAccessException {
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
    
}
