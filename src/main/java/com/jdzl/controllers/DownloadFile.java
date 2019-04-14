package com.jdzl.controllers;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLConnection;

@RestController
@RequestMapping("download")
public class DownloadFile {

    private String upload_folder = ".//src//main//resources//files//";


    @RequestMapping("file/{filename:.+}")
    public void downloadFile(HttpServletRequest req, HttpServletResponse res,
                             @PathVariable String filename) throws IOException {


        File file = new File(upload_folder+filename);

        if(file.exists()){

            String mimeType = URLConnection.guessContentTypeFromName(file.getName());
            if(mimeType == null) mimeType ="application/octet-stream";

            res.setContentType(mimeType);
            res.setHeader("Content-Disposition", String.format("attachment; filename=\"%s\"",file.getName()));
            res.setContentLength((int) file.length());
            InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
            FileCopyUtils.copy(inputStream,res.getOutputStream());




        }



    }
}
