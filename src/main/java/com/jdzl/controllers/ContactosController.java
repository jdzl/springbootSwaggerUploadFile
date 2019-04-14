package com.jdzl.controllers;


import com.jdzl.models.Contactos;
import com.jdzl.service.UploadFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
@RestController
public class ContactosController {
    @Autowired
    private UploadFile uploadFileService;
    @PostMapping("upload")
    public ResponseEntity<?> uploadFile(@RequestParam("file")MultipartFile file){

        try {
            uploadFileService.saveFile(file);
        }catch (IOException e){
            e.printStackTrace();
        }
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
    @PostMapping("upload/{nit}")
    public ResponseEntity<?> uploadFile2(@PathVariable("nit") String nit,
                                         @ModelAttribute Contactos contacto
                                         ){

        try {
            uploadFileService.saveFile(contacto.getFile());
        }catch (IOException e){
            e.printStackTrace();
        }

        contacto.setFoto("http://localhost:8000/download/file/"+contacto.getFile().getOriginalFilename());

        return new ResponseEntity<Contactos>(contacto, HttpStatus.OK);
    }
}
