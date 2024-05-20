/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOdata;

import DAOimplement.dataimplement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.connector;
import model.*;

/**
 *
 * @author ACER
 */
public class datahewanDAO implements dataimplement {

    Connection connection;

    final String select = "SELECT * FROM datahewan";
    final String insert = "INSERT INTO `datahewan`( `nama`, `kelas`, `makanan`) VALUES (?,?,?)";
    final String update = "UPDATE datahewan SET nama=?, kelas=?, makanan=? WHERE id=?";

    public datahewanDAO() {
        connection = connector.connection();
    }

    @Override
    public void insert(dataHewan p) {
        PreparedStatement statement = null;
        try {
            // Menghitung nilai berdasarkan rumus yang diberikan
            //double nilai = (p.getAlur() + p.getPenokohan() + p.getAkting()) / 3.0;
            // Menyiapkan pernyataan SQL dengan parameter
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getNama());
            statement.setString(2, p.getKelas());
            statement.setString(3, p.getMakanan());
            //statement.setDouble(4, p.getAkting());
            statement.executeUpdate();
            // Mendapatkan kunci yang dihasilkan (jika ada)
            ResultSet rs = statement.getGeneratedKeys();
//            while (rs.next()) {
//                p.set(rs.getString(1));
//            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }

    @Override
    public void update(dataHewan p) {
        PreparedStatement statement = null;
        try {
            // Menghitung nilai berdasarkan rumus yang diberikan
            //double nilai = (p.getAlur() + p.getPenokohan() + p.getAkting()) / 3.0;
            // Menyiapkan pernyataan SQL dengan parameter
            statement = connection.prepareStatement(update);
            statement.setString(1, p.getNama());
            statement.setString(2, p.getKelas());
            statement.setString(3, p.getMakanan());
            statement.setInt(4, p.getId());
            //statement.setDouble(4, p.getAkting());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) {
            PreparedStatement statement = null;
    try {
        // Menyiapkan pernyataan SQL untuk menghapus data berdasarkan judul
        String deleteQuery = "DELETE FROM datahewan WHERE id=?";
        statement = connection.prepareStatement(deleteQuery);
        
        // Mengatur judul sebagai parameter pada pernyataan SQL
        statement.setInt(1, id);
        
        // Menjalankan pernyataan SQL untuk menghapus data
        statement.executeUpdate();
    } catch (SQLException ex) {
        ex.printStackTrace();
    } 
    }

    @Override
    public List<dataHewan> getAll() {
        List<dataHewan> dp = null;
        try {
            dp = new ArrayList<dataHewan>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                dataHewan hewan = new dataHewan();
                hewan.setId(rs.getInt("id"));
                hewan.setNama(rs.getString("nama"));
                hewan.setKelas(rs.getString("kelas"));
                hewan.setMakanan(rs.getString("makanan"));
                dp.add(hewan);
            }
        } catch (SQLException ex) {
            Logger.getLogger(datahewanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dp;
    }
}
