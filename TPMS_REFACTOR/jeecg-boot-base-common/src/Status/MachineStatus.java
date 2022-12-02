package com.linqi.TPMS.Status;

import lombok.Getter;
import lombok.Setter;

public class MachineStatus {
    @Getter @Setter
    private double current;
    @Getter @Setter
    private double temperature;
//    @Getter @Setter
//    private double torque;
//    @Getter @Setter
//    private double speed;
//    @Getter @Setter
//    private double runtime;
}
