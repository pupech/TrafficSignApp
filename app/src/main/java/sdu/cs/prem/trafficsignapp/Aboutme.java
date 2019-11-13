package sdu.cs.prem.trafficsignapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Aboutme extends AppCompatActivity {

    //Explicit
    TextView fbTextView,telTextView,eduTextView ;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutme);


        fbTextView = findViewById(R.id.tv_fb);
        fbTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fbIntent = new Intent(Intent.ACTION_VIEW);
                fbIntent.setData(Uri.parse("https://www.facebook.com/profile.php?id=100003102044729"));
                startActivity(fbIntent);
            }
        }); //end fb

        telTextView = findViewById(R.id.tv_tel);
        telTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telIntent = new Intent(Intent.ACTION_DIAL);
                telIntent.setData(Uri.parse("tel:0874149293"));
                startActivity(telIntent);
            }
        });

        eduTextView = findViewById(R.id.tv_edm);
        final Uri localtion = Uri.parse("http://map.gogle.com/map?z=10&q=loc:13.776758,100.511322('มหาลัยสวนดุสิต')");
        eduTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW,localtion);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        backButton = findViewById(R.id.bt_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    } // end method
} // end class
