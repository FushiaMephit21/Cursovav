package ua.nic.Cursova.service;

import ua.nic.Cursova.model.PostsEntity;
import ua.nic.Cursova.repository.IPostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;



@Service
public class PostsService implements IEntityService {
    
    private static Logger log = Logger.getLogger(PostsService.class.getName());
    @Autowired
    IPostsRepository postsRepository;


    @Override
    public PostsEntity getById(Long id) {
        log.info("In PostsService getById{{}" + id);
        return postsRepository.getOne(id);
    }

    @Override
    public void save(Object posts) {
        log.info("In PostsService save{}" + posts);

        postsRepository.save((PostsEntity) posts);
    }

    @Override
    public void delete(Long id) {
        log.info("In PostsService delete{}" + id);
        postsRepository.deleteById(id);
    }

    @Override
    public List getAll() {
       return postsRepository.findAll();
    }
}
