package com.ai.gof.behavioral.interpreter;

public class Client {
    public static void main(String[] args) {
        String inputStr = "6 100 11 + *";
        SkyExpressionParser expressionParser = new SkyExpressionParser();
        int result = expressionParser.parse(inputStr);
        System.out.println(result);
    }
}
