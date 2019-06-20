package ua.nic.Cursova.service;

import ua.nic.Cursova.model.CorpusEntity;
import ua.nic.Cursova.repository.ICorpusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class CorpusService implements IEntityService {
    
    private static Logger log = Logger.getLogger(CorpusService.class.getName());
    @Autowired
    ICorpusRepository corpusRepository;


    public CorpusEntity getById(Long id) {
        log.info("In CorpusService getById{{}" + id);
        return corpusRepository.getOne(id);
    }

    public void save(Object corpus) {
        log.info("In CorpusService save{}" + corpus);

        corpusRepository.save((CorpusEntity) corpus);
    }

    public void delete(Long id) {
        log.info("In CorpusService delete{}" + id);
        corpusRepository.deleteById(id);
    }

    public List getAll() {
       return corpusRepository.findAll();
    }
}
