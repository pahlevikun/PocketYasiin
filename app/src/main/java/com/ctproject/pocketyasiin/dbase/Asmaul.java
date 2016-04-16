package com.ctproject.pocketyasiin.dbase;

/**
 * Created by farhan on 12/28/15.
 */
public class Asmaul {

    //private variables
    int _id;
    String _arab;
    String _latin;
    String _arti;
    String _amal;

    // Empty constructor
    public Asmaul() {
    }

    // constructor
    public Asmaul(int id, String arab, String latin, String arti, String amal) {
        this._id = id;
        this._arab = arab;
        this._latin = latin;
        this._arti = arti;
        this._amal = amal;
    }

    // constructor
    public Asmaul(String arab, String latin, String arti, String amal) {
        this._arab = arab;
        this._latin = latin;
        this._arti = arti;
        this._amal = amal;
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

    // getting phone number
    public String getAmal() {
        return this._amal;
    }

    // setting phone number
    public void setAmal(String amal) {
        this._amal = amal;
    }
}
