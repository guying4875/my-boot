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
            id:"dict-type-table-id",
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

        //监听table工具条事件
        dictTypeTable.on('tool(dict-type-table-filter)',function (obj){
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            var tr = obj.tr; //获得当前行 tr 的DOM对象
            //编辑
            var id = data.id;
            if (layEvent =='edit'){
                $.getJSON(contextPath+"/dicttype/query/"+id, function(json){
                    //点击添加，切换选项卡
                    tabElement.tabChange("dict-type-tab","tab-edit");
                    //表单元素赋值
                    form.val("dict-type-edit-filter",json);
                });
            }else{
                //删除
                layer.confirm("您确定删除此行记录",function (index){
                    $.post(contextPath+"dicttype/remove",{"id":id},function (result){
                        if (result.status == "succ"){  //删除成功从新加载列表内容
                            layer.close(index);
                            // dictTypeTable.reload('dict-type-table-id', {page:{
                            //     curr: 1 //重新从第 1 页开始
                            // },where: searchField});
                            $("#dict-type-search-id").click();
                        }
                    },"json");

                })
            }
        })


        //查询数据查询表单
        form.on("submit(dict-type-but-search)",function (data){
            // layer.msg(JSON.stringify(data.field));
            var searchField = data.field;
            dictTypeTable.reload('dict-type-table-id', {page:{
                curr: 1 //重新从第 1 页开始
            },where: searchField});
            // return false;
        });


        //选项卡切换
        tabElement.on('tab(dict-type-tab)',function (data){
            var checkTab = this;
            //当点击的为列表、添加标签页时，直接切换
            // if (data.index != 2){
                $(".layui-tab-title li").addClass("layui-bg-green");
                $(checkTab).removeClass("layui-bg-green");
                // lay.msg(data.elem)
                return;
            // }

        });



        //监听添加，批量删除功能
        var active = {
            add:function () {
                //点击添加，切换选项卡
                tabElement.tabChange("dict-type-tab","tab-add");
            },batchdel:function () {
                //批量删除
                var selectRows = dictTypeTable.checkStatus("dict-type-table-id");
                alert(selectRows.data.length);
            }
        }
        //为按钮绑定事件
        $('.layui-btn.layuiadmin-btn-admin').on('click', function(){
            var type = $(this).data('type');
            active[type]?active[type].call(this):'';
        });


        //字典类型添加表单提交
        form.on("submit(dict-type-add-but)",function (data){
            console.log(data.elem) //被执行事件的元素DOM对象，一般为button对象
            console.log(data.form) //被执行提交的form对象，一般在存在form标签时才会返回
            console.log(data.field) //当前容器的全部表单字段，名值对形式：{name: value}
            return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
        })

    });

})