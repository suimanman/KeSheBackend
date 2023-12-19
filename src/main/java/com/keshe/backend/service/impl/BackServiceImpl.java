package com.keshe.backend.service.impl;

import com.keshe.backend.dto.BackNumDto;
import com.keshe.backend.mapper.BackMapper;
import com.keshe.backend.service.BackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BackServiceImpl implements BackService {

    @Autowired
    BackMapper backMapper;

    @Override
    public List<BackNumDto> queryOrderNum() {
        return backMapper.queryOrderNum();
    }
}
