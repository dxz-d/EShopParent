package file.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;

/**
 * Description: TODO
 * CreateTime: 2022/4/15 19:23
 *
 * @author: dxz
 */
@Controller
public class FileController {
    @Value("${user.file.path}")
    private String filePath;
    @Value("${user.file.name}")
    private String fileName;
    @Resource
    private ResourceLoader resourceLoader;

    /**
     * 项目加载完成时读取文件
     *
     * @return ModelAndView
     */
    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.getModel().put("filePath", "/springboot.jpg");
        return modelAndView;
    }

    /**
     * 上传文件控制器
     *
     * @param multipartFile 文件上传类
     * @return ModelAndView
     */
    @RequestMapping("/upload")
    public ModelAndView update(@RequestParam("pic") MultipartFile multipartFile) {

        try {
            // 保存图片
            File file = new File(filePath + multipartFile.getOriginalFilename());
            multipartFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.getModel().put("filePath", "/" + fileName);

        return modelAndView;
    }


    /**
     * 通过控制器方式给图片动态加载，/{filename:.+}是配置图片格式，这里简单
     * 这里采用这种方式，而采用配置的形式会更方便些，二者选其一即可，也可以同时用
     * 但是这个不做介绍，用需要打开注释使用
     *
     * @param filename 文件名
     * @return org.springframework.http.ResponseEntity<?>
     */
    /*@RequestMapping(value = "/{filename:.+}")
    @ResponseBody
    public ResponseEntity<?> getFile(@PathVariable String filename) {
        try {
            return ResponseEntity.ok(resourceLoader.getResource("file:" + Paths.get(filePath + filename)));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }*/
}
