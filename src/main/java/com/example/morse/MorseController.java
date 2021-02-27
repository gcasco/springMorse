package com.example.morse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Patch;

@RestController
public class MorseController {


    @GetMapping(path = "/{morse}")
    public String getMensaje(@PathVariable String morse){
        return MorseTranslate.traducirMorse(morse);
    }


}
