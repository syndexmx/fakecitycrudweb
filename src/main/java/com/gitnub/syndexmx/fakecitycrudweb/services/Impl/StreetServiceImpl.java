package com.gitnub.syndexmx.fakecitycrudweb.services.Impl;

import com.gitnub.syndexmx.fakecitycrudweb.domain.Street;
import com.gitnub.syndexmx.fakecitycrudweb.domain.StreetEntity;
import com.gitnub.syndexmx.fakecitycrudweb.repositories.StreetRepository;
import com.gitnub.syndexmx.fakecitycrudweb.services.StreetService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreetServiceImpl implements StreetService {

    private final StreetRepository streetRepository;

    public StreetServiceImpl(final StreetRepository streetRepository) {
        this.streetRepository = streetRepository;
    }

    @Override
    public Street saveStreet(Street street) {
        final StreetEntity streetEntity = streetToStreetEntity(street);
        final StreetEntity savedStreetEntity = streetRepository.save(streetEntity);
        return streetEntityToStreet(savedStreetEntity);
    }

    @Override
    public List<Street> listStreets() {
        final List<StreetEntity> foundStreets = streetRepository.findAll();
        return foundStreets.stream().map(streetEntity -> streetEntityToStreet(streetEntity))
                .toList();
    }

    private StreetEntity streetToStreetEntity(Street street) {
        return StreetEntity.builder().name(street.getName()).build();
    }

    private Street streetEntityToStreet(StreetEntity streetEntity) {
        return Street.builder().name(streetEntity.getName()).build();
    }

}
