package com.example.service.serviceImpl;

import com.example.jpa.entity.Image;
import com.example.jpa.repository.ImageRepository;
import com.example.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Service
public class ImageServiceImpl implements ImageService {
    private final ImageRepository imageRepository;
    private String UPLOAD_DIR = "C:/Users/lebac/Downloads/picture";

    @Autowired
    public ImageServiceImpl(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    public Image saveImage(MultipartFile file) throws IOException {
        String fileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
        File imageFile = new File(UPLOAD_DIR + "/" + fileName);
        file.transferTo(imageFile);
        Image image = new Image();
        image.setName(fileName);
        return imageRepository.save(image);
    }


    public List<Image> getAllImages() {
        return imageRepository.findAll();
    }
}
