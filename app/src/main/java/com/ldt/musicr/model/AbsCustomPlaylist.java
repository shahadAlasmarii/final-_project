package com.ldt.musicr.model;

import android.content.Context;
import android.os.Parcel;
import androidx.annotation.NonNull;


import com.ldt.musicr.util.MusicUtil;

import java.util.ArrayList;

/**
 * @Shhad jaber
 *
 */

public abstract class AbsCustomPlaylist extends Playlist {
    public AbsCustomPlaylist(int id, String name) {
        super(id, name);
    }

    public AbsCustomPlaylist() {
    }

    public AbsCustomPlaylist(Parcel in) {
        super(in);
    }

    @NonNull
    public abstract ArrayList<Song> getSongs(Context context);

    @NonNull
    @Override
    public String getInfoString(@NonNull Context context) {
        int songCount = getSongs(context).size();
        String songCountString = MusicUtil.getSongCountString(context, songCount);

        return MusicUtil.buildInfoString(
            songCountString,
            super.getInfoString(context)
        );
    }
}
