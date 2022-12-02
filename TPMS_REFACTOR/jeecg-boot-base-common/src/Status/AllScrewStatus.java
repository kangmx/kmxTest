package com.linqi.TPMS.Status;

import lombok.Getter;
import lombok.Setter;

public class AllScrewStatus {
    //模拟量
    @Getter @Setter
    private int screwCurrent;//水平螺旋电流
    @Getter @Setter
    private int screwSpeed;//水平螺旋速度
    @Getter @Setter
    private double screwTorque;//水平螺旋转矩
    @Getter @Setter
    private int temperature;
    @Getter @Setter
    private double centreTemp1;//水平螺旋中央支撑温度1#
    @Getter @Setter
    private double centreTemp2;
    @Getter @Setter
    private double centreTemp3;
    @Getter @Setter
    private double centreTemp4;
    @Getter @Setter
    private double centreTemp5;
    @Getter @Setter
    private double centreTemp6;
    @Getter @Setter
    private long screwRuntime;//水平螺旋运行时间
    @Getter @Setter
    private double reducerTemp;//水平螺旋减速器温度
    @Getter @Setter
    private int vertical1Current;//垂直螺旋1电流
    @Getter @Setter
    private int vertical1Speed;//垂直螺旋1速度
    @Getter @Setter
    private double vertical1Torque;//垂直螺旋1转矩
    @Getter @Setter
    private int vertical1Temp;//垂直螺旋1温度
    @Getter @Setter
    private int vertical2Current;//垂直螺旋2电流
    @Getter @Setter
    private int vertical2Speed;//垂直螺旋2速度
    @Getter @Setter
    private double vertical2Torque;//垂直螺旋2转矩
    @Getter @Setter
    private int vertical2Temp;//垂直螺旋2温度
    @Getter @Setter
    private long verticalRuntime;//垂直螺旋运行时间
    @Getter @Setter
    private double verticalCentreTemp1;//垂直螺旋中央温度1
    @Getter @Setter
    private double verticalCentreTemp2;
    @Getter @Setter
    private double verticalCentreTemp3;
    @Getter @Setter
    private double verticalCentreTemp4;
    @Getter @Setter
    private int feederCurrent;//取料螺旋电流
    @Getter @Setter
    private int feederSpeed;//取料螺旋速度
    @Getter @Setter
    private double feederTorque;//取料螺旋转矩
    @Getter @Setter
    private long feederRuntime;//取料螺旋运行时间
    @Getter @Setter
    private double feederTemp;//取料螺旋温度
    @Getter @Setter
    private double feederCoolerTemp;//取料螺旋冷却器温度
    //状态量
    @Getter @Setter
    private boolean FCConnector;//水平螺旋变频器接触器
    @Getter @Setter
    private boolean windBreaker;//水平螺旋风机断路器
    @Getter @Setter
    private boolean windConnector;//水平螺旋风机接触器
    @Getter @Setter
    private boolean emergencyBreaker;//水平螺旋及应急断路器
    @Getter @Setter
    private boolean emergencyConnector;//水平螺旋机应急接触器
    @Getter @Setter
    private boolean emergencyMode;//应急模式
    @Getter @Setter
    private boolean shaftSpeedCheck;//水平螺旋机断轴速度检测
    @Getter @Setter
    private boolean startAtPosition;//水平螺旋就地启动
    @Getter @Setter
    private boolean fixAtPosition;//水平螺旋就地故障复位
    @Getter @Setter
    private boolean reducerPumpConnector;//水平螺旋减速箱油泵接触
    @Getter @Setter
    private boolean reducerPumpOnNull;//水平螺旋减速箱油泵空转
    @Getter @Setter
    private boolean reducerRapidSignal;//水平螺旋减速箱流量信号
    @Getter @Setter
    private boolean vertical1WindConnector;//垂直1风机接触
    @Getter @Setter
    private boolean vertical1WindBreaker;//垂直1风机断路器
    @Getter @Setter
    private boolean vertical1ABBFC;//垂直1ABB变频
    @Getter @Setter
    private boolean vertical2WindConnector;//垂直2风机接触器
    @Getter @Setter
    private boolean vertical2WindBreaker;//垂直2风机断路器
    @Getter @Setter
    private boolean vertical2ABBFC;//垂直2ABB变频
    @Getter @Setter
    private boolean verticalCableLimit1;//垂直线缆限位1
    @Getter @Setter
    private boolean verticalCableLimit2;
    @Getter @Setter
    private boolean verticalCableLimit3;
    @Getter @Setter
    private boolean verticalStartAtPosition;//垂直螺旋就地启动
    @Getter @Setter
    private boolean verticalFixAtPosition;//垂直螺旋就地故障复位
    @Getter @Setter
    private boolean verticalInverseAtPosition;//垂直螺旋就地倒转
    @Getter @Setter
    private boolean verticalColdDownPumpConnection;//垂直螺旋冷却油泵连接
    @Getter @Setter
    private boolean verticalColdDownPumpOnNull;//垂直螺旋冷却油泵空转
    @Getter @Setter
    private boolean verticalColdDownRabidSignal;//垂直螺旋冷却流量信号
    @Getter @Setter
    private boolean verticalAnchorRemote;//垂直螺旋润滑远程启动
    @Getter @Setter
    private boolean feederFCConnector;//取料螺旋变频接触器
    @Getter @Setter
    private boolean feederFCBreaker;//取料螺旋变频断路器
    @Getter @Setter
    private boolean feederCoolerConnector;//取料螺旋冷却器接触器
    @Getter @Setter
    private boolean feederRapidSwitch;//取料螺旋流量开关

    public void updateStatus() {
        //TODO:更新回转设备的各项状态量及模拟量
    }
}
