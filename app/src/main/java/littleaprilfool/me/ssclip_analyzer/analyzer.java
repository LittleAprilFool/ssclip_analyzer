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
    int B;
    float C;
    float D;
    float E;
    float F;
    float G;
    float H;
    int I;
    float J;
    float K;
    float L;
    float M;
    float N;
    float O;
    float P;
    float Q;
    int S;
    int T;
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
    EditText textB;
    EditText textC;
    EditText textD;
    EditText textE;
    EditText textF;
    EditText textG;
    EditText textH;
    EditText textI;
    EditText textJ;
    EditText textK;
    EditText textL;
    EditText textM;
    EditText textN;
    EditText textO;
    EditText textP;
    EditText textQ;
    EditText textS;
    EditText textT;
    EditText textU;
    EditText textV;
    EditText textW;

    TextView textX;
    TextView textY;
    TextView textZ;
    TextView textAA;
    TextView textAB;
    TextView textAC;
    TextView textAD;
    TextView textAE;
    TextView textAF;
    TextView textAG;
    TextView textAH;
    TextView textAI;
    TextView textAJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analyzer);

        add = (Button) findViewById(R.id.button);
        textB = (EditText) findViewById(R.id.textB);
        textC = (EditText) findViewById(R.id.textC);
        textD = (EditText) findViewById(R.id.textD);
        textE = (EditText) findViewById(R.id.textE);
        textF = (EditText) findViewById(R.id.textF);
        textG = (EditText) findViewById(R.id.textG);
        textH = (EditText) findViewById(R.id.textH);
        textI = (EditText) findViewById(R.id.textI);
        textJ = (EditText) findViewById(R.id.textJ);
        textK = (EditText) findViewById(R.id.textK);
        textL = (EditText) findViewById(R.id.textL);
        textM = (EditText) findViewById(R.id.textM);
        textN = (EditText) findViewById(R.id.textN);
        textO = (EditText) findViewById(R.id.textO);
        textP = (EditText) findViewById(R.id.textP);
        textQ = (EditText) findViewById(R.id.textQ);
        textS = (EditText) findViewById(R.id.textS);
        textT = (EditText) findViewById(R.id.textT);
        textU = (EditText) findViewById(R.id.textU);
        textV = (EditText) findViewById(R.id.textV);
        textW = (EditText) findViewById(R.id.textW);

        textX = (TextView) findViewById(R.id.textX);
        textY = (TextView) findViewById(R.id.textY);
        textZ = (TextView) findViewById(R.id.textZ);
        textAA = (TextView) findViewById(R.id.textAA);
        textAB = (TextView) findViewById(R.id.textAB);
        textAC = (TextView) findViewById(R.id.textAC);
        textAD = (TextView) findViewById(R.id.textAD);
        textAE = (TextView) findViewById(R.id.textAE);
        textAF = (TextView) findViewById(R.id.textAF);
        textAG = (TextView) findViewById(R.id.textAG);
        textAH = (TextView) findViewById(R.id.textAH);
        textAI = (TextView) findViewById(R.id.textAI);
        textAJ = (TextView) findViewById(R.id.textAJ);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B = Integer.parseInt(textB.getText().toString());
                C = Float.parseFloat(textC.getText().toString());
                D = Float.parseFloat(textD.getText().toString());
                E = Float.parseFloat(textE.getText().toString());
                F = Float.parseFloat(textF.getText().toString());
                G = Float.parseFloat(textG.getText().toString());
                H = Float.parseFloat(textH.getText().toString());
                I = Integer.parseInt(textI.getText().toString());
                J = Float.parseFloat(textJ.getText().toString());
                K = Float.parseFloat(textK.getText().toString());
                L = Float.parseFloat(textL.getText().toString());
                M = Float.parseFloat(textM.getText().toString());
                N = Float.parseFloat(textN.getText().toString());
                O = Float.parseFloat(textO.getText().toString());
                P = Float.parseFloat(textP.getText().toString());
                Q = Float.parseFloat(textQ.getText().toString());
                S = Integer.parseInt(textS.getText().toString());
                T = Integer.parseInt(textT.getText().toString());
                U = Float.parseFloat(textU.getText().toString());
                V = Float.parseFloat(textV.getText().toString());
                W = Float.parseFloat(textW.getText().toString());

                //Calculate Z
                int cz;
                cz = 0;
                if (V > 50) cz = cz + 1;
                if (S == 1 | S == 2) cz = cz + 1;
                if (M < 30) cz = cz + 1;
                if (L > 3) cz = cz + 1;
                textZ.setText(""+cz);

                //Display Y, related to Z
                int cy;
                cy = 0;
                if (cz == 0) cy = 1;
                if (cz == 1 | cz == 2) cy = 2;
                if (cz == 3 | cz == 4) cy = 3;
                textY.setText(""+cy);

                //Display X, related to Y
                String cx;
                cx = "NULL";
                if (cy == 1) cx = "I";
                if (cy == 2) cx = "II";
                if (cy == 3) cx = "III";
                textX.setText(""+cx);

                //Calculate AH
                int cah;
                if (K > 51) cah = 3 ;
                else if (K > 34) cah = 2;
                else cah = 1;
                textAH.setText(""+cah);

                //Calculate AI
                int cai;
                if (M > 35) cai = 1;
                else if(M > 28) cai = 2;
                else cai = 3;
                textAI.setText(""+cai);

                //Calculate AJ
                int caj;
                if (N > 17) caj = 3;
                else if(N > 15) caj = 2;
                else caj = 1;
                textAJ.setText(""+caj);

                //Calculate AE, related to AH,AI,AJ
                int cae;
                cae = cah + cai + caj + I + 1 + S + 1;
                textAE.setText(""+cae);

                //Display AG, related to AE
                int cag;
                if (cae > 9) cag = 3;
                else if (cae > 7) cag = 2;
                else cag = 1;
                textAG.setText(""+cag);

                //Display AF, related to AG
                String caf;
                caf = "NULL";
                if (cag == 1) caf = "A";
                if (cag == 2) caf = "B";
                if (cag == 3) caf = "C";
                textAF.setText(""+caf);

                //Calculate AA, related to AG
                int caa;
                caa = cag - 1;
                if (V > 50) caa = caa + 2;
                else if (U != 1) caa = caa + 1 ;
                if (P > 400) caa = caa + 1;
                caa = caa + T;
                textAA.setText(""+caa);

                //Calculate AB
                int cab;
                if (W < 10) cab = 0;
                else if (W < 14) cab = 1;
                else cab = 2;
                if (V > 50) cab = cab + 2;
                else if (U != 1) cab = cab + 1;
                if (P >= 400) cab = cab +1;
                cab = cab + T;
                textAB.setText(""+cab);

                //Calculate AC
                int cac;
                cac = cag - 1;
                if (V > 50) cac = cac + 2;
                else if (U != 1) cac = cac + 1;
                if (P >= 400) cac = cac + 1;
                cac = cac + T;
                cac = cac + B;
                if (H > 42) cac = cac + 1;
                if (M <= 41.6) cac = cac + 1;
                if (O < 40) cac = cac + 1;
                textAC.setText(""+cac);

                //Display AD, related to AC
                String cad;
                if (cac < 3) cad = "low-risk";
                else if (cac < 6) cad = "intermediate-risk";
                else cad = "high-risk";
                textAD.setText(""+cad);
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
