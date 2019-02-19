package cn.blog.controller.article;

import cn.blog.entity.article.Article;
import cn.blog.service.blog.ArticleService;
import cn.blog.service.blog.impl.ArticleServiceImpl;
import cn.blog.utils.Http;
import cn.blog.utils.Request;
import cn.blog.utils.Response;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/2/15.
 */

@RestController
@RequestMapping("/blog/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = {"/queryAll"},method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    @CrossOrigin//跨域
    public Map<String,Object> queryAll(){

        Map<String,Object> result=new HashMap<>();
        try{
            List<Article> articleList=articleService.queryAllBlog();
            if(articleList!=null){
                result.put("code",200);
                result.put("msg","查询成功");
                result.put("data",articleList);
                return result;
            }else {
                result.put("code",201);
                result.put("msg","查询结果为空");
                result.put("data",null);
                return result;
            }
        }catch (Exception e){
            result.put("code",500);
            result.put("msg",e.getMessage());
            return result;
        }
    }

    /**
     * 根据时间先后查询某一篇博客
     * @return
     */
    @RequestMapping(value = {"/queryAllBlogOrderByTime"},method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> queryAllBlogOrderByTime(){
        Map<String,Object> result=new HashMap<>();
        try{
            List<Article> articleList=articleService.queryAllBlogOrderByTime();
            if(articleList!=null){
                result.put("code",200);
                result.put("msg","查询成功");
                result.put("data",articleList);
                return result;
            }else {
                result.put("code",201);
                result.put("msg","查询结果为空");
                result.put("data",null);
                return result;
            }
        }catch (Exception e){
            result.put("code",500);
            result.put("msg",e.getMessage());
            return result;
        }
    }

    /**
     * 获取某一篇博客
     * @param articleId
     * @return
     */
    @RequestMapping(value = {"/getOneByBlogId"},method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> getOneByBlogId(@RequestBody String articleId){
        Map<String,Object> result=new HashMap<>();
        try{
            Article article=articleService.getOneByBlogId(articleId);
            if(article!=null){
                result.put("code",200);
                result.put("msg","查询成功");
                result.put("data",article);
                return result;
            }else {
                result.put("code",201);
                result.put("msg","查询结果为空");
                result.put("data",null);
                return result;
            }
        }catch (Exception e){
            result.put("code",500);
            result.put("msg",e.getMessage());
            return result;
        }
    }

    /**
     * 删除某一篇博客
     * @param articleId
     * @return
     */
    @RequestMapping(value = {"/removeBlogByBlogId"},method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> removeBlogByBlogId(@RequestBody String articleId){
        Map<String,Object> result=new HashMap<>();
        try{
            int num=articleService.removeBlogByBlogId(articleId);
            if(num>0){
                result.put("code",200);
                result.put("msg","删除成功");

                return result;
            }else {
                result.put("code",201);
                result.put("msg","删除失败");
                return result;
            }
        }catch (Exception e){
            result.put("code",500);
            result.put("msg",e.getMessage());
            return result;
        }
    }

    /**
     * 访问量由高到低查询
     * @return
     */

    @RequestMapping(value = {"/queryAllBlogOrderByReadAccount"},method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    @CrossOrigin//跨域
    public Map<String,Object> queryAllBlogOrderByReadAccount(){

        Map<String,Object> result=new HashMap<>();
        try{
            List<Article> articleList=articleService.queryAllBlogOrderByReadAccount();
            if(articleList!=null){
                result.put("code",200);
                result.put("msg","查询成功");
                result.put("data",articleList);
                return result;
            }else {
                result.put("code",201);
                result.put("msg","查询结果为空");
                result.put("data",null);
                return result;
            }
        }catch (Exception e){
            result.put("code",500);
            result.put("msg",e.getMessage());
            return result;
        }
    }


    @RequestMapping(value = {"/queryAllBlogOrderByReadAccountTopTen"},method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    @CrossOrigin//跨域
    public Map<String,Object> queryAllBlogOrderByReadAccountTopTen(){

        Map<String,Object> result=new HashMap<>();
        try{
            List<Article> articleList=articleService.queryAllBlogOrderByReadAccountTopTen();
            if(articleList!=null){
                result.put("code",200);
                result.put("msg","查询成功");
                result.put("data",articleList);
                return result;
            }else {
                result.put("code",201);
                result.put("msg","查询结果为空");
                result.put("data",null);
                return result;
            }
        }catch (Exception e){
            result.put("code",500);
            result.put("msg",e.getMessage());
            return result;
        }
    }

    /**
     * 修改博客
     * @param article
     * @return
     */
    @RequestMapping(value = {"/modifyBlog"},method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> modifyBlog(@RequestBody Article article){
        Map<String,Object> result=new HashMap<>();
        try{
            int num =articleService.modifyBlog(article);
            if(num>0){
                result.put("code",200);
                result.put("msg","修改成功");
                return result;
            }else {
                result.put("code",201);
                result.put("msg","修改失败");

                return result;
            }
        }catch (Exception e){
            result.put("code",500);
            result.put("msg",e.getMessage());
            return result;
        }
    }


    /**
     * 修改博客
     * @param article
     * @return
     */
    @RequestMapping(value = {"/AddArticle"},method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    @CrossOrigin
    public Map<String,Object> AddArticle(@RequestBody Article article){
        Map<String,Object> result=new HashMap<>();
        try{
            int num =articleService.addArticle(article);
            if(num>0){
                result.put("code",200);
                result.put("msg","新增成功");
                return result;
            }else {
                result.put("code",201);
                result.put("msg","新增失败");

                return result;
            }
        }catch (Exception e){
            result.put("code",500);
            result.put("msg",e.getMessage());
            return result;
        }
    }

}
