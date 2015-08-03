package com.franktan.androidportfolio;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.franktan.androidportfolio.model.Project;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    ListView mProjectListView;
    ProjectAdapter mProjListAdapter;

    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     */
    private ViewPager mPager;

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    private PagerAdapter mPagerAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        mProjectListView = (ListView) view.findViewById(R.id.project_card_list);

        // Instantiate a ViewPager and a PagerAdapter.
        mPager = (ViewPager) inflater.inflate(R.layout.slider, mProjectListView, false);
        mPagerAdapter = new SlidePagerAdapter(getActivity().getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);


        mProjectListView.addHeaderView(mPager,null,false);

        // specify an adapter
        mProjListAdapter = new ProjectAdapter(this.getActivity(), new Project[] {
                new Project("Popular Movies", "A popular movie app", R.drawable.android_multicolor),
                new Project("Score app", "A score app", R.drawable.android_multicolor),
                new Project("Library app", "A library app", R.drawable.android_multicolor)
        });

        mProjectListView.setAdapter(mProjListAdapter);



        return view;
    }
}
