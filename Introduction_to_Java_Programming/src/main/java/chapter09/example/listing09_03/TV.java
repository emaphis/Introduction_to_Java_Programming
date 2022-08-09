/*
 * Listing 9.3
 * 9.3 Example: Defining Classes and Creating Objects
 */
package chapter09.example.listing09_03;

/**
 * The TV class
 * @author emaph
 */
public class TV {
    int channel = 1;   // Default channel is 1
    int volumeLevel = 1;  // Dfault valueme leve is 1
    boolean on = false;  // TV is off

    /** Constructs a default TV object. */
    public TV() {
    }

    /** Turns on this TV. */
    public void turnOn() {
        on = true;
    }

    /** Turns off this TV. */
    public void turnOff() {
        on = false;
    }

    /** Sets a new channel for this TV */
    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120)
            channel = newChannel;
    }

    /**  Sets a new volume level for this TV */
    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
            volumeLevel = newVolumeLevel;
    }

    /** Increases the channel number by 1. */
    public void channelUp() {
        if (on && channel < 120)
            channel++;
    }

    /** Decreases the channel number by 1 */
    public void channelDown() {
        if (on && channel > 1)
            channel--;
    }

    /**  Increases the volume level by 1 */
    public void volumeUp() {
        if (on && volumeLevel < 7)
            volumeLevel++;
    }


    /** Decreases the volume level by 1. */
    public void volumeDown() {
        if (on && volumeLevel > 1)
            volumeLevel--;
    }
}
