package com.edutrack.edutrack.repository;

import com.edutrack.edutrack.entity.Batch;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BatchRepository extends MongoRepository<Batch, String>
{
}