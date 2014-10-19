package littleaprilfool.me.ssclip_analyzer;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class analyzer extends Activity {
    float B;
    float C;
    float D;
    float E;
    float F;
    float G;
    float H;
    float I;
    float J;
    float K;
    float L;
    float M;
    float N;
    float O;
    float P;
    float Q;
    float S;
    float T;
    float U;
    float V;
    float W;
    String X;
    int Y;
    int Z;
    int AA;
    int AB;
    int AC;
    String AD;
    int AE;
    String AF;
    int AG;
    int AH;
    int AI;
    int AJ;

    Button add;
    TextView textZ;
    EditText textB;
    EditText textC;
    //todo

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analyzer);

        add = (Button) findViewById(R.id.button);
        textB = (EditText) findViewById(R.id.textB);
        textC = (EditText) findViewById(R.id.textC);
        //todo
        textZ = (TextView) findViewById(R.id.textZ);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B = Float.parseFloat(textB.getText().toString());
                C = Float.parseFloat(textC.getText().toString());
                //todo
                float Z = B+C;
                textZ.setText(""+Z);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.analyzer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
