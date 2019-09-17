/*
 * @Author: https://github.com/WangEn
 * @Author: https://gitee.com/lovetime/
 * @Date:   2018-03-27
 * @lastModify 2018-3-28
 * +----------------------------------------------------------------------
 * | WeAdmin 表格table中多个删除等操作公用js
 * | 有改用时直接复制到对应页面也不影响使用
 * +----------------------------------------------------------------------
 */
layui.extend({
	admin: '{/}../../static/js/admin'
});


layui.use([ 'jquery', 'admin','layer','table'], function() {
	// var laydate = layui.laydate,
	$ = layui.jquery,
	admin = layui.admin;
    layer = layui.layer;
    table = layui.table;
	//执行一个laydate实例
	// laydate.render({
	// 	elem: '#start' //指定元素
	// });
	// //执行一个laydate实例
	// laydate.render({
	// 	elem: '#end' //指定元素
	// });

    /**
	 * 添加信息
     * @param title
     * @param url
     * @param w
     * @param h
     * @constructor
     */
    window.WeAdminShow = function(title, url, w, h) {
        if(title == null || title == '') {
            title = false;
        };
        if(url == null || url == '') {
            url = "404.html";
        };
        if(w == null || w == '') {
            w = ($(window).width() * 0.9);
        };
        if(h == null || h == '') {
            h = ($(window).height() - 50);
        };
        layer.open({
            type: 2,
            area: [w + 'px', h + 'px'],
            fix: false, //不固定
            maxmin: true,
            shadeClose: true,
            shade: 0.4,
            title: title,
            content: url
        });
    }
    /*弹出层+传递ID参数*/
    // 编辑信息
    window.WeAdminEdit = function(title, url, id, w, h) {
        if(title == null || title == '') {
            title = false;
        };
        if(url == null || url == '') {
            url = "404.html";
        };
        if(w == null || w == '') {
            w = ($(window).width() * 0.9);
        };
        if(h == null || h == '') {
            h = ($(window).height() - 50);
        };
        layer.open({
            type: 2,
            area: [w + 'px', h + 'px'],
            fix: false, //不固定
            maxmin: true,
            shadeClose: true,
            shade: 0.4,
            title: title,
            content: url,
            success: function(layero, index) {
                //向iframe页的id=house的元素传值  // 参考 https://yq.aliyun.com/ziliao/133150
                var body = layer.getChildFrame('body', index);
                body.contents().find("#dataId").val(id);
                console.log(id);
            },
            error: function(layero, index) {
                alert("aaa");
            }
        });
    }

	/*用户-停用*/
	window.member_stop = function (obj, id) {
		layer.confirm('确认要停用吗？', function(index) {
			if($(obj).attr('title') == '启用') {

				//发异步把用户状态进行更改
				$(obj).attr('title', '停用')
				$(obj).find('i').html('&#xe62f;');

				$(obj).parents("tr").find(".td-status").find('span').addClass('layui-btn-disabled').html('已停用');
				layer.msg('已停用!', {
					icon: 5,
					time: 1000
				});

			} else {
				$(obj).attr('title', '启用')
				$(obj).find('i').html('&#xe601;');

				$(obj).parents("tr").find(".td-status").find('span').removeClass('layui-btn-disabled').html('已启用');
				layer.msg('已启用!', {
					icon: 5,
					time: 1000
				});
			}
		});
	}

	/*用户-删除-小窗口*/
	window.memberDel = function (obj, id) {
		layer.confirm('确认要删除吗？', function(index) {
			//发异步删除数据
			//ajax请求删除数据

			$(obj).parents("tr").remove();
			layer.msg('已删除!', {
				icon: 1,
				time: 1000
			});
		});
	}

	// 批量删除-小窗口
	// window.deleteAll = function (argument) {
	// 	var data = tableCheck.getData();
	// 	// var ids=tableCheck;
	// 	layer.confirm('确认要删除吗？' +data, function(index) {
	// 		//捉到所有被选中的，发异步进行删除
	// 		//不断删除：
	//
	// 		layer.msg('删除成功', {
	// 			icon: 1
	// 		});
	// 		$(".layui-form-checked").not('.header').parents('tr').remove();
	// 	});
// }
	
});