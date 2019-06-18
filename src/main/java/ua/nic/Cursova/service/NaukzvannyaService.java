package ua.nic.Cursova.service;

import ua.nic.Cursova.model.NaukzvannyaEntity;
import ua.nic.Cursova.repository.INaukzvannyaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class NaukzvannyaService implements IEntityService {
    
    private static Logger log = Logger.getLogger(NaukzvannyaService.class.getName());
    @Autowired
    INaukzvannyaRepository naukzvannyaRepository;


    @Override
    public NaukzvannyaEntity getById(Long id) {
        log.info("In NaukzvannyaService getById{{}" + id);
        return naukzvannyaRepository.getOne(id);
    }

    @Override
    public void save(Object naukzvannya) {
        log.info("In NaukzvannyaService save{}" + naukzvannya);

        naukzvannyaRepository.save((NaukzvannyaEntity) naukzvannya);
    }

    @Override
    public void delete(Long id) {
        log.info("In NaukzvannyaService delete{}" + id);
        naukzvannyaRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return naukzvannyaRepository.findAll();
    }
}
