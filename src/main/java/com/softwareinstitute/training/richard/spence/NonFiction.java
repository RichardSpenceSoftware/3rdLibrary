package com.softwareinstitute.training.richard.spence;

public class NonFiction extends LibraryItem implements Reading{


    ///////////////////////////Attributes////////////////////////////////
    private String datepublished;
    public String nonfiction;




    ///////////////////////////////Constructors/////////////////////////
    public NonFiction(String name, String datepublished){
        super(name);
        this.datepublished = datepublished;
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
        return nonfiction;
    }
}

