package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        System.out.println("SpeakerServiceImpl RepositoryConstructor with argument");
        this.repository = speakerRepository;
    }

    @PostConstruct
    private void initialize(){
        System.out.println("Wywołanie po konstruktorze");
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

//    public void setRepository(SpeakerRepository repository) {
//        System.out.println("SpeakerServiceImpl setter");
//        this.repository = repository;
//    }
}
