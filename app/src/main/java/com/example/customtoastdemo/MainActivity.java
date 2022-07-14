package com.example.customtoastdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //  Default Toast
        //  Toast.makeText(getApplicationContext(), "This is my first Toast", Toast.LENGTH_LONG).show();

        btnToast = (Button)findViewById(R.id.btnToast);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(getApplicationContext());

                View view = getLayoutInflater().inflate(R.layout.custom_toast_layout, (ViewGroup)findViewById(R.id.viewContainer));
                toast.setView(view);

                TextView txtMsg = view.findViewById(R.id.txtMessage);
                txtMsg.setText("Message Sent Successfully");

                toast.setDuration(Toast.LENGTH_LONG);

                toast.setGravity(Gravity.CENTER, 0, 0);

                toast.show();
            }
        });

    }
}