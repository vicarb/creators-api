package com.example.creatorproject.repository;
import com.example.creatorproject.model.Creator;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CreatorRepository extends MongoRepository<Creator, String> {}