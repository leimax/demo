package com.freemark;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class CreateHtmlWebSite {
	public static final  String FTLS_PATH ="classpath:com/META-INF/template";
	
	public static final  String FTLS_PATH1 ="D:/studytools/studyworkspace/demo/src/main/resources/com/META-INF/template";
	
	public static final  String FTLS_PATH2 ="src/main/resources/com/META-INF/template";
	
	//相对路径有问题（待研究）
	public static final  String FTLS_PATH3 ="/main/resources/com/META-INF/template";
	
	public static final  String WEB_SITE_FTL ="MyWebSite.ftl";
	public static final  String CONST_HTML="/MyWebSite.html";
    //设置加载模板
	private static Template extracted(Configuration cfg) throws IOException {
		System.out.println("进入方法。。。。。。");
		 //当前类的绝对路径 
        System.out.println(CreateHtmlWebSite.class.getResource("/").getFile()); 
		cfg.setDirectoryForTemplateLoading(new File(FTLS_PATH2));  //设置读取模板文件的目录
	       Template t = cfg.getTemplate(WEB_SITE_FTL);  //读取文件名为Test.ftl的模板
		return t;
	}
	public static void main(String[] args) throws TemplateException, IOException {
		
		   Configuration cfg = new Configuration();
	       Template t = extracted(cfg);
	      
	       Map root = extracted();  
	       extracted(t, root);
	}
	//设置生成路径
	private static void extracted(Template t, Map root)
			throws UnsupportedEncodingException, FileNotFoundException,
			TemplateException, IOException {
		String beanPath = System.getProperty("user.dir")+CONST_HTML;
	       System.out.println(beanPath);
	       Writer out = new OutputStreamWriter(new FileOutputStream(
	    		  beanPath), "utf-8");  //输出流
	      
	      t.process(root, out); //动态加载root中的数据到Test.html。数据在模板中定义好了。
	      
	      System.out.println("Create successfully!");
	}
	//进行初始化数据
	private static Map extracted() {
		   Map<String, List<ShowWebSiteView>> root = new HashMap();  //存储数据
	       ShowWebSiteView view1[] = new ShowWebSiteView[]
	      {
	    	new ShowWebSiteView(
	    			"http://herryhaixiao.iteye.com/",
	    			"zesededyousxxxxx",
	    			"ssniha****1",
	    			"33333087@qq.com",
	    			"2016.08.24 注册",
	    			"",
	    			"",
	    			"ITEye"),
	    			new ShowWebSiteView(
	    	    			"http://herryhaixiao.iteye.com/",
	    	    			"zesede",
	    	    			"555012****1",
	    	    			"4449144087@qq.com",
	    	    			"2016.08.24 注册",
	    	    			"",
	    	    			"",
	    	    			"ITEye")};
	    			
	       List<ShowWebSiteView> list = new ArrayList<ShowWebSiteView>(); 
	       for (ShowWebSiteView showWebSiteView : view1)
	       {
	    	   list.add(showWebSiteView);
		   }
	      
	       root.put("weblist", list);
		   return root;
	}
	


}
