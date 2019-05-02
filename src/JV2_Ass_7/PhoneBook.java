package JV2_Ass_7;

public class PhoneBook {
    private Integer id;
    private Integer user_id;
    private String telephone;
    private Integer status;

    public PhoneBook() {
    }

    public PhoneBook(Integer id, Integer user_id, String telephone, Integer status) {
        this.id = id;
        this.user_id = user_id;
        this.telephone = telephone;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
