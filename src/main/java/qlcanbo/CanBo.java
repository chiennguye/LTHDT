/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlcanbo;

/**
 *
 * @author chienkoi
 */
public class CanBo {
    protected String name;
    protected byte age;
    protected String gender,adress;

    public CanBo() {
    }

    public CanBo(String name, byte age, String gender, String adress) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAdress() {
        return adress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    
}
