package com.Rishabh;

import java.util.*;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static ArrayList<Album> albums=new ArrayList<Album>();
    public static void main(String[] args) {
        Album album=new Album("Origins", "Imagine Dragons");
        album.addSong("Bad Liar", 4.1);
        album.addSong("Natural", 3.6);
        album.addSong("Boomerang", 4.5);
        album.addSong("Cool Out", 5.1);
        album.addSong("Digital", 3.9);
        album.addSong("Only", 2.3);
        albums.add(album);

        album=new Album("The best of Earth Wind and Fire", "Earth,Wind and Soul");
        album.addSong("September", 4.3);
        album.addSong("Love Music", 5.2);
        album.addSong("Getaway", 3.9);
        album.addSong("Shining Star", 6.2);
        album.addSong("Reasons", 3.8);
        albums.add(album);

        LinkedList<Song> playlist=new LinkedList<Song>();
        albums.get(0).addToPlaylist("Bad Liar", playlist);
        albums.get(1).addToPlaylist("September", playlist);
        //albums.get(1).addToPlaylist("September1", playlist);
        albums.get(0).addToPlaylist("Only", playlist);
        albums.get(1).addToPlaylist(4, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        play(playlist);
        //playNext(playlist);

    }
    public static void play(LinkedList<Song> playlist){
        boolean quit=false;
        boolean forward=true;
        ListIterator<Song> listIterator=playlist.listIterator();
        if(playlist.size()==0)
            System.out.println("No songs in the playlist.");
        else{
            System.out.println("Now Playing "+ listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action=sc.nextInt();
            sc.nextLine();
            switch(action){
                case 0:
                    System.out.println("Playlist Complete");
                    System.exit(0);
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();}
                            forward=true;
                        }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing "+ listIterator.next().toString());
                    }else {
                        System.out.println("No more songs in the playlist");
                        forward=false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing "+ listIterator.previous().toString());
                    }else {
                        System.out.println("We are at the start of the playlist");
                        forward=true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now Playing :"+ listIterator.previous().toString());
                            forward=false;
                        }else{
                            System.out.println("We are at the begining of the playlist");
                        }

                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now Playing : "+listIterator.next().toString());
                            forward=true;
                        }
                        else
                            System.out.println("We are at the end of the playlist");

                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
            }
        }
    }
    public static void printMenu(){
        System.out.println("Available Actions:\n press");
        System.out.println("0.quit\n"+
                            "1.Play next Song\n"+
                            "2.Play Previous Song\n"+
                            "3.Replay Current Song\n"+
                            "4.List all songs\n"+
                            "5.Display available Actions\n");
    }
    public static void printList(LinkedList<Song> playlist){
        Iterator<Song> i = playlist.iterator();
        System.out.println("=====================");
        while(i.hasNext())
            System.out.println(i.next().toString());
        System.out.println("=====================");
    }
}
