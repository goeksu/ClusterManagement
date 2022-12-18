/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bilgisayaryonetim;

import java.time.Instant;

/**
 *
 * @author gks
 */
public class bilgisayar {
    private int id;
    private int ram;
    private int storage;
    private Boolean online;
    private Boolean state;
    private long ontime;
    
    
    
    
    
    
    public int getId(){
        return id;
    }
    public void setId(int x){
        id = x;
    }
    public int getRam(){
        return ram;
    }
    public void setRam(int x){
        ram = x;
    }
    public int getStorage(){
        return storage;
    }
    public void setStorage(int x){
        storage = x;
    }
    public long getOntime(){
        return ontime;
    }
    public void setontime(){
        long unixTime = Instant.now().getEpochSecond();
        ontime = unixTime;
    }
    public Boolean getState(){
        return state;
    }
    public void setStage(Boolean x){
        state =x;
    }
    public Boolean getOnline(){
        return online;
    }
    public void setOnline(Boolean x){
        online =x;
    }
    
}
