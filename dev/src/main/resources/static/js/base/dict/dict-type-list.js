$(function (){
    var contextPath = $("#context-path").val();
    var queryUrl = $("#dict-type-form").attr("action");
    //引入必要的模块
    layui.use(['table','form','element','util'], function(){
        var dictTypeTable = layui.table;
        var form = layui.form;
        var util = layui.util;
        var tabElement = layui.element;


        //数据表格
        var setting =
            {
                elem:"#dict-type-table",
            url:contextPath+'/dicttype/querylist',
            cols:  [[ //标题栏
                {field:'id',type:'checkbox',fixed: 'left'},
                {field:'name',title:'类型名称'},
                {field:'typeCode',title:'类型编码'},
                {field:'systemCode',title:'所属系统'},
                {field:'createTime',title:'创建时间',templet:function (row){
                    var date = new Date(row.createTimeLong);
                    return util.toDateString(date,'yyyy/MM/dd HH:mm:ss')}},
                {fixed:'right',align:'center', toolbar:'#dict-type-tool',title:"操作"}
            ]],
            limit:5,
            method:"get",
            page:true,
            limits:[5,10,20,30],
            loading:true,
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
        dictTypeTable.render(setting);

        //监听工具条事件
        dictTypeTable.on('tool(dict-type-table-filter)',function (obj){
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            var tr = obj.tr; //获得当前行 tr 的DOM对象
            if (layEvent =='edit'){
                //编辑

            }else{
                //删除
            }
        })


        //查询表单
        form.on("submit(dict-type-but-search)",function (data){
            // layer.msg(JSON.stringify(data.field));
            var searchField = data.field;
            dictTypeTable.reload('dict-type-table', {page:{
                curr: 1 //重新从第 1 页开始
            },where: searchField});
            // return false;
        });


        //选项卡切换
        tabElement.on('tab(dict-type-tab)',function (data){
            $(".layui-tab-title li").removeClass("layui-bg-green");
            $(this).addClass("layui-bg-green");
            // lay.msg(data.elem)
        })

    });

})