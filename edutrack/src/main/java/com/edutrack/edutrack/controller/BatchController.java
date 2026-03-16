package com.edutrack.edutrack.controller;

import com.edutrack.edutrack.entity.Batch;
import com.edutrack.edutrack.service.BatchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/batches")
public class BatchController
{
    private final BatchService batchService;

    public BatchController(BatchService batchService)
    {
        this.batchService = batchService;
    }

    // GET all batches
    @GetMapping
    public ResponseEntity<List<Batch>> getAll()
    {
        return ResponseEntity.ok(batchService.getAll());
    }

    // CREATE batch
    @PostMapping
    public ResponseEntity<Batch> create(@RequestBody Batch batch)
    {
        return ResponseEntity.ok(batchService.create(batch));
    }

    // UPDATE batch
    @PutMapping("/{id}")
    public ResponseEntity<Batch> update(@PathVariable String id, @RequestBody Batch batch)
    {
        return ResponseEntity.ok(batchService.update(id, batch));
    }

    // DELETE batch
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id)
    {
        batchService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
