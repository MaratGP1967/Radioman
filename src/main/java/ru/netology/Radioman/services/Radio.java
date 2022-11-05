package ru.netology.Radioman.services;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class Radio {
    int numberOfRadioStations = 10;
    int radioStationNumberMax;
    private int currentRadioStationNumber;
    int currentSoundVolume;

    public Radio() {
        this.radioStationNumberMax = this.numberOfRadioStations - 1;
    }

    public Radio(int numberOfRadioStations) {
        this.radioStationNumberMax= numberOfRadioStations-1;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber < 0) {
            return;
        }
        if (currentRadioStationNumber > radioStationNumberMax) {
            return;
        }

        this.currentRadioStationNumber = currentRadioStationNumber;
    }
    public void nextRadioStationNumber() {
        currentRadioStationNumber++;
        if (currentRadioStationNumber > radioStationNumberMax) {
            currentRadioStationNumber = 0;
        }
    }

    public void prevRadioStationNumber() {
        currentRadioStationNumber--;
        if (currentRadioStationNumber < 0) {
            currentRadioStationNumber = radioStationNumberMax;
        }
    }
    public void increaseSoundVolume() {
        if (currentSoundVolume < 100) {
            currentSoundVolume++;
        } else {
            currentSoundVolume = 100;
        }
    }

    public void decreaseSoundVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume--;
        } else {
            currentSoundVolume = 0;
        }
    }


}

