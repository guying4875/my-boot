$(function (){
    layui.use('layer', function(){
        var layer = layui.layer;
        //layer.msg('hello');
    });

    //点击添加
    $("#but-add").on("click",function (){
        layer.open({
            type: 1,
            //fix: false, //不固定
            //maxmin: true,
            area:['510px','450px'],
            shadeClose: false,
            zIndex:198910200,
            anim:1,
            shade:0.5,
            title: '添加',
            content:$("#dict-type-add").html()
        });
    })
})