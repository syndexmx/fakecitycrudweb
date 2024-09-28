package com.gitnub.syndexmx.fakecitycrudweb.services;

import com.gitnub.syndexmx.fakecitycrudweb.domain.Street;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StreetService {

    public Street saveStreet(Street street);

    public List<Street> listStreets();
}
