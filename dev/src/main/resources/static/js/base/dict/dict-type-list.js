$(function (){
    var contextPath = $("#context-path").val();
    layui.use('table', function(){
        var table = layui.table;
        var setting =
            {
            url:contextPath+"/dicttype/querylist",
            limit:5,
            method:"get",
            page:true,
            limits:[5,10,20,30],
            loading:true,
            id:"dict-type-tab",
            response:
                {//数据状态的字段名称，默认：code
                    statusName:'status',
                    statusCode:200 //成功的状态码，默认：0
                    ,msgName:'msg' //状态信息的字段名称，默认：msg
                    ,countName:'total' //数据总数的字段名称，默认：count
                    ,dataName:'rows' //数据列表的字段名称，默认：data
                }
            };
        //转化静态表格
        table.init('dict-type-filter', setting);
    });

})