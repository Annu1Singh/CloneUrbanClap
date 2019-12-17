package com.sundram.urbanclapclone.datamodel;

public class CarpenterDataModel {
    private String serviceName, rupee, rupeeOff;

    public CarpenterDataModel(String serviceName, String rupee, String rupeeOff) {
        this.serviceName = serviceName;
        this.rupee = rupee;
        this.rupeeOff = rupeeOff;
    }

    public String getRupee() {
        return rupee;
    }

    public void setRupee(String rupee) {
        this.rupee = rupee;
    }

    public String getRupeeOff() {
        return rupeeOff;
    }

    public void setRupeeOff(String rupeeOff) {
        this.rupeeOff = rupeeOff;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
