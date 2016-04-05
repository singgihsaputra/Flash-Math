package org.ace.game;

import java.util.Random;

import org.ace.game.R;
import org.ace.game.R.drawable;
import org.ace.game.R.id;
import org.ace.game.R.layout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow.LayoutParams;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class Play extends Activity
{
	
	private TextView txtTimer;
	private ImageButton btnSmile;

	

	
	

	// timer to keep track of time elapsed
	private Handler timer = new Handler();
	private int secondsPassed = 0;

	
	Button a1, a2, a3, a4, a5, b1, b2, b3, b4, b5, c1, c2, c3, c4, c5, d1, d2, d3, d4, d5, e1, e2, e3, e4, e5;
	
	public static final String KEY_DIFFICULTY="";
		   public static final int DIFFICULTY_EASY = 0;
		   public static final int DIFFICULTY_MEDIUM = 1;
		   public static final int DIFFICULTY_HARD = 2;
		   
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);
		
		txtTimer = (TextView) findViewById(R.id.Timer);
		a1=(Button) findViewById(R.id.Button00);
		a2=(Button) findViewById(R.id.Button01);
		a3=(Button) findViewById(R.id.Button02);
		a4=(Button) findViewById(R.id.Button03);
		a5=(Button) findViewById(R.id.Button04);
		b1=(Button) findViewById(R.id.Button05);
		b2=(Button) findViewById(R.id.Button06);
		b3=(Button) findViewById(R.id.Button07);
		b4=(Button) findViewById(R.id.Button08);
		b5=(Button) findViewById(R.id.Button12);
		c1=(Button) findViewById(R.id.Button10);
		c2=(Button) findViewById(R.id.Button11);
		c3=(Button) findViewById(R.id.Button09);
		c4=(Button) findViewById(R.id.Button13);
		c5=(Button) findViewById(R.id.Button14);
		d1=(Button) findViewById(R.id.Button15);
		d2=(Button) findViewById(R.id.Button16);
		d3=(Button) findViewById(R.id.Button17);
		d4=(Button) findViewById(R.id.Button18);
		d5=(Button) findViewById(R.id.Button19);
		e1=(Button) findViewById(R.id.Button20);
		e2=(Button) findViewById(R.id.Button21);
		e3=(Button) findViewById(R.id.Button22);
		e4=(Button) findViewById(R.id.Button23);
		e5=(Button) findViewById(R.id.Button24);
		a1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				a1.setText(a);
				a1.setEnabled(false);
			}
		});
		a2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				a2.setText(a);
				a2.setEnabled(false);
			}
		});
		a3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				a3.setText(a);
				a3.setEnabled(false);
			}
		});
		a4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				a4.setText(a);
				a4.setEnabled(false);
			}
		});
		a5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				a5.setText(a);
				a5.setEnabled(false);
			}
		});
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				b1.setText(a);
				b1.setEnabled(false);
			}
		});
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				b2.setText(a);
				b2.setEnabled(false);
			}
		});
		b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				b3.setText(a);
				b3.setEnabled(false);
			}
		});
		b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				b4.setText(a);
				b4.setEnabled(false);
			}
		});
		
		c1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				c1.setText(a);
				c1.setEnabled(false);
			}
		});
		c2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				c2.setText(a);
				c2.setEnabled(false);
			}
		});
		c3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				c3.setText(a);
				c3.setEnabled(false);
			}
		});
		c4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				c4.setText(a);
				c4.setEnabled(false);
			}
		});
		c5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				c5.setText(a);
				c5.setEnabled(false);
			}
		});
		d1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				d1.setText(a);
				d1.setEnabled(false);
			}
		});
		d2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				d2.setText(a);
				d2.setEnabled(false);
			}
		});
		d3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				d3.setText(a);
				d3.setEnabled(false);
			}
		});
		d4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				d4.setText(a);
				d4.setEnabled(false);
			}
		});
		d5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				d5.setText(a);
				d5.setEnabled(false);
			}
		});
		e1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				e1.setText(a);
				e1.setEnabled(false);
			}
		});
		e2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				e2.setText(a);
				e2.setEnabled(false);
			}
		});
		e3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				e3.setText(a);
				e3.setEnabled(false);
			}
		});
		e4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				e4.setText(a);
				e4.setEnabled(false);
			}
		});
		e5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a=getValue();
				e5.setText(a);
				e5.setEnabled(false);
			}
		});
		// set font style for timer and mine count to LCD style
		Typeface lcdFont = Typeface.createFromAsset(getAssets(),
				"fonts/lcd2mono.ttf");
		
		txtTimer.setTypeface(lcdFont);
		
				
				
		
		
		
		
		showDialog("Good Luck", 2000, true, false);
		startNewGame();
	}
	int time;
	 private int getPuzzle(int diff) {
	      
	      switch (diff) {
	      case DIFFICULTY_HARD:
	    	  time=40;
	         break;
	      case DIFFICULTY_MEDIUM:
	    	  time=70;
	         break;
	      case DIFFICULTY_EASY:
	      default:
	         time = 100;
	         break;
	      }
	      return time;
	   }
	
	 
	public void startNewGame()
	{
		// plant mines and do rest of the calculations
		
		// display all blocks in UI
		
		
		
		int l=getIntent().getIntExtra(KEY_DIFFICULTY, DIFFICULTY_EASY);
		getPuzzle(l);
		secondsPassed=time;
		startTimer();
		
	}

	

	
	int stat=0;
	private String getValue(){
		String x="";
		Random y = new Random();
		
		if(stat==0){
		x = String.valueOf(y.nextInt(10));
		if(x.equals("0")){
			x="10";}
		this.stat=1;}
		else{
			String[] opt=new String[4];
			opt[0]="+";
			opt[1]="-";
			opt[2]="x";
			opt[3]=":";
			int a=y.nextInt(4);
			x=opt[a];
			this.stat=0;
		}
		return x;
	}

	

	

	private void winGame()
	{
		stopTimer();
		
		//set icon to cool dude
		btnSmile.setBackgroundResource(R.drawable.cool);

	

		// show message
		showDialog("You won in " + Integer.toString(secondsPassed) + " seconds!", 1000, false, true);
	}

	private void finishGame(int currentRow, int currentColumn)
	{
		
		btnSmile.setBackgroundResource(R.drawable.sad);

		// show all mines
		// disable all blocks
		
		showDialog("You tried for " + Integer.toString(secondsPassed) + " seconds!", 1000, false, false);
	}


	


	public void startTimer()
	{
		
			timer.removeCallbacks(updateTimeElasped);
			// tell timer to run call back after 1 second
			timer.postDelayed(updateTimeElasped, 1000);
		
	}

	public void stopTimer()
	{
		// disable call backs
		timer.removeCallbacks(updateTimeElasped);
	}

	// timer call back when timer is ticked
	private Runnable updateTimeElasped = new Runnable()
	{
		public void run()
		{
			long currentMilliseconds = System.currentTimeMillis();
			--secondsPassed;

			if (secondsPassed < 10)
			{
				txtTimer.setText("00" + Integer.toString(secondsPassed));
			}
			else if (secondsPassed < 100)
			{
				txtTimer.setText("0" + Integer.toString(secondsPassed));
			}
			else
			{
				txtTimer.setText(Integer.toString(secondsPassed));
			}
 
			// add notification
			timer.postAtTime(this, currentMilliseconds);
			// notify to call back after 1 seconds
			// basically to remain in the timer loop
			timer.postDelayed(updateTimeElasped, 1000);
		}
	};
	
	private void showDialog(String message, int milliseconds, boolean useSmileImage, boolean useCoolImage)
	{
		// show message
		Toast dialog = Toast.makeText(
				getApplicationContext(),
				message,
				Toast.LENGTH_LONG);

		dialog.setGravity(Gravity.CENTER, 0, 0);
		LinearLayout dialogView = (LinearLayout) dialog.getView();
		ImageView coolImage = new ImageView(getApplicationContext());
		if (useSmileImage)
		{
			coolImage.setImageResource(R.drawable.smile);
		}
		else if (useCoolImage)
		{
			coolImage.setImageResource(R.drawable.surprise);
		}
		else
		{
			coolImage.setImageResource(R.drawable.sad);
		}
		dialogView.addView(coolImage, 0);
		dialog.setDuration(milliseconds);
		dialog.show();
	}
}