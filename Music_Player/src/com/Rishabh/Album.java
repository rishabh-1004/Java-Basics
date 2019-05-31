package com.Rishabh;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song>  songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs= new ArrayList<Song>();
    }
    public boolean addSong(String title,double duration){
        if(findSong(title)==null){
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }
    private Song findSong(String title){
        for(Song song : songs){
            if(song.getTitle().equals(title)){
                return song;
            }
        }
            return null;
    }

    public boolean addToPlaylist(int track_number, LinkedList<Song> playlist){
        int index=track_number-1;
        if((index>=0) && (index<=this.songs.size() )){
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This Song is not in this playlist");
        return false;
    }

    public boolean addToPlaylist(String title,LinkedList<Song> playlist){
        Song checkedSong=findSong(title);
        if(checkedSong!=null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This Song is not in this playlist");
        return false;
    }
}
