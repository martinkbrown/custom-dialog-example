package edu.fsu.cs.mobile.example.customdialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class CustomDialogExample extends Activity {

	SeekBar seekBar;
	EditText edit;
	Button submit;
	Dialog dialog;
	Button show;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        show = (Button) findViewById(R.id.button1);
        
        show.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				showDialog(1);
				
			}
		});
    }
    
    @Override
    protected Dialog onCreateDialog(int id) {
    	
    	dialog = new Dialog(this);

    	dialog.setContentView(R.layout.custom_dialog);
    	dialog.setTitle("Custom Dialog");

    	seekBar = (SeekBar) dialog.findViewById(R.id.seekBar1);
    	edit = (EditText) dialog.findViewById(R.id.editText1);
    	submit = (Button) dialog.findViewById(R.id.submitButton);
    	
    	seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {

				edit.setText("" + progress);
				
			}
		});
    	
    	submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				dialog.dismiss();
				
			}
		});
    	
    	return dialog;
    	
    }
}