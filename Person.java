public class Person {
        private int namSinh;
        private String HoTen;
        //private String MSSV;

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

    public Person(int namSinh, String HoTen) {
            this.namSinh = namSinh;
            this.HoTen = HoTen;
        }

}

