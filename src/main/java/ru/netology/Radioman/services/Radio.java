package ru.netology.Radioman.services;

//import lombok.AllArgsConstructor;
//import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
//@AllArgsConstructor
//@Data
@Getter
@Setter
public class Radio {
    protected int numberOfRadioStations = 10;
    protected int radioStationNumberMax = numberOfRadioStations - 1;
    private int currentRadioStationNumber;
    private int currentSoundVolume;

    public Radio(int numberOfRadioStations) {
        this.radioStationNumberMax = numberOfRadioStations - 1;
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