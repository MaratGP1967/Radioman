package ru.netology.Radioman.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {
    @Test
    public void shouldSetRadioStationDefNumber() {

        Radio config = new Radio();

        config.setCurrentRadioStationNumber(5);

        int expected = 5;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationDefNumber() {

        Radio config = new Radio();

        config.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    Radio config = new Radio(30);

    @Test
    public void shouldSetRadioStationNumber() {
        //Radio config = new Radio();

        config.setCurrentRadioStationNumber(29);

        int expected = 29;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberAboveMax() {
        //Radio config = new Radio(10);

        config.setCurrentRadioStationNumber(30);

        int expected = 0;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberBelowMin() {
        //Radio config = new Radio(10);

        config.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationNumber() {
        //Radio config = new Radio(10);

        config.setCurrentRadioStationNumber(4);
        config.nextRadioStationNumber();

        int expected = 5;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationNumberFromMaxToMin() {
        //Radio config = new Radio(10);

        config.setCurrentRadioStationNumber(29);
        config.nextRadioStationNumber();

        int expected = 0;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrefRadioStationNumber() {
        //Radio config = new Radio(10);

        config.setCurrentRadioStationNumber(4);
        config.prevRadioStationNumber();

        int expected = 3;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrefRadioStationNumberFromMinToMax() {
        //Radio config = new Radio(10);

        config.setCurrentRadioStationNumber(0);
        config.prevRadioStationNumber();

        int expected = 29;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolume() {
        //Radio config = new Radio(10);

        config.setCurrentSoundVolume(4);
        config.increaseSoundVolume();

        int expected = 5;
        int actual = config.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseSoundVolumeAboveMax() {
        //Radio config = new Radio(10);

        config.setCurrentSoundVolume(100);
        config.increaseSoundVolume();

        int expected = 100;
        int actual = config.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolume() {
        //Radio config = new Radio(10);

        config.setCurrentSoundVolume(4);
        config.decreaseSoundVolume();

        int expected = 3;
        int actual = config.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseSoundVolumeBelowMin() {
        //Radio config = new Radio(10);

        config.setCurrentSoundVolume(0);
        config.decreaseSoundVolume();

        int expected = 0;
        int actual = config.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}
