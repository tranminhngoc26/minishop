package sonat.minhngoc.entity;

public class GiamDoc extends NhanVien {
  String chucvu;

  public GiamDoc(String chucvu, String tennhanvien, int tuoi) {
    super(tennhanvien,tuoi);
    this.chucvu = chucvu;
  }

  public String getChucvu() {
    return chucvu;
  }

  public void setChucvu(String chucvu) {
    this.chucvu = chucvu;
  }
}
