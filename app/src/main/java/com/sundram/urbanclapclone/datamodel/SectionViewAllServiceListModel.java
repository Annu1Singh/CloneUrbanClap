package com.sundram.urbanclapclone.datamodel;

public class SectionViewAllServiceListModel {

    private String serviceName;
    private String rupee;
    private String offRupe;
    private String typeOfService;
    private String serviceTime;
    private int drawable;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getRupee() {
        return rupee;
    }

    public void setRupee(String rupee) {
        this.rupee = rupee;
    }

    public String getOffRupe() {
        return offRupe;
    }

    public void setOffRupe(String offRupe) {
        this.offRupe = offRupe;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    public String getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(String serviceTime) {
        this.serviceTime = serviceTime;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public SectionViewAllServiceListModel(String serviceName, String rupee, String offRupe, String typeOfService, String serviceTime, int drawable) {
        this.serviceName = serviceName;
        this.rupee = rupee;
        this.offRupe = offRupe;
        this.typeOfService = typeOfService;
        this.serviceTime = serviceTime;
        this.drawable = drawable;
    }

}
