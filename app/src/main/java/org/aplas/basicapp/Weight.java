package org.aplas.basicapp;

public class Weight {
    private double gram;
    private String oriUnit;
    private String convUnit;
    private double value;

    public Weight() {
        this.gram=0;
    }

    public void setGram(double gram) {
        this.gram = gram;
    }

    public void setOunce(double gram) {
        this.gram = gram*28.3495231;
    }

    public void setPound(double gram) {
        this.gram = gram*453.59237;
    }

    public double getGram() {
        return gram;
    }

    public double getOunce() {
        return gram/28.3495231;
    }

    public double getPound() {
        return gram/453.59237;
    }

    public double convert(String oriUnit, String convUnit, double value){
        this.oriUnit=oriUnit;
        this.convUnit=convUnit;
        this.value=value;

        if (oriUnit=="Grm" && convUnit=="Grm"){
            return getGram();
        } if (oriUnit=="Grm" && convUnit=="Onc"){
            return getOunce();
        } if (oriUnit=="Grm" && convUnit=="Pnd"){
            return getPound();
        } if (oriUnit=="Onc" && convUnit=="Grm"){
            return getGram();
        } if (oriUnit=="Onc" && convUnit=="Onc"){
            return getOunce();
        } if (oriUnit=="Onc" && convUnit=="Pnd"){
            return getPound();
        }if (oriUnit=="Pnd" && convUnit=="Grm"){
            return getGram();
        } if (oriUnit=="Pnd" && convUnit=="Onc"){
            return getOunce();
        } if (oriUnit=="Pnd" && convUnit=="Pnd"){
            return getPound();
        }
        return value;
    }
}
