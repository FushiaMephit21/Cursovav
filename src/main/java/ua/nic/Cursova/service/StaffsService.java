package ua.nic.Cursova.service;

import ua.nic.Cursova.model.StaffsEntity;
import ua.nic.Cursova.repository.IStaffsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class StaffsService implements IEntityService {
    
    private static Logger log = Logger.getLogger(StaffsService.class.getName());
    @Autowired
    IStaffsRepository staffsRepository;


    @Override
    public StaffsEntity getById(Long id) {
        log.info("In StaffsService getById{{}" + id);
        return staffsRepository.getOne(id);
    }

    @Override
    public void save(Object staffs) {
        log.info("In StaffsService save{}" + staffs);

        staffsRepository.save((StaffsEntity) staffs);
    }

    @Override
    public void delete(Long id) {
        log.info("In StaffsService delete{}" + id);
        staffsRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return staffsRepository.findAll();
    }
}
