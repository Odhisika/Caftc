package src.caftc;

public class EducationalModel {
    private String B_YB;
    private String B_YC;
    private String S_YB;
    private String S_YC;
    private String T_YB;
    private String T_YC;
    private String otherLang;

    public EducationalModel(){}
    public EducationalModel (String B_YB, String B_YC,String S_YB, String S_YC, String T_YB, String T_YC,String otherLang){
        this.B_YB=B_YB;
        this.B_YC=B_YC;
        this.S_YB=S_YB;
        this.S_YC=S_YC;
        this.T_YB=T_YB;
        this.T_YC=T_YC;
    }

    public String getB_YB() {
        return B_YB;
    }

    public void setB_YB(String b_YB) {
        B_YB = b_YB;
    }

    public String getB_YC() {
        return B_YC;
    }

    public void setB_YC(String b_YC) {
        B_YC = b_YC;
    }

    public String getS_YB() {
        return S_YB;
    }

    public void setS_YB(String s_YB) {
        S_YB = s_YB;
    }

    public String getS_YC() {
        return S_YC;
    }

    public void setS_YC(String s_YC) {
        S_YC = s_YC;
    }

    public String getT_YB() {
        return T_YB;
    }

    public void setT_YB(String t_YB) {
        T_YB = t_YB;
    }

    public String getT_YC() {
        return T_YC;
    }

    public void setT_YC(String t_YC) {
        T_YC = t_YC;
    }

    public String getOtherLang() {
        return otherLang;
    }

    public void setOtherLang(String otherLang) {
        this.otherLang = otherLang;
    }
}
