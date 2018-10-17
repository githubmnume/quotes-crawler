package com.company.project.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Vrlist;
import com.company.project.service.VrlistService;
import com.github.pagehelper.PageHelper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import tk.mybatis.mapper.entity.Condition;

@RestController
@RequestMapping("/vrlist")
@Api("VR api")
@CrossOrigin
public class VrlistController {
    @Resource
    private VrlistService vrlistService;

    @PostMapping
    @ApiOperation(value = "新增VR记录", notes = "新增VR记录")
    public Result add(@RequestBody Vrlist vrlist) {
        vrlistService.save(vrlist);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除VR", notes = "删除VR")
    public Result delete(@PathVariable Integer id) {
        vrlistService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    @ApiOperation(value = "修改VR详细信息", notes = "修改VR详细信息")
    public Result update(@RequestBody Vrlist vrlist) {
        vrlistService.update(vrlist);
        return ResultGenerator.genSuccessResult();
    }
    @GetMapping("/{id}")
    @ApiOperation(value = "根据ID获取VR详细信息", notes = "根据ID获取VR详细信息")
    public Result detail(@PathVariable Integer id) {
        Vrlist vrlist = vrlistService.findById(id);
        List<Vrlist> list=new ArrayList<Vrlist>();
        list.add(vrlist);
        return ResultGenerator.genSuccessResult(vrlist);   
    }
    @GetMapping("/user/{userID}")
    @ApiOperation(value = "根据ID获取VR详细信息", notes = "根据ID获取VR详细信息")
    public Result detailByName(@PathVariable String userID) {
/**
 * condition
 * Condition condition = new Condition(ACurrentTotal.class);
condition.createCriteria().andCondition("s_date = '" + TODAY() + "'");
condition.createCriteria().andCondition("floor = '" + floor + "' AND t_time>= ((select max(t_time) from c_point_info " +
"where t_time<=NOW() " +
"group by floor limit 1) - 60 * 10)");
Condition condition = new Condition(RRelativeCompare.class);
condition.setOrderByClause("s_date");
condition.createCriteria().andCondition("period = '" + period + "' and s_date = '" + date + "'");
condition.setOrderByClause("catagory");
 */
    	Condition condition = new Condition(Vrlist.class);
    	condition.createCriteria().andCondition("tester =", userID);
		List<Vrlist> vrlist = vrlistService.findByCondition(condition);
    	return ResultGenerator.genSuccessResult(vrlist);   
    }

    @GetMapping
    @ApiOperation(value = "根据ID获取VR详细信息", notes = "根据ID获取VR详细信息")
    public Result list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "5") Integer size) {
        PageHelper.startPage(page, size);
        List<Vrlist> list = vrlistService.findAll();
        return ResultGenerator.genSuccessResult(list);
    }
}
