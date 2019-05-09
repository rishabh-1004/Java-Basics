package com.Rishabh;

public class Main {

    public static String getDurationString(int minutes,int seconds) {
        int hours=0;
        String time_="";
        if( minutes>0 && seconds>0 && seconds<60 ){
            if(minutes>60){
                hours=minutes/60;
                minutes=minutes-(hours*60);
                time_=hours+"h "+minutes+"m "+ seconds+"s";
            }
            else{
                time_="00h "+minutes+"m "+seconds+"s" ;
            }
            return time_;
        }
        else{
            return "Invalid Values";
        }
    }
    public static String getDurationString(int seconds) {
        int hours=0;
        int minutes=0;
        String time_="";
        if( seconds>0  ){
            minutes=seconds/60;
            if(minutes>60){
                hours=minutes/60;
                minutes=minutes-(hours*60);
                seconds= seconds-((hours*3600)+(minutes*60));
                time_=hours+"h "+minutes+"m "+ seconds+"s";
            }
            else{
                seconds= seconds-((minutes*60));
                time_="00h "+minutes+"m "+seconds+"s" ;
            }
            return time_;
        }
        else{
            return "Invalid Values";
        }
    }

    public static void main(String[] args) {

        String time_=getDurationString(70,56);
        System.out.println(time_);
        time_=getDurationString(4000);
        System.out.println(time_);
        time_=getDurationString(400);
        System.out.println(time_);
    }
}
