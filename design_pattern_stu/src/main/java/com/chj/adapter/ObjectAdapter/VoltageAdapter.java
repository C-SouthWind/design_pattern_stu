package com.chj.adapter.ObjectAdapter;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.adapter.classAdapter
 * @className: VoltageAdapter
 * @author: chj
 * @description: 适配器类
 * @date: Created in  2023/7/18 20:01
 * @version: 1.0
 */
public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int srcV = voltage220V.output220V();
        int dstV = srcV/44;
        return dstV;
    }
}
