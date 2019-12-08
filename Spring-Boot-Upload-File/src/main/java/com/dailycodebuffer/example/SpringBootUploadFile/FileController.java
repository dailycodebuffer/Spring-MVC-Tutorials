package com.dailycodebuffer.example.SpringBootUploadFile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;

@Controller
public class FileController {

    @Autowired
    FileService fileService;

    @GetMapping("/")
    public  String index()
    {
        return "upload";
    }

    @PostMapping("/uploadFile")
    public String uploadFile(@RequestParam("file")MultipartFile file, RedirectAttributes redirectAttributes)
    {
        fileService.uploadFile(file);
        redirectAttributes.addFlashAttribute("message", "You Successfully Uploaded" + file.getOriginalFilename() + "!");

        return "redirect:/";
    }

    @PostMapping("/uploadFiles")
    public String uploadFiles(@RequestParam("files") MultipartFile[] files, RedirectAttributes redirectAttributes) {

        Arrays.asList(files)
                .stream()
                .forEach(file -> fileService.uploadFile(file));

        redirectAttributes.addFlashAttribute("message",
                "You successfully uploaded all files!");

        return "redirect:/";
    }
}
