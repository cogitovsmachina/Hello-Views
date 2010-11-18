package org.androidtitlan.helloviews;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.RatingBar.OnRatingBarChangeListener;

public class HelloViews extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        
        //Using Buttons
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks
                Toast.makeText(HelloViews.this, "Yay! Boton presionado", Toast.LENGTH_SHORT).show();
            }

        });
        
        //Using EditText
        final EditText edittext = (EditText) findViewById(R.id.edittext);
        edittext.setOnKeyListener(new OnKeyListener() {
        	
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                    (keyCode == KeyEvent.KEYCODE_ENTER)) {
                  // Perform action on key press
                  Toast.makeText(HelloViews.this, edittext.getText(), Toast.LENGTH_SHORT).show();
                  return true;
                }
                return false;
            }			
			
        });
        
        //Using CheckBox
        final CheckBox checkbox = (CheckBox) findViewById(R.id.checkbox);
        checkbox.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks, depending on whether it's now checked
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(HelloViews.this, "Seleccionado", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(HelloViews.this, "No seleccionado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        
        //Using Radio Buttons
       OnClickListener radio_listener = new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks
                RadioButton rb = (RadioButton) v;
                Toast.makeText(HelloViews.this, rb.getText(), Toast.LENGTH_SHORT).show();
            }
        };
        
        final RadioButton radio_red = (RadioButton) findViewById(R.id.radio_red);
        final RadioButton radio_blue = (RadioButton) findViewById(R.id.radio_blue);
        radio_red.setOnClickListener(radio_listener);
        radio_blue.setOnClickListener(radio_listener);
        
        //Using Toggle Button
        
        final ToggleButton togglebutton = (ToggleButton) findViewById(R.id.togglebutton);
        togglebutton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks
                if (togglebutton.isChecked()) {
                    Toast.makeText(HelloViews.this, "Encendido", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(HelloViews.this, "Apagado", Toast.LENGTH_SHORT).show();
                }
            }
        });
        
        //Using Rating Bar
        
        final RatingBar ratingbar = (RatingBar) findViewById(R.id.ratingbar);
        ratingbar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(HelloViews.this, "Nueva Puntuacion: " + rating, Toast.LENGTH_SHORT).show();
            }
        });
        

        
    }
}