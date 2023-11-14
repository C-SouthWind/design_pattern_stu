package com.chj.principles.dependence_inversion_principle;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.principles.dependence_inversion_principle.demo1
 * @className: HardDisk
 * @author: chj
 * @description: 硬盘
 * @date: Created in  2023/7/4 19:42
 * @version: 1.0
 */
public interface HardDisk {
    void save(String data);

    String get();

}
