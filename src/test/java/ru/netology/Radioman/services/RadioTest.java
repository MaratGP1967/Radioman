package ru.netology.Radioman.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    public void shouldSetRadioStationNumber() {
        Radio config = new Radio();

        config.setCurrentRadioStationNumber(5);

        int expected = 5;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberAboveMax() {
        Radio config = new Radio();

        config.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumberBelowMin() {
        Radio config = new Radio();

        config.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationNumber() {
        Radio config = new Radio();

        config.setCurrentRadioStationNumber(4);
        config.nextRadioStationNumber();

        int expected = 5;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationNumberFromMaxToMin() {
        Radio config = new Radio();

        config.setCurrentRadioStationNumber(9);
        config.nextRadioStationNumber();

        int expected = 0;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrefRadioStationNumber() {
        Radio config = new Radio();

        config.setCurrentRadioStationNumber(4);
        config.prevRadioStationNumber();

        int expected = 3;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrefRadioStationNumberFromMinToMax() {
        Radio config = new Radio();

        config.setCurrentRadioStationNumber(0);
        config.prevRadioStationNumber();

        int expected = 9;
        int actual = config.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolume() {
        Radio config = new Radio();

        config.setCurrentSoundVolume(4);
        config.increaseSoundVolume();

        int expected = 5;
        int actual = config.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseSoundVolumeAboveMax() {
        Radio config = new Radio();

        config.setCurrentSoundVolume(10);
        config.increaseSoundVolume();

        int expected = 10;
        int actual = config.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolume() {
        Radio config = new Radio();

        config.setCurrentSoundVolume(4);
        config.decreaseSoundVolume();

        int expected = 3;
        int actual = config.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolumeBelowMin() {
        Radio config = new Radio();

        config.setCurrentSoundVolume(0);
        config.decreaseSoundVolume();

        int expected = 0;
        int actual = config.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSoundVolumeBeNegative() {
        Radio config = new Radio();

        config.setCurrentSoundVolume(5);
        config.setCurrentSoundVolume(-5);

        int expected = 5;
        int actual = config.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSoundVolumeBeMoreThen() {
        Radio config = new Radio();

        config.setCurrentSoundVolume(5);
        config.setCurrentSoundVolume(12);

        int expected = 5;
        int actual = config.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}
