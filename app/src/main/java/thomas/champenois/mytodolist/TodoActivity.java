package thomas.champenois.mytodolist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by champent on 15/01/2018.
 */
public class TodoActivity extends Activity implements
        View.OnClickListener {
    private Button btnValider ;
    private Button btnVider;
    private TextView textView;
    private EditText editText;
    private String totalText;

    @Override
public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_layout);

        btnValider = (Button) findViewById(R.id.buttonValider);
        btnValider.setOnClickListener(this) ;

        btnVider = (Button) findViewById(R.id.buttonVider);
        btnVider.setOnClickListener(this) ;

        textView = (TextView) findViewById(R.id.TextView);
        textView.setOnClickListener(this) ;

        editText = (EditText) findViewById(R.id.editText);
        editText.setOnClickListener(this) ;
        }
@Override
public void onClick(View v) {
    totalText=textView.getText().toString() + editText.getText().toString()+"/n";
    if(v.getId()==R.id.buttonValider){
        textView.setText(totalText);
        editText.setText("");
    }
    if(v.getId()==R.id.buttonVider){
        textView.setText("");
    }
        Toast.makeText(getApplicationContext(),"Bouton cliqué",Toast.LENGTH_SHORT).show();
        }
        }