package cl.alvaro.prueba1alvaro;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryTab extends Fragment {


    public GalleryTab() {
        // Required empty public constructor
    }
    public static GalleryTab newInstance (){
        return new GalleryTab();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gallery_tab, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        FloatingActionButton fab = (FloatingActionButton) getView().findViewById(R.id.fabProyectsActivity);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext().getApplicationContext(),ProyectsActivity.class);
                startActivity(intent);
            }
        });

        super.onViewCreated(view, savedInstanceState);
    }
}
