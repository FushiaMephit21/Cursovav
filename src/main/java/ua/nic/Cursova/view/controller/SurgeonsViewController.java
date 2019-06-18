package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.SurgeonsEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class SurgeonsViewController {
    @Autowired
    private IEntityService surgeonsService;

    @GetMapping("/surgeonsList")
    public String getAllSurgeons (Model model) {
        model.addAttribute("surgeonsList", surgeonsService.getAll());
        model.addAttribute("surgeonsEntity", new SurgeonsEntity());
        return "surgeonsList.html";
    }

    @RequestMapping(value = "/surgeonsList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteSurgeons (
            ModelAndView modelAndView,
            @Valid SurgeonsEntity surgeonsEntity,
            BindingResult result) {
        surgeonsService.delete(surgeonsEntity.getId());
        modelAndView.setViewName("redirect:/surgeonsList");
        return modelAndView;
    }
    @RequestMapping(value = "/surgeonsList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addSurgeons (
            ModelAndView modelAndView,
            @Valid SurgeonsEntity surgeonsEntity,
            BindingResult result) {
        surgeonsService.save(surgeonsEntity);
        modelAndView.setViewName("redirect:/surgeonsList");
        return modelAndView;
    }
    @RequestMapping(value = "/surgeonsList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateSurgeons (
            ModelAndView modelAndView,
            @Valid SurgeonsEntity surgeonsEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            surgeonsService.delete(surgeonsEntity.getId());
            surgeonsService.save(surgeonsEntity);
            modelAndView.getModel().put("surgeons", surgeonsEntity);
            modelAndView.setViewName("redirect:/surgeonsList");
        }
        return modelAndView;
    }

}

