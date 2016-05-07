package com.example.alejandro.penia5;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.FragmentTabHost;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Alejandro on 03/05/2016.
 */
@SuppressLint("NewApi")
public class Jornada extends Fragment {
    //private FragmentTabHost mTabHost;
    ViewPager pager;
    ViewPagerAdapter adapter;
    SlidingTabLayout tabs;
    CharSequence Titles[]={"Jornada1", "Jornada2" };
    int Numboftabs =2;
    private ListView listaEquipos;

    //Mandatory Constructor
    public Jornada() {
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //View rootView = inflater.inflate(R.layout.fragment_jornada, container, false);
        View rootView = inflater.inflate(R.layout.jornada, container, false);

        ArrayList<Lista_entrada> equipos = new ArrayList<Lista_entrada>();
        // acceso a DB

        equipos.add(new Lista_entrada(true, R.drawable.ic_launcher,"Nacho Justicia","DEL","3º","75%","Último: 12/04/2016 (Perdido)", true, R.drawable.ic_launcher,"Alex Gómez","PT","3º","75%","Último: 15/04/2016 (Ganado)"));
        equipos.add(new Lista_entrada(true, R.drawable.ic_launcher,"Nacho Justicia","DEL","3º","75%","Último: 12/04/2016 (Ganado)", true, R.drawable.ic_launcher,"Alex Gómez","PT","3º","75%","Último: 15/04/2016 (Ganado)"));
        equipos.add(new Lista_entrada(true, R.drawable.ic_launcher,"Nacho Justicia","DEL","3º","75%","Último: 12/04/2016 (Ganado)", true, R.drawable.ic_launcher,"Alex Gómez","PT","3º","75%","Último: 15/04/2016 (Ganado)"));
        equipos.add(new Lista_entrada(false, R.drawable.ic_launcher,"Nacho Justicia","DEL","3º","75%","Último: 12/04/2016 (Ganado)", true, R.drawable.ic_launcher,"Alex Gómez","PT","3º","75%","Último: 15/04/2016 (Ganado)"));

        listaEquipos = (ListView) rootView.findViewById(R.id.equipos);
        listaEquipos.setAdapter(new Lista_adaptador(getContext(), R.layout.jugadores_jornada, equipos) {
            @Override
            public void onEntrada(Object entrada, View view) {
                if (entrada != null) {
                    if (!(((Lista_entrada)entrada).getIsMostrarJugador1())) {
                        LinearLayout jugador1 = (LinearLayout) view.findViewById(R.id.layout_jugador1);
                        jugador1.setVisibility(LinearLayout.INVISIBLE);
                    } else {
                        LinearLayout jugador1 = (LinearLayout) view.findViewById(R.id.layout_jugador1);
                        jugador1.setVisibility(LinearLayout.VISIBLE);

                        TextView nombreJugador1 = (TextView) view.findViewById(R.id.nombre_jugador1);
                        nombreJugador1.setText(((Lista_entrada) entrada).getnombreJugador1());

                        TextView posicionCampo1 = (TextView) view.findViewById(R.id.posicion_campo1);
                        posicionCampo1.setText(((Lista_entrada) entrada).getposicionCampo1());

                        TextView posicionClasificacion1 = (TextView) view.findViewById(R.id.posicion_clasificacion1);
                        posicionClasificacion1.setText("Pos: " + ((Lista_entrada) entrada).getPosicionClasificacion1());

                        TextView winRate1 = (TextView) view.findViewById(R.id.winrate1);
                        winRate1.setText("W/R: " + ((Lista_entrada) entrada).getWinRate1());

                        TextView ultimo1 = (TextView) view.findViewById(R.id.ultimo_partido1);
                        ultimo1.setText(((Lista_entrada) entrada).getUltimo1());

                        ImageView imagen1 = (ImageView) view.findViewById(R.id.imagen_jugador1);
                        //imagen1.setBackgroundResource(((Lista_entrada) entrada).getidImagen1());
                        imagen1.setImageResource(((Lista_entrada) entrada).getidImagen1());
                    }

                    if (!(((Lista_entrada)entrada).getIsMostrarJugador2())) {
                        LinearLayout jugador2 = (LinearLayout) view.findViewById(R.id.layout_jugador2);
                        jugador2.setVisibility(LinearLayout.INVISIBLE);
                    } else {
                        LinearLayout jugador2 = (LinearLayout) view.findViewById(R.id.layout_jugador2);
                        jugador2.setVisibility(LinearLayout.VISIBLE);

                        TextView nombreJugador2 = (TextView) view.findViewById(R.id.nombre_jugador2);
                        nombreJugador2.setText(((Lista_entrada) entrada).getnombreJugador2());

                        TextView posicionCampo2 = (TextView) view.findViewById(R.id.posicion_campo2);
                        posicionCampo2.setText(((Lista_entrada) entrada).getposicionCampo2());

                        TextView posicionClasificacion2 = (TextView) view.findViewById(R.id.posicion_clasificacion2);
                        posicionClasificacion2.setText("Pos: " + ((Lista_entrada) entrada).getPosicionClasificacion2());

                        TextView winRate2 = (TextView) view.findViewById(R.id.winrate2);
                        winRate2.setText("W/R: " + ((Lista_entrada) entrada).getWinRate2());

                        TextView ultimo2 = (TextView) view.findViewById(R.id.ultimo_partido2);
                        ultimo2.setText(((Lista_entrada) entrada).getUltimo2());

                        ImageView imagen2 = (ImageView) view.findViewById(R.id.imagen_jugador2);
                        imagen2.setImageResource(((Lista_entrada) entrada).getidImagen2());
                    }
                }
            }
        });
        /*adapter =  new ViewPagerAdapter(getFragmentManager(),Titles,Numboftabs);

        // Assigning ViewPager View and setting the adapter
        pager = (ViewPager) rootView.findViewById(R.id.pager);
        pager.setAdapter(adapter);

        // Assiging the Sliding Tab Layout View
        tabs = (SlidingTabLayout) rootView.findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true); // To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width

        // Setting Custom Color for the Scroll bar indicator of the Tab View
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.tabsScrollColor);
            }
        });

        // Setting the ViewPager For the SlidingTabsLayout
        tabs.setViewPager(pager);*/


        return rootView;
    }

}
