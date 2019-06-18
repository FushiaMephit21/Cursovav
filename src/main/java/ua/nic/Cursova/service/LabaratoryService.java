package ua.nic.Cursova.service;

import ua.nic.Cursova.model.LabaratoryEntity;
import ua.nic.Cursova.repository.ILabaratoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class LabaratoryService implements IEntityService {
    
    private static Logger log = Logger.getLogger(LabaratoryService.class.getName());
    @Autowired
    ILabaratoryRepository labaratoryRepository;


    @Override
    public LabaratoryEntity getById(Long id) {
        log.info("In LabaratoryService getById{{}" + id);
        return labaratoryRepository.getOne(id);
    }

    @Override
    public void save(Object labaratory) {
        log.info("In LabaratoryService save{}" + labaratory);

        labaratoryRepository.save((LabaratoryEntity) labaratory);
    }

    @Override
    public void delete(Long id) {
        log.info("In LabaratoryService delete{}" + id);
        labaratoryRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return labaratoryRepository.findAll();
    }
}
