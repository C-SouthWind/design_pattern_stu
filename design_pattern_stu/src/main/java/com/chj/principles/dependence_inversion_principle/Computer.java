package com.chj.principles.dependence_inversion_principle;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.principles.dependence_inversion_principle.demo1
 * @className: Compute
 * @author: chj
 * @description: 电脑
 * @date: Created in  2023/7/4 19:41
 * @version: 1.0
 */
public class Computer {

    private Cpu cpu;
    private HardDisk hardDisk;
    private Memory memory;

    public Computer(Cpu cpu, HardDisk hardDisk, Memory memory) {
        this.cpu = cpu;
        this.hardDisk = hardDisk;
        this.memory = memory;
    }
    public void run(){
        System.out.println("运行计算机");
        String s = hardDisk.get();
        System.out.println(s);
        cpu.run();
        memory.save();
    }
}
