package com.zayyni;

import com.zayyni.entity.Alien;
import com.zayyni.repo.IAlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataJPARuneer implements CommandLineRunner {

    @Autowired
    private IAlienRepo alienRepo;
    @Override
    public void run(String... args) throws Exception {

        System.out.println(alienRepo.getClass().getName());
        alienRepo.save(new Alien(2,"Zayyni", "Lhr"));
    }
}
