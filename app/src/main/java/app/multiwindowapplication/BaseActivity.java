package app.multiwindowapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;

public abstract class BaseActivity extends AppCompatActivity {
    private AppCompatTextView mView;

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        mView = findViewById(R.id.textView);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (mView != null)
            mView.setText(mView.getText() + "onCreate" + "\n");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mView.setText(mView.getText() + "onPostCreate" + "\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        mView.setText(mView.getText() + "onResume" + "\n");
    }

    @Override
    protected void onStart() {
        super.onStart();
        mView.setText(mView.getText() + "onStart" + "\n");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        mView.setText(mView.getText() + "onRestart" + "\n");
    }

    @Override
    protected void onPause() {
        super.onPause();
        mView.setText(mView.getText() + "onPause" + "\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        mView.setText(mView.getText() + "onStop" + "\n");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mView.setText(mView.getText() + "onSaveInstanceState" + "\n");
    }
}
