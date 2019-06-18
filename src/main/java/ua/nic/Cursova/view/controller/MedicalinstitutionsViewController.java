package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.MedicalinstitutionsEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class MedicalinstitutionsViewController {
    @Autowired
    private IEntityService medicalinstitutionsService;

    @GetMapping("/medicalinstitutionsList")
    public String getAllMedicalinstitutions (Model model) {
        model.addAttribute("medicalinstitutionsList", medicalinstitutionsService.getAll());
        model.addAttribute("medicalinstitutionsEntity", new MedicalinstitutionsEntity());
        return "medicalinstitutionsList.html";
    }

    @RequestMapping(value = "/medicalinstitutionsList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteMedicalinstitutions (
            ModelAndView modelAndView,
            @Valid MedicalinstitutionsEntity medicalinstitutionsEntity,
            BindingResult result) {
        medicalinstitutionsService.delete(medicalinstitutionsEntity.getId());
        modelAndView.setViewName("redirect:/medicalinstitutionsList");
        return modelAndView;
    }
    @RequestMapping(value = "/medicalinstitutionsList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addMedicalinstitutions (
            ModelAndView modelAndView,
            @Valid MedicalinstitutionsEntity medicalinstitutionsEntity,
            BindingResult result) {
        medicalinstitutionsService.save(medicalinstitutionsEntity);
        modelAndView.setViewName("redirect:/medicalinstitutionsList");
        return modelAndView;
    }
    @RequestMapping(value = "/medicalinstitutionsList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateMedicalinstitutions (
            ModelAndView modelAndView,
            @Valid MedicalinstitutionsEntity medicalinstitutionsEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            medicalinstitutionsService.delete(medicalinstitutionsEntity.getId());
            medicalinstitutionsService.save(medicalinstitutionsEntity);
            modelAndView.getModel().put("medicalinstitutions", medicalinstitutionsEntity);
            modelAndView.setViewName("redirect:/medicalinstitutionsList");
        }
        return modelAndView;
    }

}

