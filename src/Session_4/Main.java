package Session_4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        SanPham objSp= new SanPham();

        ArrayList<SanPham> arrSpInKho= new ArrayList<SanPham>();
        arrSpInKho.add(new SanPham(0,"Mu",10,5));
        arrSpInKho.add(new SanPham(1,"Ao",20,2));
        arrSpInKho.add(new SanPham(2,"Quan",30,0));
        System.out.println("so luong sp con lai: "+ objSp.checkQuantity(1,arrSpInKho));

        DonHang objDh= new DonHang();
        ArrayList<DonHang> arrDh = new ArrayList<DonHang>();

        System.out.print("THEM SP VAO DON HANG LAN 1:");
        objDh.addListSp(1,arrSpInKho,0,arrDh);
        System.out.print("THEM SP VAO DON HANG LAN 2:");
        objDh.addListSp(1,arrSpInKho,0,arrDh);
        System.out.print("THEM SP VAO DON HANG LAN 3:");
        objDh.addListSp(1,arrSpInKho,0,arrDh);
        System.out.print("THEM SP VAO DON HANG LAN 4:");
        objDh.addListSp(0,arrSpInKho,1,arrDh);

        for(int i=0; i<arrDh.size();i++){
            ArrayList<SanPham> arrListSp = arrDh.get(i).listSp;
            int sumMoney=0;
            for (int j=0; j<arrListSp.size(); j++){
                sumMoney= sumMoney+ arrListSp.get(j).getPrice()*arrListSp.get(j).getQuantity();
            };
            arrDh.get(i).setTongTien(sumMoney);
        }

        for (int i=0;i<arrDh.size();i++){
            System.out.print("id:"+ arrDh.get(i).id);
            System.out.print(" Tong tien:"+ arrDh.get(i).tongTien);
            System.out.println(" ListSp:"+ arrDh.get(i).listSp);
        }
    }
}
