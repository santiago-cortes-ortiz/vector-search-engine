package com.jeisson.vectorsearchengine.service;

import com.jeisson.vectorsearchengine.repository.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DocumentService {
    private final DocumentRepository repository;
}
