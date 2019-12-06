package com.example.social_networking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements ShowDialog.ShowDialogListener {
    private Button button1;
    private Button button2;
    private Button button3;

    public static String app = "g";

    public String val(String s) {
        return s;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=new Intent(this,ShowDialog.class);
        intent.putExtra("no",10);
        startActivity(intent);

        button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openDialog("g");
            }
        });
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog("y");
            }
        });
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog("f");
            }
        });
    }

    /*// Launch Google Chrome after clicking the button
    public void launchGoogleChrome(View view) {
        Intent launchGoogleChrome = getPackageManager().getLaunchIntentForPackage("com.android.chrome");
        startActivity(launchGoogleChrome);
    }

    // Launch Facebook Application after clicking the button
    public void launchFacebookApplication(View view) {
        Intent launchFacebookApplication = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
        startActivity(launchFacebookApplication);
    }

    // Launch YouTube App after clicking the button
    public void launchYouTube(View view) {
        Intent launchYouTube = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
        startActivity(launchYouTube);
    }*/

    public void openDialog(String s) {
        ShowDialog exampleDialog = new ShowDialog();
        exampleDialog.show(getSupportFragmentManager(), "Dialog");
    }

    @Override
    public void onYesClicked(String s) {
        Intent launchFacebookApplication = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
        startActivity(launchFacebookApplication);
        if(s == "g") {
            Intent launchGoogleChrome = getPackageManager().getLaunchIntentForPackage("com.android.chrome");
            startActivity(launchGoogleChrome);
        }
        else if (s == "f")
        {
           // Intent launchFacebookApplication = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
           // startActivity(launchFacebookApplication);
        }
        else if(s == "y")
        {
            Intent launchYouTube = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
            startActivity(launchYouTube);
        }
    }
}
