package com.samoylenko.homework611;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    final static String SAVE_STATE_KEY="key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_result);
        textView.setText("Start");
        Log.d("Lifecycle", "onCreate()");
        textView.append("\n" + "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();

        textView = findViewById(R.id.text_result);
        Log.d("Lifecycle", "onStart()");
        textView.append("\n" + "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle", "onResume()");
        textView.append("\n" + "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle", "onPause()");
        textView.append("\n" + "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle", "onStop()");
        textView.append("\n" + "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle", "onDestroy()");
        textView.append("\n" + "onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lifecycle", "onRestart()");
        textView.append("\n" + "onRestart()");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d("Lifecycle", "onPostCreate()");
        textView.append("\n" + "onPostCreate()");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("Lifecycle", "onPostResume()");
        textView.append("\n" + "onPostResume()");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d("Lifecycle", "onKeyDown()");
        textView.append("\n" + "onKeyDown()");
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Log.d("Lifecycle", "onKeyLongPress()");
        textView.append("\n" + "onKeyLongPress()");
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d("Lifecycle", "onBackPressed()");
        textView.append("\n" + "onBackPressed()");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        TextView nameView = findViewById(R.id.text_result);
        outState.putString(SAVE_STATE_KEY, nameView.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        String textViewText= savedInstanceState.getString(SAVE_STATE_KEY);
        TextView nameView = findViewById(R.id.text_result);
        nameView.setText(textViewText);

        super.onRestoreInstanceState(savedInstanceState);
    }
}
