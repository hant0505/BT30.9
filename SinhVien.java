public class SinhVien {
    private int namSinh;
    private String HoTen;
    private String MSSV;


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

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public SinhVien(int namSinh, String HoTen, String MSSV) {
        this.namSinh = namSinh;
        this.HoTen = HoTen;
        this.MSSV = MSSV;
    }
}
