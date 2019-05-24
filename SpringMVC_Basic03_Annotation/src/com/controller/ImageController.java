package com.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.model.Photo;

@Controller
@RequestMapping("/image/upload.do") // GET, POST
public class ImageController {
  @RequestMapping(method = RequestMethod.GET)
  public String form() {
    System.out.println("image.jsp forward");
    return "image/image";
  }
  
  @RequestMapping(method = RequestMethod.POST)
  public String submit(Photo photo, HttpServletRequest request) throws IOException {
    /*
     * submit(Photo photo)
     * 1. 자동화 form 태그 내부 input 태그의 name = member field 명
     * 
     * 요청>> submit(Photo photo)
     * 내부적으로...
     * Photo photo = new Photo();
     * photo.setName("홍길동");
     * photo.setAge(100);
     * photo.setImage(); 입력을 별도로 해줘야함
     * 
     * 업로드한 파일은
     * CommonsMultipartFile file
     * 이름이 >> file
     * <input type="file" name="file">
     * POINT:
     * CommonsMultipartFile imageFile = photo.getFile();
     * imageFile.getName()
     * imageFile.getBytes().length;
     * imageFile.getOriginalFilename();
     */
    
    CommonsMultipartFile imageFile = photo.getFile();
    System.out.println(imageFile.getName());
    System.out.println(imageFile.getSize());
    System.out.println(imageFile.getBytes().length);
    System.out.println(imageFile.getOriginalFilename());
    
    photo.setImage(imageFile.getName());
    
    String filename = imageFile.getOriginalFilename();
    String path = request.getServletContext().getRealPath("/upload");
    String fpath = path + "\\" + filename;
    FileOutputStream fs = new FileOutputStream(fpath);
    fs.write(imageFile.getBytes());
    fs.close();
    
    return "image/image";
  }
}
