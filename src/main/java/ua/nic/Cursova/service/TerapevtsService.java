package ua.nic.Cursova.service;

import ua.nic.Cursova.model.TerapevtsEntity;
import ua.nic.Cursova.repository.ITerapevtsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class TerapevtsService implements IEntityService {
    
    private static Logger log = Logger.getLogger(TerapevtsService.class.getName());
    @Autowired
    ITerapevtsRepository terapevtsRepository;


    @Override
    public TerapevtsEntity getById(Long id) {
        log.info("In TerapevtsService getById{{}" + id);
        return terapevtsRepository.getOne(id);
    }

    @Override
    public void save(Object terapevts) {
        log.info("In TerapevtsService save{}" + terapevts);

        terapevtsRepository.save((TerapevtsEntity) terapevts);
    }

    @Override
    public void delete(Long id) {
        log.info("In TerapevtsService delete{}" + id);
        terapevtsRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return terapevtsRepository.findAll();
    }
}
