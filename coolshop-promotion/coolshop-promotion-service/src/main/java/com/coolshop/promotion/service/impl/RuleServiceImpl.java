package com.coolshop.promotion.service.impl;

import com.coolshop.base.service.impl.BaseServiceImpl;
import com.coolshop.promotion.model.Rule;
import com.coolshop.promotion.service.RuleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RuleServiceImpl extends BaseServiceImpl<Rule> implements RuleService {

}
