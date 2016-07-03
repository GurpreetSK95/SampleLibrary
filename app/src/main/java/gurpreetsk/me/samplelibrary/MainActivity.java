package gurpreetsk.me.samplelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import gurpreetsk.me.myfirstlibrary.SampleLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SampleLibrary.getInstance().makeToast(this, "Hello GDG");       //using library after adding it as a dependency

    }

}
