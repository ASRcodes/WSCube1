package com.example.wscubeprojs.adapterForTab;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.wscubeprojs.fragmentsForTablayout.calls;
import com.example.wscubeprojs.fragmentsForTablayout.chat;
import com.example.wscubeprojs.fragmentsForTablayout.status;

public class ViewPagerMessageAdapter extends FragmentPagerAdapter {

    public ViewPagerMessageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new chat();
        } else if (position==1) {
            return new status();
        }
        else {
            return new calls();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
//    Now let's set the title.................

    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return "Chats";
        } else if (position==1) {
            return "Status";
        }
        else {
            return "Calls";
        }
    }
}









