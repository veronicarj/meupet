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
public class Sobre_Activity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sobre_activity);

		ActionBar actionBar = getActionBar();
	    actionBar.setTitle("Voltar");
	    actionBar.setSubtitle("Meu Pet - Serviços de Banho & Tosa");
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
	    	setContentView(R.layout.activity_principal);
	        return true;
	    }

		return super.onOptionsItemSelected(item);
	}	
	//Fim ActionBar		

}
