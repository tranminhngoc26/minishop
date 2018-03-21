package sonat.minhngoc.entity;

import java.util.List;

public class NhanVien {
   String tennhanvien;
   String diachi;
   int tuoi;
   GiamDoc doc;
//   List<String> list;
   List<GiamDoc> list;

  public List<GiamDoc> getList() {
    return list;
  }

  public void setList(List<GiamDoc> list) {
    this.list = list;
  }

  public NhanVien(){

   }
   public void getThongBao(){
     System.out.println("Day la thong bao tu nhan vien "+ " "+ tennhanvien+" "+ tuoi+ " "+ diachi);
   }

  public void setTennhanvien(String tennhanvien) {
    this.tennhanvien = tennhanvien;
  }

  public String getTennhanvien() {
    return tennhanvien;
  }

  public String getDiachi() {
    return diachi;
  }

  public void setDiachi(String diachi) {
    this.diachi = diachi;
  }

  public int getTuoi() {
    return tuoi;
  }

  public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
  }
//  public void Start(){
////    System.out.println("hello int");
////  }
////
////  public void Destroy(){
////    System.out.println("hello destroy");
////  }

  public  NhanVien createNhanVien(){
    NhanVien nv = new NhanVien();
    nv.setTennhanvien("Nguyen Minh Phuong");
    return nv;
  }

  public NhanVien(String tennhanvien, int tuoi){
    this.tennhanvien = tennhanvien;
    this.tuoi = tuoi;
  }

  public NhanVien(String tennhanvien, String diachi, int tuoi) {
    this.tennhanvien = tennhanvien;
    this.diachi = diachi;
    this.tuoi = tuoi;
  }

  public NhanVien(GiamDoc doc){
    this.doc = doc;
  }
}
