package com.example.info;

public class Shahar {
    int imgId;
    String textShahar;
    String TextDescroption;
    Shahar(int imgId, String textShahar, String TextDescroption){
        this.imgId=imgId;
        this.textShahar=textShahar;
        this.TextDescroption=TextDescroption;
    }
    public int getImgId(){
        return imgId;
    }
    public String getTextShahar(){
        return this.textShahar;
    }
   public String getTextDescroption(){
        return this.TextDescroption;
   }
}
