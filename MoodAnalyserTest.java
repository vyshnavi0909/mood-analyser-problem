package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    void givenMessage_WhenSad_ReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in a Sad mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    void givenMessage_WhenHappy_ReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in Any mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    void givenMessage_WhenNull_ReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }
}
