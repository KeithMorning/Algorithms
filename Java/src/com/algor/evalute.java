package com.algor;

import java.util.Stack;

class Evalute {
    public static Double cal(String input){
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        for(char x : input.toCharArray()){
            if(x == '('){
                continue;
            }else if( x == '+'){
                ops.push(String.valueOf(x));
            }else if( x == '-'){
                ops.push(String.valueOf(x));
            }else if( x == '*'){
                ops.push(String.valueOf(x));
            }else if( x == '/'){
                ops.push(String.valueOf(x));
            }else if( x == ')'){
                String op = ops.pop();
                double v = vals.pop();
                if(op.equals("+")) v = vals.pop() + v;
                else if (op.equals("-")) v = vals.pop() - v;
                else if (op.equals("*")) v = vals.pop() * v;
                else if (op.equals("/")) v = vals.pop() / v;

                vals.push(v);
            } else {
                vals.push(Double.parseDouble(String.valueOf(x)));
            }
        }

        return vals.pop();

    }
}
