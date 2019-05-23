package tech.poorguy.go.common;

import com.baomidou.mybatisplus.extension.service.IService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;
import tech.poorguy.go.pig.reflection.Reflection;

import java.util.List;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/5/23 15:47
 * @description
 */
public class BaseController<E extends BaseEntity,S extends IService<E>> {
    /**
     * 我没有用构造器注入，用构造器注入service的话，反射方法不可以，取不到具体的service类。
     */
    private S service;
    @Autowired
    ApplicationContext applicationContext;

    private S getService(){
        if (service == null) {
            Class serviceClass = Reflection.getSuperClassGenericParamList(this)[1];
            return (S) applicationContext.getBean(serviceClass);
        } else {
            return service;
        }
    }
    @ApiOperation("添加一个entity")
    @PostMapping("/add")
    public void save(@RequestBody E entity){
        getService().save(entity);
    }
    @PostMapping("/addList")
    public void saveList(@RequestBody List<E> entityList) {
        getService().saveBatch(entityList);
    }

    @DeleteMapping("/deleteById")
    public void deleteById(@RequestParam @ApiParam(value = "根据id删除",required = true) String id) {
        getService().removeById(id);
    }
    @DeleteMapping("/deleteByIdList")
    public void deleteByIdList(@RequestParam List<String> idList){
        getService().removeByIds(idList);
    }

    @PutMapping("/update")
    public void update(@RequestBody E entity) {
        getService().updateById(entity);
    }

    @GetMapping("/getById")
    @ApiOperation("get a specific entity by id")
    public E getById(@RequestParam @ApiParam(value = "根据id查询", required = true) String id) {
        return getService().getById(id);
    }
    @GetMapping("/list")
    @ApiOperation("list all the entitys")
    public List<E> getList(){
        return getService().list();
    }
}
