package com.linqi.TPMS.Status;

import lombok.Getter;
import lombok.Setter;

public class Motion {
    @Setter @Getter private double travelling; //大车平移距离，单位米
    @Setter @Getter private double slewing;    //回转角度，单位rad
    @Setter @Getter private double luffing;    //变幅角度，单位rad
    @Setter @Getter private double pendulum;    //摆动角度，单位rad
    public Motion() {}
    public Motion(double[] motion) {
        travelling = motion[0];
        slewing = motion[1];
        luffing = motion[2];
        pendulum = motion[3];
    }
}
