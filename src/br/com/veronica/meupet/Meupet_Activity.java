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
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * @author veronica
 *
 */
public class Meupet_Activity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_activity);
		
		Button btnCancelar = (Button) findViewById(R.id.btnCancelar);
		btnCancelar.setOnClickListener(onClickSair());
		
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
	    	finish();
	        return true;
	    case R.id.action_info:
	        return true;
	    }

		return super.onOptionsItemSelected(item);
	}	
	//Fim ActionBar		

	private OnClickListener onClickSair() {
		return new OnClickListener(){

			@Override
			public void onClick(View v) {
				finish(); //fechando a tela atual
			}
			
		};
	}

}
