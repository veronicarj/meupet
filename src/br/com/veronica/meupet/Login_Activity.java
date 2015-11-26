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
import android.widget.EditText;
import android.widget.Toast;

/**
 * @author veronica
 *
 */
public class Login_Activity extends Activity {
	
	EditText email,senha;
	Button btnEntrar,btnCancelar;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_activity);
		
		btnCancelar = (Button) findViewById(R.id.btnCancelar);
		btnCancelar.setOnClickListener(onClickCancelar());

		btnEntrar = (Button) findViewById(R.id.btnEntrar);
		btnEntrar.setOnClickListener(onClickEntrar());		
		
		email = (EditText) findViewById(R.id.txtEmail);
		senha = (EditText) findViewById(R.id.txtSenha);		
			   
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
	
	private OnClickListener onClickEntrar() {
		return new OnClickListener(){

	         @Override
	         public void onClick(View v) {
	            if(email.getText().toString().equals("admin") && senha.getText().toString().equals("admin")) {
	               Toast.makeText(getApplicationContext(), "Redirecionando...",Toast.LENGTH_SHORT).show();
	               setContentView(R.layout.servico_activity);
	            }else if (email.getText().toString().equals("usu") && senha.getText().toString().equals("usu")) {
		               Toast.makeText(getApplicationContext(), "Redirecionando...",Toast.LENGTH_SHORT).show();
		               setContentView(R.layout.meupet_activity);
					
				}else{
	               Toast.makeText(getApplicationContext(), "E-mail ou senha inválidos!",Toast.LENGTH_SHORT).show();
	            }
	         }
			
		};
	}	
	
	private OnClickListener onClickCancelar() {
		return new OnClickListener(){

			@Override
			public void onClick(View v) {
				finish(); //fechando a tela atual
			}
			
		};
	}

}
