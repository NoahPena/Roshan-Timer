package noah.pena.roshantimer;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends Activity 
{
	
	public void onCreate(Bundle bundleInstance)
	{
		super.onCreate(bundleInstance);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
		
		
	}

}
