/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptrinhhuongdt;

/**
 *
 * @author chienkoi
 */
public class NhanVien extends CanBo{
    private String job;

    public NhanVien() {
    }

    public NhanVien(String job, String name, byte age, String gender, String adress) {
        super(name, age, gender, adress);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "NhanVien{" + 
                " job=" + job + 
                " name= " +name+
                " age= " +age+
                " gender= " +gender+
                " adress= " +adress+
                '}';
    }
    
    
    
}
