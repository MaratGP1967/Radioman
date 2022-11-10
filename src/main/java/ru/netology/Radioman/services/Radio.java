package ru.netology.Radioman.services;

public class Radio {

    protected int numberOfRadioStations = 10;
    protected int radioStationNumberMax;
    private int currentRadioStationNumber;
    private int currentSoundVolume;

    public Radio() {
        this.radioStationNumberMax = this.numberOfRadioStations - 1;
    }

    public Radio(int numberOfRadioStations) {
        this.radioStationNumberMax = numberOfRadioStations - 1;
    }

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
        if (newRadioStationNumber > radioStationNumberMax) {
            return;
        }
        currentRadioStationNumber = newRadioStationNumber;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        currentSoundVolume = newCurrentSoundVolume;
    }

    //next radio station
    public void nextRadioStationNumber() {
        currentRadioStationNumber++;
        if (currentRadioStationNumber > radioStationNumberMax) {
            currentRadioStationNumber = 0;
        }
    }

    //previous radio station
    public void prevRadioStationNumber() {
        currentRadioStationNumber--;
        if (currentRadioStationNumber < 0) {
            currentRadioStationNumber = radioStationNumberMax;
        }
    }

    //increasing the sound volume
    public void increaseSoundVolume() {
        if (currentSoundVolume < 100) {
            currentSoundVolume++;
        } else {
            currentSoundVolume = 100;
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
