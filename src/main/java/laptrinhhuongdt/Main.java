/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptrinhhuongdt;

import java.util.Scanner;

/**
 *
 * @author chienkoi
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Quanlycanbo quanlycanbo=new Quanlycanbo();
        while(true){
            System.out.println("Application Manage Officer");
            System.out.println("Enter 1: To Add new officer ");
            System.out.println("Enter 2: To Search officer by name ");
            System.out.println("Enter 3: To show officer  ");
            System.out.println("Enter 4: To exits application ");
            String  line=sc.nextLine();
            switch (line) {
                case "1":{
                    System.out.println("Enter a: To insert Enginner");
                    System.out.println("Enter b: To insert Worker");
                    System.out.println("Enter c: To insert Staff");
                   String type =sc.nextLine();
                    switch (type) {
                        case "a":{
                            System.out.print("Enter name: ");
                            String name=sc.nextLine();
                            System.out.print("Enter age: ");
                            byte age=sc.nextByte();     
                            System.out.print("Enter gender: ");
                            sc.nextLine();
                            String gender=sc.nextLine();
                            System.out.print("Enter address: ");
                            String adress=sc.nextLine(); 
                            System.out.print("Enter major: ");
                            String major =sc.nextLine();      
                            CanBo kysu=new KySu(major,name,age,gender,adress);
                            quanlycanbo.addcanbo(kysu);
                            System.out.println(kysu.toString());
                            break;                            
                        }

                        case "b":{
                            System.out.print("Enter name: ");
                            String name=sc.nextLine();
                            System.out.print("Enter age: ");
                            byte age=sc.nextByte();     
                            System.out.print("Enter gender: ");
                            String gender=sc.nextLine();
                            System.out.print("Enter address: ");
                            String adress=sc.nextLine(); 
                            System.out.print("Enter level: ");
                            byte level =sc.nextByte();      
                            CanBo congnhan=new CongNhan(level,name,age,gender,adress);
                            quanlycanbo.addcanbo(congnhan);
                            System.out.println(congnhan.toString());
                            break;                            
                        }
                        case "c":{
                            System.out.print("Enter name: ");
                            String name=sc.nextLine();
                            System.out.print("Enter age: ");
                            byte age=sc.nextByte();     
                            System.out.print("Enter gender: ");
                            String gender=sc.nextLine();
                            System.out.print("Enter address: ");
                            String adress=sc.nextLine(); 
                            System.out.print("Enter job: ");
                            String job =sc.nextLine();      
                            CanBo nhanvien=new NhanVien(job,name,age,gender,adress);
                            quanlycanbo.addcanbo(nhanvien);
                            System.out.println(nhanvien.toString());
                            break;                            
                        } 
                        default:
                            System.out.println("invalid");
                            break;
                    } 
                    break;   
                }
                case "2":{
                    System.out.println("Insert name to search: ");
                    String name =sc.nextLine();
                    quanlycanbo.searchcanbobyname(name).forEach(canbo->{System.out.println(canbo.toString());});
                    break;
                }
                case "3": {
                    quanlycanbo.showinforcanbo();
                    break;
                }
                case "4": {
                    return;
                }               
                    
                default:
                    System.out.println("Invalid");
                    continue;
            }

            
        }
    }
    
    
}
