package com.example.kevinlee.dotmorsage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {

    private Vibrator vibrator;
    private String outputString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {
                case 0: return TranslateFragment.newInstance();
                case 1: return InfoFragment.newInstance();
                default: return InfoFragment.newInstance();
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }

    public void translate(View view) {
        InputMethodManager inputManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow((null == getCurrentFocus()) ? null : getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);

        RadioButton morseToEng = (RadioButton) findViewById(R.id.morseToEngRadio);
        RadioButton engToMorse = (RadioButton) findViewById(R.id.engToMorseRadio);

        Button sendButton = (Button) findViewById(R.id.sendButton);
        Button copyButton = (Button) findViewById(R.id.copyButton);
        TextView outputMessage = (TextView) findViewById(R.id.outputMessage);
        EditText msgEditText = (EditText) findViewById(R.id.message);

        String userMessage = msgEditText.getText().toString();
        StringToDots output = new StringToDots(userMessage);

        if(engToMorse.isChecked()) {
            outputString = output.turnItIntoDots();
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(StringToVibrations.concatenateWord(userMessage), -1);
            }

        }

        if(morseToEng.isChecked()) {
            outputString = output.turnItIntoWords();
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(StringToVibrations.concatenateWord(outputString), -1);
            }

        }

        outputMessage.setText(outputString);
        sendButton.setVisibility(View.VISIBLE);
        copyButton.setVisibility(View.VISIBLE);
    }

    public void sendMessage(View view) {
        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.setType("vnd.android-dir/mms-sms");
        sendIntent.putExtra("sms_body", outputString);
        startActivity(sendIntent);
    }

    public void copyToClip(View view) {
        TextView outputMessage = (TextView) findViewById(R.id.outputMessage);
        String toCopy = outputMessage.getText().toString();
        ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Morsage", toCopy);
        clipboard.setPrimaryClip(clip);
        Toast.makeText(MainActivity.this, "Copied to clipboard",
                Toast.LENGTH_SHORT).show();
    }

    public void engToMorse(View view) {
        RadioButton morseToEng = (RadioButton) findViewById(R.id.morseToEngRadio);
        RadioButton engToMorse = (RadioButton) findViewById(R.id.engToMorseRadio);

        if(!engToMorse.isChecked()) {
            morseToEng.setChecked(false);
        }
    }

    public void morseToEng(View view) {
        RadioButton morseToEng = (RadioButton) findViewById(R.id.morseToEngRadio);
        RadioButton engToMorse = (RadioButton) findViewById(R.id.engToMorseRadio);

        if(!morseToEng.isChecked()) {
            engToMorse.setChecked(false);
        }
    }

}
