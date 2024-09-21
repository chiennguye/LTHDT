/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManageLiblary;

/**
 *
 * @author chienkoi
 */
public class newpaper extends Document{
    private String dayrelease;

    public newpaper() {
    }

    public newpaper(String dayrelease) {
        this.dayrelease = dayrelease;
    }

    public newpaper(String dayrelease, String idd, String name, int number) {
        super(idd, name, number);
        this.dayrelease = dayrelease;
    }

    public String getDayrelease() {
        return dayrelease;
    }

    public void setDayrelease(String dayrelease) {
        this.dayrelease = dayrelease;
    }

    @Override
    public String toString() {
        return "newpaper{" + 
                "dayrelease=" + dayrelease + 
                ", idd=" + idd + 
                ", name=" + name + 
                ", number=" + number +                
                '}';
    }
    
    
    
    
}
