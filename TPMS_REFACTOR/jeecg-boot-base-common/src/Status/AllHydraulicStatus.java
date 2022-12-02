package com.linqi.TPMS.Status;

import lombok.Getter;
import lombok.Setter;

public class AllHydraulicStatus {
    //模拟量
    @Getter @Setter
    private double pitchPressureBarless;//俯仰无杆端压强
    @Getter @Setter
    private double pitchPressureBar;//俯仰有杆端压强
    @Getter @Setter
    private double swingPressureBarless;//摆动无杆端压强
    @Getter @Setter
    private double swingPressureBar;//摆动有杆端压强
    @Getter @Setter
    private double tankLevel;//油箱液位
    @Getter @Setter
    private double tankTemp;//油箱温度
    @Getter @Setter
    private double pendulum;//摆动角度
    @Getter @Setter
    private long hydrauRuntime; //液压运行时间
    //状态量
    @Getter @Setter
    private boolean pumpHighTempSignal;//油泵高温信号
    @Getter @Setter
    private boolean pumpLowTempSignal;//油泵低温信号
    @Getter @Setter
    private boolean mainPumpRuntime;//主泵运行时间
    @Getter @Setter
    private boolean GeneralAlarm;//综合警报
    @Getter @Setter
    private boolean LowLiquidLevel;//低液位
    @Getter @Setter
    private boolean highPressureFilter;//高压过滤器
    @Getter @Setter
    private boolean inverseFilter;//回转过滤器
    @Getter @Setter
    private boolean cycleFilter;//循环过滤器

    public void updateStatus() {
        //TODO:更新回转设备的各项状态量及模拟量

    }
}
