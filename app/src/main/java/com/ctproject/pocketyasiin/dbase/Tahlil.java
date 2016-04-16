package com.ctproject.pocketyasiin.dbase;

/**
 * Created by farhan on 12/28/15.
 */
public class Tahlil {

    //private variables
    int _id;
    String _arab;
    String _latin;
    String _arti;

    // Empty constructor
    public Tahlil() {
    }

    // constructor
    public Tahlil(int id, String arab, String latin, String arti) {
        this._id = id;
        this._arab = arab;
        this._latin = latin;
        this._arti = arti;
    }

    // constructor
    public Tahlil(String arab, String latin, String arti) {
        this._arab = arab;
        this._latin = latin;
        this._arti = arti;
    }

    // getting ID
    public int getID() {
        return this._id;
    }

    // setting id
    public void setID(int id) {
        this._id = id;
    }

    // getting name
    public String getArab() {
        return this._arab;
    }

    // setting name
    public void setArab(String arab) {
        this._arab = arab;
    }

    // getting name
    public String getLatin() {
        return this._latin;
    }

    // setting name
    public void setLatin(String latin) {
        this._latin = latin;
    }

    // getting phone number
    public String getArti() {
        return this._arti;
    }

    // setting phone number
    public void setArti(String arti) {
        this._arti = arti;
    }

}