package org.jerfan.ecs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jerfan cang
 * @since 2021/5/19 22:58
 */
@RestController
public class StartController {


    @RequestMapping(value = "/start")
    public String start(){


        return "started";
    }
}
