package src.caftc;

public class PhysicalModel {
    private  String  MaritalStatus;
    private String AnySickness;
    private String CoupleName;
    private String Email;
    private String Healthcare;
    private String NChildren;
    private String Telephone;
    private String appearance;

    public PhysicalModel (){}
    public PhysicalModel (String MaritalStatus,String AnySickness, String CoupleName,String Email,String Healthcare,String NChildren, String Telephone, String appearance){
        this.MaritalStatus=MaritalStatus;
        this.AnySickness=AnySickness;
        this.CoupleName=CoupleName;
        this.Email=Email;
        this.Healthcare=Healthcare;
        this.NChildren=NChildren;
        this.Telephone=Telephone;
        this.appearance=appearance;
    }

    public String getMaritalStatus() {
        return MaritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        MaritalStatus = maritalStatus;
    }

    public String getAnySickness() {
        return AnySickness;
    }

    public void setAnySickness(String anySickness) {
        AnySickness = anySickness;
    }

    public String getCoupleName() {
        return CoupleName;
    }

    public void setCoupleName(String coupleName) {
        CoupleName = coupleName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getHealthcare() {
        return Healthcare;
    }

    public void setHealthcare(String healthcare) {
        Healthcare = healthcare;
    }

    public String getNChildren() {
        return NChildren;
    }

    public void setNChildren(String NChildren) {
        this.NChildren = NChildren;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }


}
