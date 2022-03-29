package com.company;

import java.util.Scanner;

public class Newspaper extends SMI {

    private int Circulation;
    private String Editor;
    private int Frequency_of_issue_week;
    private String Paper_type;

    Newspaper(){
        super();
        Circulation=0;
        Editor="нет репартера";
        Frequency_of_issue_week=2;
        Paper_type="бумага";
    }

    Newspaper(int circulation,String editor,int frequency_of_issue_week, String paper_type,
              String name, String date_of_creation, String auditorium, String language){
        super(name,date_of_creation,auditorium,language);
        Circulation=circulation;
        Editor=editor;
        Frequency_of_issue_week=frequency_of_issue_week;
        Paper_type=paper_type;
    }


    public int getCirculation() {
        return Circulation;
    }

    public void setCirculation(int circulation) {
        Circulation = circulation;
    }

    public String getEditor() {
        return Editor;
    }

    public void setEditor(String editor) {
        Editor = editor;
    }

    public int getFrequency_of_issue_week() {
        return Frequency_of_issue_week;
    }

    public void setFrequency_of_issue_week(int frequency_of_issue_week) {
        Frequency_of_issue_week = frequency_of_issue_week;
    }

    public String getPaper_type() {
        return Paper_type;
    }

    public void setPaper_type(String paper_type) {
        Paper_type = paper_type;
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

        System.out.print("Введите количество экземпляров: ");
        Circulation = in.nextInt();

        System.out.print("Введите репартера: ");
        Editor = in.next();

        System.out.print("Введите количестао выходов в неделю: ");
        Frequency_of_issue_week = in.nextInt();

        System.out.print("Введите носитель информации: ");
        Paper_type = in.next();


        System.out.println();
    }

    public String toString() {
        return "\n\tнаименование" + "\n\t" + "СМИ: " + getName()
                + "\n\t" + "дата создание сми: " + getDate_of_creation()
                + "\n\t" + "аудитория: " + getAuditorium()
                + "\n\t" + "язык: " + getLanguage()
                + "\n\t" + "количество экземпляров: " + Circulation
                + "\n\t" + "репартер: " + Editor
                + "\n\t" + "количестао выходов в неделю: " + Frequency_of_issue_week
                + "\n\t" + "носитель информации: " + Paper_type + "\n";
    }
}
