package ru.netology.Radioman.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {
    Radio config1 = new Radio();
    @Test
    public void shouldSetRadioStationDefNumber() {

        config1.setCurrentRadioStationNumber(5);

        int expected = 5;
        int actual = config1.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetRadioStationDefNumber() {

        config1.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = config1.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    Radio config = new Radio(30);

    @Test
    public void shouldSetRadioStationNumber() {

        config.setCurrentRadioStationNumber(29);

        int expected = 29;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberAboveMax() {

        config.setCurrentRadioStationNumber(30);

        int expected = 0;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberBelowMin() {

        config.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationNumber() {

        config.setCurrentRadioStationNumber(4);
        config.nextRadioStationNumber();

        int expected = 5;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationNumberFromMaxToMin() {

        config.setCurrentRadioStationNumber(29);
        config.nextRadioStationNumber();

        int expected = 0;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrefRadioStationNumber() {

        config.setCurrentRadioStationNumber(4);
        config.prevRadioStationNumber();

        int expected = 3;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrefRadioStationNumberFromMinToMax() {

        config.setCurrentRadioStationNumber(0);
        config.prevRadioStationNumber();

        int expected = 29;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolume() {

        config.setCurrentSoundVolume(4);
        config.increaseSoundVolume();

        int expected = 5;
        int actual = config.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseSoundVolumeAboveMax() {

        config.setCurrentSoundVolume(100);
        config.increaseSoundVolume();

        int expected = 100;
        int actual = config.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolume() {

        config.setCurrentSoundVolume(4);
        config.decreaseSoundVolume();

        int expected = 3;
        int actual = config.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseSoundVolumeBelowMin() {

        config.setCurrentSoundVolume(0);
        config.decreaseSoundVolume();

        int expected = 0;
        int actual = config.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}
