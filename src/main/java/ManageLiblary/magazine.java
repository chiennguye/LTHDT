/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManageLiblary;

/**
 *
 * @author chienkoi
 */
public class magazine extends Document{
    private int issue;
    private String monthrelease;

    public magazine() {
    }

    public magazine(int issue, String monthrelease) {
        this.issue = issue;
        this.monthrelease = monthrelease;
    }

    public magazine(int issue, String monthrelease, String idd, String name, int number) {
        super(idd, name, number);
        this.issue = issue;
        this.monthrelease = monthrelease;
    }

    public int getIssue() {
        return issue;
    }

    public String getMonthrelease() {
        return monthrelease;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }

    public void setMonthrelease(String monthrelease) {
        this.monthrelease = monthrelease;
    }

    @Override
    public String toString() {
        return "magazine{" + 
                "issue=" + issue + 
                ", monthrelease=" + monthrelease + 
                ", idd=" + idd + 
                ", name=" + name + 
                ", number=" + number +
                
                '}';
    }
    
    
}
