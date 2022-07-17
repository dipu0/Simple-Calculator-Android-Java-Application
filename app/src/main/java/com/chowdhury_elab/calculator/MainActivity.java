package com.chowdhury_elab.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6,
            btn7, btn8, btn9, btnDot, btnDel, btnAdd, btnSub, btnDiv, btnMul, btnEql;

    TextView tv1, tv2;

    boolean check_Operator = true;
    boolean check_Dot = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnDel = (Button) findViewById(R.id.btnDel);
        btnEql = (Button) findViewById(R.id.btnEql);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"1");
                check_Operator = false;
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"2");
                check_Operator = false;
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"3");
                check_Operator = false;
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"4");
                check_Operator = false;
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"5");
                check_Operator = false;
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"6");
                check_Operator = false;
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"7");
                check_Operator = false;
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"8");
                check_Operator = false;
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"9");
                check_Operator = false;
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"0");
                check_Operator = false;
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tv1.getText().toString().isEmpty() || check_Operator){
                    tv1.setText(tv1.getText()+"0.");
                    check_Operator = true;
                    check_Dot = true;
                }
                else if(!check_Dot){
                    tv1.setText(tv1.getText()+".");
                    check_Operator = true;
                    check_Dot = true;
                }

            }
        });
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btnfordel = tv1.getText().toString();
                if(!btnfordel.isEmpty()){
                    check_Operator = false;
                    check_Dot = false;
                    //tv1.setText("");
                    tv1.setText(btnfordel.substring(0, btnfordel.length() - 1));
                }

            }
        });

        btnDel.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tv1.setText("");
                tv2.setText("=");

                check_Operator = true;
                check_Dot = false;
                return false;
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!check_Operator){
                    tv1.setText(tv1.getText()+"+");
                    check_Operator = true;
                    check_Dot = false;
                }
                else if(tv1.getText().toString().isEmpty()){
                    tv1.setText(tv1.getText()+"0+");
                    check_Operator = true;
                    check_Dot = true;
                }

            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!check_Operator) {
                    tv1.setText(tv1.getText() + "-");
                    check_Operator = true;
                    check_Dot = false;
                }
                else if(tv1.getText().toString().isEmpty()){
                    tv1.setText(tv1.getText()+"0-");
                    check_Operator = true;
                    check_Dot = true;
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!check_Operator) {
                    tv1.setText(tv1.getText() + "×");
                    check_Operator = true;
                    check_Dot = false;
                }
                else if(tv1.getText().toString().isEmpty()){
                    tv1.setText(tv1.getText()+"0×");
                    check_Operator = true;
                    check_Dot = true;
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!check_Operator) {
                    tv1.setText(tv1.getText() + "÷");
                    check_Operator = true;
                    check_Dot = false;
                }
                else if(tv1.getText().toString().isEmpty()){
                    tv1.setText(tv1.getText()+"0÷");
                    check_Operator = true;
                    check_Dot = true;
                }
            }
        });

        btnEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String clck = (String) tv1.getText();
                clck = clck.replace("×","*");
                clck = clck.replace("÷", "/");

                if(clck.isEmpty() || check_Operator){

//                    tv1.setText("");
//                    check_Operator = false;
//                    check_Dot = false;
                    Toast.makeText(getApplicationContext(),"Please complete equation!",Toast.LENGTH_SHORT).show();
                }
                else{
                    String postfix = ExpCalculator.infixToPostfix(clck);
                    double result = ExpCalculator.evalPostfix(postfix);
                    if((int) result == (double) result){
                        tv2.setText("= "+ (int)result);
                    }
                    else tv2.setText("= "+ result);
                    tv1.setText("");
                    System.out.println(result);

                    check_Operator = true;
                    check_Dot = false;
                }
            }
        });


    }

}

class ExpCalculator{
    //evaluate a postfix expression and return its value
    public static double evalPostfix(String postfixExp){

        int index = 0;
        Stack<Double> arr = new Stack<Double>();
        double result = 0;
        //traversing throughout the string postfixExp
        for(int i = 0; i < postfixExp.length(); i++)
        {
            char c = postfixExp.charAt(i);
            //This checks for spaces and skips over them
            if(c == ' ')
                continue;
                //Checking for double digits, so if it's a digit, then continue to take in and add the value
            else if(Character.isDigit(c))
            {
                double x = 0.0;
                boolean check = true;
                //Checking for decimal places in case of a double
                while(Character.isDigit(c) || c == '.')
                {
                    //Calculate the value of the numbers before the decimal point
                    if(c!= '.' && check == true){
                        x = x*10 + (double)(c-'0');
                        i++;
                        c = postfixExp.charAt(i);
                    }
                    //Calculate the value of the numbers after the decimal point
                    else{
                        check = false;
                        x = x + 0.1 + (double)(c-'0')/10;
                        i++;
                        c = postfixExp.charAt(i);
                    }
                }
                i--;
                arr.push(x);
            }
            else
            {
                //Else if the character in postfixExp isn't a decimal point, space, or number, it's an operator
                //The switch case calculates the different values depending on the operator given
                double val1 = arr.pop();
                double val2 = arr.pop();
                switch(c)
                {
                    case '+':
                        arr.push(val2+val1);
                        break;

                    case '-':
                        arr.push(val2- val1);
                        break;

                    case '/':
                        if (val1 == 0)throw new ArithmeticException();
                        arr.push(val2/val1);
                        break;

                    case '*':
                        arr.push(val2*val1);
                        break;

                    case '^':
                        for(int x = 1; x< val1; x++)val2*=val2;
                        arr.push(val2);
                        break;

                    default:
                        throw new ArithmeticException();
                }
            }
        }
        return arr.pop();
    }

    public static String infixToPostfix(String exp){
        String result = "";
        Stack<Character> arr = new Stack<>();
        for (int i = 0; i <exp.length() ; i++) {
            char c = exp.charAt(i);
            //check if char is operator
            if(precedence(c)>0){
                //take off the top of the stack in order to check its precedence
                while(arr.isEmpty()==false && precedence(arr.peek())>=precedence(c)){
                    result += arr.pop();
                }
                result += ' ';
                arr.push(c);
                //checking for parentheses in order to determine precedence
            }else if(c==')'){
                char x = arr.pop();
                while(x!='('){
                    result += x;
                    x = arr.pop();
                }
            }else if(c=='('){
                arr.push(c);
            }else{
                //character is neither operator nor (
                result += c;
            }
        }
        for (int i = 0; i <=arr.size() ; i++) {
            result += arr.pop();
        }
        return result;
    }

    //Checks the precedence of the operator
    static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

}