package ru.netology.diplom.service;


import jakarta.xml.bind.ValidationException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.netology.diplom.dto.CloudFileDto;
import ru.netology.diplom.entity.CloudFileEntity;

import java.io.IOException;
import java.util.List;

@Service
public interface FileService {
    void upload(String file, MultipartFile files) throws IOException;

    List<CloudFileDto> show(String login, int limit);

    void delete(String fileName);

    CloudFileEntity getFile(String filename) throws ValidationException;

    CloudFileEntity updateFileName(String fileName, String newName) throws ValidationException;
}
