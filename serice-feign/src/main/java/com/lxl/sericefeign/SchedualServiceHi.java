package com.lxl.sericefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/**指定 service-hi 的 /hi 接口*/
@FeignClient(value = "eurekacientlearn")//指定服务
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayhiFromClientOne(@RequestParam(value = "name") String name);
}
