package com.ctproject.pocketyasiin.dbase;

/**
 * Created by farhan on 12/28/15.
 */
public class Pengaturan {

    //private variables
    int _id;
    String _hurufarab;
    String _huruflatin;
    String _hurufarti;

    // Empty constructor
    public Pengaturan() {
    }

    // constructor
    public Pengaturan(int id, String hurufarab, String huruflatin, String hurufarti) {
        this._id = id;
        this._hurufarab = hurufarab;
        this._huruflatin = huruflatin;
        this._hurufarti = hurufarti;
    }

    // constructor
    public Pengaturan(String hurufarab, String huruflatin, String hurufarti) {
        this._hurufarab = hurufarab;
        this._huruflatin = huruflatin;
        this._hurufarti = hurufarti;
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
    public String getHurufArab() {
        return this._hurufarab;
    }

    // setting name
    public void setHurufArab(String hurufarab) {
        this._hurufarab = hurufarab;
    }

    // getting name
    public String getHurufLatin() {
        return this._huruflatin;
    }

    // setting name
    public void setHurufLatin(String huruflatin) {
        this._huruflatin = huruflatin;
    }

    // getting phone number
    public String getHurufArti() {
        return this._hurufarti;
    }

    // setting phone number
    public void setHurufArti(String hurufarti) {
        this._hurufarti = hurufarti;
    }

}
