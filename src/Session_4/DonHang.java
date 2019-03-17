package Session_4;

import java.util.ArrayList;

public class DonHang {
    public int id;
    public int tongTien;
    public ArrayList<SanPham> listSp;

    public DonHang() {
    }

    public DonHang(int id, int tongTien, ArrayList<SanPham> listSp) {
        this.id = id;
        this.tongTien = tongTien;
        this.listSp = listSp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public ArrayList<SanPham> getListSp() {
        return listSp;
    }

    public void setListSp(ArrayList<SanPham> listSp) {
        this.listSp = listSp;
    }
    //check sp da co trong don hang hay chua

    //them sp
    public void addListSp(int idSp, ArrayList<SanPham> arrSpInKho,
                          int idDh, ArrayList<DonHang> arrDh){

        SanPham objSp= new SanPham();
        DonHang objDh= new DonHang();
        ArrayList<SanPham> arrSpInDh;

        if (objSp.checkQuantity(idSp,arrSpInKho)>=1){
            int indexDh = 0;
            boolean tonTaiIdDonHang =false;
            for( int i=0; i<arrDh.size(); i++){
                if (idDh==arrDh.get(i).getId()){
                    tonTaiIdDonHang=true;
                    indexDh= i;
                    break;
                }
            }

            if (tonTaiIdDonHang==false){
                SanPham spAdd= new SanPham(idSp, arrSpInKho.get(idSp).getName(),
                        arrSpInKho.get(idSp).getPrice(),1);
                ArrayList<SanPham> listSp= new ArrayList<SanPham>();
                listSp.add(spAdd);
                arrDh.add(new DonHang(idDh,0,listSp));
            }else{
                arrSpInDh = arrDh.get(indexDh).listSp;
                boolean tonTaiIdSp= false;
                int indexSp=0;
                for (int i=0; i<arrSpInDh.size(); i++ ){
                    if (idSp== arrSpInDh.get(i).getId()){
                        tonTaiIdSp=true;
                        indexSp=i;
                        break;
                    }
                };
                if (tonTaiIdSp=false){
                    SanPham spAdd= new SanPham(idSp, arrSpInKho.get(idSp).getName(),
                            arrSpInKho.get(idSp).getPrice(),1);
                    arrSpInDh.add(spAdd);
                }else{
                    arrSpInDh.get(indexSp).setQuantity(arrSpInDh.get(indexSp).getQuantity()+1);
                }
            }
            System.out.println("Da them sp thanh cong");
            //giam san pham trong kho
            arrSpInKho.get(idSp).setQuantity(arrSpInKho.get(idSp).getQuantity() -1);
        }
        else {//hang da het
            System.out.println("San pham da het hang!");
        };
    }
}
