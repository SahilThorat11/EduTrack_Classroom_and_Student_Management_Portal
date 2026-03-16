package com.edutrack.edutrack.service;

import com.edutrack.edutrack.entity.Batch;
import com.edutrack.edutrack.repository.BatchRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BatchService
{
    private final BatchRepository batchRepository;

    // Constructor Injection (BEST PRACTICE)
    public BatchService(BatchRepository batchRepository)
    {
        this.batchRepository = batchRepository;
    }

    // Create
    public Batch create(Batch batch)
    {
        return batchRepository.save(batch);
    }

    // Read All
    public List<Batch> getAll()
    {
        return batchRepository.findAll();
    }

    // Read By Id
    public Optional<Batch> getById(String id)
    {
        return batchRepository.findById(id);
    }

    // Delete
    public void delete(String id)
    {
        batchRepository.deleteById(id);
    }

    // Update
    public Batch update(String id, Batch newBatch)
    {
        Batch old = batchRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Batch not found"));

        old.setName(newBatch.getName());
        old.setFees(newBatch.getFees());

        return batchRepository.save(old);
    }
}