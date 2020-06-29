public class BanHang{
    private String MSHH,DVT;
    private int Soluong;
    private double Dongia;
    BanHang(){

    }
    BanHang(String MSHH,String DVT,int Soluong,double Dongia){
        this.MSHH = MSHH;
        this.DVT = DVT;
        this.Soluong = Soluong;
        this.Dongia = Dongia;
    }

    public String getMSHH() {
        return MSHH;
    }

    public void setMSHH(String mSHH) {
        MSHH = mSHH;
    }

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String dVT) {
        DVT = dVT;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int soluong) {
        Soluong = soluong;
    }

    public double getDongia() {
        return Dongia;
    }

    public void setDongia(double dongia) {
        Dongia = dongia;
    }
	@Override
	public String toString() {
		return "BanHang [MSHH=" + MSHH + ", So luong=" + Soluong+" "+ DVT + ",  Don gia=" + Dongia + "]";
	}
}