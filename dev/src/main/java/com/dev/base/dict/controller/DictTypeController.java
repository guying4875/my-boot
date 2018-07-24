package com.dev.base.dict.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @description 数据字典类型管理类
 * @author zhhy
 * @date ${YEAR}-${MONTH}-${DATE} ${TIME}
 *
 */
@Controller
@RequestMapping("dicttype")
public class DictTypeController {

    @RequestMapping("list")
    public ModelAndView queryList(){
        ModelAndView view = new ModelAndView("dict/dict-type-list");

        return view;
    }
}
