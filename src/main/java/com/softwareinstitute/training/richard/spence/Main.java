package com.softwareinstitute.training.richard.spence;

public class Main {

    public static void main(String[] args) {

        Fiction1 Macbeth = new Fiction1("Shakespear", "1688");
        System.out.println(Macbeth.getDate());

        OtherMedia CD = new OtherMedia("Montero", "CD");
        System.out.println(CD.getMedia());
    }
}
