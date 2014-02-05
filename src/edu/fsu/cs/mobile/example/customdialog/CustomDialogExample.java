package edu.fsu.cs.mobile.example.customdialog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CustomDialogExample extends Activity {

	private final String DIALOG_TAG = "SEEKBAR_DIALOG";
	Button show;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        show = (Button) findViewById(R.id.button1);
        
        show.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				SeekBarDialogFragment.newInstance("Custom Dialog").show(getFragmentManager(), 
						DIALOG_TAG);
			}
		});
    }
}