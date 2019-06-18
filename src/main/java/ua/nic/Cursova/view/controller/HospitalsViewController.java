package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.HospitalsEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class HospitalsViewController {
    @Autowired
    private IEntityService hospitalsService;

    @GetMapping("/hospitalsList")
    public String getAllHospitals (Model model) {
        model.addAttribute("hospitalsList", hospitalsService.getAll());
        model.addAttribute("hospitalsEntity", new HospitalsEntity());
        return "hospitalsList.html";
    }

    @RequestMapping(value = "/hospitalsList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteHospitals (
            ModelAndView modelAndView,
            @Valid HospitalsEntity hospitalsEntity,
            BindingResult result) {
        hospitalsService.delete(hospitalsEntity.getId());
        modelAndView.setViewName("redirect:/hospitalsList");
        return modelAndView;
    }
    @RequestMapping(value = "/hospitalsList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addHospitals (
            ModelAndView modelAndView,
            @Valid HospitalsEntity hospitalsEntity,
            BindingResult result) {
        hospitalsService.save(hospitalsEntity);
        modelAndView.setViewName("redirect:/hospitalsList");
        return modelAndView;
    }
    @RequestMapping(value = "/hospitalsList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateHospitals (
            ModelAndView modelAndView,
            @Valid HospitalsEntity hospitalsEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            hospitalsService.delete(hospitalsEntity.getId());
            hospitalsService.save(hospitalsEntity);
            modelAndView.getModel().put("hospitals", hospitalsEntity);
            modelAndView.setViewName("redirect:/hospitalsList");
        }
        return modelAndView;
    }

}

