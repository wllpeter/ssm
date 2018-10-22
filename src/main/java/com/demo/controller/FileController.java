package com.demo.controller;

import com.demo.util.FileUtils;
import com.demo.util.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Auther: DELL
 * @Date: 2018/8/13 12:01
 * @Description:
 */
@RestController
@RequestMapping("/file")
public class FileController {

    private String docPath = "/opt/sigo/recruit/resume/doc/";

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public Response upload(@RequestParam(value = "file",required = true) MultipartFile file,
                           @RequestParam(value = "type",required = true) String type
    ) throws IOException {
        File doc = new File(docPath);
        if (!doc.exists()) {
            doc.mkdirs();
        }
        String fileName = file.getOriginalFilename();
        FileUtils.uploadFile(file.getBytes(),docPath,fileName);
        return Response.success(fileName);
    }

}
