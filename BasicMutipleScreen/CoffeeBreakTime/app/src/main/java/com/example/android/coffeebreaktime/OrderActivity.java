package com.example.android.coffeebreaktime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        TextView backOrder = (TextView) findViewById(R.id.back_order_text);
        backOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        TextView billText = (TextView) findViewById(R.id.text_order);
        billText.setText(Coffee.getBill());

        TextView totalCostText = (TextView) findViewById(R.id.text_total_cost);
        totalCostText.setText("Total cost is $" + Coffee.getCost());

        TextView checkBill = (TextView) findViewById(R.id.textview_checkbill);
        checkBill.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(OrderActivity.this, FeedbackActivity.class);
                startActivity(intent);
            }
        });
    }
}

