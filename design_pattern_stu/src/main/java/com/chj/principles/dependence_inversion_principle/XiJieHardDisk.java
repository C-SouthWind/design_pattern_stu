package com.chj.principles.dependence_inversion_principle;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.principles.dependence_inversion_principle.demo1
 * @className: XiJieHardDisk
 * @author: chj
 * @description: 希捷硬盘
 * @date: Created in  2023/7/4 19:43
 * @version: 1.0
 */
public class XiJieHardDisk implements HardDisk{
    @Override
    public void save(String data) {
        System.out.println("希捷硬盘保存了:" + data);
    }

    @Override
    public String get() {
        return "获取了希捷硬盘数据";
    }
}
