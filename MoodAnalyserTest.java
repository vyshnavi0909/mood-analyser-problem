package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.rmi.UnexpectedException;
import java.util.concurrent.ExecutionException;

public class MoodAnalyserTest {
    @Test
    void givenMessage_WhenSad_ReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in a Sad mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    void givenMessage_WhenHappy_ReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in Any mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    void givenMessage_WhenNull_ThrowException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);

        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    void givenMessage_WhenEmpty_ThrowException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("");

        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
}
