package com.example.rmp25;





import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

    public class MainActivity extends Activity implements View.OnClickListener {
    EditText etNum1;
    EditText etNum2;
    Button btnAdd;
    Button btnSub;
    Button btnMult;
    Button btnDiv;
    TextView tvResult;
    String oper ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMult = findViewById(R.id.btnMult);
        btnDiv = findViewById(R.id.btnDiv);
        tvResult = findViewById(R.id.tvResult);
        btnAdd.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnSub.setOnClickListener(this);


    }

        @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
        @Override
        public void onClick(View view) {
            // TODO Auto-generated method stub
            float num1;
            float num2;
            float result = 0;

            if (TextUtils.isEmpty(etNum1.getText().toString())
                    || TextUtils.isEmpty(etNum2.getText().toString())) {
                return;
            }

            num1 = Float.parseFloat(etNum1.getText().toString());
            num2 = Float.parseFloat(etNum2.getText().toString());
            switch (view.getId()) {
                    case R.id.btnAdd:
                    oper = " + ";
                    result = num1 + num2;
                    break;
                    case R.id.btnSub:
                    oper = " - ";
                    result = num1 - num2;
                    break;
                    case R.id.btnMult:
                    oper = " * ";
                    result = num1 * num2;
                    break;
                    case R.id.btnDiv:
                    oper = " / ";
                    result = num1 / num2;
                    break;
                default:

            }
            // формируем строку вывода
            tvResult.setText(num1 + "" + oper + num2 + "" + "=" + result);
        }
    }