/**
 * 
 */
package br.com.veronica.meupet;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class Contato_Activity extends Activity{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contato_activity);
		
		TextView telefone = (TextView) findViewById(R.id.txtTelefone);
		telefone.setOnClickListener(onClickLigar());
		
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
	    	setContentView(R.layout.sobre_activity);
	        return true;
	    }

		return super.onOptionsItemSelected(item);
	}	
	//Fim ActionBar		
	
	private OnClickListener onClickLigar() {
		return new OnClickListener(){

			@Override
			public void onClick(View v) {
				TextView telefone = (TextView) findViewById(R.id.txtTelefone);
				Uri uri = Uri.parse("tel:"+ telefone.getText().toString()); 
				Intent intent = new Intent(Intent.ACTION_CALL,uri); startActivity(intent); 				
			}
			
		};
	}	
}
