package a.b.c;
/* Simple Code to understand the concept of Activity
 * Import the project and run for best results
 * Author: Shashank S Mirji
 * email: shashankmirji@gmail.com*/



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity1 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);            /// Set the layout to main
        
        Button b1=(Button)findViewById(R.id.next); /// Instance of button
        
        b1.setOnClickListener(new OnClickListener() { 
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
		Intent i1=new Intent();                  // Intent to link pages a very important concept
		i1.setClass(getApplicationContext(), Activity2.class);
		startActivity(i1);
				
			}
		});
        
    }
}