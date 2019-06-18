package ua.nic.Cursova.service;

import ua.nic.Cursova.model.NevropatologsEntity;
import ua.nic.Cursova.repository.INevropatologsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class NevropatologsService implements IEntityService {
    
    private static Logger log = Logger.getLogger(NevropatologsService.class.getName());
    @Autowired
    INevropatologsRepository nevropatologsRepository;


    @Override
    public NevropatologsEntity getById(Long id) {
        log.info("In NevropatologsService getById{{}" + id);
        return nevropatologsRepository.getOne(id);
    }

    @Override
    public void save(Object nevropatologs) {
        log.info("In NevropatologsService save{}" + nevropatologs);

        nevropatologsRepository.save((NevropatologsEntity) nevropatologs);
    }

    @Override
    public void delete(Long id) {
        log.info("In NevropatologsService delete{}" + id);
        nevropatologsRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return nevropatologsRepository.findAll();
    }
}
