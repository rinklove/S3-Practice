package com.s3example.app.sample.config;


import com.amazonaws.services.s3.AmazonS3Client;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class FileStore {

    @Value("junho-practice")
    private String bucket;

    private final AmazonS3Client client;
}
