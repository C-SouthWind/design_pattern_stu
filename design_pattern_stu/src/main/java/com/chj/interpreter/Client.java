package com.chj.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.interpreter
 * @className: Client
 * @author: chj
 * @description:
 * @date: Created in  2023/9/18 19:47
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        String expStr = "a+b-c";
        Map<String,Integer> var = new HashMap<>();
        var.put("a",10);
        var.put("b",5);
        var.put("c",1);
        Calculator calculator = new Calculator(expStr);
        System.out.println(calculator.run(var));
    }
}
