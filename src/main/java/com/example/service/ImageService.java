package com.example.service;

import com.example.jpa.entity.Image;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ImageService {
    List<Image> getAllImages();
    Image saveImage(MultipartFile file) throws IOException;
}
