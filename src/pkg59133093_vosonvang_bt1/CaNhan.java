/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg59133093_vosonvang_bt1;

/**
 *
 * @author Dalaryizmi
 */
public abstract class CaNhan{
    public String hoten;
    public int tuoi;
    public String diachi;
    public String sdt;
    
    //constructor
    public CaNhan(String hoten, int tuoi, String diachi, String sdt){
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.sdt = sdt;
    }
    public CaNhan(){
      this.hoten = "";
      this.tuoi = 0;
      this.diachi = "";
      this.sdt = "";
    }
    //getter setter
    public void setHoTen(String hoten){ 
        this.hoten = hoten; 
    }
    public String getHoTen(){
        return this.hoten;
    }
    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }
    public int getTuoi()
    {
        return this.tuoi;
    }
    public void setDiaChi(String diachi){ 
        this.diachi = diachi; 
    }
    public String getDiaChi() {
        return this.diachi;
    }
    public void setSdt(String sdt){
        this.sdt = sdt;
    }
    public String getSdt(){
        return this.sdt;
    }
    //abstract methods
    public abstract String hienThiTT();
}
