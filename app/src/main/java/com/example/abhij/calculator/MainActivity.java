package com.example.abhij.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView output,input;
    Button delete,sum,sub,mul,div,percent,dot,one,two,three,four,five,six,seven,eight,nine,zero,clear,equal;
    String inp="",out="", a="", op, n1,n2;
    char b;
    float num1,num2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output=findViewById(R.id.output);        input=findViewById(R.id.input);
        delete=findViewById(R.id.del);        sum=findViewById(R.id.plus);
        sub=findViewById(R.id.minus);        mul=findViewById(R.id.multiply);
        div=findViewById(R.id.divide);        percent=findViewById(R.id.percent);
        dot=findViewById(R.id.dot);        one=findViewById(R.id.one);
        two=findViewById(R.id.two);        three=findViewById(R.id.three);
        four=findViewById(R.id.four);        five=findViewById(R.id.five);
        six=findViewById(R.id.six);        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);        clear=findViewById(R.id.clear);
        equal=findViewById(R.id.eql);
    }

    public void onClkeql(View view) {
        operate(inp);
    }

    public void onClkdot(View view) {
        a=dot.getText().toString();
        inp=input.getText().toString().concat(a);
        input.setText(inp);
    }

    public void onClkzer(View view) {
        a=zero.getText().toString();
        inp=input.getText().toString().concat(a);
        input.setText(inp);
    }

    public void onClkthr(View view) {
        a=three.getText().toString();
        inp=input.getText().toString().concat(a);
        input.setText(inp);
    }

    public void onClktwo(View view) {
        a=two.getText().toString();
        inp=input.getText().toString().concat(a);
        input.setText(inp);
    }

    public void onClkone(View view) {
        a=one.getText().toString();
        inp=input.getText().toString().concat(a);
        input.setText(inp);
    }

    public void onClkplus(View view) {
        a=sum.getText().toString();
        inp=input.getText().toString().concat(a);
        input.setText(inp);
    }

    public void onClksix(View view) {
        a=six.getText().toString();
        inp=input.getText().toString().concat(a);
        input.setText(inp);
    }

    public void onClkfive(View view) {
        a=five.getText().toString();
        inp=input.getText().toString().concat(a);
        input.setText(inp);
    }

    public void onClkfour(View view) {
        a=four.getText().toString();
        inp=input.getText().toString().concat(a);
        input.setText(inp);
    }

    public void onClkminus(View view) {
        a=sub.getText().toString();
        inp=input.getText().toString().concat(a);
        input.setText(inp);
    }

    public void onClknine(View view) {
        a=nine.getText().toString();
        inp=input.getText().toString().concat(a);
        input.setText(inp);
    }

    public void onClkeight(View view) {
        a=eight.getText().toString();
        inp=input.getText().toString().concat(a);
        input.setText(inp);
    }

    public void onClkseven(View view) {
        a=seven.getText().toString();
        inp=input.getText().toString().concat(a);
        input.setText(inp);
    }

    public void onClkdel(View view) {
        inp=input.getText().toString();
        input.setText(inp.substring(0,inp.length()-1));
    }

    public void onClkdiv(View view) {
        a=div.getText().toString();
        inp=input.getText().toString().concat(a);
        input.setText(inp);
    }

    public void onClkmul(View view) {
        a=mul.getText().toString();
        inp=input.getText().toString().concat(a);
        input.setText(inp);
    }

    public void onClkclear(View view) {
        input.setText("");
    }

    public void operate(String c){
        int i,j;
        int a=c.indexOf("/");
        if(a!=-1)
        {
            for (i=a+1;i<c.length();i++)
            {
                b=c.charAt(i);
                if((b!='X')||(b!='+')||(b!='-')||(b!='/'))
                    n2=n2+b;
                else
                    break;
            }
            for (j=a-1;j>=0;j--)
            {
                b=c.charAt(j);
                if((b!='X')||(b!='+')||(b!='-')||(b!='/'))
                    n1=n1+b;
                else
                    break;
            }
            num1=Integer.parseInt(n1);
            num2=Integer.parseInt(n2);
            result=num1/num2;
            c=c.substring(0,j).concat(Float.toString(result)).concat(c.substring(i));
            output.setText(c);
            //operate(c);
        }
        /*else
        {
            a=c.indexOf("X");
            if(a!=-1)
            {
                for (i=a+1;i<c.length();i++)
                {
                    b=c.charAt(i);
                    if((b!='X')||(b!='+')||(b!='-')||(b!='/'))
                        n2=n2+b;
                    else
                        break;
                }
                for (j=a-1;j>=0;j--)
                {
                    b=c.charAt(j);
                    if((b!='X')||(b!='+')||(b!='-')||(b!='/'))
                        n1=n1+b;
                    else
                        break;
                }
                num1=Float.parseFloat(n1);
                num2=Float.parseFloat(n2);
                result=num1*num2;
                c=c.substring(0,i+1).concat(Float.toString(result)).concat(c.substring(j));
                operate(c);
            }
            else
            {
                a=c.indexOf("+");
                if(a!=-1)
                {
                    for (i=a+1;i<c.length();i++)
                    {
                        b=c.charAt(i);
                        if((b!='X')||(b!='+')||(b!='-')||(b!='/'))
                            n2=n2+b;
                        else
                            break;
                    }
                    for (j=a-1;j>=0;j--)
                    {
                        b=c.charAt(j);
                        if((b!='X')||(b!='+')||(b!='-')||(b!='/'))
                            n1=n1+b;
                        else
                            break;
                    }
                    num1=Float.parseFloat(n1);
                    num2=Float.parseFloat(n2);
                    result=num1+num2;
                    c=c.substring(0,i+1).concat(Float.toString(result)).concat(c.substring(j));
                    operate(c);
                }
                else
                {
                    a=c.indexOf("-");
                    if(a!=-1)
                    {
                        for (i=a+1;i<c.length();i++)
                        {
                            b=c.charAt(i);
                            if((b!='X')||(b!='+')||(b!='-')||(b!='/'))
                                n2=n2+b;
                            else
                                break;
                        }
                        for (j=a-1;j>=0;j--)
                        {
                            b=c.charAt(j);
                            if((b!='X')||(b!='+')||(b!='-')||(b!='/'))
                                n1=n1+b;
                            else
                                break;
                        }
                        num1=Float.parseFloat(n1);
                        num2=Float.parseFloat(n2);
                        result=num1-num2;
                        c=c.substring(0,i+1).concat(Float.toString(result)).concat(c.substring(j));
                        operate(c);
                    }
                    else
                    {
                        input.setText("");
                        output.setText(c);
                    }
                }
            }
        }*/
    }
}
