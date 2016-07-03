package gurpreetsk.me.myfirstlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Gurpreet on 03/07/16.
 */
public class SampleLibrary {
    private static SampleLibrary ourInstance = new SampleLibrary();     //only this class can use and create object(ONLY ONE OBJECT)

    public static SampleLibrary getInstance() {
        return ourInstance;
    }

    private SampleLibrary() {
    }

    public void makeToast(Context context, String details){
        Toast.makeText(context, "Awesome! "+details, Toast.LENGTH_SHORT).show();
    }


}
