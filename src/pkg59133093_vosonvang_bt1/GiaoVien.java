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
public class GiaoVien extends CaNhan {
    
    //attributes
    private String monday;
    private String tobomon;
    
    //constructor
    public GiaoVien(String hoten, int tuoi, String diachi, String sdt, String monday, String tobomon) {
      super(hoten, tuoi, diachi, sdt);
      this.monday = monday;
      this.tobomon = tobomon;
    }
    public GiaoVien() {
      super();
      this.monday = "";
      this.tobomon = "";
    }
    
    //setter getter
    public void setMonDay(String monday){ 
        this.monday = monday;
    }
    public String getMonDay(){
        return this.monday;
    }
    public void setToBoMon(String tobomon){ 
        this.tobomon = tobomon; 
    }
    public String getToBoMon(){
        return this.tobomon;
    }
    
    //methods
    public String hienThiTT(){
        String thongTin = "";
        thongTin = "ho ten: " + this.hoten + ", tuoi: " + this.tuoi + ", dia chi: " + this.diachi
        + ", sdt: " + this.sdt + ", Mon day: " + this.monday + ", to bo mon: " + this.tobomon;
  
        //System.out.println(thongTin);
        return thongTin;
    }
}
