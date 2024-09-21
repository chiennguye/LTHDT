/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlcanbo;

/**
 *
 * @author chienkoi
 */
public class KySu extends CanBo{
    private String major;

    public KySu() {
    }


    public KySu(String major, String name, byte age, String gender, String adress) {
        super(name, age, gender, adress);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "KySu{" + 
                "major=" + major + 
                " name= " +name+
                " age= " +age+
                " gender= " +gender+
                " adress= " +adress+                
                '}';
    } 
}
