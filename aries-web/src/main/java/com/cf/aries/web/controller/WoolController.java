package com.cf.aries.web.controller;

import com.cf.aries.common.po.WoolInfo;
import com.cf.aries.common.util.Response;
import com.cf.aries.web.consumer.WoolClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * WoolController
 *
 * @author 于文硕
 * @since 2018/5/18 9:41
 */

@Slf4j
@RestController
@RequestMapping("/wool")
public class WoolController {

    @Autowired
    private WoolClient woolClient;


    /**
     * 按id获取
     *
     * @param id
     * @return
     */
    @GetMapping("/getWoolInfoById")
    public Response<WoolInfo> getWoolInfoById(@RequestParam("id") Long id) {
        try {
            return woolClient.getWoolInfoById(id);
        } catch (Exception e) {
            log.error("WoolController.getWoolInfoById error, param is {}, error is {}", id.toString(), e);
            return Response.error();
        }
    }

    /**
     * 按条件获取
     *
     * @param woolInfo
     * @return
     */
    @PostMapping("/getWoolInfos")
    public Response<List<WoolInfo>> getWoolInfos(@RequestBody WoolInfo woolInfo) {
        try {
            return woolClient.getWoolInfos(woolInfo);
        } catch (Exception e) {
            log.error("WoolController.getWoolInfos error, param is {}, error is {}", woolInfo.toString(), e);
            return Response.error();
        }
    }


    /**
     * 存储
     *
     * @param woolInfo
     * @return
     */
    @PostMapping("/saveWoolInfo")
    public Response saveWoolInfo(@RequestBody WoolInfo woolInfo) {
        try {
            return woolClient.saveWoolInfo(woolInfo);
        } catch (Exception e) {
            log.error("WoolController.saveWoolInfo error, param is {}, error is {}", woolInfo.toString(), e);
            return Response.error();
        }
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @GetMapping("/deleteWoolInfo")
    public Response deleteWoolInfo(@RequestParam("id") Long id) {
        try {
            return woolClient.deleteWoolInfo(id);
        } catch (Exception e) {
            log.error("WoolController.deleteWoolInfo error, param is {}, error is {}", id.toString(), e);
            return Response.error();
        }
    }

}
