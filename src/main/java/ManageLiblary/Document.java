/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManageLiblary;

/**
 *
 * @author chienkoi
 */
public class Document {
    protected String idd,name;
    protected int number;

    public Document() {
    }

    public Document(String idd, String name, int number) {
        this.idd = idd;
        this.name = name;
        this.number = number;
    }

    public String getIdd() {
        return idd;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setIdd(String idd) {
        this.idd = idd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    
    
}
