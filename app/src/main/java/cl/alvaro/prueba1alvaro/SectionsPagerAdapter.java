package cl.alvaro.prueba1alvaro;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return AboutTab.newInstance();
            case 1:
                return GalleryTab.newInstance();
            case 2:
                return ContactTab.newInstance();
        }
        return AboutTab.newInstance();
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }
}
