package com.Rishabh;

import java.util.LinkedList;

public class Playlist {
    private LinkedList<Song> playlist = new LinkedList<Song>();

    public void add_in_order(Song song){
       this.playlist.add(song);
    }

}
