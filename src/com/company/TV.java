package com.company;

import java.util.Scanner;

public class TV extends SMI{

    private int Channel_number;
    private String TV_presenter;
    private int Airtime_minute ;
    private int Beginning_minute;

    public TV(){
        super();
        Channel_number= 1;
        TV_presenter="нет репартера";
        Airtime_minute =0;
        Beginning_minute=0;
    }

    public TV(int channel_number, String tv_presenter, int airtime_minute, int beginning_minute,
              String name, String date_of_creation, String auditorium, String language){

        super(name,date_of_creation,auditorium,language);
        Channel_number= channel_number;
        TV_presenter=tv_presenter;
        Airtime_minute =airtime_minute;
        Beginning_minute=beginning_minute;
    }


    public int getChannel_number() {
        return Channel_number;
    }

    public void setChannel_number(int channel_number) {
        Channel_number = channel_number;
    }

    public String getTV_presenter() {
        return TV_presenter;
    }

    public void setTV_presenter(String TV_presenter) {
        this.TV_presenter = TV_presenter;
    }

    public int getAirtime_minute() {
        return Airtime_minute;
    }

    public void setAirtime_minute(int airtime_minute) {
        Airtime_minute = airtime_minute;
    }

    public int getBeginning_minute() {
        return Beginning_minute;
    }

    public void setBeginning_minute(int beginning_minute) {
        this.Beginning_minute = beginning_minute;
    }


    public void setAllInfo() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите название газеты: ");
        String na = in.next();
        setName(na);

        System.out.print("Введите дату создание СМИ: ");
        String s = in.next();
        setDate_of_creation(s);

        System.out.print("Введите целевую аудиторию: ");
        String au = in.next();
        setAuditorium(au);

        System.out.print("Введите язык газеты: ");
        String la = in.next();
        setLanguage(la);

        System.out.print("Введите номер канала: ");
        Channel_number = in.nextInt();

        System.out.print("Введите кареспадента: ");
        TV_presenter = in.next();

        System.out.print("Введите время передачи: ");
        Airtime_minute = in.nextInt();

        System.out.print("Введите время начало передачи: ");
        Beginning_minute = in.nextInt();


        System.out.println();
    }


    public String toString() {
        return "\n\tнаименование" + "\n\t" + "СМИ: " + getName()
                + "\n\t" + "дата создание сми: " + getDate_of_creation()
                + "\n\t" + "аудитория: " + getAuditorium()
                + "\n\t" + "язык: " + getLanguage()
                + "\n\t" + "номер канала: " + Channel_number
                + "\n\t" + "кареспадент: " + TV_presenter
                + "\n\t" + "время передачи: " + Airtime_minute
                + "\n\t" + "время начало передачи: " + Beginning_minute + "\n";
    }



}
