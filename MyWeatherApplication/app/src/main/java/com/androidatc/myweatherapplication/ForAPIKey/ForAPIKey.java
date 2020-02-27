    package com.androidatc.myweatherapplication.ForAPIKey;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForAPIKey {




    //Make requests and create functional link to API path
    public static String request(String lat, String lng){
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric",lat,lng,API_KEY));
        return sb.toString();

    }

    //gwt date with format "dd MMM yyyy HH:mm"
    public static String getDate(){
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }

    //Convert Unix time stamp to date type with format “HH,mm”
    public static String convertToDateTimeFormat(double ctd) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long)ctd*1000);
        return dateFormat.format(date);
    }
    //get weather status image from open weather map
    public static String getWeatherImg(String img){
        return String.format("http://openweathermap.org/img/w/%s.png",img);
    }






    }
