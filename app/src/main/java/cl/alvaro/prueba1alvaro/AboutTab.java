package cl.alvaro.prueba1alvaro;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutTab extends Fragment {


    public AboutTab() {
        // Required empty public constructor
    }
    public static AboutTab newInstance () {

        return new AboutTab();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_tab, container, false);
    }

}
