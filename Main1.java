import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            BanHang BH = new BanHang();
            DanhSach d = new DanhSach();
            ArrayList<BanHang> b = new ArrayList<BanHang>();
            int lc,n = 0;
            do{
                System.out.println("*****************************************");
                System.out.println("*       CHƯƠNG TRÌNH QUẢN LÝ BÁN HÀNG   *");
                System.out.println("*****************************************");
                System.out.println("*   1.Nhập danh sách bán hàng           *");
                System.out.println("*   2.In danh sách bán hàng             *");
                System.out.println("*   3.Tổng giá trị của cả danh sách     *");
                System.out.println("*   4.Tìm kiếm thông tin                *");
                System.out.println("*   5.Sắp xếp danh sách                 *");
                System.out.println("*   6.Thống kê trung bình               *");
                System.out.println("*   7.Thoát                             *");
                System.out.println("*****************************************");
                System.out.print("Nhập lựa chọn:");
                lc = sc.nextInt();
                while(lc<1||lc>7){
                    System.out.print("Nhập sai nhập lại:");
                    lc = sc.nextInt();
                }
                switch(lc){
                    case 1:{
                        //Nhập danh sách bán hàng
                        System.out.print("Nhập số lượng người mua:");
                        n = sc.nextInt();
                        d = new DanhSach(n);
                        for(int i=0;i<n;i++){
                            System.out.println("Nguời thứ "+(i+1)+":");
                            System.out.print("Nhập mã số hàng hoá:");
                            sc.nextLine();
                            d.getBH(i).setMSHH(sc.nextLine());
                            System.out.print("Nhập đơn vị tính:");
                            d.getBH(i).setDVT(sc.nextLine());
                            System.out.print("Nhập số lượng:");
                            d.getBH(i).setSoluong(sc.nextInt());
                            System.out.print("Nhập đơn giá:");
                            d.getBH(i).setDongia(sc.nextInt());
                        }  
                        break;
                    }
                case 2: {
                    //In danh sách bán hàng
                    if(n<1){
                        System.out.println("Chưa có dữ liệu đơn hàng, vui lòng nhập trước");
                    } else {
                        for(int i=0;i<n;i++){
                            System.out.println(d.getBH(i).toString());
                        }
                    }
                    break;
                }
                case 3:{
                    //Tính tổng giá trị của cả danh sách bán hàng
                    if(n<1){
                        System.out.println("Chưa có dữ liệu đơn hàng, vui lòng nhập trước");
                    } else{
                        double tong = 0;
                        for(int i=0;i<n;i++){
                            tong = tong + (d.getBH(i).getSoluong() * d.getBH(i).getDongia());
                        }
                        System.out.println("Tổng giá trị của cả danh sách bán hàng là:"+tong);
                    }
                    break;
                }
                case 4:{
                    //Tìm kiếm thông tin
                    if(n<1){
                        System.out.println("Chưa có dữ liệu đơn hàng, vui lòng nhập trước");
                    } else{
                        System.out.print("Nhập mã số hàng hoá cần tìm kiếm:");
                        sc.nextLine();
                        String tk = sc.nextLine();
                        boolean kt = false;
                        for(int i=0;i<n;i++){
                            if(tk.equals(d.getBH(i).getMSHH())){
                                System.out.println(d.getBH(i).toString());
                                kt = true;
                            }
                        }
                        if(kt==false){
                            System.out.println("Không có kết quả nào trùng với từ khoá đã nhập vào");
                        }
                    }
                    break;
                }
                case 5:{
                    //Sắp xếp danh sách bán hàng
                    if(n<1){
                        System.out.println("Chưa có dữ liệu đơn hàng, vui lòng nhập trước");
                    } else{
                        String temp1 = d.getBH(0).getMSHH();
                        String temp2 = d.getBH(0).getDVT();
                        int temp3 = d.getBH(0).getSoluong();
                        double temp4 = d.getBH(0).getDongia();
                        for(int i=0;i<n-1;i++){
                            for(int j=i+1;j<n;j++){
                                if(d.getBH(i).getMSHH().compareTo(d.getBH(j).getMSHH())>0){
                                    temp1 = d.getBH(j).getMSHH();
                                    temp2 = d.getBH(j).getDVT();
                                    temp3 = d.getBH(j).getSoluong();
                                    temp4 = d.getBH(j).getDongia();

                                    d.getBH(j).setMSHH(d.getBH(i).getMSHH());
                                    d.getBH(j).setDVT(d.getBH(i).getDVT());
                                    d.getBH(j).setSoluong(d.getBH(i).getSoluong());
                                    d.getBH(j).setDongia(d.getBH(i).getDongia());

                                    d.getBH(i).setMSHH(temp1);
                                    d.getBH(i).setDVT(temp2);
                                    d.getBH(i).setSoluong(temp3);
                                    d.getBH(i).setDongia(temp4);
                                }
                            }
                        }
                        System.out.println("Hoàn thành");
                    }
                    break;
                }
                case 6:{
                    //Thống kê trung bình
                    if(n<1){
                        System.out.println("Chưa có dữ liệu đơn hàng, vui lòng nhập trước");
                    } else {
                        boolean kt;
                        do{
                            kt = true;
                            for(int i=0;i<n;i++){
                                if(d.getBH(i).getMSHH().equals("a")==false){
                                    double tong = (d.getBH(i).getDongia() * d.getBH(i).getSoluong());;
                                    int dem = 1;
                                    for(int j=i+1;j<n;j++){
                                        if(d.getBH(j).getMSHH().equals(d.getBH(i).getMSHH())){
                                            tong = tong + (d.getBH(j).getDongia() * d.getBH(j).getSoluong());
                                            dem = dem + 1;
                                            d.getBH(j).setMSHH("a");
                                        }
                                    }
                                    b.add(new BanHang(d.getBH(i).getMSHH(), d.getBH(i).getDVT(),0, (tong/dem)));
                                    d.getBH(i).setMSHH("a");
                                    kt = false;
                                } else {
                                    kt = true;
                                }
                            }
                            for(int i=0; i<b.size(); i++){
                                System.out.println(b.get(i).toString());
                            }
                            
                        }while(kt==false);
                }
                    break;
                }
            }
        }while(lc!=7);
    }
}