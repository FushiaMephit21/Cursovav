package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.PolikliniksEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class PolikliniksViewController {
    @Autowired
    private IEntityService polikliniksService;

    @GetMapping("/polikliniksList")
    public String getAllPolikliniks (Model model) {
        model.addAttribute("polikliniksList", polikliniksService.getAll());
        model.addAttribute("polikliniksEntity", new PolikliniksEntity());
        return "polikliniksList.html";
    }

    @RequestMapping(value = "/polikliniksList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deletePolikliniks (
            ModelAndView modelAndView,
            @Valid PolikliniksEntity polikliniksEntity,
            BindingResult result) {
        polikliniksService.delete(polikliniksEntity.getId());
        modelAndView.setViewName("redirect:/polikliniksList");
        return modelAndView;
    }
    @RequestMapping(value = "/polikliniksList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addPolikliniks (
            ModelAndView modelAndView,
            @Valid PolikliniksEntity polikliniksEntity,
            BindingResult result) {
        polikliniksService.save(polikliniksEntity);
        modelAndView.setViewName("redirect:/polikliniksList");
        return modelAndView;
    }
    @RequestMapping(value = "/polikliniksList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updatePolikliniks (
            ModelAndView modelAndView,
            @Valid PolikliniksEntity polikliniksEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            polikliniksService.delete(polikliniksEntity.getId());
            polikliniksService.save(polikliniksEntity);
            modelAndView.getModel().put("polikliniks", polikliniksEntity);
            modelAndView.setViewName("redirect:/polikliniksList");
        }
        return modelAndView;
    }

}

