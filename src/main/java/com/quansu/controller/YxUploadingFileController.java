package com.quansu.controller;

import com.quansu.utils.JsonResponseUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * @author cxy
 */
@Controller
@RequestMapping("/file")
public class YxUploadingFileController {

    @RequestMapping("/upload")
    @ResponseBody
    @SuppressWarnings("all")
    public JsonResponseUtils fileUpload(@RequestParam("file") CommonsMultipartFile multipartFile, String dir, HttpServletRequest request) throws IOException {
        String url = "uploadingAllFile/fileFile/";
        String typeName = "-file-";
        if ("image".equals(dir)) {
            url = "uploadingAllFile/imgFile/";
            typeName = "-img-";
        }
        //存储的fileName
        String fileName = new Date().getTime() + typeName + multipartFile.getOriginalFilename();
        String path = request.getSession().getServletContext().getRealPath("/") + url + fileName;
        File newFile = new File(path);
        System.out.println(path);
        multipartFile.transferTo(newFile);
        url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/" + url + fileName;
        Map map = new HashMap<>();
        map.put("url", url);
        return JsonResponseUtils.ok(map);
    }
}


