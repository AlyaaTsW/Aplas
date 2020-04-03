package org.aplas.basicapp;

public class Temperature {
    private double celcius;
    private String oriUnit;
    private String convUnit;
    private double value;

    public Temperature() {
        this.celcius=0;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.celcius = (fahrenheit-32)/1.8;
    }

    public void setKelvins(double kelvin) {
        this.celcius = kelvin-273.15;
    }

    public double getCelcius() {
        return celcius;
    }

    public double getFahrenheit() {
        return celcius*1.8000 + 32.00;
    }

    public double getKelvins() {
        return celcius + 273.15;
    }

    public double convert(String oriUnit, String convUnit, double value){
        this.oriUnit=oriUnit;
        this.convUnit=convUnit;
        this.value=value;

        if (oriUnit=="C" && convUnit=="C"){
            return getCelcius();
        } if (oriUnit=="C" && convUnit=="F"){
            return getFahrenheit();
        } if (oriUnit=="C" && convUnit=="K"){
            return getKelvins();
        } if (oriUnit=="F" && convUnit=="C"){
            return getCelcius();
        } if (oriUnit=="F" && convUnit=="F"){
            return getFahrenheit();
        } if (oriUnit=="F" && convUnit=="K"){
            return getKelvins();
        }if (oriUnit=="K" && convUnit=="C"){
            return getCelcius();
        } if (oriUnit=="K" && convUnit=="F"){
            return getFahrenheit();
        } if (oriUnit=="K" && convUnit=="K"){
            return getKelvins();
        }
        return value;
    }
}
