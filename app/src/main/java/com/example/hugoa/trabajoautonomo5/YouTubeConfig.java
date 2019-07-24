package com.example.hugoa.trabajoautonomo5;

public class YouTubeConfig {
    public YouTubeConfig(){

    }
    /*Se define la variable que contiene la clave del API */
    private static final String API_KEY = "AIzaSyAIfS6Ed9_c0eULWqhtEIvMM-EyT_vmLp0";

    /*Se define el metodo que retorna la clave API, para que pueda ser utilizada en otras actividades*/
    public static String getApiKey() {
        return API_KEY;
    }
}
