public class GiangVien {
    private Integer namSinh;
    private String HoTen;

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }



    public GiangVien(int namSinh, String HoTen) {
        this.namSinh = namSinh;
        this.HoTen = HoTen;
    }
}
