package com.zhy.highlight;

import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                show1();
            }
        }, 300);
    }

    private void show1() {
        HighLight hightLight = new HighLight(MainActivity.this)
                .anchor(findViewById(R.id.id_container))
                .addHighLight(R.id.btn1, R.layout.info_gravity_right_up, new HighLight.OnPosCallback() {

                    @Override
                    public void getPos(float rightMargin, float bottomMargin, RectF rectF, HighLight.MarginInfo marginInfo) {
                        marginInfo.rightMargin = rightMargin;
                        marginInfo.topMargin = rectF.top + rectF.height();
                    }
                })
                .setClickCallback(new HighLight.OnClickCallback() {
                    @Override
                    public void onClick() {
                        show2();
                    }
                });
        hightLight.show();
    }

    private void show2() {
        HighLight hightLight = new HighLight(MainActivity.this)
                .anchor(findViewById(R.id.id_container))
                .addHighLight(R.id.btn2, R.layout.info_gravity_right_up, new HighLight.OnPosCallback() {

                    @Override
                    public void getPos(float rightMargin, float bottomMargin, RectF rectF, HighLight.MarginInfo marginInfo) {
                        marginInfo.rightMargin = rightMargin;
                        marginInfo.topMargin = rectF.top + rectF.height();
                    }
                })
                .setClickCallback(new HighLight.OnClickCallback() {
                    @Override
                    public void onClick() {
                        show3();
                    }
                });
        hightLight.show();
    }

    private void show3() {
        HighLight hightLight = new HighLight(MainActivity.this)
                .anchor(findViewById(R.id.id_container))
                .addHighLight(R.id.btn3, R.layout.info_gravity_right_up, new HighLight.OnPosCallback() {

                    @Override
                    public void getPos(float rightMargin, float bottomMargin, RectF rectF, HighLight.MarginInfo marginInfo) {
                        marginInfo.rightMargin = rightMargin;
                        marginInfo.topMargin = rectF.top + rectF.height();
                    }
                })
                .setClickCallback(new HighLight.OnClickCallback() {
                    @Override
                    public void onClick() {
                        show4();
                    }
                });
        hightLight.show();
    }

    private void show4() {
        HighLight hightLight = new HighLight(MainActivity.this)
                .anchor(findViewById(R.id.id_container))
                .addHighLight(R.id.btn4, R.layout.info_gravity_left_down, new HighLight.OnPosCallback() {
                    @Override
                    public void getPos(float rightMargin, float bottomMargin, RectF rectF, HighLight.MarginInfo marginInfo) {
                        marginInfo.leftMargin = rectF.right - rectF.width()/2;
                        marginInfo.bottomMargin = bottomMargin + rectF.height();
                    }
                })
                .setClickCallback(new HighLight.OnClickCallback() {
                    @Override
                    public void onClick() {
                        show5();
                    }
                });
        hightLight.show();
    }

    private void show5() {
        HighLight hightLight = new HighLight(MainActivity.this)
                .anchor(findViewById(R.id.id_container))
                .addHighLight(R.id.btn5, R.layout.info_gravity_left_down, new HighLight.OnPosCallback() {
                    @Override
                    public void getPos(float rightMargin, float bottomMargin, RectF rectF, HighLight.MarginInfo marginInfo) {
                        marginInfo.leftMargin = rectF.right - rectF.width()/2;
                        marginInfo.bottomMargin = bottomMargin + rectF.height();
                    }
                })
                .setClickCallback(new HighLight.OnClickCallback() {
                    @Override
                    public void onClick() {
                        Toast.makeText(MainActivity.this, "over", Toast.LENGTH_SHORT).show();
                    }
                });
        hightLight.show();
    }
}
