package com.ldt.musicr.helper;

import androidx.annotation.NonNull;

import com.ldt.musicr.model.Song;

import java.util.Collections;
import java.util.List;

/**
 * @Shhad jaber
 *
 */
public class ShuffleHelper {

    public static void makeShuffleList(@NonNull List<Song> listToShuffle, final int current) {
        if (listToShuffle.isEmpty()) return;
        if (current >= 0) {
            Song song = listToShuffle.remove(current);
            Collections.shuffle(listToShuffle);
            listToShuffle.add(0, song);
        } else {
            Collections.shuffle(listToShuffle);
        }
    }
}
