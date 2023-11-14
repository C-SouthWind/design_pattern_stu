package com.chj.principles.dependence_inversion_principle;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.principles.dependence_inversion_principle.demo1
 * @className: KingstonMemory
 * @author: chj
 * @description: 金士顿内存条
 * @date: Created in  2023/7/4 19:43
 * @version: 1.0
 */
public class KingstonMemory implements Memory{
    @Override
    public void save() {
        System.out.println("金士顿内存条在读取数据");
    }
}
