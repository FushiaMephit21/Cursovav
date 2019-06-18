package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.ProfileslabaratoryEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class ProfileslabaratoryViewController {
    @Autowired
    private IEntityService profileslabaratoryService;

    @GetMapping("/profileslabaratoryList")
    public String getAllProfileslabaratory (Model model) {
        model.addAttribute("profileslabaratoryList", profileslabaratoryService.getAll());
        model.addAttribute("profileslabaratoryEntity", new ProfileslabaratoryEntity());
        return "profileslabaratoryList.html";
    }

    @RequestMapping(value = "/profileslabaratoryList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteProfileslabaratory (
            ModelAndView modelAndView,
            @Valid ProfileslabaratoryEntity profileslabaratoryEntity,
            BindingResult result) {
        profileslabaratoryService.delete(profileslabaratoryEntity.getId());
        modelAndView.setViewName("redirect:/profileslabaratoryList");
        return modelAndView;
    }
    @RequestMapping(value = "/profileslabaratoryList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addProfileslabaratory (
            ModelAndView modelAndView,
            @Valid ProfileslabaratoryEntity profileslabaratoryEntity,
            BindingResult result) {
        profileslabaratoryService.save(profileslabaratoryEntity);
        modelAndView.setViewName("redirect:/profileslabaratoryList");
        return modelAndView;
    }
    @RequestMapping(value = "/profileslabaratoryList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateProfileslabaratory (
            ModelAndView modelAndView,
            @Valid ProfileslabaratoryEntity profileslabaratoryEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            profileslabaratoryService.delete(profileslabaratoryEntity.getId());
            profileslabaratoryService.save(profileslabaratoryEntity);
            modelAndView.getModel().put("profileslabaratory", profileslabaratoryEntity);
            modelAndView.setViewName("redirect:/profileslabaratoryList");
        }
        return modelAndView;
    }

}

