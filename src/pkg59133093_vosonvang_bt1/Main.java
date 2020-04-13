/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg59133093_vosonvang_bt1;

import java.util.Scanner;

/**
 *
 * @author Dalaryizmi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tao giao vien chu nhiem
        GiaoVien gvch = new GiaoVien();
        gvch.setHoTen("Huynh Tuan Anh");
        gvch.setTuoi(45);
        gvch.setDiaChi("Nha Trang - Khanh Hoa");
        gvch.setSdt("0123456789");
        gvch.setMonDay("Design Pattern");
        gvch.setToBoMon("Lap Trinh Nang Cao");

        // tao lop hoc voi giao vien chu nhiem
        LopHoc lopHoc = new LopHoc(gvch);

        // them danh sach hoc hinh vao lop
        // tao hoc sinh bang set values
        HocSinh hs1 = new HocSinh();
        hs1.setHoTen("Vo Son Vang");
        hs1.setTuoi(21);
        hs1.setDiaChi("TP Ha Tinh");
        hs1.setSdt("0888186566");
        hs1.setLop("LTCC");
        hs1.setNangKhieu("Ca Hat");
        // them hs vao lop
        lopHoc.themHocSinh(hs1);
        HocSinh hs2 = new HocSinh("Nguyen Dinh Thuan", 18, "Tam Ky - Quang Nam", "0966105347", "59CNTT2", "danh");
        // them hs vao lop
        lopHoc.themHocSinh(hs2);

        Scanner input = new Scanner(System.in);
        // tao them hoc sinh bang input user
        HocSinh hs3 = new HocSinh();
        System.out.println("Nhap thong tin hoc sinh: ");
        System.out.print("ten hoc sinh: ");
        hs3.setHoTen(input.nextLine());
        System.out.print("tuoi: ");
        hs3.setTuoi(input.nextInt());
        input.nextLine();
        System.out.print("dia chi: ");
        hs3.setDiaChi(input.nextLine());
        System.out.print("so dien thoai: ");
        hs3.setSdt(input.nextLine());
        System.out.print("lop: ");
        hs3.setLop(input.nextLine());
        System.out.print("nang khieu: ");
        hs3.setNangKhieu(input.nextLine());
        // them hs vao lop
        lopHoc.themHocSinh(hs3);

        // them giao vien giang day vao lop hoc
        // tao giao vien bang set value
        GiaoVien gv1 = new GiaoVien();
        gv1.setHoTen("Nguyen Giao Mot");
        gv1.setTuoi(30);
        gv1.setSdt("023164794");
        gv1.setDiaChi("Nha Trang - Khanh Hoa");
        gv1.setMonDay("Lap Trinh Sin So");
        gv1.setToBoMon("Lap trinh Super");
        // them giao vien giang day vao lop hoc
        lopHoc.themGVGD(gv1);

        // tao them giao vien giang day bang cach khoi tao
        GiaoVien gv2 = new GiaoVien("Bui Chi Thanh", 40, "Nha Trang - Khanh Hoa", "0123456789", "Lap Trinh Ung Dung Web", "Lap Trinh Cao ");
        // them giao vien giang day vao lop hoc
        lopHoc.themGVGD(gv2);

        // tao them giao vien giang day bang input user
        GiaoVien gv3 = new GiaoVien();
        System.out.println("\nnhap thong tin giao vien giang day: ");
        System.out.print("ten giao vien giang day: ");
        gv3.setHoTen(input.nextLine());
        System.out.print("tuoi: ");
        gv3.setTuoi(input.nextInt());
        input.nextLine();
        System.out.print("dia chi: ");
        gv3.setDiaChi(input.nextLine());
        System.out.print("so dien thoai: ");
        gv3.setSdt(input.nextLine());
        System.out.print("mon day: ");
        gv3.setMonDay(input.nextLine());
        System.out.print("to bo mon: ");
        gv3.setToBoMon(input.nextLine());
        // them hs vao lop
        lopHoc.themGVGD(gv3);

        // in danh sach hos sinh trong lop
        lopHoc.inDSHS();

        // in danh sach giao vien giang day
        lopHoc.inDSGVGD();

//        // xoa sinh vien co ten x khoi lop hoc
//        lopHoc.xoaHS("Nguyen Sinh Hai");
//
//        // xoa giao vien co ten x khoi lop hoc
//        lopHoc.xoaGVGD("Nguyen Giao Mot");
//
//        // in danh sach hos sinh trong lop
//        lopHoc.inDSHS();
//
//        // in danh sach giao vien giang day
//        lopHoc.inDSGVGD();
    }
    
}
