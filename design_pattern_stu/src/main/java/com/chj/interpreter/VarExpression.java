package com.chj.interpreter;

import java.util.Map;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.interpreter
 * @className: VarExpression
 * @author: chj
 * @description:
 * @date: Created in  2023/9/18 19:24
 * @version: 1.0
 */
public class VarExpression extends Expression{

    private String key; //变量的解释器  a,b,c

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(Map<String, Integer> val) {
        return val.get(key);
    }
}
