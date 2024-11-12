package com.tgs.ir.core;

import com.tgs.ir.requests.PaginationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseController<E, M, T> {

    @Autowired
    private BaseService<M, T> baseService;

    @GetMapping("/{id}")
    public ResponseEntity<BaseResponse<HttpStatus, M>> getById(@PathVariable T id) {
        BaseResponse<HttpStatus, M> response = baseService.get(id);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @GetMapping
    public ResponseEntity<BaseResponse<HttpStatus, List<M>>> getAll() {
        BaseResponse<HttpStatus, List<M>> response = baseService.get();
        return new ResponseEntity<>(response, response.getStatus());
    }

    @GetMapping("/filter")
    public ResponseEntity<BaseResponse<HttpStatus, List<M>>> getAllWithFilters(
           PaginationRequest paginationRequest) {
        BaseResponse<HttpStatus, List<M>> response = baseService.get(paginationRequest);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @PostMapping
    public ResponseEntity<BaseResponse<HttpStatus, M>> create(@RequestBody M entity) {
        BaseResponse<HttpStatus, M> response = baseService.create(entity);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @PutMapping("/{id}")
    public ResponseEntity<BaseResponse<HttpStatus, M>> update(@PathVariable T id, @RequestBody M entity) {
        BaseResponse<HttpStatus, M> response = baseService.update(id, entity);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BaseResponse<HttpStatus, M>> delete(@PathVariable T id) {
        BaseResponse<HttpStatus, M> response = baseService.delete(id);
        return new ResponseEntity<>(response, response.getStatus());
    }
}
