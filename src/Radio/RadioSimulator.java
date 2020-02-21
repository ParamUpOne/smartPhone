/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Radio;

/**
 *
 * @author HP User
 */
public class RadioSimulator {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
    public static void main(String[] args)
    {
        Radio radio = new Radio();
        VoiceRecognizer vr = new VoiceRecognizer(radio);
        radio.switchOn();
        radio.setVolume(Radio.MAX_VOLUME);//turn up your favourite song
        System.out.println("Is the radio on? " + radio.isOn());
        System.out.println("And playing at volume: " + radio.getVolume());
        Voice driver = new Voice();
        radio.registerDriversVoice(driver);//connect the Radio and the driver's voice
        driver.setKeyWord("Stop Music");
        if(vr.recognize(driver))
        {
            System.out.println("Now playing at volume: " +radio.getVolume());
        }
        //we need some sort of trigger for the volume lowering, for now
        //we simulate it with a check to the volume
        
        
        
    }
    
}


