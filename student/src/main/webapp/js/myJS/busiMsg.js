$.extend($.fn.datagrid.editors,{
	datatimebox : {
		init : function(container,options){
			var input = $('<input type="text" >').appendTo(container);
			options.editable = false;
			input.datetimebox(options);
			return input;
		},
		getValue: function(target){
			return $(target).datetimebox('getValue')
		},
		setValue: function(target,value){
			$(target).datatimebox('resize',width);
		},
		destory: function(target){
			$(target).datatimebox('destory');
		},
	}
})

$(function(){
	obj = {
		editRow : undefined,
		search : function(){
			$('#dg').datagrid('load',{
				jobName : $.trim($('input[name = "uid"]').val()),
				/*createTime : $.trim($('input[name = "createTime"]').val()),
				endTime : $.trim($('input[name = "endTime"]').val())*/
			})
		},
		add : function(){
			$('#save,#redo').show();
			if(undefined == this.editRow){
				$('#dg').datagrid('insertRow',{
					index:0,
					row:{
						
					}
				})
			
				//设置第一行可编辑
				$('#dg').datagrid('beginEdit',0)
				this.editRow = 0;
			}
		},
		redo : function(){
			$('#dg').datagrid('rejectChanges');
			this.editRow = undefined;
			$('#redo,#save').hide();
		},
		save : function(){
			$('#dg').datagrid('endEdit',this.editRow);
		},
		edit : function(){
			var rows = $('#dg').datagrid('getSelections');
			if(rows.length==1){
				if(this.editRow != undefined){
					$('#dg').datagrid('endEdit',this.editRow);
				}
				if(this.editRow == undefined){
					$('#save,#redo').show();
					var index = $('#dg').datagrid('getRowIndex',rows[0]);
					$('#dg').datagrid('beginEdit',index);
					console.log(rows[0]);
					this.editRow = index;
					$('#dg').datagrid('unselectRow',index);
				};
			}else{
				$.messager.alert('警告','只能选中一行修改','warning');
			}
		},
		remove : function(){
			var rows = $('#dg').datagrid('getSelections');
			if(rows.length>0){
				$.messager.confirm('警告','确认删除？',function(flag){
					if(flag){
						var delItem = [];
						for( var i = 0 ; i<rows.length ;i++){
							delItem.push({'jobId':rows[i].jobId});
						}
						console.log({delItems:JSON.stringify(delItem)});
						$.post("busiMsgGet2.do",{delItems:JSON.stringify(delItem)},function(data,status){});
					}
				});
			}else{
				$.messager.alert('警告','选中要删除的记录','warning');
			}
		}
	}
	
	$('#dg').datagrid({
		width:1150,
		height:400,
		fitColumns:true,
		title:'企业信息管理',
		pagination:true,
		pageSize:'10',
		pageList:['10','20','30','40'],
		rownumbers:true,
		//singleSelect:true,
		url:'busiMsgGet.do',
		columns:[[
		          {
		        	  field:'busiUserId',
		        	  title:'账户编码',
		        	  width:30,
		        	  sortable:true,
		        	  checkbox:true
		          },
		          {
		        	  field:'userId',
		        	  title:'账号',
		        	  width:100,
		        	  sortable:true,
		        	  editor:{
							type:'validatebox',
							options:{
								required:true
							}
		        	  }
		          },
		          {
		        	  field:'userName',
		        	  title:'用户名',
		        	  width:75,
		        	  editor:{
							type:'validatebox',
							options:{
								required:true
							}
		        	  }
		          },
		          {
		        	  field:'job',
		        	  title:'工作',
		        	  width:30,
		        	  editor:{
							type:'validatebox',
							options:{
								required:true
							}
		        	  }
		          },
		          {
		        	  field:'department',
		        	  title:'部门',
		        	  width:100,
		        	  editor:{
							type:'validatebox',
							options:{
								required:true
							}
		        	  }
		          },
		          {
		        	  field:'phone',
		        	  title:'电话',
		        	  width:60,
		        	  editor:{
							type:'validatebox',
							options:{
								required:true
							}
		        	  }
		          },
		          {
		        	  field:'email',
		        	  title:'邮箱',
		        	  width:60,
		        	  editor:{
							type:'validatebox',
							options:{
								required:true
							}
		        	  }
		          },
		          {
		        	  field:'companyWeb',
		        	  title:'公司网站',
		        	  width:90,
		        	  editor:{
							type:'validatebox',
							options:{
								required:true
							}
		        	  }
		          },
		          {
		        	  field:'companyname',
		        	  title:'公司名称',
		        	  width:50,
		        	  editor:{
							type:'validatebox',
							options:{
								required:true
							}
		        	  }
		          },
		          {
		        	  field:'companytype',
		        	  title:'公司类型',
		        	  width:130,
		        	  editor:{
							type:'validatebox',
							options:{
								required:true
							}
		        	  }
		          },
		          {
		        	  field:'companyaddress',
		        	  title:'公司地址',
		        	  width:90,
		        	  editor:{
							type:'validatebox',
							options:{
								required:true
							}
		        	  }
		          },
		          {
		        	  field:'companyIntroduce',
		        	  title:'公司介绍',
		        	  width:70,
		        	  editor:{
							type:'validatebox',
							options:{
								required:true
							}
		        	  }
		          }
		          ]],
		toolbar:'#tb',
		onDblClickRow:function(indexRow,rowData){
			if(undefined != obj.editRow){
				console.log(indexRow+'：'+rowData);
				$('#dg').datagrid('endEdit',obj.editRow);
			}
			if(undefined==obj.editRow){
				$('#dg').datagrid('beginEdit',indexRow);
				obj.editRow = indexRow;
				$('#redo,#save').show();
			}
		},
		onAfterEdit:function(rowIndex,rowData,changes){
			console.log(rowData);
			obj.editRow = undefined;
			$('#redo,#save').hide();
			$.post("busiMsgGet2.do",{itemInfo:JSON.stringify(rowData)},function(data,status){
			});
			obj.search();
		}
	});
});