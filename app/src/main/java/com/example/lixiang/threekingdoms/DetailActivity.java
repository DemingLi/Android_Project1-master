package com.example.lixiang.threekingdoms;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Deming Lee on 2017/11/20.
 */

public class DetailActivity extends AppCompatActivity {
  private ImageView character_img;
  private TextView character_name;
  private TextView character_sex;
  private TextView character_birth;
  private TextView character_origin;
  private TextView character_force;
  private ImageView favorite;
  private ImageView back;
  
  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.character_details);
    
    character_img = (ImageView) findViewById(R.id.character_img);
    character_name = (TextView) findViewById(R.id.character_name);
    character_sex = (TextView) findViewById(R.id.character_sex);
    character_birth = (TextView) findViewById(R.id.character_bitrh);
    character_origin = (TextView) findViewById(R.id.character_force);
    favorite = (ImageView) findViewById(R.id.favorite);
  
    Intent intent = getIntent();
    Bundle extras = intent.getExtras();
    
    //接收人物信息并赋值
    //.......................//
    
    
    final Intent intent1 = new Intent();
    favorite.setTag("0");
    favorite.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Object tag = favorite.getTag();
        if(tag == 0) {
          Toast.makeText(getApplicationContext(), "已添加到收藏夹", Toast.LENGTH_SHORT);
          favorite.setImageResource(R.drawable.unlike);
          favorite.setTag("1");
          //这里传一个人物类，在收藏夹页面接收
          //...............//
        } else {
          Toast.makeText(getApplicationContext(), "已从收藏夹移除", Toast.LENGTH_SHORT);
          favorite.setImageResource(R.drawable.like);
          favorite.setTag("0");
          //传一个人物类，在收藏夹页面接收
          //..............//
          //  ↓ 传一个取消收藏的信号，在收藏夹页面判断，如果为yes则移除该人物
          intent1.putExtra("unlike", "yes");
        }
      }
    });
    
    
    final RelativeLayout card = (RelativeLayout) findViewById(R.id.card);
    final LinearLayout introduction = (LinearLayout) findViewById(R.id.introduction);
    //设置初始状态
    card.setVisibility(View.VISIBLE);
    introduction.setVisibility(View.INVISIBLE);
    character_img.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        card.setVisibility(View.INVISIBLE);
        introduction.setVisibility(View.VISIBLE);
      }
    });
    
    back = (ImageView) findViewById(R.id.back_to_card);
    back.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        card.setVisibility(View.VISIBLE);
        introduction.setVisibility(View.INVISIBLE);
        finish();
      }
    });
  }
}
