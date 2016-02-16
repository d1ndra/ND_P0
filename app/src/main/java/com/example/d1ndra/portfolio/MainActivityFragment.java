package com.example.d1ndra.portfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_main, container, false);

        Button b1 = (Button) rootview.findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Context context = getActivity();
                CharSequence text = "Spotify Streamer";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button b2 = (Button) rootview.findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Context context = getActivity();
                CharSequence text = "Super Duo";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button b3 = (Button) rootview.findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Context context = getActivity();
                CharSequence text = "Build it bigger";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button b4 = (Button) rootview.findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Context context = getActivity();
                CharSequence text = "XYZ Reader";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button b5 = (Button) rootview.findViewById(R.id.capstone);
        b5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Context context = getActivity();
                CharSequence text = "Capstone";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        return rootview;
    }
}
