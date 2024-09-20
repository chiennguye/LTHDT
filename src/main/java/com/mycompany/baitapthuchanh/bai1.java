/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapthuchanh;

import java.util.Scanner;

/**
 *
 * @author chienkoi
 */
public class bai1 {
    public static void main(String[] args) {
        System.out.println("----Giai Phuong Trinh Bac Mot----");
        Scanner s=new Scanner(System.in);
        System.out.print("Nhap so a: ");
        int a=s.nextInt();
        System.out.print("Nhap so b: ");
        int b=s.nextInt(); 
        if(a==0&&b==0) System.out.println("Phuong trinh co vo so nghiem ");
        else if(a==0&&b!=0) System.out.println("Phuong trinh da cho vo nghiem ");
        else System.out.println(" Phuong trinh da cho co nghiem la: "+((float)-b/a));
        
    }
    
}
