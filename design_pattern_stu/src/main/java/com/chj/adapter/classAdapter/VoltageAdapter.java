package com.chj.adapter.classAdapter;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.adapter.classAdapter
 * @className: VoltageAdapter
 * @author: chj
 * @description: 适配器类
 * @date: Created in  2023/7/18 20:01
 * @version: 1.0
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        int srcV = output220V();
        int dstV = srcV/44;
        return dstV;
    }
}
