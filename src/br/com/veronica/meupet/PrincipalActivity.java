package br.com.veronica.meupet;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class PrincipalActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
		
		ImageButton btServicos = (ImageButton) findViewById(R.id.imgbtnServicos);
		btServicos.setOnClickListener(onClickServicos());
		
		ImageButton btContato = (ImageButton) findViewById(R.id.imgbtnContato);
		btContato.setOnClickListener(onClickContato());
		
		ImageButton btMeupet = (ImageButton) findViewById(R.id.imgbtnMeuPet);
		btMeupet.setOnClickListener(onClickMeupet());	
		
		ActionBar actionBar = getActionBar();
	    actionBar.setTitle("Meu Pet");
	    actionBar.setSubtitle("Serviços de Banho & Tosa");
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
	    case R.id.action_info:
	    	setContentView(R.layout.sobre_activity);
	        return true;      
	    }
		
		return super.onOptionsItemSelected(item);
	}	
	//Fim ActionBar
	
	private OnClickListener onClickServicos() {

		return new OnClickListener(){

			@Override
			public void onClick(View arg0) {

				Intent intent = new Intent(getBaseContext(),Login_Activity.class);
				startActivity(intent);
			}
		};
	}
	
	private OnClickListener onClickMeupet() {
		return new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getBaseContext(),Login_Activity.class);
				startActivity(intent); //iniciando a tela Meu Pet
			}
		};
	}

	private OnClickListener onClickContato() {
		
		return new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(getBaseContext(), Contato_Activity.class);
				startActivity(intent);
			}
		};
	}	
		
}
