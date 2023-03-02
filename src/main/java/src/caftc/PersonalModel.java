package src.caftc;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class PersonalModel {
                private String address;
                private String CResident;
                private String C_Region;
                private String C_city;
                private  String  CountryName;
                private  String  Dob;
                private  String FName;
                private  String H_Region;
                private  String  H_city;
                private  String  LName;
                private  String  MName;
                private  String  Nationality;
                private  String  NicName;
                private  String OName;
                private  String  PAddress;
                private  String  PoBirth;
                private  String  Region;
                private  String Tribe;
                private  String Zipcode;
                private  String city;
                private  String  hometown;
                private String ResidentType;
                private int ID;


             public PersonalModel(Integer queryID, String queryFName, String queryHometown, String queryNationality){}
    public  PersonalModel ( Integer ID, String address,String CResident,String C_city,String C_Region,String CountryName, String  Dob, String FName, String H_Region, String  H_city,String  LName, String  MName,  String  Nationality, String  NicName, String OName, String  PAddress, String  PoBirth,String  Region,String Tribe, String Zipcode, String city,String  hometown, String ResidentType ){
                    this.FName= FName;
                    this.MName=MName;
                    this.LName=LName;
                    this.OName=OName;
                    this.H_city=H_city;
                    this.H_Region=H_Region;
                    this.Dob=Dob;
                     this.address=address;
                    this.CResident=CResident;
                    this.C_city= C_city;
                    this.ID=ID;
                    this.C_Region = C_Region;
                    this.CountryName=CountryName;
                    this.Nationality=Nationality;
                    this.NicName=NicName;
                    this.PAddress=PAddress;
                    this.PoBirth=PoBirth;
                    this.Region=Region;
                    this.Tribe=Tribe;
                    this.Zipcode=Zipcode;
                    this.city=city;
                    this.hometown=hometown;
                    this.ResidentType=ResidentType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCResident() {
        return CResident;
    }

    public void setCResident(String CResident) {
        this.CResident = CResident;
    }

    public String getC_Region() {
        return C_Region;
    }

    public void setC_Region(String c_Region) {
        C_Region = c_Region;
    }

    public String getC_city() {
        return C_city;
    }

    public void setC_city(String c_city) {
        C_city = c_city;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String dob) {
        Dob = dob;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getH_Region() {
        return H_Region;
    }

    public void setH_Region(String h_Region) {
        H_Region = h_Region;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getH_city() {
        return H_city;
    }

    public void setH_city(String h_city) {
        H_city = h_city;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public String getNicName() {
        return NicName;
    }

    public void setNicName(String nicName) {
        NicName = nicName;
    }

    public String getOName() {
        return OName;
    }

    public void setOName(String OName) {
        this.OName = OName;
    }

    public String getPAddress() {
        return PAddress;
    }

    public void setPAddress(String PAddress) {
        this.PAddress = PAddress;
    }

    public String getPoBirth() {
        return PoBirth;
    }

    public void setPoBirth(String poBirth) {
        PoBirth = poBirth;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getTribe() {
        return Tribe;
    }

    public void setTribe(String tribe) {
        Tribe = tribe;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String zipcode) {
        Zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getResidentType() {
        return ResidentType;
    }

    public void setResidentType(String residentType) {
        ResidentType = residentType;
    }
}
