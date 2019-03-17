package Session_4;


import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;

public class SanPham {
    int id;
    String name;
    int price;
    int quantity;

    //constructor and getter/setter
    public SanPham() {
    }

    public SanPham(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //1.Kiem tra so luong con lai
    public int checkQuantity(int id, ArrayList<SanPham> arrSp){
        int slcl = -1;
        slcl= arrSp.get(id).getQuantity();
        return slcl;
    };

}

