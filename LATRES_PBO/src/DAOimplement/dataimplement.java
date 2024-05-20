/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOimplement;
import java.util.List;
import model.*;
/**
 *
 * @author ASUS
 */
public interface dataimplement {
    public void insert(dataHewan p);
    public void update(dataHewan p);
    public void delete(Integer id);
    public List<dataHewan> getAll();
}
