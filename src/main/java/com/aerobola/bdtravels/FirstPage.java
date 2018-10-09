package com.aerobola.bdtravels;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class FirstPage extends AppCompatActivity {

    Button buttonKhulna, buttonDhaka,buttonRajshahi,buttonBarisal,buttonChittagong
            ,buttonRangpur,buttonSylhet,buttonMymanshing;

    public Dialog mDialog;
    public Button mDialogyes, mDialogno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        createDialog();

        buttonKhulna = findViewById(R.id.btnKhulna);
        buttonDhaka = findViewById(R.id.btnDhaka);
        buttonBarisal=findViewById(R.id.btnBarisal);
        buttonRajshahi=findViewById(R.id.btnRajsahi);
        buttonChittagong=findViewById(R.id.btnChittagong);
        buttonRangpur=findViewById(R.id.btnRangpur);
        buttonSylhet=findViewById(R.id.btnSylhet);
        buttonMymanshing=findViewById(R.id.btnMymensing);



        buttonKhulna.setOnClickListener(new View.OnClickListener() {


                                            @Override
                                            public void onClick(View view) {
                                                startActivity(new Intent(FirstPage.this, ListActivityKhulna.class));
                                            }
                                        }


        );
        buttonDhaka.setOnClickListener(new View.OnClickListener() {


                                           @Override
                                           public void onClick(View view) {
                                               startActivity(new Intent(FirstPage.this, ListActivityDhaka.class));
                                           }
                                       }


        );
        buttonBarisal.setOnClickListener(new View.OnClickListener() {


                                           @Override
                                           public void onClick(View view) {
                                               startActivity(new Intent(FirstPage.this, ListActivityBarisal.class));
                                           }
                                       }


        );
        buttonRajshahi.setOnClickListener(new View.OnClickListener() {


                                           @Override
                                           public void onClick(View view) {
                                               startActivity(new Intent(FirstPage.this, ListActivityRajshahi.class));
                                           }
                                       }


        );

        buttonChittagong.setOnClickListener(new View.OnClickListener() {


                                              @Override
                                              public void onClick(View view) {
                                                  startActivity(new Intent(FirstPage.this, ListActivityChittagong.class));
                                              }
                                          }


        );

        buttonRangpur.setOnClickListener(new View.OnClickListener() {


                                                @Override
                                                public void onClick(View view) {
                                                    startActivity(new Intent(FirstPage.this, ListActivityRangpur.class));
                                                }
                                            }


        );

        buttonSylhet.setOnClickListener(new View.OnClickListener() {


                                             @Override
                                             public void onClick(View view) {
                                                 startActivity(new Intent(FirstPage.this, ListActivitySylhet.class));
                                             }
                                         }


        );

        buttonMymanshing.setOnClickListener(new View.OnClickListener() {


                                             @Override
                                             public void onClick(View view) {
                                                 startActivity(new Intent(FirstPage.this, ListActivityMymensingh.class));
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




