package com.linqi.TPMS.Status;

import lombok.Getter;
import lombok.Setter;

public class PowerStatus {
    @Getter @Setter
    private boolean unloaderMainPower;
    @Getter @Setter
    private boolean horizonalRotationPower;
    @Getter @Setter
    private boolean unloaderRotationPower;
    @Getter @Setter
    private boolean verticalRotationPower;
}
