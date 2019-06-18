package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.PostsEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class PostsViewController {
    @Autowired
    private IEntityService postsService;

    @GetMapping("/postsList")
    public String getAllPosts (Model model) {
        model.addAttribute("postsList", postsService.getAll());
        model.addAttribute("postsEntity", new PostsEntity());
        return "postsList.html";
    }

    @RequestMapping(value = "/postsList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deletePosts (
            ModelAndView modelAndView,
            @Valid PostsEntity postsEntity,
            BindingResult result) {
        postsService.delete(postsEntity.getId());
        modelAndView.setViewName("redirect:/postsList");
        return modelAndView;
    }
    @RequestMapping(value = "/postsList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addPosts (
            ModelAndView modelAndView,
            @Valid PostsEntity postsEntity,
            BindingResult result) {
        postsService.save(postsEntity);
        modelAndView.setViewName("redirect:/postsList");
        return modelAndView;
    }
    @RequestMapping(value = "/postsList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updatePosts (
            ModelAndView modelAndView,
            @Valid PostsEntity postsEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            postsService.delete(postsEntity.getId());
            postsService.save(postsEntity);
            modelAndView.getModel().put("posts", postsEntity);
            modelAndView.setViewName("redirect:/postsList");
        }
        return modelAndView;
    }

}

