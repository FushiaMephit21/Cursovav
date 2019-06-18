package ua.nic.Cursova.service;

import ua.nic.Cursova.model.OttolaringologsEntity;
import ua.nic.Cursova.repository.IOttolaringologsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class OttolaringologsService implements IEntityService {
    
    private static Logger log = Logger.getLogger(OttolaringologsService.class.getName());
    @Autowired
    IOttolaringologsRepository ottolaringologsRepository;


    @Override
    public OttolaringologsEntity getById(Long id) {
        log.info("In OttolaringologsService getById{{}" + id);
        return ottolaringologsRepository.getOne(id);
    }

    @Override
    public void save(Object ottolaringologs) {
        log.info("In OttolaringologsService save{}" + ottolaringologs);

        ottolaringologsRepository.save((OttolaringologsEntity) ottolaringologs);
    }

    @Override
    public void delete(Long id) {
        log.info("In OttolaringologsService delete{}" + id);
        ottolaringologsRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return ottolaringologsRepository.findAll();
    }
}
