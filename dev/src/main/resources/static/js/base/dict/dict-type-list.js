$(function (){
    var contextPath = $("#context-path").val();
    var queryUrl = $("#dict-type-form").attr("action");
    //引入必要的模块
    layui.use(['table','form'], function(){
        var dictTypeTable = layui.table;
        var dictTypeQueryForm = layui.form;
        var setting =
            {
            url:'/dicttype/querylist',
            cols:  [[ //标题栏
                {field:'id',type:'checkbox',fixed: 'left'},
                {field:'name',title:'类型名称'},
                {field:'typeCode',title:'类型编码'},
                {field:'systemCode',title:'所属系统'},
                {field:'createTime',title:'创建时间'},
                {fixed:'right',align:'center', toolbar:'#dict-type-tool',title:"操作"}
            ]],
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
        dictTypeTable.render('dict-type-table-filter', setting);
    });

})