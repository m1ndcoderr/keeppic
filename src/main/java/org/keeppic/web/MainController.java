package org.keeppic.web;

import org.keeppic.domain.Picture;
import org.keeppic.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

/**
 * @author Evgeny Khodzitskiy (evgeny.hodz@gmail.com)
 * @since 04.02.2018
 */
@Controller
public class MainController {
    
//    private final PictureService pictureService;
//
//    @Autowired
//    public MainController(PictureService pictureService) {
//        this.pictureService = pictureService;
//    }

    @GetMapping(value = "/")
    public String showBasicPage() {
        return "redirect:index";
    }

    @GetMapping(value = "/toabout")
    public String showAboutPage() {
        return "redirect:about";
    }

    @GetMapping(value = "/torules")
    public String showRulesPage() {
        return "redirect:rules";
    }

    @GetMapping(value = "/toloaded")
    public String showLoadedPage() {
        return "redirect:loaded";
    }


    @PostMapping(value = "/upload")
    public String handleFileUpload(@RequestParam("files[]") ArrayList<MultipartFile> files) {
        for (MultipartFile f : files) {
            System.out.println(f.getOriginalFilename());
        }
        return "redirect:loaded";
    }
}
