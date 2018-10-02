package com.user.login_register;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    EditText ed1, ed2;



    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {
        View view= inflater.inflate(R.layout.fragment_sign_in, container, false);

        Button btnFragment = (Button)view.findViewById(R.id.btn_fragment1);
        ed1 = (EditText) view.findViewById(R.id.act_main_ed1);
        ed2 = (EditText) view.findViewById(R.id.act_main_ed2);


        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                FragmentTransaction fr =getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new Fragment2());
                fr.commit();
            }
        });

        return view;
    }

}
