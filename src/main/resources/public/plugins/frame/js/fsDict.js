/**
 * @Description: 字典配置
 * @Copyright: 2017 wueasy.com Inc. All rights reserved.
 * @author: fallsea
 * @version 1.8.4
 * @License：MIT
 */
layui.fsDict = {
		//城市
		city : {
			formatType : "local",
			labelField : "name",
			valueField : "code",
			//静态数据
			data:[
                {"code": 1,"name":"中国","style":"color:#F00;"},
                {"code": 2 ,"name":"北京"},
                {"code": 3 ,"name":"安徽"},
                {"code": 4 ,"name":"福建"},
                {"code": 5 ,"name":"甘肃"},
                {"code": 6 ,"name":"广东"},
                {"code": 7 ,"name":"广西"},
                {"code": 8 ,"name":"贵州"},
                {"code": 9 ,"name":"海南"},
                {"code":10 ,"name":"河北"},
                {"code":11 ,"name":"河南"},
                {"code":12 ,"name":"黑龙江"},
                {"code":13 ,"name":"湖北"},
                {"code":14 ,"name":"湖南"},
                {"code":15 ,"name":"吉林"},
                {"code":16 ,"name":"江苏"},
                {"code":17 ,"name":"江西"},
                {"code":18 ,"name":"辽宁"},
                {"code":19 ,"name":"内蒙古"},
                {"code":20 ,"name":"宁夏"},
                {"code":21 ,"name":"青海"},
                {"code":22 ,"name":"山东"},
                {"code":23 ,"name":"山西"},
                {"code":24 ,"name":"陕西"},
                {"code":25 ,"name":"上海"},
                {"code":26 ,"name":"四川"},
                {"code":27 ,"name":"天津"},
                {"code":28 ,"name":"西藏"},
                {"code":29 ,"name":"新疆"},
                {"code":30 ,"name":"云南"},
                {"code":31 ,"name":"浙江"},
                {"code":32 ,"name":"重庆"},
                {"code":33 ,"name":"香港"},
                {"code":34 ,"name":"澳门"},
                {"code":35 ,"name":"台湾"}
            ]
		},
		//类型
		type : {
			formatType : "local",
			labelField : "name",
			valueField : "code",
			spaceMode : " ",//展示多个数据分隔符，默认,
			data:[{"code":"write","name":"写作","css":"layui-badge layui-bg-orange"},
				{"code":"read","name":"阅读","css":"layui-badge layui-bg-green"},
				{"code":"dai","name":"发呆","css":"layui-badge layui-bg-cyan"}]
		}
		,
		//性别
		sex : {
			formatType : "local",
			labelField : "name",
			valueField : "code",
			spaceMode : "",//展示多个数据分隔符，默认,
			data:[{"code":"男","name":"男"},
				{"code":"女","name":"女"}]
		}
		,
		//省份
		area1 : {
			formatType : "server",//server 动态数据字典
			loadUrl : "/user/getCity",
			method : "POST",//坑1，默认为post
			inputs : "parentid:1",
			labelField : "name",
			valueField : "id"
		},
		//城市
		area2 : {
			formatType : "server",
			loadUrl : "/user/getCity",
			inputs : "parentid:",
			labelField : "name",
			valueField : "id"
		},
		//区
		area3 : {
			formatType : "server",
			loadUrl : "/user/getCity",
			inputs : "parentid:,area1:#area2222222",
			labelField : "name",
			valueField : "id"
		}
};
