/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptrinhhuongdt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author chienkoi
 */
public class Quanlycanbo {
    private List<CanBo> canbo;

    public Quanlycanbo() {
        this.canbo=new ArrayList<>();
    }
    public void addcanbo(CanBo canBo){
        this.canbo.add(canBo);
    }
    public List<CanBo> searchcanbobyname(String name){
        return this.canbo.stream().filter(o->o.getName().contains(name)).collect(Collectors.toList());
    }
    public  void showinforcanbo(){
        this.canbo.forEach(o->System.out.println(o.toString()));
    }
 
    
    
}
