
var dataIds=[]
// 列出所有用户
function selectUsers() {
    $.ajax({
        type: 'GET',
        url: '../../api/listUsers',
        success: function (data) {
            // console.log(data[0]);//请求成功以后返回数据打印出来
            html = []
            for (var i = 0; i < data.length; i++) {
                html.push('<tr>'+ '<td>'
                    + '<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id="'+data[i].userId+'">\n' +
                    '     <i class="layui-icon">&#xe605;</i>\n' +
                    '  </div>'+ '<td>'
                    + data[i].userId + '</td>' + '<td>'
                    + data[i].useraccount + '</td>' + '<td>'
                    + data[i].username + '</td>' + '<td>'
                    + data[i].password + '</td>' + '<td>'
                    + data[i].sex + '</td>' + '<td>'
                    + data[i].age + '</td>' + '<td class="td-manage">'
                    + '<a title="编辑" onclick="WeAdminEdit(\'编辑\',\'./edit.html\', 1, 600, 400)" href="javascript:;">\n' +
                    '   <i class="layui-icon layui-icon-edit"></i>\n' +
                    '  </a>\n' +
                    '  <a onclick="WeAdminShow(\'修改密码\',\'./password.html\',600,400)" title="修改密码" href="javascript:;">\n' +
                    '    <i class="layui-icon layui-icon-util"></i>\n' +
                    ' </a>\n' +
                    ' <a title="删除" onclick="member_del(this,\'要删除的id\')" href="javascript:;">\n' +
                    '    <i class="layui-icon layui-icon-delete"></i>\n' +
                    ' </a>' + '</td>'
                    + '</tr>');

                dataIds.push('deleteUser'+data[i].userId);

            }
            console.log(html.join(""));
            $("#userTBody").append(""+html.join(""));
            addDeleteListener(dataIds);
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            console.log(textStatus.toString());
        }
    });
};

// 添加删除按钮监听,需要添加alert提醒 ，再三确认之后才能删除
function addDeleteListener(Ids){
    console.log(Ids.length);
    for(var i=0;i<Ids.length;i++){
        $('#'+Ids[i]).click(function () {
            console.log("delete:"+$(this).attr('id'));
        });
    }
}

// 添加修改按钮监听,不需要需要添加alert提醒
function addDeleteListener(Ids){
    console.log(Ids.length);
    for(var i=0;i<Ids.length;i++){
        $('#'+Ids[i]).click(function () {
            // 点击修改按钮，让一部分数据可以编辑，然后根据表格中的数据进行发送ajax提交，成功返回alert,并刷新界面
            console.log("change:"+$(this).attr('id'));
        });
    }
}


// 列出所有驴舍
function selectHomes() {
    // var datas = '';
    $.ajax({
        type: 'GET',
        // contentType: 'application/json',
        url: 'http://localhost:8080/MavenSSM01/api/listHomes',
        success: function (data) {
            html = []
            for (var i = 0; i < data.length; i++) {
                html.push('<tr>' + '<td>'
                    + data[i].homeId + '</td>' + '<td>'
                    + data[i].userId + '</td>' + '<td>'
                    + data[i].temperature + '</td>' + '<td>'
                    + data[i].humidity + '</td>' + '<td>'
                    + data[i].illumination + '</td>' + '<td>'
                    + data[i].dest1 + '</td>' + '<td>'
                    + data[i].dest2 + '</td>' + '<td>'
                    + data[i].pId + '</td>' + '<td>'
                    + data[i].time + '</td>' + '<td>'
                    + '<button class="btn btn-primary" id="changeHome'+data[i].homeId+'">修改</button>&nbsp'
                    + '<button class="btn btn-success" id="deleteHome'+data[i].homeId+'">删除</button>' + '</td>'
                    + '</tr>');
            }
            $("#dataTableHomes").append('<tbody align="center">' + html.join("") + '</tbody>');

            console.log(html);
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            console.log(textStatus.toString());
        }
    });
};

// 列出所有驴信息
function selectDonkeys() {
    // var datas = '';
    $.ajax({
        type: 'GET',
        // contentType: 'application/json',
        url: 'http://localhost:8080/MavenSSM01/api/listDonkeys',
        success: function (data) {
            html = []
            for (var i = 0; i < data.length; i++) {
                html.push('<tr>' + '<td>'
                    + data[i].donkeyId + '</td>' + '<td>'
                    + data[i].homeId + '</td>' + '<td>'
                    + data[i].gender + '</td>' + '<td>'
                    + data[i].size + '</td>' + '<td>'
                    + '<button class="btn btn-primary" id="changeDonkey'+data[i].homeId+'">修改</button>&nbsp'
                    + '<button class="btn btn-success" id="deleteDonkey'+data[i].homeId+'">删除</button>' + '</td>'
                    + '</tr>');
            }
            $("#dataTableDonkeys").append('<tbody align="center">' + html.join("") + '</tbody>');

            console.log(html);
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            console.log(textStatus.toString());
        }
    });
};

// 刷新时间
function refreshTime(){
    // console.log("我刷新了一次时间");
    var date = new Date();
    var year = date.getFullYear();
    var month = date.getMonth() + 1;
    var day = date.getDate();
    var hours = date.getHours();
    var minutes = date.getMinutes();
    var seconds = date.getSeconds();
    // var vWeek_s = date.getDay();
    document.getElementById("TableTime").innerHTML = year + "年" + month + "月" + day + "日" + "\t" + hours + ":" + minutes +":" + seconds + "\t" ;

}