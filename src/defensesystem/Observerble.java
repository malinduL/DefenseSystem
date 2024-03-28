/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defensesystem;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Observerble {
    private Observer [] ob=new Observer[0];
    
    private static Observerble instace=null;
   
    private String mg;
    private String name;
    private int value;
    private int sliderValue;
    private int sliderFuelValue;
    private String  depName;
    
    public void addComp(Observer comp){
        extendArray();
        ob[ob.length-1]=comp;
    }
    
    private void extendArray(){
        Observer [] temp=new Observer[ob.length+1];
        for (int i = 0; i < ob.length; i++){
            System.out.println(i);
            temp[i]=ob[i];
        }
        ob=temp;
    }
    public void setMassage(String mg, String name){
        this.mg=mg;
        this.name=name;
        //System.out.println(name+":"+mg);
        notifyMassage();
    }
    public void setAreaClear(int value){
        this.value=value;
        //System.out.println("Controll Room > "+value);
        notifyAreaClearMassage();
    }
    
    public void setJsliderValue(int sliderValue){
        this.sliderValue=sliderValue;
        //System.out.println("Control room"+sliderValue);
        notifyJsliderValue();
    }
    
    private void notifyJsliderValue(){
        for (int i = 0; i < ob.length; i++) {
            ob[i].updateJsliderValue(sliderValue);
        }
    }
    
    public void setJsliderFuelValue(int sliderFuelValue,String depName){
        this.sliderFuelValue=sliderFuelValue;
        this.depName=depName;
        System.out.println("Control room"+sliderFuelValue);
        notifyJsliderFuelValue();
    }
    private void notifyJsliderFuelValue(){
        for (int i = 0; i < ob.length; i++) {
            ob[i].updateJsliderFuelValue(sliderFuelValue,depName);
        }
    }
    
    private void notifyAreaClearMassage(){
        for (int i = 0; i <ob.length ; i++) {
            ob[i].updateAreaClear(value);
        }
    }
    
    private void notifyMassage(){
        for (int i = 0; i < ob.length; i++) {
           ob[i].update(mg, name);
        }
    }
    
    public static Observerble getinstace(){
        if(instace==null){
            instace=new Observerble();
        }
        return instace;
    }
}