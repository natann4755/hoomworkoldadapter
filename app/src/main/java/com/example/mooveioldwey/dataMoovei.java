package com.example.mooveioldwey;

public class dataMoovei {
    private String titel;
    private String text;
    private int imeg;
    private String uu;

    public dataMoovei(String titel, String text, int imeg, String uu) {
        this.titel = titel;
        this.text = text;
        this.imeg = imeg;
        this.uu = uu;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImeg() {
        return imeg;
    }

    public void setImeg(int imeg) {
        this.imeg = imeg;
    }

    public String getUu() {
        return uu;
    }

    public void setUu(String uu) {
        this.uu = uu;
    }
}
