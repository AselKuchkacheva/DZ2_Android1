package com.example.dz2_android1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private Button button;
    private TextView textView;

    private Integer number1;
    private Integer number1_l;
    private Integer number2;
    private Integer number2_l;
    private Integer number3;
    private Integer number3_l;
    private Integer res;
    private Integer res_l;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        number1_l = savedInstanceState.getInt("numStr1");
        number2_l = savedInstanceState.getInt("numStr2");
        number3_l = savedInstanceState.getInt("numStr3");
        res_l = savedInstanceState.getInt("result");
        Log.e("ololo", "onRestoreInstanceState: " + res_l);
        showResult();
    }

    private void showResult() {
        if (res_l!=null)
        textView.setText(res_l.toString());
        Log.e("ololo", "showResult: " + res_l);
    }

    private void init() {
        EditText editText1 = findViewById(R.id.num1);
        EditText editText2 = findViewById(R.id.num2);
        EditText editText3 = findViewById(R.id.num3);
        textView = findViewById(R.id.sum);
        Button button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = number1 + (number2 / number3);
               // textView.setText(res.toString());
            }
        });
//        textView.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                res = Integer.valueOf(s.toString());
//            }
//        });
        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                number1 = Integer.valueOf(s.toString());
            }
        });


        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                number2 = Integer.valueOf(s.toString());

            }
        });


        editText3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                number3 = Integer.valueOf(s.toString());
            }
        });

    }



    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("numStr1", number1);
        outState.putInt("numStr2", number2);
        outState.putInt("numStr3", number3);
        outState.putInt("result", res);

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ololo", "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ololo", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ololo", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ololo", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ololo", "onDestroy");
    }

}