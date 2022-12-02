package com.linqi.TPMS.Status;

import lombok.Getter;
import lombok.Setter;

public class AllVehicleStatus {
    //模拟量
    @Getter @Setter
    private int vehicleCurrent;//大车电流
    @Getter @Setter
    private int vehicleSpeed;//大车速度
    @Getter @Setter
    private double vehicleTorque;//大车转矩
    @Getter @Setter
    private long vehicleRuntime;//大车运行时间
    @Getter @Setter
    private double vehiclePosition;//大车位置

    //状态量
    @Getter @Setter
    private boolean wheelClamp1;//1#夹轮
    @Getter @Setter
    private boolean wheelClamp2;//2#夹轮
    @Getter @Setter
    private boolean wheelClamp3;//3#夹轮
    @Getter @Setter
    private boolean wheelClamp4;//4#夹轮
    @Getter @Setter
    private boolean windCableLimit1;//防风缆限位1#
    @Getter @Setter
    private boolean windCableLimit2;//防风缆限位2#
    @Getter @Setter
    private boolean windCableLimit3;//防风缆限位3#
    @Getter @Setter
    private boolean windCableLimit4;//防风缆限位4#
    @Getter @Setter
    private boolean lubricateAlongEarthRuntime;//陆侧润滑运行
    @Getter @Setter
    private boolean lubricateAlongEarthError;//陆侧润滑故障
    @Getter @Setter
    private boolean heaterConnector;//加热器连通吸合
    @Getter @Setter
    private boolean heaterBreaker;//加热器断路器合闸
    @Getter @Setter
    private boolean echoLightAlarmConnector;//圣光警报连通器吸合
    @Getter @Setter
    private boolean echoLightAlarmBreaker;//声光警报断路器合闸
    @Getter @Setter
    private boolean cableOnLeft;//左盘线缆
    @Getter @Setter
    private boolean cableOnRight;//右盘线缆
    @Getter @Setter
    private boolean overTightLimitLeft;//左过紧限位
    @Getter @Setter
    private boolean overTightLimitRight;//右过紧限位
    @Getter @Setter
    private boolean fullPlateLimit;//全盘限位
    @Getter @Setter
    private boolean emptyPlateLimit;//空盘限位
    @Getter @Setter
    private boolean breakerOnwork1;//1#制动器
    @Getter @Setter
    private boolean breakerOnwork2;//2#制动器
    @Getter @Setter
    private boolean anchorAlongEarthRelease;//陆侧锚定释放
    @Getter @Setter
    private boolean anchorAlongSeaRelease;//海侧锚定释放
    @Getter @Setter
    private boolean turnRequestLeft;//左行请求信号
    @Getter @Setter
    private boolean turnRequestRight;//右行请求信号
    @Getter @Setter
    private boolean vehicleSlowdownLimitLeft;//左大车减速限位
    @Getter @Setter
    private boolean vehicleSlowdownLimitRight;
    @Getter @Setter
    private boolean vehicleStopLimitLeft;//左大车停止限位
    @Getter @Setter
    private boolean vehicleStopLimitRight;
    @Getter @Setter
    private boolean vehicleShutLimitLeft;//左大车急停限位
    @Getter @Setter
    private boolean vehicleShutLimitRight;
    @Getter @Setter
    private boolean gear1;//1档
    @Getter @Setter
    private boolean gear2;
    @Getter @Setter
    private boolean gear3;
    @Getter @Setter
    private boolean gear4;
    @Getter @Setter
    private boolean gear5;

    public void updateStatus() {
        //TODO:更新回转设备的各项状态量及模拟量
    }
}

