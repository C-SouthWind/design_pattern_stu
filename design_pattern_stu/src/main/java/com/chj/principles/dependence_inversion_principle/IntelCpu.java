package com.chj.principles.dependence_inversion_principle;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.principles.dependence_inversion_principle.demo1
 * @className: IntelCpu
 * @author: chj
 * @description: intelCpu
 * @date: Created in  2023/7/4 19:43
 * @version: 1.0
 */
public class IntelCpu implements Cpu{
    @Override
    public void run() {
        System.out.println("intelCpu在运行");
    }
}
