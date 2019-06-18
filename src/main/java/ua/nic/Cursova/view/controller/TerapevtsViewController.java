package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.TerapevtsEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class TerapevtsViewController {
    @Autowired
    private IEntityService terapevtsService;

    @GetMapping("/terapevtsList")
    public String getAllTerapevts (Model model) {
        model.addAttribute("terapevtsList", terapevtsService.getAll());
        model.addAttribute("terapevtsEntity", new TerapevtsEntity());
        return "terapevtsList.html";
    }

    @RequestMapping(value = "/terapevtsList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteTerapevts (
            ModelAndView modelAndView,
            @Valid TerapevtsEntity terapevtsEntity,
            BindingResult result) {
        terapevtsService.delete(terapevtsEntity.getId());
        modelAndView.setViewName("redirect:/terapevtsList");
        return modelAndView;
    }
    @RequestMapping(value = "/terapevtsList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addTerapevts (
            ModelAndView modelAndView,
            @Valid TerapevtsEntity terapevtsEntity,
            BindingResult result) {
        terapevtsService.save(terapevtsEntity);
        modelAndView.setViewName("redirect:/terapevtsList");
        return modelAndView;
    }
    @RequestMapping(value = "/terapevtsList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateTerapevts (
            ModelAndView modelAndView,
            @Valid TerapevtsEntity terapevtsEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            terapevtsService.delete(terapevtsEntity.getId());
            terapevtsService.save(terapevtsEntity);
            modelAndView.getModel().put("terapevts", terapevtsEntity);
            modelAndView.setViewName("redirect:/terapevtsList");
        }
        return modelAndView;
    }

}

