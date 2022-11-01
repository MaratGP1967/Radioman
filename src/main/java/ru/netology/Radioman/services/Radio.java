package ru.netology.Radioman.services;

public class Radio {
    private int currentRadioStationNumber;
    int currentSoundVolume;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    // direct input of the station number
    public void setCurrentRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0) {
            return;
        }
        if (newRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newRadioStationNumber;
    }

    //next radio station
    public void nextRadioStationNumber() {
        currentRadioStationNumber++;
        if (currentRadioStationNumber > 9) {
            currentRadioStationNumber = 0;
        }
    }

    //previous radio station
    public void prevRadioStationNumber() {
        currentRadioStationNumber--;
        if (currentRadioStationNumber  < 0) {
            currentRadioStationNumber = 9;
        }
    }

    //increasing the sound volume
    public void increaseSoundVolume() {
        if (currentSoundVolume < 10) {
            currentSoundVolume++;
        } else {
            currentSoundVolume = 10;
        }
    }

    //reducing the volume of the sound
    public void decreaseSoundVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume--;
        } else {
            currentSoundVolume = 0;
        }
    }

}
