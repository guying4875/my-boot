$(function (){

    layui.use('table', function() {
        var table = layui.table;
        //利用layui将静态表格转换为layui表格
        table.init('dict-type-list',{
            url: "/dev/dicttype/querylist",
            method: 'get',
            page:true,
            limit:5,
            loading:true,
            limits:[10,20,30],
            request:{pageName: 'curr' //页码的参数名称，默认：page
                ,limitName: 'nums' //每页数据量的参数名，默认：limit
                 },
            response: {
                statusName: 'status' //数据状态的字段名称，默认：code
                ,statusCode: 200 //成功的状态码，默认：0
                ,msgName: 'msg' //状态信息的字段名称，默认：msg
                ,countName: 'total' //数据总数的字段名称，默认：count
                ,dataName: 'rows' //数据列表的字段名称，默认：data
            },
            even:true,       //开启隔行背景
        })

        //设置绑定工具条事件
        table.on("tool(dict-type-list)",function (obj){
            // console.log(obj.value); //得到修改后的值
            var curEvent = obj.event; //当前编辑事件
            console.log(curEvent)
            var tr = obj.tr;
            if (curEvent =='edit'){
                console.log($(tr).find("td:eq(5)").find("a:eq(1)").html())
                $(tr).find("td:eq(5) div a").addClass("layui-hide")
                $(tr).find("td:eq(1)").append("<input>")
            }

        })

    });
})