<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%= request.getContextPath()%>/css/index3.css" type="text/css">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
$(function(){
	$("form").hide();
	
	$("input[value='下架']").click(function(){
		var yid=$(this).next().val();
		location="<%= request.getContextPath()%>/updxia.do?yid="+yid;
		
	})
	$("input[value='上架']").click(function(){
		var yid=$(this).prev().val();
		location="<%= request.getContextPath()%>/updshang.do?yid="+yid;
		
	})
	$("input[name='ii']").click(function(){
		
		$("input[name='id']").attr("checked",$(this).prop("checked"))
		
	})
	$("input[value='反选']").click(function(){
		$("input[name='id']").each(function(){
			$(this).attr("checked",!$(this).prop("checked"))
		})
		
	})
	
	
	$("input[value='批量删除']").click(function(){
		var yids=$("input[name='id']:checked").map(function(){
			return $(this).val();
		}).get().join(",");
		$.post("<%= request.getContextPath()%>/delete.do",{yids:yids},function(a){
			if(a){
				alert("批量删除成功")
				location="<%= request.getContextPath()%>/list.do"
			}else{
				alert("批量删除失败")
			}
		},"json")
		
	})
	
	
	
	$("input[value='查询影片']").click(function(){
		$("form").show();
		
	})
	
	
})



function fenye(page){
	$("input[name='page']").val(page)
	$("form").submit();
}

</script>
</head>
<body>




<input type="button" value="批量删除"/><input type="button" value="查询影片"/>
  <table>
     <tr>
       <td>
         <input type="checkbox" name="ii"/>全选 <input type="button" value="反选"/>
       </td>
       <td>影片名</td>
       <td>导演</td>
       <td>票价</td>
       <td>上映时间</td>
       <td>时长</td>
       <td>类型</td>
       <td>年代</td>
       <td>区域</td>
       <td>状态</td>
       <td>操作</td>
     </tr>
     <c:forEach items="${list }" var="s">
       <tr>
         <td>
           <input type="checkbox" name="id" value="${s.yid }"/>
         </td>
         <td>${s.yname }</td>
         <td>${s.daoy }</td>
         <td>${s.price}</td>
         <td>${s.date }</td>
         <td>${s.time }</td>
         <td>${s.type}</td>
         <td>${s.nd }</td>
         <td>${s.qy }</td>
         <td>
           <c:if test="${s.zt==0 }">
                                                正在热映         
           </c:if>
           <c:if test="${s.zt==1 }">
                                                已下架       
           </c:if>
         </td>
         <td>
           <input type="button" value="详情"/>
           <input type="button" value="编辑"/>
           <c:if test="${s.zt==0 }">
              <input type="button" value="下架"/>
           </c:if>
           <input type="hidden" value="${s.yid }"/>
           <c:if test="${s.zt==1 }">
              <input type="button" value="上架"/>
           </c:if>
         </td>
       </tr>
     
     
     
     </c:forEach>
     
     
     
     <tr>
       <td colspan="20">
      当前${pi.getPageNum()}页  共${pi.getPages()} 页

       
          <input type="button" value="首页" onclick="fenye(1)"/>
          <input type="button" value="上一页" onclick="fenye(${pi.isIsFirstPage()?1:pi.getPrePage()})"/>
          <input type="button" value="下一页" onclick="fenye(${pi.isIsLastPage()?pi.getPages():pi.getNextPage()})"/>
          <input type="button" value="尾页" onclick="fenye(${pi.getPages()})"/>
       
       </td>
     
     </tr>


  </table>

<form action="<%= request.getContextPath()%>/list.do" method="post">
 影片名称:<input type="text" name="yname" value="${map.yname}"/>
 上映时间:<input type="text" name="datest" value="${map.datest}"/>--
<input type="text" name="dateend" value="${map.dateend}"/><br>

电影年代:<input type="text" name="nd" value="${map.nd}"/>

价格:<input type="text" name="pricest" value="${map.pricest}"/>--
<input type="text" name="priceend" value="${map.priceend}"/><br>
 导演:<input type="text" name="daoy" value="${map.daoy}"/>
电影时长:<input type="text" name="timest" value="${map.timest}"/>--
<input type="text" name="timeend" value="${map.timeend}"/>
<input type="hidden" name="page" /><br>
<input type="submit" value="搜索"/>
<input type="reset" value="重置"/>

</form>



</body>
</html>