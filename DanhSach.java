public class DanhSach {
    private BanHang[] BH;
    DanhSach(){

    }
    DanhSach(int n) {
        BH = new BanHang[n];
        for(int i=0;i<n;i++){
            BH[i]=new BanHang();
        }
    }
    public BanHang getBH(int i){
        return BH[i];
    }
}