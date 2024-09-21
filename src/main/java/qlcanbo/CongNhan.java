/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlcanbo;

/**
 *
 * @author chienkoi
 */
public class CongNhan extends CanBo{
    private byte level;

    public CongNhan() {
    }

    public CongNhan(byte level, String name, byte age, String gender, String adress) {
        super(name, age, gender, adress);
        this.level = level;
    }

    public byte getLevel() {
        return level;
    }

    public void setLevel(byte level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "CongNhan{" + 
                " level= " + level + 
                " name= " +name+
                " age= " +age+
                " gender= " +gender+
                " adress= " +adress+                
                '}';
    }
}
