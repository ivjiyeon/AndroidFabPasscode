//Jiyeon Byun
//1155086596
package edu.cuhk.csci3310;

import androidx.appcompat.app.AppCompatActivity;

//import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Context context = getApplicationContext();
    String success = "Bingo!";
    String fail = "Incorrect Passcode";
    private String mPasscode = "";
    private TextView mShowPasscode;
    private ImageView image;
    //int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowPasscode = (TextView) findViewById(R.id.passcodeView);
        image = (ImageView) findViewById(R.id.hidden_bird);
    }

    //Whenever number buttons are clicked, this handler will be called
    //As button is clicked, it'll update mPasscode to show what buttons are clicked
    public void updatePasscode(View view) {
        //as the passcode is clicked, update mPasscode
        Button button = (Button) view;
        String text = button.getText().toString();
        mPasscode = mPasscode + text;
        //mPasscode=Integer.parseInt(temp);
        mShowPasscode.setText(mPasscode);
    }

    //When unlock button is clicked, this handler will be called
    //it will check if the password is correct
    public void unlockPasscode(View view) {
        String finalP = mShowPasscode.getText().toString();
        //Button b = (Button) view.findViewWithTag("button");
        Button button = (Button) view;
        //check if the passcode matches, "Bingo!" & show image & disable number buttons
        if (finalP.equals("986596")) {
            image.setVisibility(View.VISIBLE);
            Toast.makeText(this, success, Toast.LENGTH_SHORT).show();
            //b.setEnabled(false);
            for (int i = 1; i < 10; i++) {
                int id = getResources().getIdentifier("button" + i, "id", getPackageName());
                button = findViewById(id);
                button.setEnabled(false);
            }
        }

        //toast message "Incorrect Passcode" and reset the passcode
        else {
            Toast.makeText(this, fail, Toast.LENGTH_SHORT).show();
            mShowPasscode.setText("");
            mPasscode = mShowPasscode.getText().toString();
        }
    }
}