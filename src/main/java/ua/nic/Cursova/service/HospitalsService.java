package ua.nic.Cursova.service;

import ua.nic.Cursova.model.HospitalsEntity;
import ua.nic.Cursova.repository.IHospitalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class HospitalsService implements IEntityService {
    
    private static Logger log = Logger.getLogger(HospitalsService.class.getName());
    @Autowired
    IHospitalsRepository hospitalsRepository;


    @Override
    public HospitalsEntity getById(Long id) {
        log.info("In HospitalsService getById{{}" + id);
        return hospitalsRepository.getOne(id);
    }

    @Override
    public void save(Object hospitals) {
        log.info("In HospitalsService save{}" + hospitals);

        hospitalsRepository.save((HospitalsEntity) hospitals);
    }

    @Override
    public void delete(Long id) {
        log.info("In HospitalsService delete{}" + id);
        hospitalsRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return hospitalsRepository.findAll();
    }
}
