/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManageLiblary;

/**
 *
 * @author chienkoi
 */
public class Book extends Document{
    private String nameAuthor;
    private int pagenumber;

    public Book() {
    }

    public Book(String nameAuthor, int pagenumber) {
        this.nameAuthor = nameAuthor;
        this.pagenumber = pagenumber;
    }

    public Book(String nameAuthor, int pagenumber, String idd, String name, int number) {
        super(idd, name, number);
        this.nameAuthor = nameAuthor;
        this.pagenumber = pagenumber;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public int getPagenumber() {
        return pagenumber;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public void setPagenumber(int pagenumber) {
        this.pagenumber = pagenumber;
    }

    @Override
    public String toString() {
        return "Book{" + 
                "nameAuthor=" + nameAuthor + 
                ", pagenumber=" + pagenumber + 
                ", idd=" + idd + 
                ", name=" + name + 
                ", number=" + number + 
                
                '}';
    }
    
    
}
