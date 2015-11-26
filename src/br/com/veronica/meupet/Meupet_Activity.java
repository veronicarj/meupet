/**
 * 
 */
package br.com.veronica.meupet;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/**
 * @author veronica
 *
 */
public class Meupet_Activity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.meupet_activity);
		
		ActionBar actionBar = getActionBar();
	    actionBar.setTitle("Voltar");
	    actionBar.setSubtitle("Meu Pet - Servi�os de Banho & Tosa");
		actionBar.setDisplayHomeAsUpEnabled(true);
	}
	
	//ActionBar	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.principal, menu);
	    return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		
		switch (id) {
	    case android.R.id.home:
	    	finish();
	        return true;
	    case R.id.action_info:
	    	setContentView(R.layout.sobre_activity);
	        return true;
	    }

		return super.onOptionsItemSelected(item);
	}	
	//Fim ActionBar		

}
