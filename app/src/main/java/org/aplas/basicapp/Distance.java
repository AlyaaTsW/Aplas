package org.aplas.basicapp;

public class Distance {
    private double meter;
    private String oriUnit;
    private String convUnit;
    private double value;

    public Distance() {
        this.meter=0;
    }

    public void setMeter(double meter) {
        this.meter = meter;
    }

    public void setInch(double meter) {
        this.meter = meter*0.0254;
    }

    public void setMile(double meter) {
        this.meter = meter/0.000621371;
    }

    public void setFoot(double meter) {
        this.meter = meter/3.28084;
    }

    public double getMeter() {
        return meter;
    }

    public double getInch() {
        return meter*39.3701;
    }

    public double getMile() {
        return meter*0.000621371;
    }

    public double getFoot() {
        return meter*3.28084;
    }

    public double convert(String oriUnit, String convUnit, double value){
        this.oriUnit=oriUnit;
        this.convUnit=convUnit;
        this.value=value;

        if (oriUnit=="Mtr" && convUnit=="Mtr"){
            return getMeter();
        } if (oriUnit=="Mtr" && convUnit=="Inc"){
            return getInch();
        } if (oriUnit=="Mtr" && convUnit=="Mil"){
            return getMile();
        } if (oriUnit=="Mtr" && convUnit=="Ft"){
            return getFoot();
        } if (oriUnit=="Inc" && convUnit=="Mtr"){
            return getMeter();
        } if (oriUnit=="Inc" && convUnit=="Inc"){
            return getInch();
        } if (oriUnit=="Inc" && convUnit=="Mil"){
            return getMile();
        } if (oriUnit=="Inc" && convUnit=="Ft"){
            return getFoot();
        }if (oriUnit=="Mil" && convUnit=="Mtr"){
            return getMeter();
        } if (oriUnit=="Mil" && convUnit=="Inc"){
            return getInch();
        } if (oriUnit=="Mil" && convUnit=="Mil"){
            return getMile();
        } if (oriUnit=="Mil" && convUnit=="Ft"){
            return getFoot();
        }if (oriUnit=="Ft" && convUnit=="Mtr"){
            return getMeter();
        } if (oriUnit=="Ft" && convUnit=="Inc"){
            return getInch();
        } if (oriUnit=="Ft" && convUnit=="Mil"){
            return getMile();
        } if (oriUnit=="Ft" && convUnit=="Ft"){
            return getFoot();
        }
        return value;
    }
}
