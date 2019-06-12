package com.ai.gof.behavioral.interpreter;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Stack;

public class SkyExpressionParser {
    private Stack<Interpreter> stack = new Stack<Interpreter>();

    public int parse(String str){
        String[] strItemArray = str.split(" ");
        for(String symbol:strItemArray){
            if(!OperatorUtil.isOperator(symbol)){
                Interpreter numberExpression = new NumberInterpreter(symbol);
                stack.push(numberExpression);
            }else{
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.println(String.format("出栈：%d 和 %d"
                    ,firstExpression.interpret(),secondExpression.interpret()));
                Interpreter operator =  OperatorUtil.getExpressionObject(firstExpression,secondExpression,symbol);
                System.out.println(String.format("应用运算符：%s",operator));
                int result = operator.interpret();
                NumberInterpreter resultExpression = new NumberInterpreter(result);
                stack.push(resultExpression);
                System.out.println(String.format("阶段结果入栈：%d",result));
            }
        }
        int result = stack.pop().interpret();
        return result;
    }
}
