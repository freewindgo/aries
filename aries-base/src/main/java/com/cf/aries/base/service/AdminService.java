package com.cf.aries.base.service;


import com.cf.aries.common.po.AdminBank;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * AdminService
 *
 * @author 于文硕
 * @since 2018/5/11 13:49
 */

public interface AdminService {

    List<AdminBank> getAllBank();


}
