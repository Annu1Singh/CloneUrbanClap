package com.sundram.urbanclapclone.datamodel;

public class DataModel {

    private String serviceName;
    private int drawable;

    public DataModel() {
    }

    public DataModel(String serviceName, int drawable) {
        this.serviceName = serviceName;
        this.drawable = drawable;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }


}
