package ua.nic.Cursova.service;

import ua.nic.Cursova.model.DogtorsEntity;
import ua.nic.Cursova.repository.IDogtorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class DogtorsService implements IEntityService {
    
    private static Logger log = Logger.getLogger(DogtorsService.class.getName());
    @Autowired
    IDogtorsRepository dogtorsRepository;


    public DogtorsEntity getById(Long id) {
        log.info("In DogtorsService getById{{}" + id);
        return dogtorsRepository.getOne(id);
    }

    public void save(Object dogtors) {
        log.info("In DogtorsService save{}" + dogtors);

        dogtorsRepository.save((DogtorsEntity) dogtors);
    }

    public void delete(Long id) {
        log.info("In DogtorsService delete{}" + id);
        dogtorsRepository.deleteById(id);
    }

    public List getAll() {
       return dogtorsRepository.findAll();
    }
}
