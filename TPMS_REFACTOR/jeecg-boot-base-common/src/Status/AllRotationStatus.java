package com.linqi.TPMS.Status;

import lombok.Getter;
import lombok.Setter;

public class AllRotationStatus {
    //模拟量
    @Getter @Setter
    private int rotationCurrent;//回转电流
    @Getter @Setter
    private int rotationSpeed;//回转电机速度
    @Getter @Setter
    private int rotationTorque;//回转电机转矩
    @Getter @Setter
    private long runTime;//回转运行时间
    @Getter @Setter
    private double rotationArgs;//回转角度
    @Getter @Setter
    private int rotationTemp1;//回转电机温度#1
    @Getter @Setter
    private int rotationTemp2;//回转电机温度#2

    //状态量
    @Getter @Setter
    private boolean circuitBreaker1;//#1电流断路机合闸
    @Getter @Setter
    private boolean circuitBreaker2;//#2电流断路机合闸
    @Getter @Setter
    private boolean rotationBreaker;//回转制动器断路合闸
    @Getter @Setter
    private boolean rotationConnector;//回转制动器连接吸合
    @Getter @Setter
    private boolean stopper1OnNull;//1#制动器空开合闸
    @Getter @Setter
    private boolean stopper2OnNull;//2#制动器空开合闸
    @Getter @Setter
    private boolean windBlowerMain;//风机总开关
    @Getter @Setter
    private boolean windBlowerConnector;//风机接触器
    @Getter @Setter
    private boolean windBlower1;//#1风机开关
    @Getter @Setter
    private boolean windBlower2;//#2风机开关
    @Getter @Setter
    private boolean rotationLubricateRemote;//回转润滑远程启动
    @Getter @Setter
    private boolean rotationLubricateRuntime;//回转润滑运行
    @Getter @Setter
    private boolean rotationLubricateError;//回转润滑故障
    @Getter @Setter
    private boolean rotationAlongSeaRequest;//海侧请求信号
    @Getter @Setter
    private boolean rotationSpeedLimitRequest;//回转减速信号
    @Getter @Setter
    private boolean rotationAlongEarthRequest;//岸侧请求信号
    @Getter @Setter
    private boolean gear1;//档位1
    @Getter @Setter
    private boolean gear2;
    @Getter @Setter
    private boolean gear3;
    @Getter @Setter
    private boolean gear4;
    @Getter @Setter
    private boolean gear5;
    @Getter @Setter
    private boolean rotationAnchorLimit;//回转锚定限制
    @Getter @Setter
    private boolean rotationSlowdownLimitLeft;//左回转减速限位
    @Getter @Setter
    private boolean rotationSlowdownLimitRight;
    @Getter @Setter
    private boolean rotationStopLimitLeft;//左回转停止限位
    @Getter @Setter
    private boolean rotationStopLimitRight;
    @Getter @Setter
    private boolean rotationShutLimitLeft;//左回转急停限位
    @Getter @Setter
    private boolean rotationShutLimitRight;

    public void updateStatus() {
        //TODO:更新回转设备的各项状态量及模拟量y
    }
}
