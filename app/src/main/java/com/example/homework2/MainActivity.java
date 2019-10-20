//AUTHOR: Jacob Moore
//DATE: 10/20/2019

package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    double Value1 = 0.0, Value2 = 0.0;
    EditText edit1;
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8,btn_9, btn_0, btn_Add, btn_Sub, btn_Mul, btn_Div, btn_equal, btn_dec, btn_clear;
    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = (Button) findViewById(R.id.button9);
        btn_1 = (Button) findViewById(R.id.button);
        btn_2 = (Button) findViewById(R.id.button6);
        btn_3 = (Button) findViewById(R.id.button10);
        btn_4 = (Button) findViewById(R.id.button2);
        btn_5 = (Button) findViewById(R.id.button7);
        btn_6 = (Button) findViewById(R.id.button11);
        btn_7 = (Button) findViewById(R.id.button3);
        btn_8 = (Button) findViewById(R.id.button8);
        btn_9 = (Button) findViewById(R.id.button12);
        btn_dec = (Button) findViewById(R.id.button4);

        btn_Add = (Button) findViewById(R.id.button15);
        btn_Sub = (Button) findViewById(R.id.button16);
        btn_Mul = (Button) findViewById(R.id.button17);
        btn_Div = (Button) findViewById(R.id.button18);

        btn_equal = (Button) findViewById(R.id.button5);
        btn_clear = (Button) findViewById(R.id.button14);

        edit1 = (EditText) findViewById(R.id.editText);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"9");
            }
        });

        btn_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!edit1.getText().toString().contains(".")){ //see if a decimal already exists and make sure only one is on editText line
                    edit1.setText(edit1.getText()+".");
                }
            }
        });

        //clears and resets all variables
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText("");
                add = false;
                sub = false;
                mul = false;
                div = false;
                Value1 = 0.0;
                Value2 = 0.0;
            }
        });

        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (add | sub | mul | div){
                    add = true; //if a boolean is set make sure the new selected one is now selected instead
                    sub = false;
                    mul = false;
                    div = false;
                }
                else {
                    Value1 = Double.parseDouble(edit1.getText().toString());
                    add = true;
                    sub = false;
                    mul = false;
                    div = false;
                    edit1.setText("");
                }
            }
        });

        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (add | sub | mul | div){
                    add = false; //if a boolean is set make sure the new selected one is now selected instead
                    sub = true;
                    mul = false;
                    div = false;
                }
                else {
                    Value1 = Double.parseDouble(edit1.getText().toString());
                    add = false;
                    sub = true;
                    mul = false;
                    div = false;
                    edit1.setText("");
                }

            }
        });

        btn_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (add | sub | mul | div){
                    add = false; //if a boolean is set make sure the new selected one is now selected instead
                    sub = false;
                    mul = true;
                    div = false;
                }
                else {
                    Value1 = Double.parseDouble(edit1.getText().toString());
                    add = false;
                    sub = false;
                    mul = true;
                    div = false;
                    edit1.setText("");
                }
            }
        });

        btn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (add | sub | mul | div){
                    add = false; //if a boolean is set make sure the new selected one is now selected instead
                    sub = false;
                    mul = false;
                    div = true;
                }
                else {
                    Value1 = Double.parseDouble(edit1.getText().toString());
                    add = false;
                    sub = false;
                    mul = false;
                    div = true;
                    edit1.setText("");
                }
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try { //just incase the user doesnt insert a second value
                    Value2 = Double.parseDouble(edit1.getText().toString());
                }
                catch(Exception ex){
                    edit1.setText(String.valueOf(Value1));
                }


                if (add) {
                    edit1.setText(String.valueOf(Value1 + Value2));
                }
                else if (sub) {
                    edit1.setText(String.valueOf(Value1 - Value2));
                }
                else if (mul) {
                    edit1.setText(String.valueOf(Value1 * Value2));
                }
                else if (div) {
                    edit1.setText(String.valueOf(Value1 / Value2));
                }
                else {
                    //do nothing
                }

                //reset for further calculations
                add = false;
                sub = false;
                mul = false;
                div = false;
                Value1 = Double.parseDouble(edit1.getText().toString());
                Value2 = 0.0;

            }
        });
    }

}
