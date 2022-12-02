package com.linqi.TPMS.Status;

import lombok.Getter;
import lombok.Setter;

public class SensorStatus {
    @Getter @Setter
    double mmw1;
    @Getter @Setter
    double mmw2;
    @Getter @Setter
    double mmw3;

    @Getter @Setter
    double lidar1;
    @Getter @Setter
    double lidar2;
    @Getter @Setter
    double lidar3;
}
