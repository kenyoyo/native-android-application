package com.example.android.coffeebreaktime;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {
    ArrayList<Coffee> menu = new ArrayList<Coffee>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        menu.add(new Coffee("Americano", "1.75"));
        menu.add(new Coffee("Black coffee", "1.75"));
        menu.add(new Coffee("Cappuccino", "2.00"));
        menu.add(new Coffee("Latte", "2.00"));
        menu.add(new Coffee("Macchiato", "2.05"));
        menu.add(new Coffee("Mocha", "2.15"));

        TextView seeOrderText = (TextView) findViewById(R.id.see_order_text);
        seeOrderText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, OrderActivity.class);
                startActivity(intent);
            }
        });

        TextView coffeeName1 = (TextView) findViewById(R.id.name_text_view1);
        coffeeName1.setText(menu.get(0).getCoffeeName());
        TextView coffeeCost1 = (TextView) findViewById(R.id.cost_text_view1);
        coffeeCost1.setText("$" + menu.get(0).getCoffeeCost());

        TextView coffeeName2 = (TextView) findViewById(R.id.name_text_view2);
        coffeeName2.setText(menu.get(1).getCoffeeName());
        TextView coffeeCost2 = (TextView) findViewById(R.id.cost_text_view2);
        coffeeCost2.setText("$" + menu.get(1).getCoffeeCost());

        TextView coffeeName3 = (TextView) findViewById(R.id.name_text_view3);
        coffeeName3.setText(menu.get(2).getCoffeeName());
        TextView coffeeCost3 = (TextView) findViewById(R.id.cost_text_view3);
        coffeeCost3.setText("$" + menu.get(2).getCoffeeCost());

        TextView coffeeName4 = (TextView) findViewById(R.id.name_text_view4);
        coffeeName4.setText(menu.get(3).getCoffeeName());
        TextView coffeeCost4 = (TextView) findViewById(R.id.cost_text_view4);
        coffeeCost4.setText("$" + menu.get(3).getCoffeeCost());

        TextView coffeeName5 = (TextView) findViewById(R.id.name_text_view5);
        coffeeName5.setText(menu.get(4).getCoffeeName());
        TextView coffeeCost5 = (TextView) findViewById(R.id.cost_text_view5);
        coffeeCost5.setText("$" + menu.get(4).getCoffeeCost());

        TextView coffeeName6 = (TextView) findViewById(R.id.name_text_view6);
        coffeeName6.setText(menu.get(5).getCoffeeName());
        TextView coffeeCost6 = (TextView) findViewById(R.id.cost_text_view6);
        coffeeCost6.setText("$" + menu.get(5).getCoffeeCost());

        final Button hotButton1 = (Button) findViewById(R.id.hot_button1);
        hotButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "You have order Hot " + menu.get(0).getCoffeeName() + ".", Toast.LENGTH_SHORT).show();
                Coffee.addCost(Double.parseDouble(menu.get(0).getCoffeeCost()));
                Coffee.addOrder("- Hot " + menu.get(0).getCoffeeName() + " cost: $" + menu.get(0).getCoffeeCost());
            }
        });

        final Button coolButton1 = (Button) findViewById(R.id.cool_button1);
        coolButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "You have order Iced " + menu.get(0).getCoffeeName() + ".", Toast.LENGTH_SHORT).show();
                Coffee.addCost(Double.parseDouble(menu.get(0).getCoffeeCost()));
                Coffee.addOrder("- Iced " + menu.get(0).getCoffeeName() + " cost: $" + menu.get(0).getCoffeeCost());
            }
        });

        final Button hotButton2 = (Button) findViewById(R.id.hot_button2);
        hotButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "You have order Hot " + menu.get(1).getCoffeeName() + ".", Toast.LENGTH_SHORT).show();
                Coffee.addCost(Double.parseDouble(menu.get(1).getCoffeeCost()));
                Coffee.addOrder("- Hot " + menu.get(1).getCoffeeName() + " cost: $" + menu.get(1).getCoffeeCost());
            }
        });

        final Button coolButton2 = (Button) findViewById(R.id.cool_button2);
        coolButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "You have order Iced " + menu.get(1).getCoffeeName() + ".", Toast.LENGTH_SHORT).show();
                Coffee.addCost(Double.parseDouble(menu.get(1).getCoffeeCost()));
                Coffee.addOrder("- Iced " + menu.get(1).getCoffeeName() + " cost: $" + menu.get(1).getCoffeeCost());
            }
        });

        final Button hotButton3 = (Button) findViewById(R.id.hot_button3);
        hotButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "You have order Hot " + menu.get(2).getCoffeeName() + ".", Toast.LENGTH_SHORT).show();
                Coffee.addCost(Double.parseDouble(menu.get(2).getCoffeeCost()));
                Coffee.addOrder("- Hot " + menu.get(2).getCoffeeName() + " cost: $" + menu.get(2).getCoffeeCost());
            }
        });

        final Button coolButton3 = (Button) findViewById(R.id.cool_button3);
        coolButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "You have order Iced " + menu.get(2).getCoffeeName() + ".", Toast.LENGTH_SHORT).show();
                Coffee.addCost(Double.parseDouble(menu.get(2).getCoffeeCost()));
                Coffee.addOrder("- Iced " + menu.get(2).getCoffeeName() + " cost: $" + menu.get(2).getCoffeeCost());
            }
        });

        final Button hotButton4 = (Button) findViewById(R.id.hot_button4);
        hotButton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "You have order Hot " + menu.get(3).getCoffeeName() + ".", Toast.LENGTH_SHORT).show();
                Coffee.addCost(Double.parseDouble(menu.get(3).getCoffeeCost()));
                Coffee.addOrder("- Hot " + menu.get(3).getCoffeeName() + " cost: $" + menu.get(3).getCoffeeCost());
            }
        });

        final Button coolButton4 = (Button) findViewById(R.id.cool_button4);
        coolButton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "You have order Iced " + menu.get(3).getCoffeeName() + ".", Toast.LENGTH_SHORT).show();
                Coffee.addCost(Double.parseDouble(menu.get(3).getCoffeeCost()));
                Coffee.addOrder("- Iced " + menu.get(3).getCoffeeName() + " cost: $" + menu.get(3).getCoffeeCost());
            }
        });

        final Button hotButton5 = (Button) findViewById(R.id.hot_button5);
        hotButton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "You have order Hot " + menu.get(4).getCoffeeName() + ".", Toast.LENGTH_SHORT).show();
                Coffee.addCost(Double.parseDouble(menu.get(4).getCoffeeCost()));
                Coffee.addOrder("- Hot " + menu.get(4).getCoffeeName() + " cost: $" + menu.get(4).getCoffeeCost());
            }
        });

        final Button coolButton5 = (Button) findViewById(R.id.cool_button5);
        coolButton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "You have order Iced " + menu.get(4).getCoffeeName() + ".", Toast.LENGTH_SHORT).show();
                Coffee.addCost(Double.parseDouble(menu.get(4).getCoffeeCost()));
                Coffee.addOrder("- Iced " + menu.get(4).getCoffeeName() + " cost: $" + menu.get(4).getCoffeeCost());
            }
        });

        final Button hotButton6 = (Button) findViewById(R.id.hot_button6);
        hotButton6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "You have order Hot " + menu.get(5).getCoffeeName() + ".", Toast.LENGTH_SHORT).show();
                Coffee.addCost(Double.parseDouble(menu.get(5).getCoffeeCost()));
                Coffee.addOrder("- Hot " + menu.get(5).getCoffeeName() + " cost: $" + menu.get(5).getCoffeeCost());
            }
        });

        final Button coolButton6 = (Button) findViewById(R.id.cool_button6);
        coolButton6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "You have order Iced " + menu.get(5).getCoffeeName() + ".", Toast.LENGTH_SHORT).show();
                Coffee.addCost(Double.parseDouble(menu.get(5).getCoffeeCost()));
                Coffee.addOrder("- Iced " + menu.get(5).getCoffeeName() + " cost: $" + menu.get(5).getCoffeeCost());
            }
        });
    }
}

