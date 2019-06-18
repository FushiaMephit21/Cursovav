package ua.nic.Cursova.service;

import ua.nic.Cursova.model.SurgeonsEntity;
import ua.nic.Cursova.repository.ISurgeonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class SurgeonsService implements IEntityService {
    
    private static Logger log = Logger.getLogger(SurgeonsService.class.getName());
    @Autowired
    ISurgeonsRepository surgeonsRepository;


    @Override
    public SurgeonsEntity getById(Long id) {
        log.info("In SurgeonsService getById{{}" + id);
        return surgeonsRepository.getOne(id);
    }

    @Override
    public void save(Object surgeons) {
        log.info("In SurgeonsService save{}" + surgeons);

        surgeonsRepository.save((SurgeonsEntity) surgeons);
    }

    @Override
    public void delete(Long id) {
        log.info("In SurgeonsService delete{}" + id);
        surgeonsRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return surgeonsRepository.findAll();
    }
}
