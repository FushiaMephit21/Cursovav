package ua.nic.Cursova.service;

import ua.nic.Cursova.model.ProfileslabaratoryEntity;
import ua.nic.Cursova.repository.IProfileslabaratoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class ProfileslabaratoryService implements IEntityService {
    
    private static Logger log = Logger.getLogger(ProfileslabaratoryService.class.getName());
    @Autowired
    IProfileslabaratoryRepository profileslabaratoryRepository;


    @Override
    public ProfileslabaratoryEntity getById(Long id) {
        log.info("In ProfileslabaratoryService getById{{}" + id);
        return profileslabaratoryRepository.getOne(id);
    }

    @Override
    public void save(Object profileslabaratory) {
        log.info("In ProfileslabaratoryService save{}" + profileslabaratory);

        profileslabaratoryRepository.save((ProfileslabaratoryEntity) profileslabaratory);
    }

    @Override
    public void delete(Long id) {
        log.info("In ProfileslabaratoryService delete{}" + id);
        profileslabaratoryRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return profileslabaratoryRepository.findAll();
    }
}
