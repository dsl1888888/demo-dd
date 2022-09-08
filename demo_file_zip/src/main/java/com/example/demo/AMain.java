package com.example.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class AMain {


    public static void main(String[] args) {
        //当个
//        String zipString = "AAAAAAA.zip";
//
//        String doIt="C:\\Users\\DD\\Desktop\\zip Java.txt";
//        ZipFile(doIt, zipString);
//
//        File filesInPath = new File(zipString);


        //多个
        ArrayList<String> fileList=new ArrayList<>();
        fileList.add("zip Java.txt");
        fileList.add("zip Java1.txt");

//        fileList.add("C:\\Users\\DD\\Desktop\\zip Java.txt");
//        fileList.add("C:\\Users\\DD\\Desktop\\zip Java1.txt");
        String zipFileName="AAAAAAA.zip";
        ZIPUtil.createZipFile(fileList,zipFileName);
    }

    /**
     * 压缩单个文件
     */
    public static void ZipFile(String filepath, String zippath) {
        try {
            File file = new File(filepath);
            File zipFile = new File(zippath);
            InputStream input = new FileInputStream(file);
            ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
            zipOut.putNextEntry(new ZipEntry(file.getName()));
            int temp = 0;
            while ((temp = input.read()) != -1) {
                zipOut.write(temp);
            }
            input.close();
            zipOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
