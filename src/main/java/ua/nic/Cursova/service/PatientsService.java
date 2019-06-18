package ua.nic.Cursova.service;

import ua.nic.Cursova.model.PatientsEntity;
import ua.nic.Cursova.repository.IPatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class PatientsService implements IEntityService {
    
    private static Logger log = Logger.getLogger(PatientsService.class.getName());
    @Autowired
    IPatientsRepository patientsRepository;


    @Override
    public PatientsEntity getById(Long id) {
        log.info("In PatientsService getById{{}" + id);
        return patientsRepository.getOne(id);
    }

    @Override
    public void save(Object patients) {
        log.info("In PatientsService save{}" + patients);

        patientsRepository.save((PatientsEntity) patients);
    }

    @Override
    public void delete(Long id) {
        log.info("In PatientsService delete{}" + id);
        patientsRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return patientsRepository.findAll();
    }
}
