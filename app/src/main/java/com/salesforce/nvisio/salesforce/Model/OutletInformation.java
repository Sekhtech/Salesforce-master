package com.salesforce.nvisio.salesforce.Model;

import android.arch.persistence.room.PrimaryKey;

/**
 * Created by USER on 30-Jan-18.
 */

public class OutletInformation {

    private String outletName;
    private Double outletLatitude,outletLongitude;

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    private int appointmentId;

    public OutletInformation() {
    }

    public String getOutletName() {
        return outletName;
    }

    public OutletInformation(String outletName) {
        this.outletName = outletName;
    }

    public void setOutletName(String outletName) {
        this.outletName = outletName;
    }

    public Double getOutletLatitude() {
        return outletLatitude;
    }

    public void setOutletLatitude(Double outletLatitude) {
        this.outletLatitude = outletLatitude;
    }

    public Double getOutletLongitude() {
        return outletLongitude;
    }

    public void setOutletLongitude(Double outletLongitude) {
        this.outletLongitude = outletLongitude;
    }
}
