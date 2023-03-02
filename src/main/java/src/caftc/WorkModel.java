package src.caftc;

import javafx.scene.control.TextField;

public class WorkModel {


    private String LifeOccupation;


    private String Lofwork;


    private  String NofWork;


    private String WorkExperience;


    private String positWork;


    private String wrkOccupation;

    public WorkModel(){}
    public WorkModel (String LifeOccupation, String Lofwork,String NofWork, String WorkExperience, String positWork, String workOccupation ){
        this.LifeOccupation=LifeOccupation;
        this.Lofwork=Lofwork;
        this.NofWork=NofWork;
        this.WorkExperience=WorkExperience;
        this.positWork=positWork;
        this.wrkOccupation=workOccupation;
    }

    public String getLifeOccupation() {
        return LifeOccupation;
    }

    public void setLifeOccupation(String lifeOccupation) {
        LifeOccupation = lifeOccupation;
    }

    public String getLofwork() {
        return Lofwork;
    }

    public void setLofwork(String lofwork) {
        Lofwork = lofwork;
    }

    public String getNofWork() {
        return NofWork;
    }

    public void setNofWork(String nofWork) {
        NofWork = nofWork;
    }

    public String getWorkExperience() {
        return WorkExperience;
    }

    public void setWorkExperience(String workExperience) {
        WorkExperience = workExperience;
    }

    public String getPositWork() {
        return positWork;
    }

    public void setPositWork(String positWork) {
        this.positWork = positWork;
    }

    public String getWrkOccupation() {
        return wrkOccupation;
    }

    public void setWrkOccupation(String wrkOccupation) {
        this.wrkOccupation = wrkOccupation;
    }
}
