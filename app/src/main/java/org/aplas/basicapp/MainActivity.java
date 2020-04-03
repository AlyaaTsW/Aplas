package org.aplas.basicapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private AlertDialog startDialog;

    private Distance dist = new Distance();
    private Weight weight = new Weight();
    private Temperature temp = new Temperature();
    private Button convertBtn;
    private EditText inputTxt;
    private EditText outputTxt;
    private Spinner unitOri;
    private Spinner unitConv;
    private RadioGroup unitType;
    private CheckBox roundBox;
    private CheckBox formBox;
    private ImageView imgView;
    private String type;
    private String oriUnit;
    private String convUnit;
    private double value;
    private double val;
    private boolean rounded;

    protected double convertUnit(String type, String oriUnit, String convUnit, double value){
        this.type=type;
        this.oriUnit=oriUnit;
        this.convUnit=convUnit;
        this.value=value;

        if (type=="Temperature"){
            return temp.convert(oriUnit,convUnit,value);
        }if (type=="Distance"){
            return dist.convert(oriUnit,convUnit,value);
        }if (type=="Weight"){
            return weight.convert(oriUnit,convUnit,value);
        }
        return value;
    }

    protected String strResult(double val, boolean rounded){
        this.val = val;
        this.rounded = rounded;

        if (rounded==true){
            DecimalFormat f = new DecimalFormat("#.##");
            return Double.toString(Double.parseDouble(f.format(val)));
        } if (rounded==false) {
            DecimalFormat f2 = new DecimalFormat("#.#####");
            return Double.toString(Double.parseDouble(f2.format(val)));
        }
        return Double.toString(val);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convertBtn = (Button) findViewById(R.id.convertButton);
        inputTxt =(EditText) findViewById(R.id.inputText);
        outputTxt =(EditText) findViewById(R.id.outputText);
        unitOri =(Spinner) findViewById(R.id.oriList);
        unitConv =(Spinner) findViewById(R.id.convList);
        unitType =(RadioGroup) findViewById(R.id.radioGroup);
        roundBox =(CheckBox) findViewById(R.id.chkRounded);
        formBox =(CheckBox) findViewById(R.id.chkFormula);
        imgView =(ImageView) findViewById(R.id.img);

        unitType.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        RadioGroup unitType = (RadioGroup)findViewById(R.id.radioGroup);
                        RadioButton rbTemp = (RadioButton) findViewById(R.id.rbTemp);
                        RadioButton rbWeight = (RadioButton) findViewById(R.id.rbWeight);
                        RadioButton rbDist = (RadioButton) findViewById(R.id.rbDist);

                        if (unitType.getCheckedRadioButtonId()== -1){

                        }

                    }
                }
        );
    }

    @Override
    protected void onStart() {
        super.onStart();

        startDialog = new AlertDialog.Builder(MainActivity.this).create();
        startDialog.setTitle("Application started");
        startDialog.setMessage("This app can use to convert any units");
        startDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        startDialog.show();
    }
}
