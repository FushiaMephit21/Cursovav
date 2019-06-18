package ua.nic.Cursova.service;

import ua.nic.Cursova.model.PolikliniksEntity;
import ua.nic.Cursova.repository.IPolikliniksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class PolikliniksService implements IEntityService {
    
    private static Logger log = Logger.getLogger(PolikliniksService.class.getName());
    @Autowired
    IPolikliniksRepository polikliniksRepository;


    @Override
    public PolikliniksEntity getById(Long id) {
        log.info("In PolikliniksService getById{{}" + id);
        return polikliniksRepository.getOne(id);
    }

    @Override
    public void save(Object polikliniks) {
        log.info("In PolikliniksService save{}" + polikliniks);

        polikliniksRepository.save((PolikliniksEntity) polikliniks);
    }

    @Override
    public void delete(Long id) {
        log.info("In PolikliniksService delete{}" + id);
        polikliniksRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return polikliniksRepository.findAll();
    }
}
