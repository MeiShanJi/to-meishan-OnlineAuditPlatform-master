<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户注册页面</title>
    <%@include file="/pages/common/head.jsp"%>
    <link type="text/css" rel="stylesheet" href="static/css/style.css" >
    <script type="text/javascript">
        $(function () {
            $("#username").blur(function () {

                var username=this.value;
                $.getJSON("http://localhost:8080/FileManagement/userServlet","action=existsUsername&username="+username,function (data) {

                    if (data.existsUsername=="t") {
                        $("span.errorMsg").text("用户名存在！");
                    } else {
                        $("span.errorMsg").text("用户名可用！");
                    }
                });

            });
            //验证码更新
            $("#code_img").click(function () {
                <%--因缓存而验证码不更新可加时间戳--%>
                <%--this.src="${basePath}/Kaptcha.jpg?d="+new Date();--%>
                this.src="${basePath}/Kaptcha.jpg";
            });
            // 给注册绑定单击事件
            $("#sub_btn").click(function () {
                // 验证用户名：必须由字母，数字下划线组成，并且长度为1到12位
                //1 获取用户名输入框里的内容
                var usernameText = $("#username").val();
                //2 创建正则表达式对象
                var usernamePatt = /^\w{1,12}$/;
                //3 使用test方法验证
                if (!usernamePatt.test(usernameText)) {
                    //4 提示用户结果
                    $("span.errorMsg").text("用户名不合法！");

                    return false;
                }

                // 验证密码：必须由字母，数字下划线组成，并且长度为1到12位
                //1 获取用户名输入框里的内容
                var passwordText = $("#password").val();
                //2 创建正则表达式对象
                var passwordPatt = /^\w{1,12}$/;
                //3 使用test方法验证
                if (!passwordPatt.test(passwordText)) {
                    //4 提示用户结果
                    $("span.errorMsg").text("密码不合法！");

                    return false;
                }

                // 验证码
                var codeText = $("#code").val();
                //去掉验证码前后空格
                codeText = $.trim(codeText);

                if (codeText == null || codeText == "") {
                    //4 提示用户
                    $("span.errorMsg").text("验证码不能为空！");

                    return false;
                }
                var flag=true;
                //设置ajax同步访问
                $.ajaxSettings.async=false;
                $.getJSON("http://localhost:8080/FileManagement/userServlet","action=code&code="+codeText,function (data) {
                    async:false

                    if (data.result!="t") {
                        $("span.errorMsg").text("验证码错误！");
                       flag=false;
                    }else {
                        return true;
                    }
                });
                return flag;
                 // 去掉错误信息
                 $("span.errorMsg").text("");

            });
        });
    </script>

</head>
<body>


<div class="login_banner">
    <div id="login_header">
    </div>

    <div id="content">
        <div class="login_form">
            <div class="login_box">
                <div class="tit">
                    <h1>用户注册</h1>
                </div>
                <div class="msg_cont">
								<span class="errorMsg">
									请输入账号和密码
								</span>
                </div>
                <div class="form">
                    <form action="userServlet" method="post">
                        <input type="hidden" name="action" value="register">
                        <label>账号：</label>
                        <input class="itxt" type="text" placeholder="请输入用户名"
                               autocomplete="off" tabindex="1" name="username" id="username" />
                        <br />
                        <br />
                        <label>密码：</label>
                        <input class="itxt" type="password" placeholder="请输入密码"
                               autocomplete="off" tabindex="1" name="password" />
                        <br />
                        <br />
                        <label>验证码：</label>&nbsp;&nbsp;&nbsp;
                        <input class="itxt" type="text" name="code" style="width: 80px;" id="code"/>
                        <img id="code_img" alt="换一张" src="Kaptcha.jpg"  style="float: right;width: 120px;hight:30px;margin-right: 40px">
                        <br />
                        <br />
                        <input type="submit" value="注册" id="sub_btn" />
                    </form>
                </div>

            </div>
        </div>
    </div>
</div>
</body>
</html>