package ua.nic.Cursova.service;

import ua.nic.Cursova.model.HinegologsEntity;
import ua.nic.Cursova.repository.IHinegologsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class HinegologsService implements IEntityService {
    
    private static Logger log = Logger.getLogger(HinegologsService.class.getName());
    @Autowired
    IHinegologsRepository hinegologsRepository;


    @Override
    public HinegologsEntity getById(Long id) {
        log.info("In HinegologsService getById{{}" + id);
        return hinegologsRepository.getOne(id);
    }

    @Override
    public void save(Object hinegologs) {
        log.info("In HinegologsService save{}" + hinegologs);

        hinegologsRepository.save((HinegologsEntity) hinegologs);
    }

    @Override
    public void delete(Long id) {
        log.info("In HinegologsService delete{}" + id);
        hinegologsRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return hinegologsRepository.findAll();
    }
}
