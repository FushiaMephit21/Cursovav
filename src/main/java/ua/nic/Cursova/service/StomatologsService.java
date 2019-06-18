package ua.nic.Cursova.service;

import ua.nic.Cursova.model.StomatologsEntity;
import ua.nic.Cursova.repository.IStomatologsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class StomatologsService implements IEntityService {
    
    private static Logger log = Logger.getLogger(StomatologsService.class.getName());
    @Autowired
    IStomatologsRepository stomatologsRepository;


    @Override
    public StomatologsEntity getById(Long id) {
        log.info("In StomatologsService getById{{}" + id);
        return stomatologsRepository.getOne(id);
    }

    @Override
    public void save(Object stomatologs) {
        log.info("In StomatologsService save{}" + stomatologs);

        stomatologsRepository.save((StomatologsEntity) stomatologs);
    }

    @Override
    public void delete(Long id) {
        log.info("In StomatologsService delete{}" + id);
        stomatologsRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return stomatologsRepository.findAll();
    }
}
