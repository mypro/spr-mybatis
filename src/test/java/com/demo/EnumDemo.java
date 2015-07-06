package com.demo;

/**
 * Created by chenweichao on 15-6-11.
 */
public enum EnumDemo  {

    MONDAY("today is Monday"),
    TUESDAY("today is Tuesday"),
    WENSDAY("today is Wensday");

    private String context;
    private String getContext(){
        return this.context;
    }

    private EnumDemo(String context){
        this.context = context;
    }

    public static void main(String[] args) {
        for (EnumDemo ed : EnumDemo.values()) {
            System.out.println(ed.getContext());
        }
        System.out.println(EnumDemo.MONDAY);
    }
}
