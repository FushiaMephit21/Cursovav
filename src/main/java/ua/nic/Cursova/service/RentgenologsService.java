package ua.nic.Cursova.service;

import ua.nic.Cursova.model.RentgenologsEntity;
import ua.nic.Cursova.repository.IRentgenologsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class RentgenologsService implements IEntityService {
    
    private static Logger log = Logger.getLogger(RentgenologsService.class.getName());
    @Autowired
    IRentgenologsRepository rentgenologsRepository;


    @Override
    public RentgenologsEntity getById(Long id) {
        log.info("In RentgenologsService getById{{}" + id);
        return rentgenologsRepository.getOne(id);
    }

    @Override
    public void save(Object rentgenologs) {
        log.info("In RentgenologsService save{}" + rentgenologs);

        rentgenologsRepository.save((RentgenologsEntity) rentgenologs);
    }

    @Override
    public void delete(Long id) {
        log.info("In RentgenologsService delete{}" + id);
        rentgenologsRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return rentgenologsRepository.findAll();
    }
}
