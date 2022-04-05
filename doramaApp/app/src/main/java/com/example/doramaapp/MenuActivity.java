package com.example.doramaapp;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MenuActivity extends AppCompatActivity {
    PageController pageController;
    TabLayout tableLayout;
    ViewPager view;
    TabItem tab1, tab2, tab3, tab4;
    LinearLayout menu,escucha,calendar;
    ImageView img_menu,img_escucha,img_calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN,WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);
        setContentView(R.layout.activity_menu);
        //showSelectedFragment(new NoticiasFragment());
        tableLayout = findViewById(R.id.Tablayout);
        view = (ViewPager)findViewById(R.id.contenedor);

        menu=findViewById(R.id.menu_icon);
        escucha=findViewById(R.id.escuchamos_icon);
        calendar=findViewById(R.id.calendario_icon);

        img_menu=findViewById(R.id.img_menu);
        img_escucha=findViewById(R.id.img_escucha);
        img_calendar=findViewById(R.id.img_calendar);

        tab1 = findViewById(R.id.noticias);
        tab2 = findViewById(R.id.escuchar);
        //tab3 = findViewById(R.id.oportunidad);
        tab4 = findViewById(R.id.agenda);

        pageController = new PageController(getSupportFragmentManager(), tableLayout.getTabCount());
        view.setAdapter(pageController);



        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* img_calendar.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                img_escucha.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                img_menu.setBackgroundColor(Color.parseColor("#003087"));*/
                textos();
                view.setCurrentItem(0);
                pageController.notifyDataSetChanged();
            }
        });
        escucha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               /* img_menu.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                img_calendar.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                img_escucha.setBackgroundColor(Color.parseColor("#003087"));*/
                textos();
                view.setCurrentItem(1);
                pageController.notifyDataSetChanged();
            }
        });
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* img_escucha.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                img_menu.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                img_calendar.setBackgroundColor(Color.parseColor("#003087"));*/
                textos();
                view.setCurrentItem(2);
                pageController.notifyDataSetChanged();
            }
        });



        tableLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition() == 0){

                    textos();
                    view.setCurrentItem(tab.getPosition());
                    pageController.notifyDataSetChanged();

                }
                if(tab.getPosition() == 1){

                    textos();
                    view.setCurrentItem(tab.getPosition());
                    pageController.notifyDataSetChanged();
                }
                if(tab.getPosition() == 2){

                    textos();
                    view.setCurrentItem(tab.getPosition());
                    pageController.notifyDataSetChanged();
                }
                /*if(tab.getPosition() == 3){
                    colores();
                    view.setCurrentItem(tab.getPosition());
                    tableLayout.getTabAt(3).getIcon().setColorFilter(Color.parseColor("#F3CF11"), PorterDuff.Mode.SRC_IN);
                    pageController.notifyDataSetChanged();
                }*/
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        view.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tableLayout));


    }
    /*public boolean onCreateOptionsMenu(@NonNull Menu menu){
        if(tipo_usuario.equalsIgnoreCase("normal")){
            getMenuInflater().inflate(R.menu.menu_main_comunidad, menu);
        }else{
            getMenuInflater().inflate(R.menu.menu_main, menu);
        }
        return true;
    }*/



    /*public boolean onOptionsItemSelected(MenuItem item) {
        if(tipo_usuario.equalsIgnoreCase("normal")){
            switch(item.getItemId()){
                case R.id.menu:
                    view.setCurrentItem(0);
                    pageController.notifyDataSetChanged();
                    return true;
                case R.id.mensajes:
                    Intent mensaje = new Intent(MenuActivity.this, Mis_Mensajes.class);
                    startActivity(mensaje);
                    return true;
                case R.id.perfil:
                    Intent perfil = new Intent(MenuActivity.this, PerfilActivity.class);
                    startActivity(perfil);
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        }else{
            switch(item.getItemId()){
                case R.id.administracion:
                    db.collection("Usuarios").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                long numero=Long.parseLong(String.valueOf(task.getResult().size()));
                                Intent menu = new Intent(MenuActivity.this, ConfiguracionActivity.class);
                                menu.putExtra("usu",numero);
                                startActivity(menu);
                            } else {
                                Log.d(TAG, "Error getting documents: ", task.getException());
                            }
                        }
                    });
                    return true;
                case R.id.menu:
                    view.setCurrentItem(0);
                    pageController.notifyDataSetChanged();
                    return true;
                case R.id.perfil:
                    Intent perfil = new Intent(MenuActivity.this, PerfilActivity.class);
                    startActivity(perfil);
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        }

    }*/
    private void showSelectedFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
    }


    private void textos(){
        tableLayout.getTabAt(0).getText();
        tableLayout.getTabAt(1).getText();
        tableLayout.getTabAt(2).getText();

        /* tableLayout.getTabAt(3).getIcon().setColorFilter(Color.parseColor("#ffffff"), PorterDuff.Mode.SRC_IN);
         */}
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if (keyCode == KeyEvent.KEYCODE_BACK)
        {
            //Back buttons was pressed, do whatever logic you want
        }

        return false;
    }

}
