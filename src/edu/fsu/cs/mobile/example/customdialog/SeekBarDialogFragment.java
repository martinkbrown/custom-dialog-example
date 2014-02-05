package edu.fsu.cs.mobile.example.customdialog;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class SeekBarDialogFragment extends DialogFragment {
	public static SeekBarDialogFragment newInstance(String title) {
		SeekBarDialogFragment alertFragment = new SeekBarDialogFragment();
		Bundle args = new Bundle();
		args.putString("title", title);
		alertFragment.setArguments(args);
		return alertFragment;
	}
	
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		String title = getArguments().getString("title");
		
		final Dialog dialog = new Dialog(getActivity());
		
		dialog.setTitle(title);
		dialog.setContentView(R.layout.custom_dialog);
		
		SeekBar seekBar = (SeekBar) dialog.findViewById(R.id.seekBar1);
		final EditText edit = (EditText) dialog.findViewById(R.id.editText1);
		Button submit = (Button) dialog.findViewById(R.id.submitButton);
		
		seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				
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
