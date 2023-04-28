package com.kyhslam.catalogservice.service;

import com.kyhslam.catalogservice.jpa.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
