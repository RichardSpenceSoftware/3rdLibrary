package com.softwareinstitute.training.richard.spence;

public class Fiction1 extends LibraryItem implements Reading{


    ///////////////////////////Attributes////////////////////////////////
    private String datepublished;
    private String fiction;




    ///////////////////////////////Constructors/////////////////////////
    public Fiction1(String name, String datepublished){
        super(name);
        this.datepublished = datepublished;
        this.fiction = fiction;

    }


    ////////////////////Methods///////////////////////////

    public String getDate() {
        return datepublished;
    }

    public void setDate(String datepublished) {
        this.datepublished = datepublished;
    }


    @Override
    public String fiction_or_non() {
        return fiction;
    }
}



