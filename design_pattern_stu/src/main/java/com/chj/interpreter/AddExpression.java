package com.chj.interpreter;



import java.util.Map;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.interpreter
 * @className: AddExpression
 * @author: chj
 * @description:
 * @date: Created in  2023/9/18 19:16
 * @version: 1.0
 */
public class AddExpression extends SymbolExpression{

    public AddExpression(Expression left, Expression right) {
        super(left,right);
    }

    public int interpreter(Map<String, Integer> val){
        return super.left.interpreter(val) + super.right.interpreter(val);

    }

}
