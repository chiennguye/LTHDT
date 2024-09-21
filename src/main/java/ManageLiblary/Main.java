/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManageLiblary;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chienkoi
 */
public class Main {
    public static void main(String[] args) {
         
    Scanner sc=new Scanner(System.in);
    managelibrary Managelibrary=new managelibrary();
    while(true){
            System.out.println("----Application manage Library----");
            System.out.println("Enter 1: To Add new document");
            System.out.println("Enter 2: To Search document by type");
            System.out.println("Enter 3: To show infore document ");
            System.out.println("Enter 4: To delete document by idd");
            System.out.println("Enter 5: To exit program");
            System.out.println("------------------------------------");
            System.out.println("Please chose a function: " );
            String line=sc.nextLine();
            switch (line) {
            case "1":{
                 System.out.println("------------------------------------");                
                 System.out.println("Enter a: To insert book");
                 System.out.println("Enter b: To insert magazine");
                 System.out.println("Enter c: To insert newpaper");            
                 System.out.println("------------------------------------");
                 System.out.println("Please chose a function: " );
                 String type=sc.nextLine();
                 switch (type) {
                    case "a":{
                        System.out.println("---Insert information for Book---");
                        System.out.print("Insert name author: ");
                        String nameauthor=sc.nextLine();
                        System.out.print("Insert page number: ");
                        int pagenb=sc.nextInt();
                        System.out.print("Insert idd : ");
                        sc.nextLine();                        
                        String id=sc.nextLine();
                        System.out.print("Insert name : ");
                        String name=sc.nextLine();
                        System.out.print("Insert number: ");
                        int number=sc.nextInt();
                        Document book=new Book(nameauthor,pagenb,id,name,number);
                        Managelibrary.addDocument(book);
                        System.out.println(book.toString());
                        sc.nextLine();
                        break;                       
                    }
                    case "b":{
                        System.out.println("---Insert information for newspaper---");
                        System.out.print("Insert name dayrelease: ");
                        String dayrelease=sc.nextLine();
                        System.out.print("Insert idd : ");
                        String id=sc.nextLine();                        
                        System.out.print("Insert name : ");
                        String name=sc.nextLine();
                        System.out.print("Insert number: ");
                        int number=sc.nextInt();
                        Document newspp=new newpaper(dayrelease,id,name,number);
                        Managelibrary.addDocument(newspp);
                        System.out.println(newspp.toString());
                        sc.nextLine();
                        break;                       
                    }
                    case "c":{
                        System.out.println("---Insert information for magazine---");
                        System.out.print("Insert issue: ");
                        int issue=sc.nextInt();                        
                        System.out.print("Insert name monthrelease: ");
                        sc.nextLine();                        
                        String monthrelease=sc.nextLine();
                        System.out.print("Insert idd : ");
                        String id=sc.nextLine();                        
                        System.out.print("Insert name : ");
                        String name=sc.nextLine();
                        System.out.print("Insert number: ");
                        int number=sc.nextInt();
                        Document magazine=new magazine(issue,monthrelease,id,name,number);
                        Managelibrary.addDocument(magazine);
                        System.out.println(magazine.toString());
                        sc.nextLine();
                        break;                       
                    }                    
                    default:
                        break;
                }
                
                break;
            }
                case "2": {
                    System.out.println("Enter a to search book");
                    System.out.println("Enter b to search newspaper");
                    System.out.println("Enter a to search journal");
                    String choise = sc.nextLine();
                    switch (choise) {
                        case "a": {
                            Managelibrary.searchdocumentbyBook();
                            break;
                        }
                        case "b": {
                            Managelibrary.searchdocumentbynewpp();
                            break;
                        }
                        case "c":
                            Managelibrary.searchdocumentbymanazine();
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "3": {
                    Managelibrary.showinfordocument();
                    break;
                }
                case "4": {
                    System.out.print("Enter id to remove: ");
                    String idd = sc.nextLine();
                    System.out.println(Managelibrary.deleteDocument(idd)? "success":"fail");
                }
                break;
                case "5": {
                    return;
                }                
            default:
                throw new AssertionError();
        }
            
}        
    }

    
}
