 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
   <html>
    <head>
    <title>我</title>
     <meta http-equiv="Content-Type" content="text/html; charset=utf-8">  
     <meta name="viewport" content="width=device-width" />
     <link href="../bootstrap3.35/bootstrap.css" rel="stylesheet" type="text/css" />
     <script  src="../bootstrap3.35_js/jquery-1.10.2.js" type="text/javascript"></script>
     <script  src="../bootstrap3.35_js/bootstrap.js" type="text/javascript"> </script>
  
     </head> 
      
    <body>  
      <h4 align="center">鎴戠殑甯哥敤缃戝潃</h4>
      <div class="table-responsive" style=" padding-top: 20px; padding-left: 20px; padding-right: 20px;">
        <table  class="table table-bordered table-hover">  
               <tr>
               <th>缃戝潃</th>
               <th>缃戝潃鍚嶇О</th>
               <th>璐︽埛鍚�/th>
               <th>瀵嗙爜</th>
               <th>娉ㄥ唽閭</th>
               <th>澶囨敞涓�/th>
               <th>澶囨敞浜�/th>
               <th>澶囨敞涓�/th>
               </tr>
               <#list weblist as row>  
                <tr>  
                    <td>  
                        <#if row.webSite?exists>  
                            <a href="${row.webSite}">${row.webSite}</a>
                        </#if>
                    </td>  
                    <td>  
                        <#if row.webName?exists>  
                           ${row.webName}
                        </#if>
                    </td> 
                    <td>  
                        <#if row.userName?exists>  
                            ${row.userName}
                        </#if>
                    </td>  
                    <td>  
                        <#if row.password?exists>  
                            ${row.password}
                        </#if>
                    </td>  
                    <td>  
                        <#if row.email?exists>  
                           ${row.email}
                        </#if>
                    </td>  
                    <td>  
                        <#if row.remark1?exists>  
                            ${row.remark1}
                        </#if>
                    </td>  
                    <td>  
                        <#if row.remark2?exists>  
                            ${row.remark2}
                        </#if>
                    </td>  
                    <td>  
                        <#if row.remark3?exists>  
                            ${row.remark3}
                        </#if>
                    </td>  
                </tr>  
            </#list>  
               
        </table>    
        </div>  
    </body>  
</html>  