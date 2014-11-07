package noah.pena.roshantimer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements OnClickListener 
{
	private PowerManager.WakeLock wl;
	
	ToggleButton dotaButton;
	
	public static boolean dotaMode = false;
	PowerManager pm;
	
	public void onCreate(Bundle bundleInstance)
	{
		super.onCreate(bundleInstance);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
		
		dotaButton = (ToggleButton)findViewById(R.id.toggleButtonDotaMode);
		
		pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
        wl = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "DoNjfdhotDimScreen");

        wl.release();
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.toggleButtonDotaMode)
		{
			if(dotaButton.getText().toString().equals("Dota 2 Mode OFF"))
			{
				dotaMode = false;
				wl.release();
			} else {
				dotaMode = true;
				wl.acquire();
			}
		}
	}

}
