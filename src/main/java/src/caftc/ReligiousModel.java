package src.caftc;

public class ReligiousModel {

    private String B_Dob;
    private String ChBap;
    private String CuChName;
    private String CuPasName;
    private String IFOreligious;
    private String NfLchurch;
    private String OldNfPastor;
    private String RfLeaving;
    private String YiPrevChurch;
    private String noChAttended;

    public ReligiousModel(){}
    public ReligiousModel (String B_DoB, String chBap, String CuChName, String cuPasName, String IFOreligious, String NfLchurch,
                           String OldNfPastor, String RfLeaving, String YiPrevChurch,String noChAttended){
        this.B_Dob=B_DoB;
        this.ChBap = chBap;
        this.CuChName=CuChName;
        this.IFOreligious=IFOreligious;
        this.NfLchurch=NfLchurch;
        this.OldNfPastor=OldNfPastor;
        this.RfLeaving=RfLeaving;
        this.YiPrevChurch=YiPrevChurch;
        this.noChAttended=noChAttended;
    }

    public String getB_Dob() {
        return B_Dob;
    }

    public void setB_Dob(String b_Dob) {
        B_Dob = b_Dob;
    }

    public String getChBap() {
        return ChBap;
    }

    public void setChBap(String chBap) {
        ChBap = chBap;
    }

    public String getCuChName() {
        return CuChName;
    }

    public void setCuChName(String cuChName) {
        CuChName = cuChName;
    }

    public String getCuPasName() {
        return CuPasName;
    }

    public void setCuPasName(String cuPasName) {
        CuPasName = cuPasName;
    }

    public String getIFOreligious() {
        return IFOreligious;
    }

    public void setIFOreligious(String IFOreligious) {
        this.IFOreligious = IFOreligious;
    }

    public String getNfLchurch() {
        return NfLchurch;
    }

    public void setNfLchurch(String nfLchurch) {
        NfLchurch = nfLchurch;
    }

    public String getOldNfPastor() {
        return OldNfPastor;
    }

    public void setOldNfPastor(String oldNfPastor) {
        OldNfPastor = oldNfPastor;
    }

    public String getRfLeaving() {
        return RfLeaving;
    }

    public void setRfLeaving(String rfLeaving) {
        RfLeaving = rfLeaving;
    }

    public String getYiPrevChurch() {
        return YiPrevChurch;
    }

    public void setYiPrevChurch(String yiPrevChurch) {
        YiPrevChurch = yiPrevChurch;
    }

    public String getNoChAttended() {
        return noChAttended;
    }

    public void setNoChAttended(String noChAttended) {
        this.noChAttended = noChAttended;
    }
}
