package com.example.alejandro.penia5;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Alejandro on 06/05/2016.
 */
public class HistorialResultados extends Fragment {
    ViewPager pager;
    ViewPagerAdapterHistorialResultados adapter;
    SlidingTabLayout tabs;
    CharSequence Titles[];
    int Numboftabs = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_historial_resultados, container, false);

        //Acceso a base de datos
        int numJornadas = 36;

        Titles = new CharSequence[36];
        for (int i=0; i<numJornadas; i++) {
            int num = i+1;
            Titles[i] = "Jornada " + num;
            Numboftabs = Numboftabs + 1;
        }

        adapter =  new ViewPagerAdapterHistorialResultados(getFragmentManager(),Titles,Numboftabs);

        // Assigning ViewPager View and setting the adapter
        pager = (ViewPager) rootView.findViewById(R.id.pager_historial_resultados);
        pager.setAdapter(adapter);

        // Assiging the Sliding Tab Layout View
        tabs = (SlidingTabLayout) rootView.findViewById(R.id.tabs_historial_resultados);
        tabs.setDistributeEvenly(true); // To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width

        // Setting Custom Color for the Scroll bar indicator of the Tab View
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.tabsScrollColor);
            }
        });

        // Setting the ViewPager For the SlidingTabsLayout
        tabs.setViewPager(pager);

        return rootView;
    }
}
