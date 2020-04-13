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
public class HocSinh extends CaNhan {
    //attributes
    private String lop;
    private String nangkhieu;
    
    //constructor
    public HocSinh(String hoten, int tuoi, String diachi, String sdt, String lop, String nangkhieu){
        super(hoten, tuoi, diachi, sdt);
        this.lop = lop;
        this.nangkhieu = nangkhieu;
    }
    public HocSinh(){
      super();
      this.lop = "";
      this.nangkhieu = "";
    }
    
    //setter getter
    public void setLop(String lop){ 
        this.lop = lop; 
    }
    public String getLop(){ 
        return this.lop; 
    }
    public void setNangKhieu(String nangkhieu){ 
        this.nangkhieu = nangkhieu; 
    }
    public String getNangKhieu(){ 
        return this.nangkhieu;
    }
    
    // methods
    @Override
    public String hienThiTT() {
        String thongTin = "";
        thongTin = "ho ten: " + this.hoten + ", tuoi: " + this.tuoi + ", dia chi: " + this.diachi
        + ", sdt: " + this.sdt + ", lop: " + this.lop + ", nang khieu: " + this.nangkhieu;

        //      System.out.println(thongTin);
        return thongTin;
    }
}
