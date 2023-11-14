package com.chj.interpreter;

import java.util.Map;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.interpreter
 * @className: SymbolExpression
 * @author: chj
 * @description:
 *  抽象运算符号解析器，每个运算符号，都只和自己左右两个数字有关系
 *  但左右两个数字也可能是一个解析结果，无论何种类型，都是Expression的是实现类
 *
 * @date: Created in  2023/9/18 19:17
 * @version: 1.0
 */
public class SymbolExpression extends Expression{
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(Map<String, Integer> val) {
        return 0;
    }
}
