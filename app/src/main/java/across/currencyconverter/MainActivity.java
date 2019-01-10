package across.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1;
    Double d1,d2;

    public void con(View view){

        ed1 =(EditText)findViewById(R.id.ed1);

        d1=Double.parseDouble(ed1.getText().toString());
        d2=d1*60;
        Toast.makeText(this, "$"+d2.toString(), Toast.LENGTH_SHORT).show();

        Log.i("this ", ed1.getText().toString());

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
