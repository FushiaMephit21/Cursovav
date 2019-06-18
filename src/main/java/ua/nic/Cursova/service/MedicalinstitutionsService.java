package ua.nic.Cursova.service;

import ua.nic.Cursova.model.MedicalinstitutionsEntity;
import ua.nic.Cursova.repository.IMedicalinstitutionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class MedicalinstitutionsService implements IEntityService {
    
    private static Logger log = Logger.getLogger(MedicalinstitutionsService.class.getName());
    @Autowired
    IMedicalinstitutionsRepository medicalinstitutionsRepository;


    @Override
    public MedicalinstitutionsEntity getById(Long id) {
        log.info("In MedicalinstitutionsService getById{{}" + id);
        return medicalinstitutionsRepository.getOne(id);
    }

    @Override
    public void save(Object medicalinstitutions) {
        log.info("In MedicalinstitutionsService save{}" + medicalinstitutions);

        medicalinstitutionsRepository.save((MedicalinstitutionsEntity) medicalinstitutions);
    }

    @Override
    public void delete(Long id) {
        log.info("In MedicalinstitutionsService delete{}" + id);
        medicalinstitutionsRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return medicalinstitutionsRepository.findAll();
    }
}
