package com.aerobola.bdtravels;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class FirstPage extends AppCompatActivity {

    Button buttonKhulna;

    public Dialog mDialog;
    public Button mDialogyes, mDialogno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        createDialog();

        buttonKhulna = findViewById(R.id.btnKhulna);


        buttonKhulna.setOnClickListener(new View.OnClickListener() {


                                            @Override
                                            public void onClick(View view) {
                                                startActivity(new Intent(FirstPage.this, ListActivityKhulna.class));
                                            }
                                        }


        );
    }

    private void createDialog() {
        mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.setContentView(R.layout.dialog_exit);

        mDialog.setCanceledOnTouchOutside(true);
        mDialog.setCancelable(true);
        mDialogyes = (Button) mDialog.findViewById(R.id.yes);
        mDialogno = (Button) mDialog.findViewById(R.id.No);
        mDialogyes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // moveTaskToBack(true);
                // finish();
                // finishAffinity();

                Intent intent = new Intent(Intent.ACTION_MAIN);
                // intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addCategory(Intent.CATEGORY_HOME);
                startActivity(intent);
                finish();
                System.exit(0);
                // android.os.Process.killProcess(android.os.Process.myPid());
            }
        });

        mDialogno.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mDialog.dismiss();
            }
        });

    }

    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        mDialog.show();

    }
}




