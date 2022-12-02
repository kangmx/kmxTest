package com.linqi.TPMS.Status;

import lombok.Getter;
import lombok.Setter;

public class OverviewStatus {
    //模拟量
    @Getter @Setter
    private long liquidMainRuntime;
    @Getter @Setter
    private long horizontalScrewRuntime;
    @Getter @Setter
    private long verticalScrewRuntime;
    @Getter @Setter
    private long feedingScrewRuntime;
    @Getter @Setter
    private long rotationRuntime;
    @Getter @Setter
    private long vehicleRuntime;

    //状态量
    @Getter @Setter
    private boolean emergencyElectrical;
    @Getter @Setter
    private boolean emergencyDriver;
    @Getter @Setter
    private boolean emergencyRC;
    @Getter @Setter
    private boolean emergencyVehicleController;
    @Getter @Setter
    private boolean emergencyHorizontalController;
    @Getter @Setter
    private boolean emergencyVehicleSeaAlong;
    @Getter @Setter
    private boolean emergencyVerticalController;

    @Getter @Setter
    private boolean switchOnElectrical;
    @Getter @Setter
    private boolean switchOnDriver;
    @Getter @Setter
    private boolean switchOnRC;
    @Getter @Setter
    private boolean switchOnVehicleController;
    @Getter @Setter
    private boolean switchOnHorizontalController;
    @Getter @Setter
    private boolean switchOnVerticalController;
    @Getter @Setter
    private boolean switchOnOperationRoom;

    //指示灯
    @Getter @Setter
    private boolean horizontalProgress;          //水平螺旋启动完毕
    @Getter @Setter
    private boolean verticalProgress;            //垂直螺旋启动完毕
    @Getter @Setter
    private boolean feederProgress;              //取料螺旋启动完毕

    //中央支撑温度
    @Getter @Setter
    private double horizontalTemp1;
    @Getter @Setter
    private double horizontalTemp2;
    @Getter @Setter
    private double horizontalTemp3;
    @Getter @Setter
    private double horizontalTemp4;
    @Getter @Setter
    private double horizontalTemp5;

    @Getter @Setter
    private double verticalTemp1;
    @Getter @Setter
    private double verticalTemp2;
    @Getter @Setter
    private double verticalTemp3;
    @Getter @Setter
    private double verticalTemp4;

    public void updateStatus() {
        //TODO:更新回转设备的各项状态量及模拟量
    }
}
