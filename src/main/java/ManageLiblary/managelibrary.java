/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManageLiblary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author chienkoi
 */
public class managelibrary {
    private List<Document>  document;
    
    public managelibrary(){
         this.document=new ArrayList<>();
    }
    public void addDocument(Document document){
        this.document.add(document);
    }
    public boolean deleteDocument(String id) {
        Document doc = this.document.stream()
                .filter(document -> document.getIdd().equals(id))
                .findFirst().orElse(null);
        if (doc == null) {
            return false;
        }
        this.document.remove(doc);
        return true;
    }
    public void showinfordocument(){
        this.document.forEach(document->System.out.println(document.toString()));
    }
    public void searchdocumentbyBook(){
        this.document.stream().filter(doc->doc instanceof Book).forEach(doc->System.out.println(doc.toString()));       
    }
    public void searchdocumentbymanazine(){
        this.document.stream().filter(doc->doc instanceof magazine).forEach(doc->System.out.println(doc.toString()));       
    }    
    public void searchdocumentbynewpp(){
        this.document.stream().filter(doc->doc instanceof newpaper).forEach(doc->System.out.println(doc.toString()));       
    }
    
}
