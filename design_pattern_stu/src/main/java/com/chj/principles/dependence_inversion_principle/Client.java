package com.chj.principles.dependence_inversion_principle;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.principles.dependence_inversion_principle.demo1
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/7/4 19:52
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer(
                new IntelCpu(),new XiJieHardDisk(),new KingstonMemory()
        );
        computer.run();
    }
}
