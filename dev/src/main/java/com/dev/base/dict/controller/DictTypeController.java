package com.dev.base.dict.controller;

import com.dev.base.dict.model.DictTypeVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

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

    /**
     * 跳转到字典类型列表页面
     * @return
     */
    @RequestMapping("showlist")
    public ModelAndView toListView(){
        ModelAndView view = new ModelAndView("dict/dict-type-list");
        List<DictTypeVo> list = new ArrayList<>();
        for (int i =1; i<4; i++){
            DictTypeVo dt = new DictTypeVo();
            dt.setId(i);
            dt.setName("name"+i);
            dt.setTypeCode("typecode"+i);
            dt.setSystemCode("systemcode"+i);
            dt.setCreateTime(new Date());
            list.add(dt);
        }
        view.addObject("dicttypelist",list);
        return view;
    }

    /**
     * 查询字典类型列表数据
     * @return
     */
    @ResponseBody
    @RequestMapping("querylist")
    public Map<String,Object> queryList(){
        Map<String,Object> map = new HashMap<>();
        List<DictTypeVo> list = new ArrayList<>();
        for (int i =11; i<16; i++){
            DictTypeVo dt = new DictTypeVo();
            dt.setId(i);
            dt.setName("name"+i);
            dt.setTypeCode("typecode"+i);
            dt.setSystemCode("systemcode"+i);
            dt.setCreateTime(new Date());
            list.add(dt);
        }
        map.put("status",200);
        map.put("msg","");
        map.put("total",20);
        map.put("rows",list);
        return map;
    }
}
