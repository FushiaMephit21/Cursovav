package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.LabaratoryEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class LabaratoryViewController {
    @Autowired
    private IEntityService labaratoryService;

    @GetMapping("/labaratoryList")
    public String getAllLabaratory (Model model) {
        model.addAttribute("labaratoryList", labaratoryService.getAll());
        model.addAttribute("labaratoryEntity", new LabaratoryEntity());
        return "labaratoryList.html";
    }

    @RequestMapping(value = "/labaratoryList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteLabaratory (
            ModelAndView modelAndView,
            @Valid LabaratoryEntity labaratoryEntity,
            BindingResult result) {
        labaratoryService.delete(labaratoryEntity.getId());
        modelAndView.setViewName("redirect:/labaratoryList");
        return modelAndView;
    }
    @RequestMapping(value = "/labaratoryList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addLabaratory (
            ModelAndView modelAndView,
            @Valid LabaratoryEntity labaratoryEntity,
            BindingResult result) {
        labaratoryService.save(labaratoryEntity);
        modelAndView.setViewName("redirect:/labaratoryList");
        return modelAndView;
    }
    @RequestMapping(value = "/labaratoryList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateLabaratory (
            ModelAndView modelAndView,
            @Valid LabaratoryEntity labaratoryEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            labaratoryService.delete(labaratoryEntity.getId());
            labaratoryService.save(labaratoryEntity);
            modelAndView.getModel().put("labaratory", labaratoryEntity);
            modelAndView.setViewName("redirect:/labaratoryList");
        }
        return modelAndView;
    }

}

