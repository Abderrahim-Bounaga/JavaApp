package sample;

public class Product {
    private int ID;
    private String Adress;
    private String Type;
    private String Surface;
    private int Price;
    private String Name;
    private String Mail;
    private String Role;
    private String Pass;
    private int Phone;

    public Product (int ID, String Adress, String Type, String Surface, int Price, String name,String mail, String role,String pass, int phone){
        super();
        this.ID = ID;
        this.Adress = Adress;
        this.Type = Type;
        this.Surface = Surface;
        this.Price = Price;
        this.Name = name;
        this.Mail = mail;
        this.Role = role;
        this.Pass = pass;
     this.Phone = phone;
    }

    public Product() {

    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getSurface() {
        return Surface;
    }

    public void setSurface(String surface) {
        Surface = surface;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setMail(String mail) {
        this.Mail = mail;
    }

    public String getMail() {
        return Mail;
    }

    public void setRole(String role) {
        this.Role = role;
    }

    public String getRole() {
        return Role;
    }

    public void setPass(String pass) {
        this.Pass = pass;
    }

    public String getPass() {
        return Pass;
    }

    public void setPhone(int phone) {
        this.Phone = phone;
    }

    public int getPhone() {
        return Phone;
    }
}
