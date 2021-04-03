package com.moodanalyser;

public class MoodAnalyser {
    String message;
    public MoodAnalyser(){

    }
    public MoodAnalyser(String message){
        this.message = message;
    }
    public String analyseMood() throws MoodAnalyserException {
        try{
            if(message.length() == 0 ){
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "Please enter proper mood");
            }
            if(message.contains("Sad")){
                return "SAD";
            }else{
                return "HAPPY";
            }
        }catch (NullPointerException e){
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL, "Please enter proper mood");
        }
    }
}
