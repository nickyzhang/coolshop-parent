package com.coolshop.base.generator;

import com.robert.vesta.service.intf.IdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class IdGenerator {
    @Autowired
    public IdService idService;

    public long generateId () {
        return this.idService.genId();
    }


}
