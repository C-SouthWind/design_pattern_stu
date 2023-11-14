package com.chj.interpreter;

import java.util.Map;
import java.util.Stack;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.interpreter
 * @className: Calculator
 * @author: chj
 * @description:
 * @date: Created in  2023/9/18 19:19
 * @version: 1.0
 */
public class Calculator {

    //定义表达式
    private Expression expression;

    //构造函数传参，并解析
    public Calculator(String expStr) {
        //安排运算先后顺序
        Stack<Expression> stack = new Stack<>();
        //表达式拆分成字符数组 expStr = a + b   拆分之后  [a,+,b]
        char[] charArray = expStr.toCharArray();

        Expression left = null;
        Expression right = null;

        //遍历字符数组
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]){
                case '+':
                    //从stack取出left
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left,right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left,right));
                    break;
                default:
                    //如果是一个var 就创建要给VarExpression 对象，并push到stack
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        this.expression = stack.pop();
    }

    public int run(Map<String, Integer> var){
        return this.expression.interpreter(var);
    }















































}
