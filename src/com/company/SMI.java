package com.company;

public class SMI
{
    private String Name;
    private String Date_of_creation;
    private String Auditorium;
    private String Language;


    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getAuditorium() {
        return Auditorium;
    }

    public void setAuditorium(String auditorium) {
        Auditorium = auditorium;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate_of_creation() {
        return Date_of_creation;
    }

    public void setDate_of_creation(String date_of_creation) {
        Date_of_creation = date_of_creation;
    }

    public SMI(){
        Name="без названия";
        Date_of_creation="без даты";
        Auditorium="0";
        Language="русский";
    }

    public SMI(String name,String date_of_creation,String auditorium,String language){
         Name=name;
         Date_of_creation=date_of_creation;
         Auditorium=auditorium;
         Language=language;
    }
}
