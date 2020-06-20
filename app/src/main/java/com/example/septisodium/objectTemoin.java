package com.example.septisodium;

import java.util.ArrayList;

public class objectTemoin {
    private String name;
    private String caracteristique1 ;
    private String caracteristique2;
    private String caracteristique3;
    private Integer drawble;

    public objectTemoin(String name, String caracteristique1, String caracteristique2, String caracteristique3,Integer drawble) {
        this.name = name;
        this.caracteristique1 = caracteristique1;
        this.caracteristique2 = caracteristique2;
        this.caracteristique3 = caracteristique3;
        this.drawble=drawble;
    }

    public String getName() {
        return name;
    }

    public String getCaracteristique1() {
        return caracteristique1;
    }

    public String getCaracteristique2() {
        return caracteristique2;
    }

    public String getCaracteristique3() {
        return caracteristique3;
    }

    public Integer getDrawble() {
        return drawble;
    }
}
