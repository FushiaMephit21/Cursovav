package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.PatientsEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class PatientsViewController {
    @Autowired
    private IEntityService patientsService;

    @GetMapping("/patientsList")
    public String getAllPatients (Model model) {
        model.addAttribute("patientsList", patientsService.getAll());
        model.addAttribute("patientsEntity", new PatientsEntity());
        return "patientsList.html";
    }

    @RequestMapping(value = "/patientsList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deletePatients (
            ModelAndView modelAndView,
            @Valid PatientsEntity patientsEntity,
            BindingResult result) {
        patientsService.delete(patientsEntity.getId());
        modelAndView.setViewName("redirect:/patientsList");
        return modelAndView;
    }
    @RequestMapping(value = "/patientsList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addPatients (
            ModelAndView modelAndView,
            @Valid PatientsEntity patientsEntity,
            BindingResult result) {
        patientsService.save(patientsEntity);
        modelAndView.setViewName("redirect:/patientsList");
        return modelAndView;
    }
    @RequestMapping(value = "/patientsList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updatePatients (
            ModelAndView modelAndView,
            @Valid PatientsEntity patientsEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            patientsService.delete(patientsEntity.getId());
            patientsService.save(patientsEntity);
            modelAndView.getModel().put("patients", patientsEntity);
            modelAndView.setViewName("redirect:/patientsList");
        }
        return modelAndView;
    }

}

