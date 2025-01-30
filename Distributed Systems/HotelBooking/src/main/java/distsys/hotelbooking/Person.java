/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.hotelbooking;
// classes that will be passed as arguments to remote methods must implement Serializable.
// no additional  methods or fields are needed to implement it.
import java.io.Serializable;

/**
 *
 * @author guilhermesilveira
 */
public class Person implements Serializable{
    private static final long serialVersionUID = 1L;
    
    String personName;
    
    public void setName (String pName) {
        personName = pName;
    }
    
    public String getName() {
        return personName;
    }
}