package com.rawzadigital.sampledrawernavigation.utils;

public final class Cast {

    // Hide and eliminate annoyying NullPointerException lint warning and
    // make sure that it will never happen
    private Cast(){}
    @android.support.annotation.NonNull
    public static <T> T neverNull(T value){
        return value;
    }
}
