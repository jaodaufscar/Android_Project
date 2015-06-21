package com.movile.next.seriestracker.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.movile.next.seriestracker.R;
import com.movile.next.seriestracker.model.episodeModels.Show;

/**
 * Created by movile on 21/06/15.
 */
public class ShowInformationFragment extends Fragment {

    public static final String EXTRA_SHOW = "extra_show";
    private Show mShow;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mShow = (Show) getArguments().getSerializable(EXTRA_SHOW);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.show_information_fragment, container, false);
    }

}
