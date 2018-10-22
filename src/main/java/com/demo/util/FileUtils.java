package com.demo.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Auther: DELL
 * @Date: 2018/8/13 13:49
 * @Description:
 */
public class FileUtils {


    public static void uploadFile(byte[] file,String filePath,String fileName) throws IOException {
        File targetFile = new File(filePath);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        try(FileOutputStream fileOutputStream  = new FileOutputStream(filePath.concat(fileName))){
            fileOutputStream.write(file);
        }
//        FileOutputStream fileOutputStream  = new FileOutputStream(filePath.concat(fileName));
//        fileOutputStream.write(file);
//        fileOutputStream.flush();
//        fileOutputStream.close();
    }
}
