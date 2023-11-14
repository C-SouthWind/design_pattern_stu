package com.chj.interpreter;

import java.util.Map;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.interpreter
 * @className: Expression
 * @author: chj
 * @description:
 * @date: Created in  2023/9/18 19:19
 * @version: 1.0
 */
public abstract class Expression {
    //解释公式和数值， key就是公式（表达式）参数[a,b,c] value就是具体的值
    public abstract int interpreter(Map<String, Integer> val);

}
